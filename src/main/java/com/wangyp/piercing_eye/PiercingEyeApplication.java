package com.wangyp.piercing_eye;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)

public class PiercingEyeApplication {

	public static void main(String[] args) {
		SpringApplication.run(PiercingEyeApplication.class, args);
	}

}
