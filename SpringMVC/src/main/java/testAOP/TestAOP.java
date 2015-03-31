package testAOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hanchilin.SpringMVC.Performer;


public class TestAOP {

	public static void main(String[] args) throws Exception {
		/*ApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		MindReader mr = (MindReader) ac.getBean("magcian");
		mr.interceptThoughts("test");*/
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Performer pf = (Performer) ac.getBean("duke");
		pf.perform();
	}
}
