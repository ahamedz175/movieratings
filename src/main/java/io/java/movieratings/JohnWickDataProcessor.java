package io.java.movieratings;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.batch.item.ItemProcessor;

public class JohnWickDataProcessor implements ItemProcessor<MovieReviewsInput, MovieReviews> {

	private static final Logger log = LoggerFactory.getLogger(JohnWickDataProcessor.class);
	  //int id = 2965;
	  	
	  @Override
	  public MovieReviews process(final MovieReviewsInput movieReviewsInput) throws Exception {
	    
		  MovieReviews movieReviews = new MovieReviews();
		  
		  	//company.setName(companyInput.getCompanyName().toUpperCase());
		  	
		  DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		  	//movieReviews.setId(id);
		  	movieReviews.setId(Integer.parseInt(movieReviewsInput.getId()));
		  	movieReviews.setDataOfReview(LocalDate.parse(movieReviewsInput.getDataOfReview(), df));
		  	movieReviews.setUser(movieReviewsInput.getUser());
		  	movieReviews.setUsefulnessVote(movieReviewsInput.getUsefulnessVote().toUpperCase());
		  	movieReviews.setTotalVotes(movieReviewsInput.getTotalVotes().toUpperCase());
		  	movieReviews.setUsersRating(movieReviewsInput.getUsersRating().toUpperCase());
		  	movieReviews.setReviewTitle(movieReviewsInput.getReviewTitle());
		  	movieReviews.setReview(movieReviewsInput.getReview());
		  	movieReviews.setMovieName("JohnWick");
		  	
		  	//this.id+=1;
		  


	    log.info("Converting (" + movieReviewsInput + ") into (" + movieReviews + ")");

	    return movieReviews;
	  }

	
}
