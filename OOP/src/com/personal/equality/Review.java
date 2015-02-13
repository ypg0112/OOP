package com.personal.equality;

import java.util.Date;

public class Review {
	
	private final int id;
	
	private final String reviewerName;
	
	private final String reviewComment;
	
	private final Date reviewDate;

	
	public Review(int id, String reviewerName, String reviewComment, Date reviewDate) {
		this.id = id;
		this.reviewerName = reviewerName;
		this.reviewComment = reviewComment;
		this.reviewDate = reviewDate;
	}

	public int getId() {
		return id;
	}

	public String getReviewerName() {
		return reviewerName;
	}

	public String getReviewComment() {
		return reviewComment;
	}

	public Date getReviewDate() {
		return reviewDate;
	}
	
	

}
