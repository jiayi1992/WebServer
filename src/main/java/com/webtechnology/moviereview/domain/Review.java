package com.webtechnology.moviereview.domain;

import java.math.BigDecimal;

public class Review {
	
	private BigDecimal revid;
	private BigDecimal rating;
	private String text;
	private String title;
	private String mname;
	
	public Review(BigDecimal revid, BigDecimal rating, String text, String title, String mname) {
		super();
		this.revid = revid;
		this.rating = rating;
		this.text = text;
		this.title = title;
		this.mname = mname;
	}
	
	public Review(BigDecimal rating, String text, String title, String mname) {
		super();
		this.revid = new BigDecimal(0);
		this.rating = rating;
		this.text = text;
		this.title = title;
		this.mname = mname;
	}
	
	public BigDecimal getRevid() {
		return revid;
	}
	public void setRevid(BigDecimal revid) {
		this.revid = revid;
	}
	public BigDecimal getRating() {
		return rating;
	}
	public void setRating(BigDecimal rating) {
		this.rating = rating;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}

	
}
