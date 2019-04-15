package com.zgl.dubbo.provider.mapper;

import com.zgl.dubbo.api.domain.User;
import com.zgl.dubbo.provider.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author zgl
 * @date 2019/4/13 下午10:51
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}