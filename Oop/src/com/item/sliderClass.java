package com.item;

public class sliderClass {

	int slideD;
	String img;
	String text;
	
	
	
	
	public sliderClass(int slideD, String img, String text) {
		super();
		this.slideD = slideD;
		this.img = img;
		this.text = text;
	}
	
	
	public int getSlideD() {
		return slideD;
	}
	public void setSlideD(int slideD) {
		this.slideD = slideD;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
}
