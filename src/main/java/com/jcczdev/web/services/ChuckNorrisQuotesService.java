package com.jcczdev.web.services;

import org.springframework.stereotype.Service;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;

/**
 * @author Juan Carlos - 2017/10/23
 *
 */
@Service
public class ChuckNorrisQuotesService implements QuoteService {

// we make this property final to avoid being created each time getQuoted methods is called.
	private final ChuckNorrisQuotes chuckNorrisQuotes;
	
	public ChuckNorrisQuotesService() {
		this.chuckNorrisQuotes = new ChuckNorrisQuotes();
	}
	
	@Override
	public String getQuote() {
		return chuckNorrisQuotes.getRandomQuote();
	}

}
