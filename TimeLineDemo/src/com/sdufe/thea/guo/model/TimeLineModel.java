package com.sdufe.thea.guo.model;


public class TimeLineModel {

	private int imageview;
	private String text;

	public int getImageview() {
		return imageview;
	}

	public void setImageview(int imageview) {
		this.imageview = imageview;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public TimeLineModel(int imageview, String text) {
		super();
		this.imageview = imageview;
		this.text = text;
	}

}
