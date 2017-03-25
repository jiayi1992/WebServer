package com.webtechnology.moviereview.controller;

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
public class ActorController {
	
	private static final Logger logger = LoggerFactory.getLogger(ActorController.class);
	
	@Autowired
	MoviegoerService movieService;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/ActorList")
	public String getMovieList(HttpServletRequest request, HttpServletResponse response, Locale locale, Model model) {
		
		List<HashMap<String,Object>> actorList = new ArrayList<HashMap<String,Object>>();
		
		model.addAttribute("actorList",movieService.getAllActors());
		

		//System.out.println(movie);

		return "ActorList";
	}
	
	@RequestMapping(value = "/ActorDetail")
	public String getActorByList(HttpServletRequest request, HttpServletResponse response, Model model) {
		
		List<HashMap<String,Object>> actorList = new ArrayList<HashMap<String,Object>>();
		
		String actor = request.getParameter("actorName");
		System.out.println(actor);
		//System.out.println(movieService.getMovieByActor(actor).get(0).get("TITLE"));
		model.addAttribute("actorName",actor);
		model.addAttribute("actorList",movieService.getMovieByActor(actor));
		model.addAttribute("directorList",movieService.getMovieByDirector(actor));
		model.addAttribute("producerList",movieService.getMovieByProducer(actor));

		return "ActorDetail";
	}

}
