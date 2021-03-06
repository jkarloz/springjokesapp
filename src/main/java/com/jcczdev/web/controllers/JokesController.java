package com.jcczdev.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jcczdev.web.services.ChuckNorrisQuotesService;

/**
 * @author Juan Carlos - 2017/10/23
 *
 */
@Controller
public class JokesController {

	private ChuckNorrisQuotesService chuckNorrisQuotesService;
		
	@Autowired
	public JokesController(ChuckNorrisQuotesService chuckNorrisQuotesService) {
		this.chuckNorrisQuotesService = chuckNorrisQuotesService;
	}

	@RequestMapping({"/", ""})
	public String getJoke(Model model) {
		model.addAttribute("joke", chuckNorrisQuotesService.getQuote());
		return "chucknorris";
	}
}
