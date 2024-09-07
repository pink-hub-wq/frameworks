package com.edu.seiryo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.HiddenHttpMethodFilter;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.edu.seiryo.interceptor.LoginHandlerInterceptor;
@Configuration
public class MyConfig implements WebMvcConfigurer{
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new LoginHandlerInterceptor())
		.addPathPatterns("/**")
		.excludePathPatterns("/index.html","/","/user/login","/js/**","/css/**","/img/**");
	}
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/main.html").setViewName("dashboard.html");
		registry.addViewController("/").setViewName("index.html");
		registry.addViewController("/index.html").setViewName("index.html");
	}
	@Bean
	public HiddenHttpMethodFilter hiddenHttpMethodFilter() {
		HiddenHttpMethodFilter hiddenHttpMethodFilter = new HiddenHttpMethodFilter();
		hiddenHttpMethodFilter.setBeanName("hiddenHttpMethodFilter");
		hiddenHttpMethodFilter.setMethodParam("_method");
		return hiddenHttpMethodFilter;
	}
	@Bean
	public LocaleResolver localeResolver() {
		return new MyLocalResolver();
	}
}
