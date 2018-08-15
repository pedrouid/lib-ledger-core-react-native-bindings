// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from callback.djinni

#import "LGError.h"
#import "LGWalletPool.h"
#import "LGWalletPoolCallbackImpl.h"
#import "RCTCoreLGError.h"
#import "RCTCoreLGWalletPool.h"
#import <Foundation/Foundation.h>
#import <React/RCTBridge.h>
#import <React/RCTBridgeModule.h>


/**
 *Callback triggered by main completed task,
 *returns optional result of template type T
 */
@interface RCTCoreLGWalletPoolCallback : NSObject <LGWalletPoolCallback>
@property (nonatomic, strong) RCTPromiseResolveBlock resolve;
@property (nonatomic, strong) RCTPromiseRejectBlock reject;
@property (nonatomic, weak) RCTBridge *bridge;
-(instancetype)initWithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock) reject andBridge: (RCTBridge *) bridge;
@end