package com.spring.test.cache;

import java.util.concurrent.TimeUnit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.test.entity.Student;

@Configuration
public class CacheBeanConfig {
	
	@Bean
	CacheStore<String> otpCache(){
		return new CacheStore<String>(2, TimeUnit.MINUTES);
	}
	
	@Bean
	CacheStore<Student> userCache(){
		return new CacheStore<Student>(2, TimeUnit.MINUTES);
	}

}
