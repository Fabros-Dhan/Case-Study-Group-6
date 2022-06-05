package com.group6.gpacalculator;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class End extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_endpage);
		
		Bundle bundle = getIntent().getExtras();
		
		String Grade = bundle.getString("GWA");
		
		TextView text = (TextView) findViewById(R.id.textView4);
		
		text.setText(Grade);
		
	}

}
