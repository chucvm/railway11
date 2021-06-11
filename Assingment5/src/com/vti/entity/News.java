package com.vti.entity;

public class News implements INews {
	int id;
	String Title;
	String Publishdate;
	String Author;
	String content;
	private int[] rate;
	float AverageRate;
	
	
	public News(int id, String title, String publishdate, String author, String content, int[] rate,
			float averageRate) {
		super();
		this.id = id;
		Title = title;
		Publishdate = publishdate;
		Author = author;
		this.content = content;
		this.rate = rate;
		AverageRate = averageRate;
	}
	
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	
	
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return Title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		Title = title;
	}
	/**
	 * @return the publishdate
	 */
	public String getPublishdate() {
		return Publishdate;
	}
	/**
	 * @param publishdate the publishdate to set
	 */
	public void setPublishdate(String publishdate) {
		Publishdate = publishdate;
	}
	/**
	 * @return the author
	 */
	public String getAuthor() {
		return Author;
	}
	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		Author = author;
	}
	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}
	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}
	
	


	/**
	 * @return the rate
	 */
	public int[] getRate() {
		return rate;
	}


	/**
	 * @param rate the rate to set
	 */
	public void setRate(int[] rate) {
		this.rate = rate;
	}


	public float getAverageRate() {
		return AverageRate;
	}
	@Override
	public String toString() {
		return "News [id=" + id + ", Title=" + Title + ", Publishdate=" + Publishdate + ", Author=" + Author
				+ ", content=" + content + ", AverageRate=" + AverageRate + "]";
	}
	@Override
	public void display() {
		System.out.println("News [title=" + Title + ", publishDate=" +
				Publishdate + ", author=" + Author + "]");
		
	}
	@Override
	public float calculate() {
		AverageRate = (float) ((rate[0] + rate[1] + rate[2]) / 3);
		return AverageRate;
		
		
	}

}
