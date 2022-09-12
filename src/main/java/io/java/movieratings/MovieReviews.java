package io.java.movieratings;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//import org.hibernate.annotations.Check;

@Entity
@Table(name="MOVIEREVIEWS")
public class MovieReviews {
	
	
	
	private LocalDate dataOfReview;
	private String user;
	private String usefulnessVote;
	private String totalVotes;
	private String usersRating;
	private String reviewTitle;
	@Column(name="review", length = 1000000)
	private String review;
	private String movieName;
	
	
	@Id //@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDate getDataOfReview() {
		return dataOfReview;
	}
	public void setDataOfReview(LocalDate dataOfReview) {
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
		return "MovieReviews [id=" + id + ", dataOfReview=" + dataOfReview + ", user=" + user + ", usefulnessVote="
				+ usefulnessVote + ", totalVotes=" + totalVotes + ", usersRating=" + usersRating + ", reviewTitle="
				+ reviewTitle + ", review=" + review + "]";
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	
	
	
	

}
