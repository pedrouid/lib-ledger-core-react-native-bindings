// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from bitcoin_like_wallet.djinni

package com.ledger.reactnative;

import co.ledger.core.Amount;
import co.ledger.core.BitcoinLikeOutput;
import co.ledger.core.BitcoinLikeTransactionRequest;
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

/**Structure representing a bitcoin transaction request */
public class RCTCoreBitcoinLikeTransactionRequest extends ReactContextBaseJavaModule {
    private final ReactApplicationContext reactContext;
    private Map<String, BitcoinLikeTransactionRequest> javaObjects;
    private WritableNativeMap implementationsData;
    public Map<String, BitcoinLikeTransactionRequest> getJavaObjects()
    {
        return javaObjects;
    }

    public RCTCoreBitcoinLikeTransactionRequest(ReactApplicationContext reactContext)
    {
        super(reactContext);
        this.reactContext = reactContext;
        this.javaObjects = new HashMap<String, BitcoinLikeTransactionRequest>();
        WritableNativeMap.setUseNativeAccessor(true);
        this.implementationsData = new WritableNativeMap();
    }

    @Override
    public String getName()
    {
        return "RCTCoreBitcoinLikeTransactionRequest";
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
            promise.reject("Failed to release instance of RCTCoreBitcoinLikeTransactionRequest", "First parameter of RCTCoreBitcoinLikeTransactionRequest::release should be an instance of RCTCoreBitcoinLikeTransactionRequest");
        }
    }
    @ReactMethod
    public void log(Promise promise)
    {
        WritableNativeArray result = new WritableNativeArray();
        for (Map.Entry<String, BitcoinLikeTransactionRequest> elem : this.javaObjects.entrySet())
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

    @ReactMethod
    public void init(ReadableArray utxo, ReadableArray outputs, Optional<ReadableMap> baseFees, Optional<ReadableMap> totalFees, Integer lockTime, Promise promise) {
        WritableNativeMap implementationsData = new WritableNativeMap();
        ArrayList<BitcoinLikeOutput> javaParam_0 = new ArrayList<BitcoinLikeOutput>();
        WritableNativeArray javaParam_0_data = new WritableNativeArray();

        for (int i = 0; i <  utxo.size(); i++)
        {
            ReadableMap utxo_elem = utxo.getMap(i);
            RCTCoreBitcoinLikeOutput rctParam_utxo_elem = this.reactContext.getNativeModule(RCTCoreBitcoinLikeOutput.class);
            BitcoinLikeOutput javaParam_0_elem = rctParam_utxo_elem.getJavaObjects().get(utxo_elem.getString("uid"));
            javaParam_0_data.pushString(utxo_elem.getString("uid"));
            javaParam_0.add(javaParam_0_elem);
        }
        implementationsData.putArray("utxo", javaParam_0_data);

        ArrayList<BitcoinLikeOutput> javaParam_1 = new ArrayList<BitcoinLikeOutput>();
        WritableNativeArray javaParam_1_data = new WritableNativeArray();

        for (int i = 0; i <  outputs.size(); i++)
        {
            ReadableMap outputs_elem = outputs.getMap(i);
            RCTCoreBitcoinLikeOutput rctParam_outputs_elem = this.reactContext.getNativeModule(RCTCoreBitcoinLikeOutput.class);
            BitcoinLikeOutput javaParam_1_elem = rctParam_outputs_elem.getJavaObjects().get(outputs_elem.getString("uid"));
            javaParam_1_data.pushString(outputs_elem.getString("uid"));
            javaParam_1.add(javaParam_1_elem);
        }
        implementationsData.putArray("outputs", javaParam_1_data);

        RCTCoreAmount rctParam_baseFees = this.reactContext.getNativeModule(RCTCoreAmount.class);
        Amount javaParam_2 = rctParam_baseFees.getJavaObjects().get(baseFees.get().getString("uid"));
        implementationsData.putString("baseFees", baseFees.get().getString("uid"));
        RCTCoreAmount rctParam_totalFees = this.reactContext.getNativeModule(RCTCoreAmount.class);
        Amount javaParam_3 = rctParam_totalFees.getJavaObjects().get(totalFees.get().getString("uid"));
        implementationsData.putString("totalFees", totalFees.get().getString("uid"));
        BitcoinLikeTransactionRequest javaResult = new BitcoinLikeTransactionRequest(javaParam_0, javaParam_1, javaParam_2, javaParam_3, lockTime);

        String uuid = UUID.randomUUID().toString();
        this.javaObjects.put(uuid, javaResult);
        WritableNativeMap finalResult = new WritableNativeMap();
        finalResult.putString("type","RCTCoreBitcoinLikeTransactionRequest");
        finalResult.putString("uid",uuid);
        this.implementationsData.putMap(uuid, implementationsData);
        promise.resolve(finalResult);
    }
    public void mapImplementationsData(ReadableMap currentInstance)
    {
        String currentInstanceUid = currentInstance.getString("uid");
        BitcoinLikeTransactionRequest javaImpl = this.javaObjects.get(currentInstanceUid);
        WritableNativeMap implementationsData = new WritableNativeMap();
        ArrayList<BitcoinLikeOutput> field_0 = javaImpl.getUtxo();
        WritableNativeArray converted_field_0 = new WritableNativeArray();
        for (BitcoinLikeOutput field_0_elem : field_0)
        {
            String field_0_elem_uuid = UUID.randomUUID().toString();
            RCTCoreBitcoinLikeOutput rctImpl_field_0_elem = this.reactContext.getNativeModule(RCTCoreBitcoinLikeOutput.class);
            rctImpl_field_0_elem.getJavaObjects().put(field_0_elem_uuid, field_0_elem);
            WritableNativeMap converted_field_0_elem = new WritableNativeMap();
            converted_field_0_elem.putString("type","RCTCoreBitcoinLikeOutput");
            converted_field_0_elem.putString("uid",field_0_elem_uuid);
            converted_field_0.pushMap(converted_field_0_elem);
        }
        implementationsData.putArray("utxo", converted_field_0);
        ArrayList<BitcoinLikeOutput> field_1 = javaImpl.getOutputs();
        WritableNativeArray converted_field_1 = new WritableNativeArray();
        for (BitcoinLikeOutput field_1_elem : field_1)
        {
            String field_1_elem_uuid = UUID.randomUUID().toString();
            RCTCoreBitcoinLikeOutput rctImpl_field_1_elem = this.reactContext.getNativeModule(RCTCoreBitcoinLikeOutput.class);
            rctImpl_field_1_elem.getJavaObjects().put(field_1_elem_uuid, field_1_elem);
            WritableNativeMap converted_field_1_elem = new WritableNativeMap();
            converted_field_1_elem.putString("type","RCTCoreBitcoinLikeOutput");
            converted_field_1_elem.putString("uid",field_1_elem_uuid);
            converted_field_1.pushMap(converted_field_1_elem);
        }
        implementationsData.putArray("outputs", converted_field_1);
        Amount field_2 = javaImpl.getBaseFees();
        String field_2_uuid = UUID.randomUUID().toString();
        RCTCoreAmount rctImpl_field_2 = this.reactContext.getNativeModule(RCTCoreAmount.class);
        rctImpl_field_2.getJavaObjects().put(field_2_uuid, field_2);
        WritableNativeMap converted_field_2 = new WritableNativeMap();
        converted_field_2.putString("type","RCTCoreAmount");
        converted_field_2.putString("uid",field_2_uuid);
        implementationsData.putMap("baseFees", converted_field_2);
        Amount field_3 = javaImpl.getTotalFees();
        String field_3_uuid = UUID.randomUUID().toString();
        RCTCoreAmount rctImpl_field_3 = this.reactContext.getNativeModule(RCTCoreAmount.class);
        rctImpl_field_3.getJavaObjects().put(field_3_uuid, field_3);
        WritableNativeMap converted_field_3 = new WritableNativeMap();
        converted_field_3.putString("type","RCTCoreAmount");
        converted_field_3.putString("uid",field_3_uuid);
        implementationsData.putMap("totalFees", converted_field_3);
        this.implementationsData.putMap(currentInstanceUid, implementationsData);
    }
    @ReactMethod
    public void getUtxo(ReadableMap currentInstance, Promise promise)
    {
        String uid = currentInstance.getString("uid");
        if (uid.length() > 0)
        {
            if (!this.implementationsData.hasKey(uid))
            {
                this.mapImplementationsData(currentInstance);
            }
            ReadableNativeMap data = this.implementationsData.getMap(uid);
            ReadableArray resultTmp = data.getArray("utxo");
            WritableNativeArray result = new WritableNativeArray();
            for (int i = 0; i < resultTmp.size(); i++)
            {
                WritableNativeMap result_elem = new WritableNativeMap();
                result_elem.merge(resultTmp.getMap(i));
                result.pushMap(result_elem);
            }
            promise.resolve(result);
        }
        else
        {
            promise.reject("Failed to call RCTCoreBitcoinLikeTransactionRequest::getUtxo", "First parameter of RCTCoreBitcoinLikeTransactionRequest::getUtxo should be an instance of RCTCoreBitcoinLikeTransactionRequest");
        }
    }

    @ReactMethod
    public void getOutputs(ReadableMap currentInstance, Promise promise)
    {
        String uid = currentInstance.getString("uid");
        if (uid.length() > 0)
        {
            if (!this.implementationsData.hasKey(uid))
            {
                this.mapImplementationsData(currentInstance);
            }
            ReadableNativeMap data = this.implementationsData.getMap(uid);
            ReadableArray resultTmp = data.getArray("outputs");
            WritableNativeArray result = new WritableNativeArray();
            for (int i = 0; i < resultTmp.size(); i++)
            {
                WritableNativeMap result_elem = new WritableNativeMap();
                result_elem.merge(resultTmp.getMap(i));
                result.pushMap(result_elem);
            }
            promise.resolve(result);
        }
        else
        {
            promise.reject("Failed to call RCTCoreBitcoinLikeTransactionRequest::getOutputs", "First parameter of RCTCoreBitcoinLikeTransactionRequest::getOutputs should be an instance of RCTCoreBitcoinLikeTransactionRequest");
        }
    }

    @ReactMethod
    public void getBaseFees(ReadableMap currentInstance, Promise promise)
    {
        String uid = currentInstance.getString("uid");
        if (uid.length() > 0)
        {
            if (!this.implementationsData.hasKey(uid))
            {
                this.mapImplementationsData(currentInstance);
            }
            ReadableNativeMap data = this.implementationsData.getMap(uid);
            WritableNativeMap result = new WritableNativeMap();
            result.merge(data.getMap("baseFees"));
            promise.resolve(result);
        }
        else
        {
            promise.reject("Failed to call RCTCoreBitcoinLikeTransactionRequest::getBaseFees", "First parameter of RCTCoreBitcoinLikeTransactionRequest::getBaseFees should be an instance of RCTCoreBitcoinLikeTransactionRequest");
        }
    }

    @ReactMethod
    public void getTotalFees(ReadableMap currentInstance, Promise promise)
    {
        String uid = currentInstance.getString("uid");
        if (uid.length() > 0)
        {
            if (!this.implementationsData.hasKey(uid))
            {
                this.mapImplementationsData(currentInstance);
            }
            ReadableNativeMap data = this.implementationsData.getMap(uid);
            WritableNativeMap result = new WritableNativeMap();
            result.merge(data.getMap("totalFees"));
            promise.resolve(result);
        }
        else
        {
            promise.reject("Failed to call RCTCoreBitcoinLikeTransactionRequest::getTotalFees", "First parameter of RCTCoreBitcoinLikeTransactionRequest::getTotalFees should be an instance of RCTCoreBitcoinLikeTransactionRequest");
        }
    }

    @ReactMethod
    public void getLockTime(ReadableMap currentInstance, Promise promise)
    {
        String uid = currentInstance.getString("uid");
        if (uid.length() > 0)
        {
            BitcoinLikeTransactionRequest javaObj = this.javaObjects.get(uid);
            Integer result = javaObj.getLockTime();
            WritableNativeMap resultMap = new WritableNativeMap();
            resultMap.putInt("value", result);
            promise.resolve(resultMap);
        }
        else
        {
            promise.reject("Failed to call RCTCoreBitcoinLikeTransactionRequest::getLockTime", "First parameter of RCTCoreBitcoinLikeTransactionRequest::getLockTime should be an instance of RCTCoreBitcoinLikeTransactionRequest");
        }
    }

}
