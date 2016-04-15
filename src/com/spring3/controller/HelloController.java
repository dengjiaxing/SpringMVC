package com.spring3.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//将类声明为Spring容器中的Bean，Spring调用时对该类实例化
@Controller					
@RequestMapping("/welcome")						//声明Controller处理的请求是什么
public class HelloController {
	@RequestMapping(method = RequestMethod.GET)   	//声明请求的方法，默认为GET方法
	//定义printWelcome方法，返回String类型对象
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Hello World");	
		return "hello";								//返回“hello”，交由ViewResolver解析
	}
}
