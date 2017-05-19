package com.example.usgir.broadcastreceivers;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by usgir on 5/18/2017.
 */

public class recieverone extends BroadcastReceiver{
    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equalsIgnoreCase("yup"))
        {
            Toast.makeText(context,"Yup Intent Received",Toast.LENGTH_LONG).show();
        }
        else Toast.makeText(context,"Received System Intent",Toast.LENGTH_LONG).show();
    }
}
