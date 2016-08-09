package com.netmarble.springStudy.dto;

import java.io.Serializable;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class BseDto<T> implements Serializable{
	private T resultData;
	
	public BseDto(){
		
	}
	public BseDto(T resultData){
		this.resultData = resultData;

	}
	public T getResultData() {
		return resultData;
	}
	public void setResultData(T resultData) {
		this.resultData = resultData;
	}
	@Override
	public String toString(){
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }
}
