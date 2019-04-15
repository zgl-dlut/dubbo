package com.zgl.dubbo.api.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zgl
 * @date 2019/4/13 下午10:47
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {

	private Integer id;

	private String name;

	private Integer age;

	private String sex;
}