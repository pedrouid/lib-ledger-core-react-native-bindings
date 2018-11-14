// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from wallet.djinni

#import "RCTCoreLGOperationQuery.h"


@implementation RCTCoreLGOperationQuery
//Export module
RCT_EXPORT_MODULE(RCTCoreLGOperationQuery)

@synthesize bridge = _bridge;

-(instancetype)init
{
    self = [super init];
    //Init Objc implementation
    if(self)
    {
        self.objcImplementations = [[NSMutableDictionary alloc] init];
    }
    return self;
}

+ (BOOL)requiresMainQueueSetup
{
    return NO;
}
RCT_REMAP_METHOD(release, release:(NSDictionary *)currentInstance withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject)
{
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGOperationQuery::release, first argument should be an instance of LGOperationQuery", nil);
        return;
    }
    [self.objcImplementations removeObjectForKey:currentInstance[@"uid"]];
    resolve(@(YES));
}
RCT_REMAP_METHOD(log, logWithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject)
{
    NSMutableArray *uuids = [[NSMutableArray alloc] init];
    for (id key in self.objcImplementations)
    {
        [uuids addObject:key];
    }
    NSDictionary *result = @{@"value" : uuids};
    resolve(result);
}
RCT_REMAP_METHOD(flush, flushWithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject)
{
    [self.objcImplementations removeAllObjects];
    resolve(@(YES));
}
RCT_REMAP_METHOD(isNull, isNull:(NSDictionary *)currentInstance withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject)
{
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        resolve(@(YES));
        return;
    }
    [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if ([self.objcImplementations objectForKey:currentInstance[@"uid"]])
    {
        resolve(@(NO));
        return;
    }
    resolve(@(YES));
}

/**
 *Apply given order to query's operation
 *@param key, OperationOrderKey object which defines order
 *@param descending, bool
 *@return OperationQuery object, new ordered operation
 */
RCT_REMAP_METHOD(addOrder,addOrder:(NSDictionary *)currentInstance withParams:(int)key
                                                                   descending:(BOOL)descending withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGOperationQuery::addOrder, first argument should be an instance of LGOperationQuery", nil);
        return;
    }
    LGOperationQuery *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGOperationQuery::addOrder, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    LGOperationQuery * objcResult = [currentInstanceObj addOrder:(LGOperationOrderKey)key descending:descending];

    NSString *objcResult_uuid = [[NSUUID UUID] UUIDString];
    RCTCoreLGOperationQuery *rctImpl_objcResult = (RCTCoreLGOperationQuery *)[self.bridge moduleForName:@"CoreLGOperationQuery"];
    [rctImpl_objcResult.objcImplementations setObject:objcResult forKey:objcResult_uuid];
    NSDictionary *result = @{@"type" : @"CoreLGOperationQuery", @"uid" : objcResult_uuid };

    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling LGOperationQuery::addOrder", nil);
        return;
    }

}

/**
 *Get applied filter on operation query
 *@return QueryFilter object
 */
RCT_REMAP_METHOD(filter,filter:(NSDictionary *)currentInstance WithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGOperationQuery::filter, first argument should be an instance of LGOperationQuery", nil);
        return;
    }
    LGOperationQuery *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGOperationQuery::filter, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    LGQueryFilter * objcResult = [currentInstanceObj filter];

    NSString *objcResult_uuid = [[NSUUID UUID] UUIDString];
    RCTCoreLGQueryFilter *rctImpl_objcResult = (RCTCoreLGQueryFilter *)[self.bridge moduleForName:@"CoreLGQueryFilter"];
    [rctImpl_objcResult.objcImplementations setObject:objcResult forKey:objcResult_uuid];
    NSDictionary *result = @{@"type" : @"CoreLGQueryFilter", @"uid" : objcResult_uuid };

    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling LGOperationQuery::filter", nil);
        return;
    }

}

/**
 *Add offset to the operation query
 *@param from, 64 bits integer
 */
