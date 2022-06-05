package com.group6.gpacalculator;

import java.text.DecimalFormat;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main extends Activity{
	private EditText edt1,edt2,edt3,edt4,edt5,edt6,edt7;
	private Intent intent;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mainpage);
		
		
		 edt1 = (EditText) findViewById(R.id.editText1);
		 edt2 = (EditText) findViewById(R.id.editText2);
		 edt3 = (EditText) findViewById(R.id.editText3);
		 edt4 = (EditText) findViewById(R.id.editText4);
		 edt5 = (EditText) findViewById(R.id.editText5);
		 edt6 = (EditText) findViewById(R.id.editText6);
		 edt7 = (EditText) findViewById(R.id.editText7);
		Button btn = (Button) findViewById(R.id.button1);
		intent = (new Intent(Main.this, End.class));
		
		btn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
			double n1 = Double.parseDouble(edt1.getText().toString());
			double n2 = Double.parseDouble(edt2.getText().toString());
			double n3 = Double.parseDouble(edt3.getText().toString());
			double n4 = Double.parseDouble(edt4.getText().toString());
			double n5 = Double.parseDouble(edt5.getText().toString());
			double n6 = Double.parseDouble(edt6.getText().toString());
			double n7 = Double.parseDouble(edt7.getText().toString());
				
			double product1 = n1*5;
			double product2= n2*5;
			double product3= n3*3;
			double product4= n4*5;
			double product5= n5*3;
			double product6= n6*2;
			double product7= n7*3;
			
			double sum = (product1+product2+product3+product4+product5
					+product6+product7);
			DecimalFormat df = new DecimalFormat("#.##");
			double sum1 = (sum/26);
				
			if (sum1 >= 5.1 || sum1<=0.9) {
				Toast.makeText(Main.this, "Invalid",Toast.LENGTH_LONG).show();
			}else {
				intent.putExtra("GWA", df.format(sum1));
				startActivity(intent);
				finish();
			}
			
			}
		});
		
		Button btn2 =(Button) findViewById(R.id.button2);
		
		btn2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				edt1.getText().clear();
				edt2.getText().clear();
				edt3.getText().clear();
				edt4.getText().clear();
				edt5.getText().clear();
				edt6.getText().clear();
				edt7.getText().clear();
				
				
			}
		});
	}

}
