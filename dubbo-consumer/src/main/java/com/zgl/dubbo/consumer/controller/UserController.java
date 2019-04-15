package com.zgl.dubbo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zgl.dubbo.api.service.UserInterface;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zgl
 * @date 2019/4/13 下午3:56
 */
@RestController
@RequestMapping("/dubbo")
public class UserController {

	@Reference(version = "8.8.8")
	private UserInterface userInterface;

	@GetMapping("/getUser")
	public String getUser(String name) {
		return userInterface.getUser(name);
	}

	@GetMapping("/hello")
	public String hello() {
		return "hello dubbo!";
	}
}