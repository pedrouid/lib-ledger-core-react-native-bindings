// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from wallet.djinni

package com.ledger.reactnative;

import co.ledger.core.DerivationPath;
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

public class RCTCoreDerivationPath extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;
    private Map<String, DerivationPath> javaObjects;
    public Map<String, DerivationPath> getJavaObjects()
    {
        return javaObjects;
    }

    public RCTCoreDerivationPath(ReactApplicationContext reactContext)
    {
        super(reactContext);
        this.reactContext = reactContext;
        this.javaObjects = new HashMap<String, DerivationPath>();
        WritableNativeMap.setUseNativeAccessor(true);
    }

    @Override
    public String getName()
    {
        return "RCTCoreDerivationPath";
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
            promise.reject("Failed to release instance of RCTCoreDerivationPath", "First parameter of RCTCoreDerivationPath::release should be an instance of RCTCoreDerivationPath");
        }
    }
    @ReactMethod
    public void log(Promise promise)
    {
        WritableNativeArray result = new WritableNativeArray();
        for (Map.Entry<String, DerivationPath> elem : this.javaObjects.entrySet())
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

    /** Get the number of element in this path. */
    @ReactMethod
    public void getDepth(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            DerivationPath currentInstanceObj = this.javaObjects.get(sUid);

            int javaResult = currentInstanceObj.getDepth();
            WritableNativeMap result = new WritableNativeMap();
            result.putInt("value", javaResult);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /** Get the child num at the given index in the path. */
    @ReactMethod
    public void getChildNum(ReadableMap currentInstance, int index, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            DerivationPath currentInstanceObj = this.javaObjects.get(sUid);

            int javaResult = currentInstanceObj.getChildNum(index);
            WritableNativeMap result = new WritableNativeMap();
            result.putInt("value", javaResult);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Get the child num at the given index in the path. If the child num is hardened, returns it
     * without the hardened marker bit.
     */
    @ReactMethod
    public void getUnhardenedChildNum(ReadableMap currentInstance, int index, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            DerivationPath currentInstanceObj = this.javaObjects.get(sUid);

            int javaResult = currentInstanceObj.getUnhardenedChildNum(index);
            WritableNativeMap result = new WritableNativeMap();
            result.putInt("value", javaResult);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /** Return true if the given index in the path is an hardened child num. */
    @ReactMethod
    public void isHardened(ReadableMap currentInstance, int index, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            DerivationPath currentInstanceObj = this.javaObjects.get(sUid);

            boolean javaResult = currentInstanceObj.isHardened(index);
            WritableNativeMap result = new WritableNativeMap();
            result.putBoolean("value", javaResult);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /** Serialize the given path to a human readable string like "44'/0'/0'/0/0" */
    @ReactMethod
    public void toString(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            DerivationPath currentInstanceObj = this.javaObjects.get(sUid);

            String javaResult = currentInstanceObj.toString();
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
     * Return a derivation path without the last element, e.g. the parent of "44'/0'/0'/0/0" is
     * "44'/0'/0'/0"
     */
    @ReactMethod
    public void getParent(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            DerivationPath currentInstanceObj = this.javaObjects.get(sUid);

            DerivationPath javaResult = currentInstanceObj.getParent();

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreDerivationPath rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreDerivationPath.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreDerivationPath");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /** Return an array where which item is a child num of the path. */
    @ReactMethod
    public void toArray(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            DerivationPath currentInstanceObj = this.javaObjects.get(sUid);

            ArrayList<Integer> javaResult = currentInstanceObj.toArray();
            WritableNativeMap result = new WritableNativeMap();
            WritableNativeArray javaResult_list = new WritableNativeArray();
            for(int javaResult_elem : javaResult)
            {
                javaResult_list.pushInt(javaResult_elem);
            }
            result.putArray("value", javaResult_list);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    @ReactMethod
    public void parse(String path, Promise promise) {
        try
        {
            DerivationPath javaResult = DerivationPath.parse(path);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreDerivationPath rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreDerivationPath.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreDerivationPath");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
}
