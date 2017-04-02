package com.sq.controller;
import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AInterceptor {
	
	public AInterceptor() {
		System.out.println(this.getClass().getName() + " construct .");
	}
	
	@RequestMapping("/exec")
	@ResponseBody
	public String exec(HttpServletResponse resp) throws IOException{
		System.out.println(this.getClass().getName() + ":" + Thread.currentThread().getStackTrace()[2].getMethodName());
//		resp.getWriter().write("hello world");
		return "hello world by return";
	}
	
	public String name;
		
	public void setName(String name) {
		this.name = name;
	}


	public void say(){
		System.out.println(this.name);
	}
	
}
