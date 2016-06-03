package com.example.ringmode;

import java.io.IOException;
import java.util.ArrayList;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class SecondActivity extends Activity {

	
 
    
   
	//SQLiteDatabase Mydatabase=openOrCreateDatabase("mode", MODE_PRIVATE, null);
	ArrayList<String> aa;
    EditText silent,ring,vibrate;
    Button save;
  
  
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_second);
        
        silent=(EditText)findViewById(R.id.silent);
        ring=(EditText)findViewById(R.id.ring);
        vibrate=(EditText)findViewById(R.id.vibrate);
       
        // setting default values///
        silent.setText(""+StaticDB.getSilent());
        ring.setText(""+StaticDB.getRing());
        vibrate.setText(""+StaticDB.getVibrate());
       
        
        

		 save=(Button)findViewById(R.id.save);
		 
	        save.setOnClickListener(new OnClickListener() {
				
				@SuppressLint("ShowToast") @Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					StaticDB.setSilent( new String(silent.getText().toString()));
					StaticDB.setRing(new String(ring.getText().toString()));
					StaticDB.setVibrate(new String(vibrate.getText().toString()));
					
					Toast.makeText(getApplicationContext(), StaticDB.getSilent(), 100).show();
					
					
				Intent it=new Intent(SecondActivity.this,ThirdActivity.class);
				startActivity(it);
				
				
				
				}
			});
	        
		
    }
}
     
