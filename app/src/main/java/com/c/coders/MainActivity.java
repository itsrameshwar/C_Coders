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
import android.support.design.widget.FloatingActionButton;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ImageView;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.animation.ObjectAnimator;
import android.view.animation.LinearInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.BounceInterpolator;
import android.app.Activity;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.view.View;

public class MainActivity extends AppCompatActivity {
	
	
	private Toolbar _toolbar;
	private FloatingActionButton _fab;
	private DrawerLayout _drawer;
	private double n = 0;
	private String str = "";
	private String message = "";
	
	private ScrollView vscroll1;
	private LinearLayout linear2;
	private LinearLayout linear1;
	private Button button1;
	private Button button17;
	private Button button2;
	private Button button3;
	private Button button4;
	private Button button5;
	private Button button6;
	private Button button7;
	private Button button8;
	private Button button9;
	private Button button10;
	private Button button11;
	private Button button12;
	private Button button18;
	private Button button13;
	private Button button14;
	private Button button15;
	private Button button16;
	private TextView textview1;
	private ScrollView _drawer_vscroll1;
	private LinearLayout _drawer_linear1;
	private TextView _drawer_textview13;
	private ImageView _drawer_imageview3;
	private LinearLayout _drawer_linear13;
	private LinearLayout _drawer_linear3;
	private LinearLayout _drawer_linear14;
	private LinearLayout _drawer_linear4;
	private LinearLayout _drawer_linear5;
	private LinearLayout _drawer_linear9;
	private LinearLayout _drawer_linear10;
	private LinearLayout _drawer_linear11;
	private LinearLayout _drawer_linear6;
	private LinearLayout _drawer_linear7;
	private ImageView _drawer_imageview14;
	private TextView _drawer_textview11;
	private ImageView _drawer_imageview5;
	private TextView _drawer_textview2;
	private ImageView _drawer_imageview15;
	private TextView _drawer_textview12;
	private ImageView _drawer_imageview6;
	private TextView _drawer_textview3;
	private ImageView _drawer_imageview7;
	private TextView _drawer_textview4;
	private ImageView _drawer_imageview10;
	private TextView _drawer_textview7;
	private ImageView _drawer_imageview11;
	private TextView _drawer_textview8;
	private ImageView _drawer_imageview12;
	private TextView _drawer_textview9;
	private ImageView _drawer_imageview8;
	private TextView _drawer_textview5;
	private ImageView _drawer_imageview9;
	private TextView _drawer_textview6;
	
