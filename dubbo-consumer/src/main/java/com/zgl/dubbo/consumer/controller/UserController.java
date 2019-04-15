package com.zgl.dubbo.consumer.controller;

import com.zgl.dubbo.api.domain.User;
import com.zgl.dubbo.consumer.service.DubboUserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author zgl
 * @date 2019/4/13 下午3:56
 */
@RestController
@RequestMapping("/dubbo")
public class UserController {

	@Resource
	private DubboUserService dubboUserService;

	@GetMapping("/getUser")
	public User getUser(String name){
		return dubboUserService.getUser(name);
	}

	@GetMapping("/hello")
	public String hello(){
		return "hello dubbo!";
	}
}