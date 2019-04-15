package com.zgl.dubbo.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zgl.dubbo.api.domain.User;
import com.zgl.dubbo.api.service.UserInterface;
import com.zgl.dubbo.provider.mapper.UserMapper;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;

/**
 * @author zgl
 * @date 2019/4/13 下午10:49
 */
@Service
public class UserInterfaceImpl implements UserInterface {

	@Resource
	private UserMapper userMapper;

	@Override
	public User getUser(String name) {
		Example example = new Example(User.class);
		example.createCriteria().andEqualTo("name", name);
		return userMapper.selectOneByExample(example);
	}
}