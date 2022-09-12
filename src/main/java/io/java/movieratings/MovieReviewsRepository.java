package io.java.movieratings;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

public interface MovieReviewsRepository extends CrudRepository<MovieReviews, Integer> {

	List<MovieReviews> findByIdBetween(int start, int end);
	List<MovieReviews> findAll();
	List<MovieReviews> getByMovieNameOrderByDataOfReviewDesc(String name, Pageable pageable);//,  Pageable pageable);
	List<MovieReviews> getByMovieName(String name);
	
	
	default List<MovieReviews> findMoviesByPage(String name, int pageNum)//, int pageNum)
	{
		return getByMovieNameOrderByDataOfReviewDesc(name, PageRequest.of(pageNum, 10));//, PageRequest.of(pageNum, 2));
	}
}
