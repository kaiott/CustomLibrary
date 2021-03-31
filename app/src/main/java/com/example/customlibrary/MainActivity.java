package com.example.customlibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import com.example.mylibrary.KaisUtils;

import timber.log.Timber;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(BuildConfig.DEBUG){
            Timber.plant(new Timber.DebugTree());
        }

        double[] data = {1d,23.44,556,7d,.65,.4,43d,3.43,3.32,3d,32d,.3,4d,.34,432d,.4};
        double[] data2 = {3,4,5,64,3,1,2};
        double[] data3 = {0.003,0.04,0.0005,0.05,0.0,0.02,0.0112};
        Timber.i("onCreate: Max: %s", KaisUtils.max(data));
        Timber.i("onCreate: Argmax: %s", KaisUtils.argmax(data2));
        Timber.i("onCreate: MaxDB: %s", KaisUtils.amplitudeToDB(KaisUtils.max(data3)));
    }
}