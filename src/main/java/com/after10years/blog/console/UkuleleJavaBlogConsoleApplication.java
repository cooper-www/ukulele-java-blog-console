package com.after10years.blog.console;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@SpringBootApplication
public class UkuleleJavaBlogConsoleApplication {

	public static void main(String[] args) {
		SpringApplication.run(UkuleleJavaBlogConsoleApplication.class, args);
	}
}
