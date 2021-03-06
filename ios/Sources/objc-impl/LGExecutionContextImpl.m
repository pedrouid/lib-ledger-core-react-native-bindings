#import "LGExecutionContextImpl.h"
#import "../objc/LGRunnable.h"

@implementation LGExecutionContextImpl
@synthesize resolve = _resolve;
@synthesize reject = _reject;
- (instancetype)initContextWithName:(NSString *)name andIsSerialized:(BOOL)isSerialized {
    self = [super init];
    if (self) {
        if (isSerialized) {
            NSString *queueName = [NSString stringWithFormat:@"com.ExecutionContext.SerialQueue.%@", name];
            self.queue = dispatch_queue_create([queueName UTF8String], DISPATCH_QUEUE_SERIAL);
        } else {
            if ([name isEqualToString:@"__main__"]) {
                self.queue = dispatch_get_global_queue(QOS_CLASS_USER_INITIATED, 0);
            } else {
                self.queue = dispatch_get_global_queue(QOS_CLASS_UTILITY, 0);
            }
            
        }
        
    }
    return self;
}

/**
 *Execute a given runnable
 *@param runnalbe, Runnable object
 */
- (void)execute:(nullable LGRunnable *)runnable
{
    dispatch_async(self.queue, ^{
        if (runnable) {
            [runnable run];
        }
    });
}

/**
 *Execute a given runnable with a delay
 *@param runnalbe, Runnable object
 *@param millis, 64 bits integer, delay in milli-seconds
 */
- (void)delay:(nullable LGRunnable *)runnable millis:(int64_t)millis
{
    dispatch_after(dispatch_time(DISPATCH_TIME_NOW, (int64_t)(millis * NSEC_PER_MSEC)), self.queue, ^{
        if (runnable) {
            [runnable run];
        }
    });
}

@end
