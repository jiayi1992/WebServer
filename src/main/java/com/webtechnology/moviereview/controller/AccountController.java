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

import com.webtechnology.moviereview.domain.Moviegoer;
import com.webtechnology.moviereview.domain.Review;
import com.webtechnology.moviereview.service.MoviegoerService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class AccountController {
	
	private static final Logger logger = LoggerFactory.getLogger(AccountController.class);
	
	@Autowired
	private static String username = "";
	
	@Autowired
	MoviegoerService movieService;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/MovieLogin")
	public String home(HttpServletRequest request, HttpServletResponse response, Model model) {
		logger.info("Login.");
		
		String userName = request.getParameter("username");
		String password = request.getParameter("password");

		//System.out.println(userName+" "+password);
		
		if(userName != null&& password != null){
			if(movieService.searchMoviegoer(userName, password)){
				//System.out.println("successful");
				username = userName;
				model.addAttribute("message","successful");
				
			}else{
				//System.out.println("fail");
				model.addAttribute("message","Username or password is wrong.");
			}
		}
		return "MovieLogin";
	}

//	
	@RequestMapping(value = "/newMoviegoer", method = RequestMethod.GET)
	public String newEmployee(Model model) {
		logger.info("calling moviegoer do Get");
		Moviegoer moviegoer = new Moviegoer();
		moviegoer.setPassword("123456");	
		
		model.addAttribute("moviegoer",moviegoer);

		
		return "newMoviegoer";
	}
//
//	
	@RequestMapping(value = "/saveMoviegoer", method = RequestMethod.POST)
	public String SaveMyFavEmployee(HttpServletRequest request, HttpServletResponse response, @ModelAttribute Moviegoer moviegoer, Model model) {
		logger.info(" inside save employee");

		System.out.println("save moviegoer: moviegoer value"+moviegoer);
		try{
			movieService.insertMoviegoer(moviegoer);
		
			model.addAttribute("moviegoer",moviegoer);
			String error = "successful";
			model.addAttribute("error",error);
		}catch(Exception e){
			//System.out.println("username is exited");
			String error = "username is existed";
			model.addAttribute("error",error);
		}
		
		return "newMoviegoer";
	}
	
	@RequestMapping(value = "/menu", method = RequestMethod.GET)
	public String menu(Model model) {
		logger.info("calling moviegoer do Get");
		
		return "menu";
	}
	
	@RequestMapping(value = "/searchResult")
	public String getMovieList(HttpServletRequest request, HttpServletResponse response, Locale locale, Model model) {
		
		List<HashMap<String,Object>> resultList = new ArrayList<HashMap<String,Object>>();
		
		String type = request.getParameter("search");
		String keyword = request.getParameter("keyword");
		System.out.println(type);
		System.out.println(username);
		model.addAttribute("type",type);
		if(type.equals("movie")){
			model.addAttribute("resultList",movieService.getMovieByKeyword(keyword));
		}else{
			model.addAttribute("resultList",movieService.getActorByKeyword(keyword));
		}

		return "searchResult";
	}

	@RequestMapping(value = "/messageReview")
	public String messageReview(HttpServletRequest request, HttpServletResponse response, Model model) {
		
		List<HashMap<String,Object>> actorList = new ArrayList<HashMap<String,Object>>();
		String message = "";
		String comments = request.getParameter("comments");
		BigDecimal rating = new BigDecimal(request.getParameter("rating"));
		String movie = request.getParameter("movieName");
		//System.out.println(movie);
		System.out.println(username);
		System.out.println(comments);
		System.out.println(rating);
		System.out.println(movie);
		Review review = new Review(rating,comments,movie,username);
		try{
			movieService.insertReview(review);
			System.out.println("successful");
			message = "successful";
			model.addAttribute("message",message);
		}catch(Exception e){
			System.out.println("error");
		}
		return "messageReview";
	}
	
}
