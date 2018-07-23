package com.rejupillai.robofarm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@SpringBootApplication
public class RobofarmApplication {

	static int count = 0 ; 
	static final  Logger logger = LoggerFactory.getLogger(RobofarmApplication.class);

	@RequestMapping("/")
	String home() {

		return "Hello Home ! " ; 

	}

	@RequestMapping("/robo")
	String robo() {
		
		logger.info("++++++++++++ Request Count -> " + count++ );
		System.out.print("++++++++++++ Request Count ->" + count++ );	
		return "Hello Robo Farm ! " ; 

	}


	public static void main(String[] args) {
		SpringApplication.run(RobofarmApplication.class, args);
	}
}
