package harin.com.mylibrary;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;

/**
 * Created by Life on 04.08.2017 - 8:16 PM
 * <p>
 * File description :
 */

public class GetSetPreference {

    private static SharedPreferences sharedPreferences;

    ///////////////////////////////////////////////////////////////////////////
    // string preference
    ///////////////////////////////////////////////////////////////////////////
    public static void setString(Context context, @NonNull String key, @NonNull String value) {
        initPref(context, key);
        sharedPreferences.edit().putString(key, value).apply();
    }

    public static String getString(Context context, @NonNull String key) {
        //initPref(context, key);
        return sharedPreferences.getString(key, null);
    }

    ///////////////////////////////////////////////////////////////////////////
    // int preference
    ///////////////////////////////////////////////////////////////////////////
    public static void setInt(Context context, @NonNull String key, @NonNull int value) {
        initPref(context, key);
        sharedPreferences.edit().putInt(key, value).apply();
    }

    public static int getInt(Context context, @NonNull String key) {
        //initPref(context, key);
        return sharedPreferences.getInt(key, 1);
    }

    ///////////////////////////////////////////////////////////////////////////
    // boolean preference
    ///////////////////////////////////////////////////////////////////////////
    public static void setBoolean(Context context, @NonNull String key, boolean value) {
        initPref(context, key);
        sharedPreferences.edit().putBoolean(key, value).apply();
    }

    public static boolean getBoolean(Context context, @NonNull String key) {
        //initPref(context, key);
        return sharedPreferences.getBoolean(key, false);
    }

    ///////////////////////////////////////////////////////////////////////////
    // Float preference
    ///////////////////////////////////////////////////////////////////////////
    public static void setFloat(Context context, @NonNull String key, @NonNull float value){
        initPref(context, key);
        sharedPreferences.edit().putFloat(key, value).apply();
    }

    public static float getFloat(Context context, @NonNull String key){
        //initPref(context, key);
        return sharedPreferences.getFloat(key, 0);
    }


    ///////////////////////////////////////////////////////////////////////////
    // Long share preference
    ///////////////////////////////////////////////////////////////////////////
    public static void setLong(Context context, @NonNull String key, @NonNull long value){
        initPref(context, key);
        sharedPreferences.edit().putLong(key, value).apply();
    }

    public static long getLong(Context context, @NonNull String key){
        //initPref(context, key);
        return sharedPreferences.getLong(key, 0);
    }

    ///////////////////////////////////////////////////////////////////////////
    // initialie share preference with keys
    ///////////////////////////////////////////////////////////////////////////
    private static void initPref(Context context, @NonNull String key) {
        sharedPreferences = new HarinSharedPreference(context, context.getSharedPreferences(key, Context.MODE_PRIVATE));
    }

    /*
    *  To clear all the stored SharedPreferences
    * */
    public static void ClearAllPreference() {
        sharedPreferences.edit().clear().apply();
    }


}
