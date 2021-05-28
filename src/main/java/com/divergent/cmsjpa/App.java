package com.divergent.cmsjpa;



import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.divergent.cmsjpa.config.AppConfig;


public class App
{
	public static void main(String[] args) throws Exception {
		
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Home home = context.getBean(Home.class);
		//Home home= new Home();
		home.home();
	}
	
}


