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
	 //���û��� 
	 //����Activity���onKeyDown(int keyCoder,KeyEvent event)����  
	 public boolean onKeyDown(int keyCode, KeyEvent event) { 
		 if ((keyCode == KeyEvent.KEYCODE_BACK) && webview.canGoBack()) { 
			 webview.goBack(); //goBack()��ʾ����WebView����һҳ�� 
			 return true; 
		 } 
	     return false; 
	 } 
	 
	//Web��ͼ 
    private class HelloWebViewClient extends WebViewClient { 
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) { 
            view.loadUrl(url); 
            return true; 
        } 
    }

}
