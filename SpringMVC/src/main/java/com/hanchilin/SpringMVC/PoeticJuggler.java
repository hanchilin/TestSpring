/*
CREAT:2015年3月19日上午9:39:15
USER:CW
*/

package com.hanchilin.SpringMVC;

import org.springframework.beans.factory.annotation.Autowired;

public class PoeticJuggler extends Juggler {
	private Poem poem;
	@Autowired
	public PoeticJuggler(Poem poem) {
		super();
		this.poem = poem;
	}
	
	public PoeticJuggler(int beanBags, Poem poem) {
		super(beanBags);
		this.poem = poem;
	}
	
	public void perform() throws Exception{
		super.perform();
		System.out.println("While reciting...");
		poem.recite();
	}
	

}
