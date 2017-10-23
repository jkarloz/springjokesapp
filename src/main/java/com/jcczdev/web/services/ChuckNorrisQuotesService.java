package com.jcczdev.web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

/**
 * @author Juan Carlos - 2017/10/23
 *
 */
@Service
public class ChuckNorrisQuotesService implements QuoteService {

	/* (non-Javadoc)
	 * @see com.jcczdev.web.services.QuoteService#getQuotes()
	 */
	private ChuckNorrisQuotes chuckNorrisQuotes;
	
	@Override
	public String getQuote() {
		chuckNorrisQuotes = new ChuckNorrisQuotes();
		return chuckNorrisQuotes.getRandomQuote();
	}

}
