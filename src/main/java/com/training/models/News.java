package com.training.models;

public class News {
	private int newsId;
	private String postedByUser;
	private String commentByUser;
	private String comment;

	/**
	 * Default constructor
	 */
	public News() {
	}

	/**
	 * Parameterized constructor
	 * 
	 * @param newsId
	 * @param postedByUser
	 * @param commentByUser
	 * @param comment
	 */
	public News(int newsId, String postedByUser, String commentByUser, String comment) {
		super();
		this.newsId = newsId;
		this.postedByUser = postedByUser;
		this.commentByUser = commentByUser;
		this.comment = comment;
	}

	/**
	 * Getters and setters for alll attributes of fruit object
	 */
	public int getNewsId() {
		return newsId;
	}

	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}

	public String getPostedByUser() {
		return postedByUser;
	}

	public void setPostedByUser(String postedByUser) {
		this.postedByUser = postedByUser;
	}

	public String getCommentByUser() {
		return commentByUser;
	}

	public void setCommentByUser(String commentByUser) {
		this.commentByUser = commentByUser;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	/**
	 * Overridden toString() method
	 */
	@Override
	public String toString() {
		return "NewsId: " + newsId + ", Posted By User: " + postedByUser + ", Comment By User: " + commentByUser
				+ ", Comment: " + comment;
	}

}
