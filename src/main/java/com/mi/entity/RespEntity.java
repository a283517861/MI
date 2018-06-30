package com.mi.entity;

/**
 * @Author 张东旭
 * @Description
 * @Date 2018.6.28 22:57
 * @Modified
 */
//接口响应至少需要告诉使用方三项信息：状态码、描述、数据。

public class RespEntity {

	private int code;
	private String msg;
	private Object data;


	public RespEntity(RespCode respCode){
		this.code = respCode.getCode();
		this.msg = respCode.getMsg();
	}




	public RespEntity(RespCode respCode, Object data) {
		this(respCode);
		this.data = data;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public int getCode() {
		return code;
	}

	public String getMsg() {
		return msg;
	}

	public Object getData() {
		return data;
	}
}
