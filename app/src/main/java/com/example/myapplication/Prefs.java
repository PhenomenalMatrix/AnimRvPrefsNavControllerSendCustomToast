package com.example.myapplication;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

public class Prefs {
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    public Prefs(Activity activity) {
        sharedPreferences = activity.getPreferences(Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
    }

    public void saveDate(String txt){
        editor.putString("key",txt);
        editor.apply();
    }

    public String getData(){
        String txt = sharedPreferences.getString("key","empty");
        return txt;
    }

    public void saveImage(int id){
        editor.putInt("imageKey",id);
        editor.apply();
    }

    public int getImage(){
        return sharedPreferences.getInt("imageKey", R.drawable.ic_launcher_background);
    }

}
