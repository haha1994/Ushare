package com.haha.ushare;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.*;
import android.widget.TextView;
import android.widget.Toast;

public class AddCourse extends Activity{
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.addcourse_layout);
		
		TextView sure = (TextView)findViewById(R.id.addCourseSure);
		sure.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				toast("Ìí¼Ó³É¹¦£¡");
			}
		});
		
		TextView cancel = (TextView)findViewById(R.id.addCourseCancel);
		cancel.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
//				onKeyDown(KeyEvent.KEYCODE_BACK, null);
				onBackPressed();
			}
		});
	}
	
	private void toast(String content){
		Toast mtoast = Toast.makeText(this,content,Toast.LENGTH_SHORT);
		mtoast.show();
	}
}
