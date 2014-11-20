package com.sdufe.thea.guo;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.Window;
import android.widget.ListView;

import com.sdufe.thea.guo.adapter.TimeLineAdapter;
import com.sdufe.thea.guo.model.TimeLineModel;

public class MainActivity extends Activity {
	
	private ListView listView;
	private List<TimeLineModel> list;
	private TimeLineAdapter adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		
		initData();
		initView();
		
	}

	private void initView() {
		listView=(ListView) findViewById(R.id.listview);
		adapter=new TimeLineAdapter(this, list);
		
		listView.setAdapter(adapter);
	}

	private void initData() {
		list=new ArrayList<TimeLineModel>();
		
		list.add(new TimeLineModel(R.drawable.medicalcheck2, "込込"));
		list.add(new TimeLineModel(R.drawable.nurse_visit2, "最最"));
		list.add(new TimeLineModel(R.drawable.nursingcareplan2, "細細"));
		list.add(new TimeLineModel(R.drawable.medicalcheck2, "込込"));
		list.add(new TimeLineModel(R.drawable.nurse_visit2, "晴晴"));
		list.add(new TimeLineModel(R.drawable.nursingcareplan2, "身身"));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
