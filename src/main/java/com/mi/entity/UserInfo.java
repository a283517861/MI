package com.mi.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;


/**
 * @Author 张东旭
 * @Description
 * @Date 2018.6.28 23:27
 * @Modified
 */
@JsonRootName("UserInfo")
public class UserInfo {

	//用户基本信息
	@JsonProperty("id")
	private Integer id;
	@JsonProperty("nickname")
	private String nickname;
	@JsonProperty("avatar")
	private String avatar;
	@JsonProperty("deptId")
	private Integer deptId;
	@JsonProperty("adminId")
	private Integer adminId;
	@JsonProperty("userType")
	private Integer userType;
	@JsonProperty("userStatus")
	private Integer userStatus;
	@JsonProperty("userName")
	private String userName;
	@JsonProperty("address")
	private String address;
	@JsonProperty("role")
	private Integer role;
	@JsonProperty("email")
	private String email;
	@JsonProperty("phone")
	private String phone;
	@JsonProperty("ip")
	private Integer ip;
	@JsonProperty("identityType")
	private String identityType;
	@JsonProperty("identifier")
	private String identifier;
	@JsonProperty("credential")
	private String credential;

	public UserInfo() {

	}

	public UserInfo(Integer id, String identityType, String nickname, String avatar, Integer deptId, Integer adminId,
					Integer userType, Integer userStatus, String userName, String address, Integer role, String email,
					String phone, Integer ip, String identityType1, String identifier, String credential) {
		this.id = id;
		this.identityType = identityType;
		this.nickname = nickname;
		this.avatar = avatar;
		this.deptId = deptId;
		this.adminId = adminId;
		this.userType = userType;
		this.userStatus = userStatus;
		this.userName = userName;
		this.address = address;
		this.role = role;
		this.email = email;
		this.phone = phone;
		this.ip = ip;
		this.identityType = identityType1;
		this.identifier = identifier;
		this.credential = credential;
	}



	public String getIdentifier() {

		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public String getCredential() {
		return credential;
	}

	public void setCredential(String credential) {
		this.credential = credential;
	}



	public Integer getId() {
		return id;
	}

	public String getIdentityType() {
		return identityType;
	}

	public String getNickname() {
		return nickname;
	}

	public String getAvatar() {
		return avatar;
	}

	public Integer getDeptId() {
		return deptId;
	}

	public Integer getAdminId() {
		return adminId;
	}

	public Integer getUserType() {
		return userType;
	}

	public Integer getUserStatus() {
		return userStatus;
	}

	public String getUserName() {
		return userName;
	}

	public String getAddress() {
		return address;
	}

	public Integer getRole() {
		return role;
	}

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}

	public Integer getIp() {
		return ip;
	}


	public void setId(Integer id) {
		this.id = id;
	}

	public void setIdentityType(String identityType) {
		this.identityType = identityType;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}

	public void setUserType(Integer userType) {
		this.userType = userType;
	}

	public void setUserStatus(Integer userStatus) {
		this.userStatus = userStatus;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setRole(Integer role) {
		this.role = role;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setIp(Integer ip) {
		this.ip = ip;
	}






}
