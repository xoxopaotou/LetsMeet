package com.example.moban;
 
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class Schedule_an_event extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.schedule_an_event);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.schedule_an_event, menu);
		return true;
	}
	
	public void login(View v){
		Intent intent = new Intent(Schedule_an_event.this, Mymeet.class);
		startActivity(intent);
	}
	
	
	 public void date(View v){
	    	Intent intent = new Intent(Schedule_an_event.this, DatePicke.class);
			startActivity(intent);
	    	
	    	
	    }
	    
	   
	  }
