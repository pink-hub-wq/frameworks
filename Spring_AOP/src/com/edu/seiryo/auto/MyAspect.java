package com.edu.seiryo.auto;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAspect implements MethodInterceptor {
	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {
		System.out.println("方法开始前");
		Object obj = mi.proceed();
		System.out.println("方法开始后");
		return obj;
	}
}