package com.netmarble.springStudy.aop;

public enum CacheConsts {
	DBName("springDB"); 
	
	private final String dbName;
	
	CacheConsts(String bucketName){
		this.dbName = bucketName;
	}

	public String getBucketName() {
		return dbName;
	}
	
}
