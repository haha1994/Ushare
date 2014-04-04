package com.haha.ushare;

//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.PrintStream;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class Source extends Activity {

	String filename;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.source_layout);

		final EditText searchinput = (EditText) findViewById(R.id.searchinput);

		ImageButton searchbutton = (ImageButton) findViewById(R.id.serachbutton);
		searchbutton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				String text = searchinput.getText().toString();
				if (text.equals("")) {
					toast("你还没输入呢。。。");
				} else {
					filename = text;
					write(filename , "succeed!");
					toast("no source about " + text + "!");
				}

			}
		});
	}

	// 向SD卡中文件写入
	private void write(String filename, String message) {
		try {
			if (Environment.getExternalStorageState().equals(
					Environment.MEDIA_MOUNTED)) {
				//获取SD卡目录
				File sdCardDir = Environment.getExternalStorageDirectory();
				File path = new File(sdCardDir.getCanonicalPath() + "/com/haha/Ushare/");
				File targetFile = new File(sdCardDir.getCanonicalPath() + "/com/haha/Ushare/" + filename);
				
				if(!path.exists()){ 
					//2.创建目录，可以在应用启动的时候创建 
					path.mkdirs(); 
					}
					if (!targetFile.exists()) { 
					//3.创建文件 
						targetFile.createNewFile(); 
					} 
					
				//以指定文件创建 RandomAccessFile对象
				RandomAccessFile raf = new RandomAccessFile(targetFile , "rw");
				//将文件指针移动到最后
				raf.seek(targetFile.length());
				//输出文件内容
				raf.write(message.getBytes());
				raf.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 向应用程序文件中写东西
	// private void write(String filename , String message){
	// try {
	// FileOutputStream fos = openFileOutput(filename, MODE_APPEND);
	// PrintStream ps = new PrintStream(fos);
	// ps.println(message);
	// ps.close();
	// } catch (FileNotFoundException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// }

	private void toast(String content) {
		Toast mtoast = Toast.makeText(this, content, Toast.LENGTH_SHORT);
		mtoast.show();
	}

}
