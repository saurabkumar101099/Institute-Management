package com.spiders.softwaretrainingspringboot.util;

public class ResponseStructure <H> {
	
	private int status;
	private String message;
	private H data;
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public H getData() {
		return data;
	}
	public void setData(H data) {
		this.data = data;
	}
	

}
