package com.haha.ushare;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class News extends Activity{

	private WebView webview;
	private Button back;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.news_layout);
		
		back = (Button)findViewById(R.id.back);
		back.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				News.this.finish();
			}
		});
		
		webview = (WebView)findViewById(R.id.webview1);
		webview.getSettings().setJavaScriptEnabled(true);
		webview.loadUrl("http://www.baidu.com");
		webview.setWebViewClient(new HelloWebViewClient ());
	}
	
	 @Override
	 //设置回退 
	 //覆盖Activity类的onKeyDown(int keyCoder,KeyEvent event)方法  
	 public boolean onKeyDown(int keyCode, KeyEvent event) { 
		 if ((keyCode == KeyEvent.KEYCODE_BACK) && webview.canGoBack()) { 
			 webview.goBack(); //goBack()表示返回WebView的上一页面 
			 return true; 
		 } 
	     return false; 
	 } 
	 
	//Web视图 
    private class HelloWebViewClient extends WebViewClient { 
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) { 
            view.loadUrl(url); 
            return true; 
        } 
    }

}
