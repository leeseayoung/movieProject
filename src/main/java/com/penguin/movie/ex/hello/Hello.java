package com.penguin.movie.ex.hello;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})

@Controller
public class Hello {
	 	@ResponseBody
	    @RequestMapping("/hello/test")
	    public String helloWorld() {
	        return "Hello World!!";
	    }
	}

