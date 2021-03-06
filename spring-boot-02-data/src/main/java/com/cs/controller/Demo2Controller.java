package com.cs.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cs.bean.Demo;
import com.cs.service.DemoService;

@RestController
@RequestMapping("/demo2")
public class Demo2Controller {

	@Resource
	private DemoService demoService;

	/**
	 * 测试保存数据方法.
	 * 
	 * @return
	 */
	@RequestMapping("/save")
	public String save() {
		Demo d = new Demo();
		d.setName("Angel");
		demoService.save(d);// 保存数据.
		return "ok.Demo2Controller.save";
	}
	
	//地址：http://127.0.0.1:8080/demo2/getById?id=1
	@RequestMapping("/getById")
	public Demo getById(long id){
		return demoService.getById(id);
	}
}
