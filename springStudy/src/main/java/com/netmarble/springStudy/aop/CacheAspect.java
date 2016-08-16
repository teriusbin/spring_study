package com.netmarble.springStudy.aop;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Component;



@Aspect
@Component
public class CacheAspect {
	private final Logger logger = LoggerFactory.getLogger(CacheAspect.class);
	@Around(value="@annotation(com.netmarble.springStudy.aop.CacheRemove)")
	public Object remove() throws Throwable {
		Object retVal = null; 
		System.out.println("custom DB remove");
		return retVal;
			

	}
	
	
}
