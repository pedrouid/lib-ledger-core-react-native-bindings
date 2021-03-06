// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from wallet.djinni

package com.ledger.reactnative;

import co.ledger.core.Account;
import co.ledger.core.AddressListCallback;
import co.ledger.core.AmountCallback;
import co.ledger.core.AmountListCallback;
import co.ledger.core.BitcoinLikeAccount;
import co.ledger.core.BlockCallback;
import co.ledger.core.ErrorCodeCallback;
import co.ledger.core.EventBus;
import co.ledger.core.Logger;
import co.ledger.core.OperationQuery;
import co.ledger.core.Preferences;
import co.ledger.core.TimePeriod;
import co.ledger.core.WalletType;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableNativeArray;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

/**Class representing an account */
public class RCTCoreAccount extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;
    private Map<String, Account> javaObjects;
    public Map<String, Account> getJavaObjects()
    {
        return javaObjects;
    }

    public RCTCoreAccount(ReactApplicationContext reactContext)
    {
        super(reactContext);
        this.reactContext = reactContext;
        this.javaObjects = new HashMap<String, Account>();
        WritableNativeMap.setUseNativeAccessor(true);
    }

    @Override
    public String getName()
    {
        return "RCTCoreAccount";
    }
    @ReactMethod
    public void release(ReadableMap currentInstance, Promise promise)
    {
        String uid = currentInstance.getString("uid");
        if (uid.length() > 0)
        {
            this.javaObjects.remove(uid);
            promise.resolve(0);
        }
        else
        {
            promise.reject("Failed to release instance of RCTCoreAccount", "First parameter of RCTCoreAccount::release should be an instance of RCTCoreAccount");
        }
    }
    @ReactMethod
    public void log(Promise promise)
    {
        WritableNativeArray result = new WritableNativeArray();
        for (Map.Entry<String, Account> elem : this.javaObjects.entrySet())
        {
            result.pushString(elem.getKey());
        }
        promise.resolve(result);
    }
    @ReactMethod
    public void flush(Promise promise)
    {
        this.javaObjects.clear();
        promise.resolve(0);
    }
    @ReactMethod
    public void isNull(ReadableMap currentInstance, Promise promise)
    {
        String uid = currentInstance.getString("uid");
        if (uid.length() > 0)
        {
            if (this.javaObjects.get(uid) == null)
            {
                promise.resolve(true);
                return;
            }
            else
            {
                promise.resolve(false);
                return;
            }
        }
        promise.resolve(true);
    }

    /**
     *Get index of account in user's wallet
     *32 bits integer
     */
    @ReactMethod
    public void getIndex(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            Account currentInstanceObj = this.javaObjects.get(sUid);

            int javaResult = currentInstanceObj.getIndex();
            WritableNativeMap result = new WritableNativeMap();
            result.putInt("value", javaResult);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**TODO */
    @ReactMethod
    public void queryOperations(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            Account currentInstanceObj = this.javaObjects.get(sUid);

            OperationQuery javaResult = currentInstanceObj.queryOperations();

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreOperationQuery rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreOperationQuery.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreOperationQuery");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     *Get balance of account
     *@param callback, if getBalacne, Callback returning an Amount object which represents account's balance
     */
    @ReactMethod
    public void getBalance(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            Account currentInstanceObj = this.javaObjects.get(sUid);

            RCTCoreAmountCallback javaParam_0 = RCTCoreAmountCallback.initWithPromise(promise, this.reactContext);
            currentInstanceObj.getBalance(javaParam_0);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     *Get balance of account at a precise interval with a certain granularity
     *@param start, lower bound of search range
     *@param end, upper bound of search range
     *@param precision, granularity at which we want results
     *@param callback, ListCallback returning a list of Amount object which represents account's balance
     */
    @ReactMethod
    public void getBalanceHistory(ReadableMap currentInstance, String start, String end, int period, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            Account currentInstanceObj = this.javaObjects.get(sUid);

            if (period < 0 || TimePeriod.values().length <= period)
            {
                promise.reject("Enum error", "Failed to get enum TimePeriod");
                return;
            }
            TimePeriod javaParam_2 = TimePeriod.values()[period];
            RCTCoreAmountListCallback javaParam_3 = RCTCoreAmountListCallback.initWithPromise(promise, this.reactContext);
            currentInstanceObj.getBalanceHistory(start, end, javaParam_2, javaParam_3);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     *Get synchronization status of account
     *@return bool
     */
    @ReactMethod
    public void isSynchronizing(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            Account currentInstanceObj = this.javaObjects.get(sUid);

            boolean javaResult = currentInstanceObj.isSynchronizing();
            WritableNativeMap result = new WritableNativeMap();
            result.putBoolean("value", javaResult);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     *Start synchronization of account
     *@return EventBus, handler will be notified of synchronization outcome
     */
    @ReactMethod
    public void synchronize(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            Account currentInstanceObj = this.javaObjects.get(sUid);

            EventBus javaResult = currentInstanceObj.synchronize();

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreEventBus rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreEventBus.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreEventBus");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     *Return account's preferences
     *@return Preferences object
     */
    @ReactMethod
    public void getPreferences(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            Account currentInstanceObj = this.javaObjects.get(sUid);

            Preferences javaResult = currentInstanceObj.getPreferences();

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCorePreferences rctImpl_javaResult = this.reactContext.getNativeModule(RCTCorePreferences.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCorePreferences");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     *Return account's logger which provides all needed (e.g. database) logs
     *@return Logger Object
     */
    @ReactMethod
    public void getLogger(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            Account currentInstanceObj = this.javaObjects.get(sUid);

            Logger javaResult = currentInstanceObj.getLogger();

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreLogger rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreLogger.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreLogger");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     *Return preferences of specific operation
     *@param uid, string of operation id
     *@return Preferences
     *Return operation for a specific operation
     *@param uid, string of operation id
     */
    @ReactMethod
    public void getOperationPreferences(ReadableMap currentInstance, String uid, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            Account currentInstanceObj = this.javaObjects.get(sUid);

            Preferences javaResult = currentInstanceObj.getOperationPreferences(uid);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCorePreferences rctImpl_javaResult = this.reactContext.getNativeModule(RCTCorePreferences.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCorePreferences");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    @ReactMethod
    public void asBitcoinLikeAccount(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            Account currentInstanceObj = this.javaObjects.get(sUid);

            BitcoinLikeAccount javaResult = currentInstanceObj.asBitcoinLikeAccount();

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreBitcoinLikeAccount rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreBitcoinLikeAccount.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreBitcoinLikeAccount");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * asEthereumLikeAccount(): Callback<EthereumLikeAccount>;
     * asRippleLikeAccount(): Callback<RippleLikeAccount>;
     *Check if account is a Bitcoin one
     *@return bool
     */
    @ReactMethod
    public void isInstanceOfBitcoinLikeAccount(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            Account currentInstanceObj = this.javaObjects.get(sUid);

            boolean javaResult = currentInstanceObj.isInstanceOfBitcoinLikeAccount();
            WritableNativeMap result = new WritableNativeMap();
            result.putBoolean("value", javaResult);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     *Check if account is an Ethereum one
     *@return bool
     */
    @ReactMethod
    public void isInstanceOfEthereumLikeAccount(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            Account currentInstanceObj = this.javaObjects.get(sUid);

            boolean javaResult = currentInstanceObj.isInstanceOfEthereumLikeAccount();
            WritableNativeMap result = new WritableNativeMap();
            result.putBoolean("value", javaResult);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     *Check if account is a Ripple one
     *@return bool
     */
    @ReactMethod
    public void isInstanceOfRippleLikeAccount(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            Account currentInstanceObj = this.javaObjects.get(sUid);

            boolean javaResult = currentInstanceObj.isInstanceOfRippleLikeAccount();
            WritableNativeMap result = new WritableNativeMap();
            result.putBoolean("value", javaResult);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**TODO */
    @ReactMethod
    public void getFreshPublicAddresses(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            Account currentInstanceObj = this.javaObjects.get(sUid);

            RCTCoreAddressListCallback javaParam_0 = RCTCoreAddressListCallback.initWithPromise(promise, this.reactContext);
            currentInstanceObj.getFreshPublicAddresses(javaParam_0);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     *Get type of wallet to which account belongs
     *@return WalletType object
     */
    @ReactMethod
    public void getWalletType(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            Account currentInstanceObj = this.javaObjects.get(sUid);

            WalletType javaResult = currentInstanceObj.getWalletType();
            WritableNativeMap result = new WritableNativeMap();
            int finalJavaResult = javaResult.ordinal();
            result.putInt("value", finalJavaResult);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     *Get event bus through which account is notified on synchronization status
     *@return EventBus object
     */
    @ReactMethod
    public void getEventBus(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            Account currentInstanceObj = this.javaObjects.get(sUid);

            EventBus javaResult = currentInstanceObj.getEventBus();

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreEventBus rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreEventBus.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreEventBus");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**Start observing blockchain on which account synchronizes and send/receive transactions */
    @ReactMethod
    public void startBlockchainObservation(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            Account currentInstanceObj = this.javaObjects.get(sUid);

            currentInstanceObj.startBlockchainObservation();
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**Stop observing blockchain */
    @ReactMethod
    public void stopBlockchainObservation(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            Account currentInstanceObj = this.javaObjects.get(sUid);

            currentInstanceObj.stopBlockchainObservation();
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     *Get account's observation status
     *@return boolean
     */
    @ReactMethod
    public void isObservingBlockchain(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            Account currentInstanceObj = this.javaObjects.get(sUid);

            boolean javaResult = currentInstanceObj.isObservingBlockchain();
            WritableNativeMap result = new WritableNativeMap();
            result.putBoolean("value", javaResult);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     *Get Last block of blockchain on which account operates
     *@param callback, Callback returning, if getLastBlock succeeds, a Block object
     */
    @ReactMethod
    public void getLastBlock(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            Account currentInstanceObj = this.javaObjects.get(sUid);

            RCTCoreBlockCallback javaParam_0 = RCTCoreBlockCallback.initWithPromise(promise, this.reactContext);
            currentInstanceObj.getLastBlock(javaParam_0);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /** Get the key used to generate the account */
    @ReactMethod
    public void getRestoreKey(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            Account currentInstanceObj = this.javaObjects.get(sUid);

            String javaResult = currentInstanceObj.getRestoreKey();
            WritableNativeMap result = new WritableNativeMap();
            result.putString("value", javaResult);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     *Erase data (in user's DB) relative to wallet since given date
     *@param date, start date of data deletion
     */
    @ReactMethod
    public void eraseDataSince(ReadableMap currentInstance, Date date, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            Account currentInstanceObj = this.javaObjects.get(sUid);

            RCTCoreErrorCodeCallback javaParam_1 = RCTCoreErrorCodeCallback.initWithPromise(promise, this.reactContext);
            currentInstanceObj.eraseDataSince(date, javaParam_1);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
}
