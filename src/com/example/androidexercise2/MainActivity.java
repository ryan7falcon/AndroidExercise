package com.example.androidexercise2;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	//button
	private Button btnOK;
	//text label
	private TextView textView1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//load controls
		btnOK = (Button)findViewById(R.id.btnOK);
		textView1 = (TextView)findViewById(R.id.textView1);
		
		//button handler
		btnOK.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				onOk();
			}
		});
		
	}
	
	//on ok button click
	private void onOk(){
		//change the text in the text view in TextView1
		textView1.setText("Hello");
		//create a dialog box
		AlertDialog dlg = new AlertDialog.Builder(this).create();
		dlg.setTitle("Title");
		dlg.setMessage("Message");
		dlg.setButton(AlertDialog.BUTTON_POSITIVE, "OK", (DialogInterface.OnClickListener)null);
		dlg.setButton(AlertDialog.BUTTON_NEUTRAL, "Cancel", (DialogInterface.OnClickListener)null);
		dlg.show(); // Does not wait for dialog!
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
