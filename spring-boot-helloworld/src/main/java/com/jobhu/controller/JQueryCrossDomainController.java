package com.jobhu.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.jobhu.pojo.Dog;

/**
 * 跨域的解决方式
 * @author JobH
 *
 */
@RestController
public class JQueryCrossDomainController {
	
	//@RequestMapping("/JSONP/{func1}")
	//public void jsonp(@PathVariable("func1")String func,HttpServletRequest request,HttpServletResponse response) {
	@RequestMapping("JSONP")
	public void jsonp(@RequestParam("name")String name,@RequestParam("age")Integer age,@RequestParam("callback")String callback,HttpServletResponse response) {	
		Dog dog = new Dog();
		dog.setAge(age);
		dog.setName(name);
		response.setHeader("Pragma", "No-cache");
		response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0);	
        response.setContentType("text/plain;charset=utf-8");
        
        try {
			PrintWriter pw = response.getWriter();
			pw.print("("+JSON.toJSONString(dog)+")");
			pw.flush();
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
