package com.haha.ushare;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//������
		ImageButton newsbn = (ImageButton)this.findViewById(R.id.news);
		newsbn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				toast("no news!");
				Intent intent = new Intent(MainActivity.this,News.class);
				startActivity(intent);
			}
		});
		
		//�α�
		ImageButton coursebn = (ImageButton)this.findViewById(R.id.course);
		coursebn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
//				toast("no course!");
				Intent intent = new Intent(MainActivity.this,Course.class);
				startActivity(intent);
			}
		});
		
		//����
		ImageButton settingbn = (ImageButton)this.findViewById(R.id.setting);
		settingbn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				toast("no setting!");
				Intent intent = new Intent(MainActivity.this,Setting.class);
				startActivity(intent);
			}
		});
		
		//��Դ
		ImageButton sourcebn = (ImageButton)this.findViewById(R.id.source);
		sourcebn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(MainActivity.this,Source.class);
				startActivity(intent);
			}
		});
		
	}
	
	private void showDialog(){
		AlertDialog.Builder mbuilder = new AlertDialog.Builder(this);
		mbuilder.setTitle("��ܰ��ʾ");
		mbuilder.setMessage("ȷ���˳���");
		mbuilder.setPositiveButton("ȷ��", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				dialog.dismiss();
				MainActivity.this.finish();
			}
		});
		mbuilder.setNegativeButton("ȡ��", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				dialog.dismiss();
			}
		});
		mbuilder.show();
	}
	
	@Override
	public void onBackPressed() {
		showDialog();
	}

	private void toast(String content){
		Toast mtoast = Toast.makeText(this,content,Toast.LENGTH_SHORT);
		mtoast.show();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
