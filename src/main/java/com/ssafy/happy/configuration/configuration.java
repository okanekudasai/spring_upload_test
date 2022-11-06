package com.ssafy.happy.configuration;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = { "com.ssafy.**.mapper" })
public class configuration {
	
}
