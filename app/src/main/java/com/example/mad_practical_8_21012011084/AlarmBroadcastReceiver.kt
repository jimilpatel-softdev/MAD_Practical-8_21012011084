package com.example.mad_practical_8_21012011084

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class AlarmBroadcastReceiver : BroadcastReceiver() {

    companion object{
        val ALARMKEY="Key"
        val ALARMSTART="Start"
        val ALARMSTOP="Stop"
    }
    override fun onReceive(context: Context, intent: Intent) {
        // This method is called when the BroadcastReceiver is receiving an Intent broadcast.
        val DATA=intent.getStringExtra(ALARMKEY)
        val intentservice=Intent(context,AlarmService::class.java)
        if (DATA == ALARMSTART){
            context.startService(intentservice)
        }
        else{
            context.stopService(intentservice)
        }
    }
}