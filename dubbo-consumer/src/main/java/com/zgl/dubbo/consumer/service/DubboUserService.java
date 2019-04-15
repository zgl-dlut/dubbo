package com.zgl.dubbo.consumer.service;

import com.zgl.dubbo.api.domain.User;

/**
 * @author zgl
 * @date 2019/4/14 上午11:10
 */
public interface DubboUserService {

	User getUser(String name);
}