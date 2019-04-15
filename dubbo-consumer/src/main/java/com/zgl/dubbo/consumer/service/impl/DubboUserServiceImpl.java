package com.zgl.dubbo.consumer.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zgl.dubbo.api.domain.User;
import com.zgl.dubbo.api.service.UserInterface;
import com.zgl.dubbo.consumer.service.DubboUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author zgl
 * @date 2019/4/14 上午11:11
 */
@Service
public class DubboUserServiceImpl implements DubboUserService {

	@Reference
	//@Resource
	private UserInterface userInterface;

	@Override
	public User getUser(String name) {
		return userInterface.getUser(name);
	}
}