package com.fl.dean;

public class News {
	private Integer newsId;
	private String title;
	private String content;

	public Integer getNewsId() {
		return newsId;
	}

	public void setNewsId(Integer newsId) {
		this.newsId = newsId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public News() {
		super();
		// TODO Auto-generated constructor stub
	}

	public News(Integer newsId, String title, String content) {
		super();
		this.newsId = newsId;
		this.title = title;
		this.content = content;
	}
}
