package com.sdufe.thea.guo.adapter;

import java.util.List;

import com.sdufe.thea.guo.R;
import com.sdufe.thea.guo.model.TimeLineModel;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class TimeLineAdapter extends BaseAdapter {
	
	Context context;
	List<TimeLineModel> list;

	public TimeLineAdapter(Context context, List<TimeLineModel> list) {
		super();
		this.context = context;
		this.list = list;
	}

	@Override
	public int getCount() {
		if (list!=null) {
			return list.size();
		}
		return 0;
	}

	@Override
	public Object getItem(int position) {
		if (list!=null) {
			return list.get(position);
		}
		return null;
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHold hold;
		if (convertView==null) {
			hold=new ViewHold();
			convertView=LayoutInflater.from(context).inflate(R.layout.timeline_item, null);
			convertView.setTag(hold);
		}else {
			hold=(ViewHold) convertView.getTag();
		}
		hold.imageView=(ImageView) convertView.findViewById(R.id.left_imageview);
		hold.show=(TextView) convertView.findViewById(R.id.right_textview);
		
		hold.imageView.setImageResource(list.get(position).getImageview());
		hold.show.setText(list.get(position).getText());
		return convertView;
	}
	
	static class ViewHold{
		public TextView show;
		public ImageView imageView;
	}

}
