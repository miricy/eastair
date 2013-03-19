package com.i33d.eastair;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageButton;
import android.widget.ImageView;

public class SubMenuActivity extends Activity {

	private WebView webView=null;
	String homeUrl="file:///android_asset/menu1.html";
	String subUrl="file:///android_asset/menu1.html";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		int menuitem=this.getIntent().getIntExtra("menuitem",0);
		this.getIntent().getExtras().clear();
		setContentView(R.layout.activity_sub_menu);
		webView =(WebView)findViewById(R.id.webview);
		webView.setWebViewClient(new WebViewClient(){

			@Override
			public boolean shouldOverrideUrlLoading(WebView view, String url) {
				// TODO Auto-generated method stub
				subUrl=url;
				return super.shouldOverrideUrlLoading(view, url);
			}

			@Override
			public void onReceivedError(WebView view, int errorCode,
					String description, String failingUrl) {
				// TODO Auto-generated method stub
				
				super.onReceivedError(view, errorCode, description, failingUrl);
			}});
		
		
		
		ImageButton imgBack=(ImageButton)findViewById(R.id.menu_back);
		imgBack.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				if(subUrl.equalsIgnoreCase(homeUrl))
				{
				   SubMenuActivity.this.finish();
				}
				else
				{
					subUrl=homeUrl;
					webView.loadUrl(homeUrl);
				}
			}});
		ImageView imgTitle=(ImageView)findViewById(R.id.menu_title);
		switch(menuitem)
		{
		case 0:
			imgTitle.setImageDrawable(SubMenuActivity.this.getResources().getDrawable(R.drawable.menu1_title));
			subUrl=homeUrl="file:///android_asset/menu1.html";			
			break;
			
		case 1:
			imgTitle.setImageDrawable(SubMenuActivity.this.getResources().getDrawable(R.drawable.menu2_title));
			subUrl=homeUrl="file:///android_asset/menu2.html";
			break;
		case 2:
			imgTitle.setImageDrawable(SubMenuActivity.this.getResources().getDrawable(R.drawable.menu3_title));
			subUrl=homeUrl="file:///android_asset/menu3.html";
			break;
		case 3:
			imgTitle.setImageDrawable(SubMenuActivity.this.getResources().getDrawable(R.drawable.menu4_title));
			subUrl=homeUrl="file:///android_asset/menu4.html";
			break;
		}
		
		webView.loadUrl(homeUrl);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_sub_menu, menu);
		return true;
	}

}
