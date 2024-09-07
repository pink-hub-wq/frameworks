package com.edu.seiryo.config;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;

@Configuration
public class DruidConfig {
	@ConfigurationProperties(prefix = "spring.datasource")
	@Bean
	public DataSource druidDataSource() throws SQLException {
		DruidDataSource dataSource = new DruidDataSource();
		dataSource.setInitialSize(5);
		dataSource.setMaxActive(20);
		dataSource.setFilters("stat");
		return dataSource;
	}

	@Bean
	public ServletRegistrationBean statViewServlet() {
		StatViewServlet statViewServlet = new StatViewServlet();
		ServletRegistrationBean<StatViewServlet> bean = new ServletRegistrationBean<StatViewServlet>(
				statViewServlet, "/druid/*");
		Map<String, String> initParams = new HashMap<String, String>();
		initParams.put("loginUsername", "admin");
		initParams.put("loginPassword", "123");
		bean.setInitParameters(initParams);
		return bean;
	}

	@Bean
	public FilterRegistrationBean webStatFilter() {
		FilterRegistrationBean bean = new FilterRegistrationBean();
		bean.setFilter(new WebStatFilter());
		Map<String, String> initParams = new HashMap<>();
		initParams.put("exclusions", "*.js,*.css,/druid/*,/jdbc/*");
		bean.setInitParameters(initParams);
		bean.setUrlPatterns(Arrays.asList("/*"));
		return bean;
	}
}
