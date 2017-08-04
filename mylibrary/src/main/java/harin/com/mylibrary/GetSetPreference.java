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

    public static SharedPreferences sharedPreferences;

    public static void setString(Context context, @NonNull String key, @NonNull String value) {
        sharedPreferences = new HarinSharedPreference(context, context.getSharedPreferences(key, Context.MODE_PRIVATE));
        sharedPreferences.edit().putString(key, value).apply();
    }

    public static String getString(Context context, @NonNull String key) {
        sharedPreferences = new HarinSharedPreference(context, context.getSharedPreferences(key, Context.MODE_PRIVATE));
        return sharedPreferences.getString(key, null);
    }





}
