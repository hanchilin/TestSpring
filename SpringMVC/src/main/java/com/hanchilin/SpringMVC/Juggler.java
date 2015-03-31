package com.hanchilin.SpringMVC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Juggler implements Performer {

	private int beanBags = 3;
	
	public Juggler(){
		
	}
	public Juggler(int beanBags){
		this.beanBags = beanBags;
	}

	public void perform() throws Exception {
		System.out.println("JUGGLER " + beanBags + " BEANBAGS");
	}
	
	
	public static void main(String[] args) throws Exception {
		ApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Performer p = (Performer) ac.getBean("duke");
		p.perform();		
	}
}
