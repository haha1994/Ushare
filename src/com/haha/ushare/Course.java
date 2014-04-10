package com.haha.ushare;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Environment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Course extends Activity{
	
	private int colors[] = {
			Color.rgb(0xee,0xff,0xff),
			Color.rgb(0xf0,0x96,0x09),
			Color.rgb(0x8c,0xbf,0x26),
			Color.rgb(0x00,0xab,0xa9),
			Color.rgb(0x99,0x6c,0x33),
			Color.rgb(0x3b,0x92,0xbc),
			Color.rgb(0xd5,0x4d,0x34),
			Color.rgb(0xcc,0xcc,0xcc),
			Color.argb(0x80, 0x00, 0x00, 0x00),
			Color.argb(0x00, 0x00, 0x00, 0x00)
		};

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.course_layout);
		
		 LinearLayout ll1 = (LinearLayout)findViewById(R.id.ll1);
	        LinearLayout ll2 = (LinearLayout)findViewById(R.id.ll2);
	        LinearLayout ll3 = (LinearLayout)findViewById(R.id.ll3);
	        LinearLayout ll4 = (LinearLayout)findViewById(R.id.ll4);
	        LinearLayout ll5 = (LinearLayout)findViewById(R.id.ll5);
	        LinearLayout ll6 = (LinearLayout)findViewById(R.id.ll6);
	        LinearLayout ll7 = (LinearLayout)findViewById(R.id.ll7);
	        //每天的课程设置
//	        setClass(ll1, "", "", "", "", 2, 0);
	        setClass(ll1, "数据库系统", "仙I 524", "1-18周，每一周", "8:00-11:00", 3, 8);
	        setNoClass(ll1, 1, 9);
	        setClass(ll1, "计算机网络", "仙I 524", "1-18周，每一周", "14:00-17:00", 3, 8);
//	        setNoClass(ll1, 1, 0);
//	        setClass(ll1, "人文化学", "一区 3-404", "3-13周，每一周", "19:00-20:30", 2, 8);
//	        setNoClass(ll1, 1, 0);
	        
	        setClass(ll2, "体育", "游泳馆", "1-18周，每一周", "8:00-9:50", 2, 8);
	        setClass(ll2, "上机", "机房", "1-18，每一周", "10:10-12:00", 2, 8);
//	        setNoClass(ll2, 3, 0);
	        setClass(ll2, "软件工程统计方法", "仙I 524", "1-18周，每一周", "14:00-15:50", 2, 8);
//	        setNoClass(ll2, 1, 0);
//	        setClass(ll2, "中国近现代史纲要", "3区 1-327", "1-9周，每一周", "19:00-21:25", 3, 8);
	        
	        setNoClass(ll3, 4, 9);
	        setClass(ll3, "计算机与操作系统", "仙I 524", "1-18周，单周", "14:00-15:50", 2, 8);
	        setNoClass(ll3, 2, 9);
	        setClass(ll3, "上机", "机房", "1-18周，每一周", "18:30-21:30", 3, 8);
//	        setNoClass(ll3, 3, 0);
//	        setClass(ll3, "当代政治与经济", "3区 1-501", "1-7周，每一周", "19:00-21:25", 3, 8);
	        
	        setNoClass(ll4, 2, 9);
	        setClass(ll4, "软件工程统计方法", "仙I 524", "1-18周，双周", "10:10-12:00", 2, 8);
	        setClass(ll4, "软件工程与计算", "仙I 106", "1-18周，每一周", "14:00-15:50", 2, 8);
//	        setNoClass(ll4, 1, 0);
	        setClass(ll4, "艺术社会学", "仙II 122", "2-17周，每一周", "16:10-18:00", 2, 8);
//	        setNoClass(ll4, 2, 0);
//	        setNoClass(ll4, 3, 0);
	        
	        setClass(ll5, "上机", "机房", "1-18周，每一周", "8:00-9:50", 2, 8);
	        setClass(ll5, "计算机与操作系统", "仙I 524", "1-18周，每一周", "10:10-12:00", 2, 8);
