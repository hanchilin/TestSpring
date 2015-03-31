package testAOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import testInterface.MindReader;

public class Test {

	public static void main(String[] args) {
		/*ApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		MindReader mr = (MindReader) ac.getBean("magcian");
		mr.interceptThoughts("test");*/
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Audience ad = (Audience) ac.getBean("audience");
		ad.takeSeats();
		ad.turnOffCellPhone();
		ad.applaud();
		ad.demandRefund();
	}
}
