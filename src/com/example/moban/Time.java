package com.example.moban;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class Time extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.time);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.time, menu);
		return true;
	}
	 
	public void login(View v){
		Intent intent = new Intent(Time.this, DatePicke.class);
		startActivity(intent);
	}
	
	
	 public void send_invitation(View v){
	    	Intent intent = new Intent(Time.this, Send_invitation.class);
			startActivity(intent);
	    	
	    	
	    }
	
}
