package com.edu.seiryo.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAspect implements MethodInterceptor {
	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {
		System.out.println("执行方法前");
		Object obj = mi.proceed();
		System.out.println("执行方法后");
		return obj;
	}
}