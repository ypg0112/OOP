package com.personal.equality;


public class OverrideEqualReview {
	
	private final int id;
	
	private final String reviewerName;
	
	private final String reviewComment;
	
	
	public OverrideEqualReview(int id, String reviewerName, String reviewComment) {
		this.id = id;
		this.reviewerName = reviewerName;
		this.reviewComment = reviewComment;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result
				+ ((reviewComment == null) ? 0 : reviewComment.hashCode());
		result = prime * result
				+ ((reviewerName == null) ? 0 : reviewerName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OverrideEqualReview other = (OverrideEqualReview) obj;
		if (id != other.id)
			return false;
		if (reviewComment == null) {
			if (other.reviewComment != null)
				return false;
		} else if (!reviewComment.equals(other.reviewComment))
			return false;
		if (reviewerName == null) {
			if (other.reviewerName != null)
				return false;
		} else if (!reviewerName.equals(other.reviewerName))
			return false;
		return true;
	}
	
	
	
	
}
