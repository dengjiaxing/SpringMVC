package com.spring3.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//��������ΪSpring�����е�Bean��Spring����ʱ�Ը���ʵ����
@Controller					
@RequestMapping("/welcome")						//����Controller�����������ʲô
public class HelloController {
	@RequestMapping(method = RequestMethod.GET)   	//��������ķ�����Ĭ��ΪGET����
	//����printWelcome����������String���Ͷ���
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Hello World");	
		return "hello";								//���ء�hello��������ViewResolver����
	}
}
