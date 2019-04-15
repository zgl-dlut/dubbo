package com.zgl.dubbo.provider;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author zgl
 * @date 2019/4/13 下午10:50
 */
public interface BaseMapper<T> extends Mapper<T>, MySqlMapper<T> {
}