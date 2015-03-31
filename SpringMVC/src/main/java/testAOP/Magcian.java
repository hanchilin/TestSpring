package testAOP;

import testInterface.MindReader;

public class Magcian implements MindReader {

	private String thoughts;
	
	public void interceptThoughts(String thoughts) {
		System.out.println("Intercepting volunteer's " + thoughts);
	}

	public String getThoughts() {
		return thoughts;
	}

}
