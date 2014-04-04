package com.haha.ushare;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class Course extends Activity{

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.course_layout);
		
		TextView addCourse = (TextView)findViewById(R.id.addCourse);
		addCourse.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				Intent intent = new Intent(Course.this,AddCourse.class);
				startActivity(intent);
			}
		});
	}

}
