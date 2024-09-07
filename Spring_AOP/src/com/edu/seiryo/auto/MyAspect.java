package com.edu.seiryo.auto;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAspect implements MethodInterceptor {
	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {
		System.out.println("������ʼǰ");
		Object obj = mi.proceed();
		System.out.println("������ʼ��");
		return obj;
	}
}