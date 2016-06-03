package com.example.ringmode;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

public class BackgroundService extends Service {
	
	
	 @Override
	  public int onStartCommand(Intent intent, int flags, int startId) {
	    //TODO do something useful
	    return Service.START_NOT_STICKY;
	  }
	 
	 
	@Override
	public IBinder onBind(Intent arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void onDestroyed(){
        Toast.makeText(this, "Ring Mode Stopped", 100).show();
        super.onDestroy();
    }

}
