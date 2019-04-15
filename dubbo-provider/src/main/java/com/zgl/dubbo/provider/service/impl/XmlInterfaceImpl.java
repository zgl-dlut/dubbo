package com.zgl.dubbo.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zgl.dubbo.api.service.XmlInterface;

/**
 * @author zgl
 * @date 2019/4/15 下午2:37
 */
@Service(version = "9.9.9")
public class XmlInterfaceImpl implements XmlInterface {

	@Override
	public String testXml() {
		return "XML配置~~~";
	}
}