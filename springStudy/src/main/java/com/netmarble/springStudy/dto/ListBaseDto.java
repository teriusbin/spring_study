package com.netmarble.springStudy.dto;

import java.io.Serializable;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class ListBaseDto  implements Serializable {

	private Object resultData;
	private int listSize;
	
	public ListBaseDto(){
		
	}
	public ListBaseDto(Object resultData, int listSize){
		this.resultData = resultData;
		this.listSize = listSize;
	}
	
	public Object getResultData() {
		return resultData;
	}
	public void setResultData(Object resultData) {
		this.resultData = resultData;
	}
	public int getListSize() {
		return listSize;
	}
	public void setListSize(int listSize) {
		this.listSize = listSize;
	}
	@Override
	public String toString(){
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }
}
