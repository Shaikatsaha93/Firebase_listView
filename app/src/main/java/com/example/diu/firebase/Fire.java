package com.example.diu.firebase;

import android.app.Application;

import com.firebase.client.Firebase;

public class Fire extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
