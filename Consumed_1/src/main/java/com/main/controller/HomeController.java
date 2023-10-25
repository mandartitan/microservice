package com.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HomeController {
	
	@Autowired
	RestTemplate rt;
	
	@RequestMapping("/getCon")
	public List getdata()
	{
		String url="http://zuul/pro/getPro";
		List t=rt.getForObject(url, List.class);
		
		return t;
	}

}
