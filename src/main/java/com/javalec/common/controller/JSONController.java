package com.javalec.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.javalec.common.model.Shop;

@RequestMapping("/kfc/brands")
@Controller
public class JSONController {

	@RequestMapping(value="{name}", method=RequestMethod.GET)
	@ResponseBody
	public Shop getShopInJSON(@PathVariable String name){
		Shop shop = new Shop();
		shop.setName(name);
		shop.setStaffName(new String[]{"test1", "test2"});
	
		return shop;
	}
}