//	        setNoClass(ll5, 2, 0);
	        setClass(ll5, "毛泽东思想和中国特色社会主义理论体系概论", "图书馆 125", "1-18周，每一周", "14:00-17:00", 3, 8);
//	        setNoClass(ll5, 2, 0);
//	        setClass(ll5, "手机应用分析与创意", "1区 5-103", "1-7周，每一周", "19:00-21:2", 3, 8);
	        
//	        setNoClass(ll6, 14, 0);
	        
//	        setNoClass(ll7, 14, 0);
	     
		
		String filename = "course.txt";
		try {
			if(Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)){
				File sdCardDir = Environment.getExternalStorageDirectory();
				File path = new File(sdCardDir.getCanonicalPath() + "/com/haha/Ushare/");
				File targetFile = new File(sdCardDir.getCanonicalPath() + "/com/haha/Ushare/" + filename);
				if(!path.exists()){
					path.mkdirs(); 
				}
				if (!targetFile.exists()) { 
					//3.创建文件 
					targetFile.createNewFile(); 
				}
				FileInputStream fis = new FileInputStream(sdCardDir.getCanonicalPath() + "/com/haha/Ushare/" + filename);
				BufferedReader br = new BufferedReader(new InputStreamReader(fis));
				String line = "";
				while((line = br.readLine()) != null){
//					toast(line);
				}
				br.close();
			}
		} catch (IOException e) {
			toast("fail");
		}
		
		//AddCourse
		TextView addCourse = (TextView)findViewById(R.id.addCourse);
		addCourse.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				Intent intent = new Intent(Course.this,AddCourse.class);
				startActivity(intent);
			}
		});
	}
	
	 /**
     * 设置课程的方法
     * @param ll
     * @param title 课程名称
     * @param place 地点
     * @param last 时间
     * @param time 周次
     * @param classes 节数
     * @param color 背景色
     */
    void setClass(LinearLayout ll, String title, String place,
    		String last, String time, int classes, int color)
    {
    	View view = LayoutInflater.from(this).inflate(R.layout.item, null);
    	view.setMinimumHeight(dip2px(this,classes * 48));
    	view.setBackgroundColor(colors[color]);
    	((TextView)view.findViewById(R.id.title)).setText(title);
        ((TextView)view.findViewById(R.id.place)).setText(place);
        ((TextView)view.findViewById(R.id.last)).setText(last);
        ((TextView)view.findViewById(R.id.time)).setText(time);
        //为课程View设置点击的监听器
        view.setOnClickListener(new OnClickClassListener());
        TextView blank1 = new TextView(this);
        TextView blank2 = new TextView(this);
        blank1.setHeight(dip2px(this,classes));
        blank2.setHeight(dip2px(this,classes));
        ll.addView(blank1);
        ll.addView(view);
        ll.addView(blank2);
    }
    /**
     * 设置无课（空百）
     * @param ll
     * @param classes 无课的节数（长度）
     * @param color
     */
    void setNoClass(LinearLayout ll,int classes, int color)
    {
    	TextView blank = new TextView(this);
    	if(color == 9)
    		blank.setMinHeight(dip2px(this,classes * 50));
    	blank.setBackgroundColor(colors[color]);
    	ll.addView(blank);
    }
    //点击课程的监听器
    class OnClickClassListener implements OnClickListener{
    	
    	public void onClick(View v) {
    		// TODO Auto-generated method stub
    		String title;
    		title = (String) ((TextView)v.findViewById(R.id.title)).getText();
    		toast("你点击的是：" + title);
    	}
	}
    
    public static int dip2px(Context context, float dpValue) {        
    	final float scale = context.getResources().getDisplayMetrics().density;        
    	return (int) (dpValue * scale + 0.5f);} /** * 根据手机的分辨率从 px(像素) 的单位 转成为 dp */
    public static int px2dip(Context context, float pxValue) {        
    	final float scale = context.getResources().getDisplayMetrics().density;        
    	return (int) (pxValue / scale + 0.5f);}
    
    private void toast(String content){
		Toast mtoast = Toast.makeText(this,content,Toast.LENGTH_SHORT);
		mtoast.show();
	}
	
}
