/*
CREAT:2015年3月19日上午9:49:29
USER:CW
*/

package com.hanchilin.SpringMVC;

public class Sonnet29 implements Poem {

	private static String[] LINES = {
		"When, in disgrace with fortune and men's eyes,",
		"I all alone beweep my outcast state."
	};
	
	public Sonnet29() {
		// TODO Auto-generated constructor stub
	}

	public void recite() {
		for (int i = 0; i < LINES.length; i++) {
			System.out.println(LINES[i]);
		}

	}

}