RCT_REMAP_METHOD(offset,offset:(NSDictionary *)currentInstance withParams:(int)from withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGOperationQuery::offset, first argument should be an instance of LGOperationQuery", nil);
        return;
    }
    LGOperationQuery *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGOperationQuery::offset, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    LGOperationQuery * objcResult = [currentInstanceObj offset:from];

    NSString *objcResult_uuid = [[NSUUID UUID] UUIDString];
    RCTCoreLGOperationQuery *rctImpl_objcResult = (RCTCoreLGOperationQuery *)[self.bridge moduleForName:@"CoreLGOperationQuery"];
    [rctImpl_objcResult.objcImplementations setObject:objcResult forKey:objcResult_uuid];
    NSDictionary *result = @{@"type" : @"CoreLGOperationQuery", @"uid" : objcResult_uuid };

    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling LGOperationQuery::offset", nil);
        return;
    }

}

/**
 *Add limit to the operation query results
 *@param count, 64 bits integer
 */
RCT_REMAP_METHOD(limit,limit:(NSDictionary *)currentInstance withParams:(int)count withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGOperationQuery::limit, first argument should be an instance of LGOperationQuery", nil);
        return;
    }
    LGOperationQuery *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGOperationQuery::limit, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    LGOperationQuery * objcResult = [currentInstanceObj limit:count];

    NSString *objcResult_uuid = [[NSUUID UUID] UUIDString];
    RCTCoreLGOperationQuery *rctImpl_objcResult = (RCTCoreLGOperationQuery *)[self.bridge moduleForName:@"CoreLGOperationQuery"];
    [rctImpl_objcResult.objcImplementations setObject:objcResult forKey:objcResult_uuid];
    NSDictionary *result = @{@"type" : @"CoreLGOperationQuery", @"uid" : objcResult_uuid };

    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling LGOperationQuery::limit", nil);
        return;
    }

}

/**
 *TODO
 *Complete the operation query
 */
RCT_REMAP_METHOD(complete,complete:(NSDictionary *)currentInstance WithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGOperationQuery::complete, first argument should be an instance of LGOperationQuery", nil);
        return;
    }
    LGOperationQuery *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGOperationQuery::complete, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    LGOperationQuery * objcResult = [currentInstanceObj complete];

    NSString *objcResult_uuid = [[NSUUID UUID] UUIDString];
    RCTCoreLGOperationQuery *rctImpl_objcResult = (RCTCoreLGOperationQuery *)[self.bridge moduleForName:@"CoreLGOperationQuery"];
    [rctImpl_objcResult.objcImplementations setObject:objcResult forKey:objcResult_uuid];
    NSDictionary *result = @{@"type" : @"CoreLGOperationQuery", @"uid" : objcResult_uuid };

    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling LGOperationQuery::complete", nil);
        return;
    }

}

/**TODO */
RCT_REMAP_METHOD(partial,partial:(NSDictionary *)currentInstance WithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGOperationQuery::partial, first argument should be an instance of LGOperationQuery", nil);
        return;
    }
    LGOperationQuery *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGOperationQuery::partial, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    LGOperationQuery * objcResult = [currentInstanceObj partial];

    NSString *objcResult_uuid = [[NSUUID UUID] UUIDString];
    RCTCoreLGOperationQuery *rctImpl_objcResult = (RCTCoreLGOperationQuery *)[self.bridge moduleForName:@"CoreLGOperationQuery"];
    [rctImpl_objcResult.objcImplementations setObject:objcResult forKey:objcResult_uuid];
    NSDictionary *result = @{@"type" : @"CoreLGOperationQuery", @"uid" : objcResult_uuid };

    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling LGOperationQuery::partial", nil);
        return;
    }

}

/**
 *Execute query to retrieve operations
 *@param callback, if execute method succeed, ListCallback object returning a List of Operation objects
 */
RCT_REMAP_METHOD(execute,execute:(NSDictionary *)currentInstance WithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGOperationQuery::execute, first argument should be an instance of LGOperationQuery", nil);
        return;
    }
    LGOperationQuery *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGOperationQuery::execute, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    RCTCoreLGOperationListCallback *objcParam_0 = [[RCTCoreLGOperationListCallback alloc] initWithResolver:resolve rejecter:reject andBridge:self.bridge];
    [currentInstanceObj execute:objcParam_0];

}
@end
