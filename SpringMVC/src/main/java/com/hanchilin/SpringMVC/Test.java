/*
CREAT:2015年3月19日上午9:39:15
USER:CW
*/

package com.hanchilin.SpringMVC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import testAOP.Audience;

public class Test {

	public static void main(String[] args) throws Exception {
		ApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContext.xml");
//		Performer pf = (Performer) ac.getBean("poeticDuke");
		Performer pf =  (Performer) ac.getBean("duke");
		pf.perform();
	}
}
