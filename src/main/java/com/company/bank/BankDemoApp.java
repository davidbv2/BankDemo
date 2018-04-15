	package com.company.bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// the below annotation tells Spring boot that this is where we want to start app
@SpringBootApplication 
public class BankDemoApp {

	public static void main(String[] args) {
		/* Every web app needs a main Java method o start.
		 * This method will be where our Spring boot app starts,
		 * creating servlet container for app to run on etc. 
		 */
		
		/*This method sets up default config., starts Spring app context (Spring 
		 * container), performs class path scan (tracks annotations)
		 * & starts Tomcat server 
		 */
		
		SpringApplication.run(BankDemoApp.class, args);
		
		

	}

}
