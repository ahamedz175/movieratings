package io.java.movieratings;

public class MovieReviewsInput {

	
	
	private String dataOfReview;
	private String user;
	private String usefulnessVote;
	private String totalVotes;
	private String usersRating;
	private String reviewTitle;
	private String review;
	private String id;
	
	public String getDataOfReview() {
		return dataOfReview;
	}
	public void setDataOfReview(String dataOfReview) {
		this.dataOfReview = dataOfReview;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getUsefulnessVote() {
		return usefulnessVote;
	}
	public void setUsefulnessVote(String usefulnessVote) {
		this.usefulnessVote = usefulnessVote;
	}
	public String getTotalVotes() {
		return totalVotes;
	}
	public void setTotalVotes(String totalVotes) {
		this.totalVotes = totalVotes;
	}
	public String getUsersRating() {
		return usersRating;
	}
	public void setUsersRating(String usersRating) {
		this.usersRating = usersRating;
	}
	public String getReviewTitle() {
		return reviewTitle;
	}
	public void setReviewTitle(String reviewTitle) {
		this.reviewTitle = reviewTitle;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	@Override
	public String toString() {
		return "MovieReviews [dataOfReview=" + dataOfReview + ", user=" + user + ", usefulnessVote="
				+ usefulnessVote + ", totalVotes=" + totalVotes + ", usersRating=" + usersRating + ", reviewTitle="
				+ reviewTitle + ", review=" + review + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	
}
