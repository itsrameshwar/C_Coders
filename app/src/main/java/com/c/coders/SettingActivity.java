package com.c.coders;

import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.graphics.*;
import android.media.*;
import android.net.*;
import android.text.*;
import android.util.*;
import android.webkit.*;
import android.animation.*;
import android.view.animation.*;
import java.util.*;
import java.text.*;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import java.util.ArrayList;
import android.widget.ScrollView;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import android.app.Activity;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.content.Intent;
import android.net.Uri;
import android.widget.CompoundButton;
import android.widget.AdapterView;
import android.view.View;

public class SettingActivity extends AppCompatActivity {
	
	
	private Toolbar _toolbar;
	private double n = 0;
	private String list = "";
	private String list1 = "";
	
	private ArrayList<String> list2 = new ArrayList<>();
	
	private ScrollView vscroll1;
	private LinearLayout linear1;
	private LinearLayout linear3;
	private LinearLayout linear4;
	private LinearLayout linear5;
	private LinearLayout linear6;
	private LinearLayout linear7;
	private Switch switch2;
	private Switch switch3;
	private TextView textview1;
	private Spinner spinner1;
	private TextView textview4;
	private TextView textview3;
	
	private SharedPreferences f;
	private SharedPreferences f1;
	private MediaPlayer m;
	private SoundPool s;
	private SharedPreferences f2;
	private Intent i = new Intent();
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.setting);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		_toolbar = (Toolbar) findViewById(R.id._toolbar);
		setSupportActionBar(_toolbar);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setHomeButtonEnabled(true);
		_toolbar.setNavigationOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _v) {
				onBackPressed();
			}
		});
		vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		linear7 = (LinearLayout) findViewById(R.id.linear7);
		switch2 = (Switch) findViewById(R.id.switch2);
		switch3 = (Switch) findViewById(R.id.switch3);
		textview1 = (TextView) findViewById(R.id.textview1);
		spinner1 = (Spinner) findViewById(R.id.spinner1);
		textview4 = (TextView) findViewById(R.id.textview4);
		textview3 = (TextView) findViewById(R.id.textview3);
		f = getSharedPreferences("f", Activity.MODE_PRIVATE);
		f1 = getSharedPreferences("f1", Activity.MODE_PRIVATE);
		f2 = getSharedPreferences("f2", Activity.MODE_PRIVATE);
		
		switch2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2)  {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					f.edit().putString("a", "1").commit();
					vscroll1.setBackgroundResource(R.drawable.code9);
					spinner1.setBackgroundColor(0xFFFFFFFF);
					switch2.setTextColor(0xFFFFFFFF);
					switch3.setTextColor(0xFFFFFFFF);
					textview1.setTextColor(0xFFFFFFFF);
					textview4.setTextColor(0xFFFFFFFF);
					textview3.setTextColor(0xFFFFFFFF);
					android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable(); gd.setColor(Color.parseColor("#616161")); gd.setCornerRadius(10); 
					linear3.setBackground(gd);
					linear5.setBackground(gd);
					linear6.setBackground(gd);
					linear7.setBackground(gd);
					linear4.setBackground(gd);
					switch2.setBackground(gd);
					switch3.setBackground(gd);
					
				}
				else {
					f.edit().putString("a", "0").commit();
					vscroll1.setBackgroundResource(R.drawable.code8);
					spinner1.setBackgroundColor(0xFFFFFFFF);
					textview1.setTextColor(0xFF000000);
					switch2.setTextColor(0xFF000000);
					switch3.setTextColor(0xFF000000);
					textview4.setTextColor(0xFF000000);
					textview3.setTextColor(0xFF000000);
					android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable(); gd.setColor(Color.parseColor("#7986CB")); gd.setCornerRadius(10); 
					linear3.setBackground(gd);
					linear5.setBackground(gd);
					linear6.setBackground(gd);
					linear7.setBackground(gd);
					linear4.setBackground(gd);
					switch3.setBackground(gd);
					switch2.setBackground(gd);
					spinner1.setBackground(gd);
				}
			}
		});
		
		switch3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2)  {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					f1.edit().putString("b", "1").commit();
					m = MediaPlayer.create(getApplicationContext(), R.raw.facebook_ringtone_pop);
					m.start();
				}
				else {
					f1.edit().putString("b", "0").commit();
					m.pause();
				}
			}
		});
		
		spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				
			}
			
			@Override
			public void onNothingSelected(AdapterView<?> _param1) {
				
			}
		});
		
		textview4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=com.rameshwar.c.coders")));
				if (f1.getString("b", "").equals("1")) {
					
					m.start();
				}
				else {
					
				}
			}
		});
		
		textview3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), ReferenceActivity.class);
				startActivity(i);
				if (f1.getString("b", "").equals("1")) {
					
					m.start();
				}
				else {
					
				}
			}
		});
	}
	private void initializeLogic() {
		setTitle("Settings");
		n = 10;
		for(int _repeat12 = 0; _repeat12 < (int)(25); _repeat12++) {
			list2.add(String.valueOf((long)(n)));
			n++;
		}
		spinner1.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, list2));
		((ArrayAdapter)spinner1.getAdapter()).notifyDataSetChanged();
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	@Override
	public void onStart() {
		super.onStart();
		if (f.getString("a", "").equals("1")) {
			vscroll1.setBackgroundResource(R.drawable.code9);
			spinner1.setBackgroundColor(0xFFFFFFFF);
			switch3.setTextColor(0xFFFFFFFF);
			switch2.setChecked(true);
			switch2.setTextColor(0xFFFFFFFF);
			android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable(); gd.setColor(Color.parseColor("#616161")); gd.setCornerRadius(10); 
			linear3.setBackground(gd);
			linear5.setBackground(gd);
			linear6.setBackground(gd);
			linear7.setBackground(gd);
			linear4.setBackground(gd);
			switch3.setBackground(gd);
			switch2.setBackground(gd);
		}
		else {
			vscroll1.setBackgroundResource(R.drawable.code8);
			spinner1.setBackgroundColor(0xFFFFFFFF);
			switch2.setTextColor(0xFF000000);
			switch3.setTextColor(0xFF000000);
			android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable(); gd.setColor(Color.parseColor("#7986CB")); gd.setCornerRadius(10); 
			linear3.setBackground(gd);
			linear5.setBackground(gd);
			linear6.setBackground(gd);
			linear7.setBackground(gd);
			linear4.setBackground(gd);
			switch2.setBackground(gd);
			switch3.setBackground(gd);
			spinner1.setBackground(gd);
		}
		if (f1.getString("b", "").equals("1")) {
			switch3.setChecked(true);
			m.pause();
		}
	}
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input){
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels(){
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels(){
		return getResources().getDisplayMetrics().heightPixels;
	}
	
}
