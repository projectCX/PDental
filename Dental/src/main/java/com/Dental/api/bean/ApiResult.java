package com.Dental.api.bean;

public class ApiResult {
	
	private Boolean successed;
	private String error;
	public Boolean getSuccessed() {
		return successed;
	}
	public void setSuccessed(Boolean successed) {
		this.successed = successed;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public ApiResult() {
		super();
	}
	public ApiResult(Boolean successed, String error) {
		super();
		this.successed = successed;
		this.error = error;
	}
	
	
}
