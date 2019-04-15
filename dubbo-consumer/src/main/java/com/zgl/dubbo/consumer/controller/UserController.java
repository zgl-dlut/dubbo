package com.zgl.dubbo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zgl.dubbo.api.service.UserInterface;
import com.zgl.dubbo.api.service.XmlInterface;
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

	@Reference(version = "9.9.9")
	private XmlInterface xmlInterface;

	@GetMapping("/getUser")
	public String getUser(String name) {
		return userInterface.getUser(name);
	}

	@GetMapping("/xml")
	public String hello() {
		return xmlInterface.testXml();
	}
}