	private AlertDialog.Builder d;
	private Intent i = new Intent();
	private ObjectAnimator ob = new ObjectAnimator();
	private SharedPreferences f1;
	private MediaPlayer m;
	private SharedPreferences f;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main);
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
		_fab = (FloatingActionButton) findViewById(R.id._fab);
		
		_drawer = (DrawerLayout) findViewById(R.id._drawer);ActionBarDrawerToggle _toggle = new ActionBarDrawerToggle(MainActivity.this, _drawer, _toolbar, R.string.app_name, R.string.app_name);
		_drawer.addDrawerListener(_toggle);
		_toggle.syncState();
		
		LinearLayout _nav_view = (LinearLayout) findViewById(R.id._nav_view);
		
		vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		button1 = (Button) findViewById(R.id.button1);
		button17 = (Button) findViewById(R.id.button17);
		button2 = (Button) findViewById(R.id.button2);
		button3 = (Button) findViewById(R.id.button3);
		button4 = (Button) findViewById(R.id.button4);
		button5 = (Button) findViewById(R.id.button5);
		button6 = (Button) findViewById(R.id.button6);
		button7 = (Button) findViewById(R.id.button7);
		button8 = (Button) findViewById(R.id.button8);
		button9 = (Button) findViewById(R.id.button9);
		button10 = (Button) findViewById(R.id.button10);
		button11 = (Button) findViewById(R.id.button11);
		button12 = (Button) findViewById(R.id.button12);
		button18 = (Button) findViewById(R.id.button18);
		button13 = (Button) findViewById(R.id.button13);
		button14 = (Button) findViewById(R.id.button14);
		button15 = (Button) findViewById(R.id.button15);
		button16 = (Button) findViewById(R.id.button16);
		textview1 = (TextView) findViewById(R.id.textview1);
		_drawer_vscroll1 = (ScrollView) _nav_view.findViewById(R.id.vscroll1);
		_drawer_linear1 = (LinearLayout) _nav_view.findViewById(R.id.linear1);
		_drawer_textview13 = (TextView) _nav_view.findViewById(R.id.textview13);
		_drawer_imageview3 = (ImageView) _nav_view.findViewById(R.id.imageview3);
		_drawer_linear13 = (LinearLayout) _nav_view.findViewById(R.id.linear13);
		_drawer_linear3 = (LinearLayout) _nav_view.findViewById(R.id.linear3);
		_drawer_linear14 = (LinearLayout) _nav_view.findViewById(R.id.linear14);
		_drawer_linear4 = (LinearLayout) _nav_view.findViewById(R.id.linear4);
		_drawer_linear5 = (LinearLayout) _nav_view.findViewById(R.id.linear5);
		_drawer_linear9 = (LinearLayout) _nav_view.findViewById(R.id.linear9);
		_drawer_linear10 = (LinearLayout) _nav_view.findViewById(R.id.linear10);
		_drawer_linear11 = (LinearLayout) _nav_view.findViewById(R.id.linear11);
		_drawer_linear6 = (LinearLayout) _nav_view.findViewById(R.id.linear6);
		_drawer_linear7 = (LinearLayout) _nav_view.findViewById(R.id.linear7);
		_drawer_imageview14 = (ImageView) _nav_view.findViewById(R.id.imageview14);
		_drawer_textview11 = (TextView) _nav_view.findViewById(R.id.textview11);
		_drawer_imageview5 = (ImageView) _nav_view.findViewById(R.id.imageview5);
		_drawer_textview2 = (TextView) _nav_view.findViewById(R.id.textview2);
		_drawer_imageview15 = (ImageView) _nav_view.findViewById(R.id.imageview15);
		_drawer_textview12 = (TextView) _nav_view.findViewById(R.id.textview12);
		_drawer_imageview6 = (ImageView) _nav_view.findViewById(R.id.imageview6);
		_drawer_textview3 = (TextView) _nav_view.findViewById(R.id.textview3);
		_drawer_imageview7 = (ImageView) _nav_view.findViewById(R.id.imageview7);
		_drawer_textview4 = (TextView) _nav_view.findViewById(R.id.textview4);
		_drawer_imageview10 = (ImageView) _nav_view.findViewById(R.id.imageview10);
		_drawer_textview7 = (TextView) _nav_view.findViewById(R.id.textview7);
		_drawer_imageview11 = (ImageView) _nav_view.findViewById(R.id.imageview11);
		_drawer_textview8 = (TextView) _nav_view.findViewById(R.id.textview8);
		_drawer_imageview12 = (ImageView) _nav_view.findViewById(R.id.imageview12);
		_drawer_textview9 = (TextView) _nav_view.findViewById(R.id.textview9);
		_drawer_imageview8 = (ImageView) _nav_view.findViewById(R.id.imageview8);
		_drawer_textview5 = (TextView) _nav_view.findViewById(R.id.textview5);
		_drawer_imageview9 = (ImageView) _nav_view.findViewById(R.id.imageview9);
		_drawer_textview6 = (TextView) _nav_view.findViewById(R.id.textview6);
		d = new AlertDialog.Builder(this);
		f1 = getSharedPreferences("f1", Activity.MODE_PRIVATE);
		f = getSharedPreferences("f", Activity.MODE_PRIVATE);
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), BasicsActivity.class);
				startActivity(i);
				if (f1.getString("b", "").equals("1")) {
					m = MediaPlayer.create(getApplicationContext(), R.raw.facebook_ringtone_pop);
					m.start();
				}
			}
		});
		
		button17.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), NumberActivity.class);
				startActivity(i);
				if (f1.getString("b", "").equals("1")) {
					m = MediaPlayer.create(getApplicationContext(), R.raw.facebook_ringtone_pop);
					m.start();
				}
			}
		});
		
		button2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), MathActivity.class);
				startActivity(i);
				if (f1.getString("b", "").equals("1")) {
					m = MediaPlayer.create(getApplicationContext(), R.raw.facebook_ringtone_pop);
					m.start();
				}
			}
		});
		
		button3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), Array1Activity.class);
				startActivity(i);
				if (f1.getString("b", "").equals("1")) {
					m = MediaPlayer.create(getApplicationContext(), R.raw.facebook_ringtone_pop);
					m.start();
				}
			}
		});
		
		button4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), Array2Activity.class);
				startActivity(i);
				if (f1.getString("b", "").equals("1")) {
					m = MediaPlayer.create(getApplicationContext(), R.raw.facebook_ringtone_pop);
					m.start();
				}
			}
		});
		
		button5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), StringActivity.class);
				startActivity(i);
				if (f1.getString("b", "").equals("1")) {
					m = MediaPlayer.create(getApplicationContext(), R.raw.facebook_ringtone_pop);
					m.start();
				}
			}
		});
		
		button6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), FunctionActivity.class);
				startActivity(i);
				if (f1.getString("b", "").equals("1")) {
					m = MediaPlayer.create(getApplicationContext(), R.raw.facebook_ringtone_pop);
					m.start();
				}
			}
		});
		
		button7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), StorageActivity.class);
				startActivity(i);
				if (f1.getString("b", "").equals("1")) {
					m = MediaPlayer.create(getApplicationContext(), R.raw.facebook_ringtone_pop);
					m.start();
				}
			}
		});
		
		button8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), RecursionActivity.class);
				startActivity(i);
				if (f1.getString("b", "").equals("1")) {
					m = MediaPlayer.create(getApplicationContext(), R.raw.facebook_ringtone_pop);
					m.start();
				}
			}
		});
		
		button9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), PointersActivity.class);
				startActivity(i);
				if (f1.getString("b", "").equals("1")) {
					m = MediaPlayer.create(getApplicationContext(), R.raw.facebook_ringtone_pop);
					m.start();
				}
			}
		});
		
		button10.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), StructureActivity.class);
				startActivity(i);
				if (f1.getString("b", "").equals("1")) {
					m = MediaPlayer.create(getApplicationContext(), R.raw.facebook_ringtone_pop);
					m.start();
				}
			}
		});
		
		button11.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), FileActivity.class);
				startActivity(i);
				if (f1.getString("b", "").equals("1")) {
					m = MediaPlayer.create(getApplicationContext(), R.raw.facebook_ringtone_pop);
					m.start();
				}
			}
		});
		
		button12.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), PatternActivity.class);
				startActivity(i);
				if (f1.getString("b", "").equals("1")) {
					m = MediaPlayer.create(getApplicationContext(), R.raw.facebook_ringtone_pop);
					m.start();
				}
			}
		});
		
		button18.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), AlphabetpActivity.class);
				startActivity(i);
				if (f1.getString("b", "").equals("1")) {
					m = MediaPlayer.create(getApplicationContext(), R.raw.facebook_ringtone_pop);
					m.start();
				}
			}
		});
		
		button13.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), SortingActivity.class);
				startActivity(i);
				if (f1.getString("b", "").equals("1")) {
					m = MediaPlayer.create(getApplicationContext(), R.raw.facebook_ringtone_pop);
					m.start();
				}
			}
		});
		
		button14.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), SearchActivity.class);
				startActivity(i);
				if (f1.getString("b", "").equals("1")) {
					m = MediaPlayer.create(getApplicationContext(), R.raw.facebook_ringtone_pop);
					m.start();
				}
			}
		});
		
		button15.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), SeriesActivity.class);
				startActivity(i);
				if (f1.getString("b", "").equals("1")) {
					m = MediaPlayer.create(getApplicationContext(), R.raw.facebook_ringtone_pop);
					m.start();
				}
			}
		});
		
		button16.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), ConversionActivity.class);
				startActivity(i);
				if (f1.getString("b", "").equals("1")) {
					m = MediaPlayer.create(getApplicationContext(), R.raw.facebook_ringtone_pop);
					m.start();
				}
			}
		});
		
		_fab.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts( "mailto", "rameshwaragrawal098@gmail.com", null)); emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Help"); startActivity(Intent.createChooser(emailIntent,null));
				if (f1.getString("b", "").equals("1")) {
					m = MediaPlayer.create(getApplicationContext(), R.raw.facebook_ringtone_pop);
					m.start();
				}
			}
		});
		
		_drawer_textview11.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), LetuscActivity.class);
				startActivity(i);
			}
		});
		
		_drawer_textview2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), AsciiActivity.class);
				startActivity(i);
			}
		});
		
		_drawer_textview12.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), SettingActivity.class);
				startActivity(i);
			}
		});
		
		_drawer_textview3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), AboutmeActivity.class);
				startActivity(i);
			}
		});
		
		_drawer_textview4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent i = new Intent(Intent.ACTION_SEND); i.setType("text/plain"); i.putExtra(Intent.EXTRA_SUBJECT, "C Coders"); String sAux = "\nThis application will help you to improve ur coding skills in C language and also help u in building ur carrer in the field of computer science...\nThis will definitely help u preparing for interviews,exams,and many more....\n\n"; sAux = sAux + "https://play.google.com/store/apps/details?id=com.rameshwar.c.coders\n"; i.putExtra(Intent.EXTRA_TEXT, sAux); startActivity(Intent.createChooser(i, "Share via"));
			}
		});
		
		_drawer_textview7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=com.c.coders")));
			}
		});
		
		_drawer_textview8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
				AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
				 View exit= getLayoutInflater().inflate(R.layout.exit,null); alert.setView(exit); final AlertDialog dialog =
				alert.create (); 
				dialog.show();
				 final Button button = (Button) exit.findViewById(R.id.textview8);
				
				
			}
		});
		
		_drawer_textview9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts( "mailto", "rameshwaragrawal098@gmail.com", null)); emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Feedback"); startActivity(Intent.createChooser(emailIntent,null));
			}
		});
		
		_drawer_textview5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
				AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
				 View help1= getLayoutInflater().inflate(R.layout.help1,null); alert.setView(help1); final AlertDialog dialog =
				alert.create (); 
				dialog.show();
				 final Button button = (Button) help1.findViewById(R.id.textview5);
			}
		});
		
		_drawer_textview6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				d.setTitle("Exit ");
				d.setMessage("Are you sure you want to quit?");
				d.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						finish();
					}
				});
				d.setNegativeButton("No", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				d.create().show();
			}
		});
	}
	private void initializeLogic() {
		i.setClass(getApplicationContext(), SplashActivity.class);
		startActivity(i);
	}
	@Override
	public boolean onCreateOptionsMenu (Menu menu){
		menu.add(0, 0, 0, "Why Ads?");
		menu.add(0, 1, 1, "Rate app");
		menu.add(0, 2, 2, "Item 3");
		menu.add(0, 3, 3, "Item 4");
		menu.add(0, 4, 4, "Item 5");
		menu.add(0, 5, 5, "Item 6");
		menu.add(0,6,6,"share").setIcon(R.drawable.ic_share_white).setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);
		menu.add(0,7,7,"settings").setIcon(R.drawable.ic_settings_white).setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);
		return true;
	}
	 @Override
	public boolean onOptionsItemSelected(MenuItem item){
		switch (item.getItemId()){
			case 0:
			_move1();
			break;
			case 1:
			_move2();
			break;
			case 2:
			_move3();
			break;
			case 3:
			_move4();
			break;
			case 4:
			_move5();
			break;
			case 5:
			_move6();
			break;
			case 6:
			_move13();
			break;
			case 7:
			_move14();
			break;
			
		}
		return super.onOptionsItemSelected(item);
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
	public void onBackPressed() {
		d.setTitle("Exit?");
		d.setMessage("Are you sure you want to quit?");
		d.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				finish();
			}
		});
		d.setNegativeButton("No", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				
			}
		});
		d.create().show();
	}
	
	@Override
	public void onStart() {
		super.onStart();
		if (f.getString("a", "").equals("1")) {
			android.support.v7.app.ActionBar ab =getSupportActionBar();
			ab.setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(Color.parseColor("#212121")));
			
			if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
				Window w =this.getWindow();
				w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
				w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setStatusBarColor(Color.parseColor("#000000"));
				
			}
			
			android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable(); gd.setColor(Color.parseColor("#424242")); gd.setCornerRadius(40); 
			button1.setBackground(gd);
			button2.setBackground(gd);
			button3.setBackground(gd);
			button4.setBackground(gd);
			button5.setBackground(gd);
			button6.setBackground(gd);
			button7.setBackground(gd);
			button8.setBackground(gd);
			button9.setBackground(gd);
			button10.setBackground(gd);
			button11.setBackground(gd);
			button12.setBackground(gd);
			button13.setBackground(gd);
			button14.setBackground(gd);
			button15.setBackground(gd);
			button16.setBackground(gd);
			button17.setBackground(gd);
			button18.setBackground(gd);
			
			vscroll1.setBackgroundResource(R.drawable.code9);
			linear1.setBackgroundResource(R.drawable.code9);
			button1.setTextColor(0xFFFFFFFF);
			button17.setTextColor(0xFFFFFFFF);
			button2.setTextColor(0xFFFFFFFF);
			button3.setTextColor(0xFFFFFFFF);
			button4.setTextColor(0xFFFFFFFF);
			button5.setTextColor(0xFFFFFFFF);
			button6.setTextColor(0xFFFFFFFF);
			button7.setTextColor(0xFFFFFFFF);
			button8.setTextColor(0xFFFFFFFF);
			button9.setTextColor(0xFFFFFFFF);
			button10.setTextColor(0xFFFFFFFF);
			button11.setTextColor(0xFFFFFFFF);
			button12.setTextColor(0xFFFFFFFF);
			button13.setTextColor(0xFFFFFFFF);
			button14.setTextColor(0xFFFFFFFF);
			button15.setTextColor(0xFFFFFFFF);
			button16.setTextColor(0xFFFFFFFF);
			button18.setTextColor(0xFFFFFFFF);
		}
		else {
			android.support.v7.app.ActionBar ab =getSupportActionBar();
			ab.setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(Color.parseColor("#9C27B0")));
			
			if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
				Window w =this.getWindow();
				w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
				w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setStatusBarColor(Color.parseColor("#AB47BC"));
			}
			
			android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable(); gd.setColor(Color.parseColor("#00BCD4")); gd.setCornerRadius(30); 
			button1.setBackground(gd);
			button2.setBackground(gd);
			button3.setBackground(gd);
			button4.setBackground(gd);
			button5.setBackground(gd);
			button6.setBackground(gd);
			button7.setBackground(gd);
			button8.setBackground(gd);
			button9.setBackground(gd);
			button10.setBackground(gd);
			button11.setBackground(gd);
			button12.setBackground(gd);
			button13.setBackground(gd);
			button14.setBackground(gd);
			button15.setBackground(gd);
			button16.setBackground(gd);
			button17.setBackground(gd);
			button18.setBackground(gd);
			
			vscroll1.setBackgroundResource(R.drawable.code8);
			linear1.setBackgroundResource(R.drawable.code8);
			button1.setTextColor(0xFF000000);
			button17.setTextColor(0xFF000000);
			button2.setTextColor(0xFF000000);
			button3.setTextColor(0xFF000000);
			button4.setTextColor(0xFF000000);
			button5.setTextColor(0xFF000000);
			button6.setTextColor(0xFF000000);
			button7.setTextColor(0xFF000000);
			button8.setTextColor(0xFF000000);
			button9.setTextColor(0xFF000000);
			button10.setTextColor(0xFF000000);
			button11.setTextColor(0xFF000000);
			button12.setTextColor(0xFF000000);
			button13.setTextColor(0xFF000000);
			button14.setTextColor(0xFF000000);
			button15.setTextColor(0xFF000000);
			button16.setTextColor(0xFF000000);
			button18.setTextColor(0xFF000000);
		}
	}
	private void _move1 () {
		
		AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
		 View ads= getLayoutInflater().inflate(R.layout.ads,null); alert.setView(ads); final AlertDialog dialog =
		alert.create (); 
		dialog.show();
		final Button button = (Button) ads.findViewById(R.id.textview8);
		
		
	}
	
	
	private void _move2 () {
		startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=com.c.coders")));
	}
	
	
	private void _move3 () {
		
	}
	
	
	private void _move4 () {
		
	}
	
	
	private void _move5 () {
		
	}
	
	
	private void _move6 () {
		
	}
	
	
	private void _move7 () {
		
	}
	
	
	private void _move8 () {
		
	}
	
	
	private void _move9 () {
		
	}
	
	
	private void _move10 () {
		
	}
	
	
	private void _move11 () {
		
	}
	
	
	private void _move12 () {
		
	}
	
	
	private void _move13 () {
		Intent i = new Intent(Intent.ACTION_SEND); i.setType("text/plain"); i.putExtra(Intent.EXTRA_SUBJECT, "C Coders"); String sAux = "\nThis application will help you to improve ur coding skills in C language and also help u in building ur carrer in the field of computer science...\nThis will definitely help u preparing for interviews,exams,and many more....\n\n";sAux = sAux + "https://play.google.com/store/apps/details?id=com.c.coders \n\n"; i.putExtra(Intent.EXTRA_TEXT, sAux); startActivity(Intent.createChooser(i, "Share via"));
		if (f1.getString("b", "").equals("1")) {
			m = MediaPlayer.create(getApplicationContext(), R.raw.facebook_ringtone_pop);
			m.start();
		}
	}
	
	
	private void _move14 () {
		i.setClass(getApplicationContext(), SettingActivity.class);
		startActivity(i);
		if (f1.getString("b", "").equals("1")) {
			m = MediaPlayer.create(getApplicationContext(), R.raw.facebook_ringtone_pop);
			m.start();
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
