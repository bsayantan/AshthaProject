package com.aastha.demo.Controller1;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aastha.demo.Interface.Interface;
import com.aastha.demo.ObjectClass.ObjectClass;

@Controller
public class Controller1 {
	@Autowired
	Interface d;
	
	@RequestMapping("/mi2")
	public String home(@RequestBody ObjectClass object)
	{
		
		System.out.println(object);
		d.save(object);
		return "hello";
	}
	

}

