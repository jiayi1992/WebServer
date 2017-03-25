package com.webtechnology.moviereview.controller;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.webtechnology.moviereview.domain.Moviegoer;
import com.webtechnology.moviereview.service.MoviegoerService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class MovieController {
	
	private static final Logger logger = LoggerFactory.getLogger(MovieController.class);
	
	@Autowired
	MoviegoerService movieService;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/MovieList")
	public String getMovieList(HttpServletRequest request, HttpServletResponse response, Locale locale, Model model) {
		
		List<HashMap<String,Object>> movieList = new ArrayList<HashMap<String,Object>>();
		
		model.addAttribute("movieList",movieService.getAllMovies());
		
		return "MovieList";
	}
	
	@RequestMapping(value = "/MovieDetail")
	public String getActorByList(HttpServletRequest request, HttpServletResponse response, Model model) {
		
		List<HashMap<String,Object>> actorList = new ArrayList<HashMap<String,Object>>();
		
		String movie = request.getParameter("movieName");
		System.out.println(movie);
		model.addAttribute("actorList",movieService.getActorByMovie(movie));

		return "MovieDetail";
	}
	
	@RequestMapping(value = "/MovieListReview")
	public String getMovieListReview(HttpServletRequest request, HttpServletResponse response, Locale locale, Model model) {
		
		List<HashMap<String,Object>> movieList = new ArrayList<HashMap<String,Object>>();
		
		model.addAttribute("movieList",movieService.getAllMovies());
		
		return "MovieListReview";
	}
	
	@RequestMapping(value = "/MovieReview")
	public String MovieReview(HttpServletRequest request, HttpServletResponse response, Model model) {
		
		List<HashMap<String,Object>> actorList = new ArrayList<HashMap<String,Object>>();
		
		String movie = request.getParameter("movieName");
//		
//		System.out.println(movie);
//		
//		System.out.println(movieService.getReview(movie).get("AVG"));
//		
		model.addAttribute("review",movieService.getReview(movie));
		model.addAttribute("movie",movie);

		return "MovieReview";
	}
	

}
