package com.netmarble.springstudy.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.netmarble.springstudy.constant.ResultStatus;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Response {

	@JsonIgnore
	ResultStatus status;
	@JsonProperty
	private Object result;
	public Response(){
		status = ResultStatus.OK;
	}
	public Response(ResultStatus status){
		this.status = status;
	}
	@JsonProperty
	public int getCode(){
		return status.getCode();
	}
	@JsonProperty
	public String getMessage(){
		return status.getMessage();
	}
}
