package com.jobhu.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jobhu.pojo.Account;

/**
 * springboot对跨域的支持
 * @author JobH
 *
 */
@RestController
@RequestMapping("/account")
public class CrossOriginController1 {

	@CrossOrigin(maxAge =3600,methods= {RequestMethod.DELETE,RequestMethod.GET,RequestMethod.OPTIONS},origins= {"http://domain2.com"})
	@GetMapping("/{id}")
	public Account retrieve(@PathVariable Long id) {
		return null;	
	}
}
