package com.i33d.eastair;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;



public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		ImageButton imgmenu1=(ImageButton)findViewById(R.id.menu1);
		imgmenu1.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent it = new Intent(MainActivity.this,SubMenuActivity.class);
				it.putExtra("menuitem", 0);
				MainActivity.this.startActivity(it);				
				
			}});
		
		
		ImageButton imgmenu2=(ImageButton)findViewById(R.id.menu2);
		imgmenu2.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				Intent it = new Intent(MainActivity.this,SubMenuActivity.class);
				it.putExtra("menuitem", 0x0001);
				MainActivity.this.startActivity(it);	
				
			}});
		
		ImageButton imgmenu3=(ImageButton)findViewById(R.id.menu3);
		imgmenu3.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				Intent it = new Intent(MainActivity.this,SubMenuActivity.class);
				it.putExtra("menuitem", 0x0002);
				MainActivity.this.startActivity(it);	
				
			}});
		
		ImageButton imgmenu4=(ImageButton)findViewById(R.id.menu4);
		imgmenu4.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				Intent it = new Intent(MainActivity.this,SubMenuActivity.class);
				it.putExtra("menuitem", 0x0003);
				MainActivity.this.startActivity(it);	
				
			}});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
