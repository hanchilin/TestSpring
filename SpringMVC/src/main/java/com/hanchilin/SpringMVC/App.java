package com.hanchilin.SpringMVC;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import testAOP.Volunteer;
import testInterface.Thinker;

/**
 * Hello world!
 *
 */
@Configuration("sapp")
public class App 
{
	
	@Bean
	public Performer duke(){
		return new Juggler(15);
	}
	
	@Bean
	public Thinker thingking(){
		return new Volunteer();
	}
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
