package com.zgl.dubbo.api.service;

import com.zgl.dubbo.api.domain.User;

/**
 * @author zgl
 * @date 2019/4/13 下午10:48
 */
public interface UserInterface {

	User getUser(String name);
}