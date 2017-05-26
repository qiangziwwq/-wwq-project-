package org.spring.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @author wwq
 * @date   2017年5月26日上午11:55:03 
 * @desc   首页
 */
@Controller
@RequestMapping("/index/")
public class TestController {
	
	//跳转到首页
	@RequestMapping("index")
	public String index(){
		return "index"; 
	}
	//跳转到其它页面
   @RequestMapping("toPage")
	public String toPage(String page){
	   return page; 
   }
}
