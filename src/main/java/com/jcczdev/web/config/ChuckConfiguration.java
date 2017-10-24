package com.jcczdev.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

/**
 * @author Juan Carlos - 2017/10/23
 *
 */
// Configuration and Bean annotation were commented because we are implementing XML based configuration
// This is made in chuck-config.xml file and SpringjokesappApplication.java
//@Configuration
public class ChuckConfiguration {
	
	/*
	 * For this case, as ChuckNorrisQuotes is a class from an external jar and we need an instance of it
	 * we make this java configuration.
	 */
	//@Bean
	public ChuckNorrisQuotes chuckNorrisQuotes() {
		return new ChuckNorrisQuotes();
	}
}
