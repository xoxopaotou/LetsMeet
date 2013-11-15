package com.example.moban;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class Send_invitation extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.send_invitation);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.send_invitation, menu);
		return true;
	}
	
}
