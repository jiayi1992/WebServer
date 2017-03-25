package com.webtechnology.moviereview.dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import com.webtechnology.moviereview.domain.Moviegoer;
import com.webtechnology.moviereview.domain.Review;
import com.webtechnology.moviereview.util.ConnectionFactory;

@Component
public class MoviegoerDAO {
	
	public List<Moviegoer> getMoviegoerList() {
		
		List<Moviegoer> moviegoerList = new ArrayList<Moviegoer>();		
		
		Moviegoer e1 = new Moviegoer("John","Smith","1","1",new BigDecimal("40000"),"1","1","1");
		//Moviegoer e2 = new Moviegoer("Test","Smith",new BigDecimal("50000"));
		
		moviegoerList.add(e1);
		
		return moviegoerList;
	}
	
	public boolean searchMoviegoer(String mname, String password){
		SqlSession session = ConnectionFactory.getSqlSessionFactory().openSession();
		HashMap<String,Object> moviegoer = null;
		
		try {			   
			   moviegoer = session.selectOne("com.mapper.MoviegoerMapper.selectByMoviegoer", mname);
			   session.commit();
			} finally {
			  session.close();
			}
		
		if(moviegoer == null){
			System.out.println("no this user");
			return false;
		}else if(moviegoer.get("PASSWORD").equals(password)){
			return true;
		}else 
			return false;
	}
	
	public void insertMoviegoer(Moviegoer moviegoer){
		SqlSession session = ConnectionFactory.getSqlSessionFactory().openSession();
		
		try {			   
			   session.insert("com.mapper.MoviegoerMapper.insertMoviegoer", moviegoer);
			   session.commit();
			   
			} finally {
			  session.close();
			}
	}
	
	public List<HashMap<String,Object>> getAllMovies(){
			List<HashMap<String,Object>> movieList = null;
			SqlSession session = ConnectionFactory.getSqlSessionFactory().openSession();
			try {
				movieList = session.selectList("com.mapper.MoviegoerMapper.selectAllMovie");
			} finally {
			  session.close();
			}
			
			return movieList;
	}
	
	public List<HashMap<String,Object>> getActorByMovie(String movie){
		List<HashMap<String,Object>> actorList = null;
		SqlSession session = ConnectionFactory.getSqlSessionFactory().openSession();
		try {
			actorList = session.selectList("com.mapper.MoviegoerMapper.selectActorByMovie",movie);
		} finally {
		  session.close();
		}
		
		return actorList;
	}
	
	public List<HashMap<String,Object>> getAllActors(){
		List<HashMap<String,Object>> actorList = null;
		SqlSession session = ConnectionFactory.getSqlSessionFactory().openSession();
		try {
			actorList = session.selectList("com.mapper.MoviegoerMapper.selectAllActor");
		} finally {
		  session.close();
		}
		
		return actorList;
		}
	
	public List<HashMap<String,Object>> getMovieByActor(String actor){
		List<HashMap<String,Object>> movieList = null;
		SqlSession session = ConnectionFactory.getSqlSessionFactory().openSession();
		try {
			movieList = session.selectList("com.mapper.MoviegoerMapper.selectMovieByActor",actor);
		} finally {
		  session.close();
		}
		return movieList;
	}
	
	public List<HashMap<String,Object>> getMovieByDirector(String director){
		List<HashMap<String,Object>> movieList = null;
		SqlSession session = ConnectionFactory.getSqlSessionFactory().openSession();
		try {
			movieList = session.selectList("com.mapper.MoviegoerMapper.selectMovieByDirector",director);
		} finally {
		  session.close();
		}
		return movieList;
	}
	
	public List<HashMap<String,Object>> getMovieByProducer(String producer){
		List<HashMap<String,Object>> movieList = null;
		SqlSession session = ConnectionFactory.getSqlSessionFactory().openSession();
		try {
			movieList = session.selectList("com.mapper.MoviegoerMapper.selectMovieByProducer",producer);
		} finally {
		  session.close();
		}
		return movieList;
	}
	
	public List<HashMap<String,Object>> getMovieByKeyword(String keyword){
		List<HashMap<String,Object>> list = null;
		SqlSession session = ConnectionFactory.getSqlSessionFactory().openSession();
		try {
			list = session.selectList("com.mapper.MoviegoerMapper.selectMovieByKeyword","%"+keyword+"%");
		} finally {
		  session.close();
		}
		return list;
	}
	
	public List<HashMap<String,Object>> getActorByKeyword(String keyword) {
		List<HashMap<String,Object>> list = null;
		SqlSession session = ConnectionFactory.getSqlSessionFactory().openSession();
		try {
			list = session.selectList("com.mapper.MoviegoerMapper.selectActorByKeyword","%"+keyword+"%");
		} finally {
		  session.close();
		}
		return list;
	}
	
	public HashMap<String,Object> getReview(String movie) {
		HashMap<String,Object> review = null;
		SqlSession session = ConnectionFactory.getSqlSessionFactory().openSession();
		try {
			review = session.selectOne("com.mapper.MoviegoerMapper.selectReview",movie);
		} finally {
		  session.close();
		}
		return review;
	}
	
	public void insertReview(Review review){
		SqlSession session = ConnectionFactory.getSqlSessionFactory().openSession();
		
		try {			   
			   session.insert("com.mapper.MoviegoerMapper.insertReview", review);
			   session.commit();
			   
			} finally {
			  session.close();
			}
	}

}
