package com.mi.entity;

import javax.validation.constraints.NotBlank;

/**
 * @Author 张东旭
 * @Description
 * @Date 2018.6.30 17:27
 * @Modified
 */
public class ReqUser {
	@NotBlank(message = "登录类型不能为空")
	private String identityType;
	@NotBlank(message = "用户名不能为空")
	private String identifier;
	@NotBlank(message = "密码不能为空")
	private String credential;


	public String getIdentityType() {
		return identityType;
	}

	public String getIdentifier() {
		return identifier;
	}

	public String getCredential() {
		return credential;
	}



}
