package org.spring.springboot.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.spring.springboot.domain.City;
import org.spring.springboot.domain.ResultEntity;
import org.spring.springboot.domain.TestEntity;
import org.spring.springboot.service.CityService;
import org.spring.springboot.utils.FastJsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @author wwq
 * @date   2017年5月26日上午11:55:03 
 * @desc   首页
 */
@Controller
@RequestMapping("/index/")
public class TestController {
	
	@Autowired
	private CityService cityService;  
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
   /**
    * Bootstarp 分页查询 
    * @param param
    * @param req
    * @param resp
    * @return
    */
   @RequestMapping("getTableData")
   @ResponseBody
   public ResultEntity<TestEntity>getTableData( TestEntity param,HttpServletRequest req,HttpServletResponse resp){
	   ResultEntity<TestEntity> result=new ResultEntity<TestEntity>(); 
	   int count=0; 
	   List<TestEntity>list=new ArrayList<TestEntity>(); 
	   for(int i=0;i<50;i++){
		   TestEntity t=new TestEntity(); 
		   t.setTid(i);
		   t.setFirst("张"+i);
		   if(i%2==0){
			   t.setSex("女");
		   }else{
			   t.setSex("男");
		   }
		   t.setScore(70+i);
		   list.add(t); 
	   }
	   result.setTotal(Long.valueOf(list.size()));
	   result.setRows(list.subList(param.offset, param.offset+param.limit));
	   return result; 
   }
   @RequestMapping("getTableDataPageHelper")
   @ResponseBody
   public ResultEntity<City>getTableData2(City param){
	   ResultEntity<City>result=cityService.getCityList(param); 
	   System.out.println(FastJsonUtils.toJSONString(result));
	   return result; 
   }
   
}
