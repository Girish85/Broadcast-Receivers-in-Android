package com.example.usgir.broadcast;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.location.LocationManager;
import android.net.wifi.WifiManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"Activity created",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart(){
        super.onStart();
        Toast.makeText(this,"Activity Started",Toast.LENGTH_SHORT).show();
        WifiManager wifiManager = (WifiManager)getSystemService(Context.WIFI_SERVICE);
        wifiManager.setWifiEnabled(false);
        Toast.makeText(this,"Wifi disabled",Toast.LENGTH_SHORT).show();
    }
    public void onbclick(View view)
    {
        Intent intent=new Intent();
        intent.setAction("CustomBroadcast");
        Toast.makeText(MainActivity.this,"Custom Broadcast Sent",Toast.LENGTH_LONG).show();
        sendBroadcast(intent);
    }
}
