package com.webtechnology.moviereview.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.webtechnology.moviereview.dao.MoviegoerDAO;
import com.webtechnology.moviereview.domain.Moviegoer;
import com.webtechnology.moviereview.domain.Review;


@Component
public class MoviegoerService {
	
	@Autowired
	MoviegoerDAO movieDAO;

	public List<HashMap<String,Object>> getAllMovies() {
		
		return movieDAO.getAllMovies();
	}
	
	public boolean searchMoviegoer(String mname, String password){
		
		return movieDAO.searchMoviegoer(mname, password);
	}

	
	public void insertMoviegoer(Moviegoer moviegoer){

		movieDAO.insertMoviegoer(moviegoer);
	}
	
	public List<HashMap<String,Object>> getAllActors(){
		return movieDAO.getAllActors();
	}
	
	public List<HashMap<String,Object>> getMovieByActor(String actorName){
		return movieDAO.getMovieByActor(actorName);
	}
	
	public List<HashMap<String,Object>>  getMovieByDirector(String actorName){
		return movieDAO.getMovieByDirector(actorName);
	}
	
	public List<HashMap<String,Object>>  getMovieByProducer(String actorName){
		return movieDAO.getMovieByProducer(actorName);
	}
	
	public List<HashMap<String,Object>> getActorByMovie(String movie) {
		
		return movieDAO.getActorByMovie(movie);
	}
	
	public List<HashMap<String,Object>> getMovieByKeyword(String keyword) {
		
		return movieDAO.getMovieByKeyword(keyword);
	}
	
	public List<HashMap<String,Object>> getActorByKeyword(String keyword) {
		
		return movieDAO.getActorByKeyword(keyword);
	}
	
	public HashMap<String,Object> getReview(String movie) {
		return movieDAO.getReview(movie);
	}
	
	public void insertReview(Review review){
		movieDAO.insertReview(review);
	}
}
