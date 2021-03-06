// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from preferences.djinni

package com.ledger.reactnative;

import co.ledger.core.Preferences;
import co.ledger.core.PreferencesEditor;
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

/**
 * Interface for accessing and modifying custom preferences. Preferences are key - value data which will be persisted to
 * the filesystem. They can be local or stored with the Ledger API backend (encrypted by a user secret). This can be used to
 * attach application data to the libledger-core modules (i.e. a wallet pool, a wallet, an account, an operation). This interface
 * is highly inspired by Android SharedPreferences.
 */
public class RCTCorePreferences extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;
    private Map<String, Preferences> javaObjects;
    public Map<String, Preferences> getJavaObjects()
    {
        return javaObjects;
    }

    public RCTCorePreferences(ReactApplicationContext reactContext)
    {
        super(reactContext);
        this.reactContext = reactContext;
        this.javaObjects = new HashMap<String, Preferences>();
        WritableNativeMap.setUseNativeAccessor(true);
    }

    @Override
    public String getName()
    {
        return "RCTCorePreferences";
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
            promise.reject("Failed to release instance of RCTCorePreferences", "First parameter of RCTCorePreferences::release should be an instance of RCTCorePreferences");
        }
    }
    @ReactMethod
    public void log(Promise promise)
    {
        WritableNativeArray result = new WritableNativeArray();
        for (Map.Entry<String, Preferences> elem : this.javaObjects.entrySet())
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
    public static byte[] hexStringToByteArray(String hexString)
    {
        int hexStringLength = hexString.length();
        byte[] data = new byte[hexStringLength / 2];
        for (int i = 0; i < hexStringLength; i += 2)
        {
            data[i / 2] = (byte) ((Character.digit(hexString.charAt(i), 16) << 4) + Character.digit(hexString.charAt(i+1), 16));
        }
        return data;
    }
    static final String HEXES = "0123456789ABCDEF";
    public static String byteArrayToHexString( byte [] data)
    {
        if (data == null)
        {
            return null;
        }
        final StringBuilder hexStringBuilder = new StringBuilder( 2 * data.length );
        for ( final byte b : data )
        {
            hexStringBuilder.append(HEXES.charAt((b & 0xF0) >> 4)).append(HEXES.charAt((b & 0x0F)));
        }
        return hexStringBuilder.toString();
    }

    /**
     * Retrieves the value associated with the given key or fallback to the default value.
     * @return The data associated with the key or fallbackValue.
     */
    @ReactMethod
    public void getString(ReadableMap currentInstance, String key, String fallbackValue, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            Preferences currentInstanceObj = this.javaObjects.get(sUid);

            String javaResult = currentInstanceObj.getString(key, fallbackValue);
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
     * Retrieves the value associated with the given key or fallback to the default value.
     * @return The data associated with the key or fallbackValue.
     */
    @ReactMethod
    public void getInt(ReadableMap currentInstance, String key, int fallbackValue, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            Preferences currentInstanceObj = this.javaObjects.get(sUid);

            int javaResult = currentInstanceObj.getInt(key, fallbackValue);
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
     * Retrieves the value associated with the given key or fallback to the default value.
     * @return The data associated with the key or fallbackValue.
     */
    @ReactMethod
    public void getLong(ReadableMap currentInstance, String key, long fallbackValue, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            Preferences currentInstanceObj = this.javaObjects.get(sUid);

            long javaResult = currentInstanceObj.getLong(key, fallbackValue);
            WritableNativeMap result = new WritableNativeMap();
            result.putDouble("value", javaResult);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Retrieves the value associated with the given key or fallback to the default value.
     * @return The data associated with the key or fallbackValue.
     */
    @ReactMethod
    public void getBoolean(ReadableMap currentInstance, String key, boolean fallbackValue, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            Preferences currentInstanceObj = this.javaObjects.get(sUid);

            boolean javaResult = currentInstanceObj.getBoolean(key, fallbackValue);
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
     * Retrieves the value associated with the given key or fallback to the default value.
     * @return The data associated with the key or fallbackValue.
     */
    @ReactMethod
    public void getStringArray(ReadableMap currentInstance, String key, ReadableArray fallbackValue, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            Preferences currentInstanceObj = this.javaObjects.get(sUid);

            ArrayList<String> javaParam_1 = new ArrayList<String>();
            for (int i = 0; i <  fallbackValue.size(); i++)
            {
                String fallbackValue_elem = fallbackValue.getString(i);
                javaParam_1.add(fallbackValue_elem);
            }
            ArrayList<String> javaResult = currentInstanceObj.getStringArray(key, javaParam_1);
            WritableNativeMap result = new WritableNativeMap();
            WritableNativeArray javaResult_list = new WritableNativeArray();
            for(String javaResult_elem : javaResult)
            {
                javaResult_list.pushString(javaResult_elem);
            }
            result.putArray("value", javaResult_list);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Retrieves the value associated with the given key or fallback to the default value.
     * @return The data associated with the key or fallbackValue.
     */
    @ReactMethod
    public void getData(ReadableMap currentInstance, String key, String fallbackValue, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            Preferences currentInstanceObj = this.javaObjects.get(sUid);

            byte [] javaParam_1 = hexStringToByteArray(fallbackValue);

            byte[] javaResult = currentInstanceObj.getData(key, javaParam_1);
            WritableNativeMap result = new WritableNativeMap();
            String finalJavaResult = byteArrayToHexString(javaResult);
            result.putString("value", finalJavaResult);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Checks whether the Preferences contains the given key.
     * @return true the preferences contains the key, false otherwise.
     */
    @ReactMethod
    public void contains(ReadableMap currentInstance, String key, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            Preferences currentInstanceObj = this.javaObjects.get(sUid);

            boolean javaResult = currentInstanceObj.contains(key);
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
     * Get a preferences editor in order to add/modify/remove data.
     * @return An interface for editting preferences.
     */
    @ReactMethod
    public void edit(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            Preferences currentInstanceObj = this.javaObjects.get(sUid);

            PreferencesEditor javaResult = currentInstanceObj.edit();

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCorePreferencesEditor rctImpl_javaResult = this.reactContext.getNativeModule(RCTCorePreferencesEditor.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCorePreferencesEditor");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
}
