/*
CREAT:2015年3月19日上午11:30:19
USER:CW
*/

package com.hanchilin.SpringMVC;

import org.springframework.beans.factory.annotation.Autowired;

public class Instrumentalist implements Performer {

	public Instrumentalist(){		
	}
	
	private String song;
	@Autowired
	@StringedInstrument
	private Instrument instrument;

	public void perform() throws Exception {
		System.out.print("Playing "+song+" : ");
		instrument.play();
	}
	public String getSong() {
		return song;
	}
	public void setSong(String song) {
		this.song = song;
	}
	public void screamSong(String song) {
		this.song = song;
	}
	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}

}
