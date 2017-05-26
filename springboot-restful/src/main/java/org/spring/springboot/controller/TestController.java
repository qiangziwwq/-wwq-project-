package org.spring.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/index/")
public class TestController {
	
	@RequestMapping("index")
	public String index(){
		System.out.println(111);
		return "index"; 
	}
	
   @RequestMapping("toPage")
	public String toPage(String page){
	   return page; 
   }
   
   @RequestMapping("toFormPage")
   public String toFormPage(String page){
	   
	   return page; 
   }
}
