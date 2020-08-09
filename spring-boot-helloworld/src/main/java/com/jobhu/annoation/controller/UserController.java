package com.jobhu.annoation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RestController;

import com.jobhu.annoation.service.ICatService;

//@RestController
@Controller
public class UserController {

	@Autowired
    private ICatService catService;
    
    
}
