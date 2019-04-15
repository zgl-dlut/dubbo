package com.zgl.dubbo.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zgl.dubbo.api.service.UserInterface;
import org.springframework.stereotype.Component;

/**
 * @author zgl
 * @date 2019/4/13 下午10:49
 */
@Service(version = "8.8.8")
@Component
public class UserInterfaceImpl implements UserInterface {

	@Override
	public String getUser(String name) {
		return "zgl无敌!";
	}
}