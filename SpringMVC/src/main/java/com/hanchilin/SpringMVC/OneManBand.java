/*
CREAT:2015年3月19日下午12:15:19
USER:CW
*/

package com.hanchilin.SpringMVC;

import java.util.Collection;
import java.util.Map;

public class OneManBand implements Performer {

	public OneManBand() {
		// TODO Auto-generated constructor stub
	}

	/*private Collection<Instrument> instruments;
	
	@Override
	public void perform() throws Exception {
		for (Instrument instrument : instruments) {
			instrument.play();
		}
	}

	public void setInstruments(Collection<Instrument> instruments) {
		this.instruments = instruments;
	}*/
	
	private Map<String, Instrument> instruments;

	public void perform() throws Exception {
		for (String key : instruments.keySet()) {
			System.out.println("key: "+key+" ");
			Instrument instrument = instruments.get(key);
			instrument.play();
		}
	}

	public void setInstruments(Map<String, Instrument> instruments) {
		this.instruments = instruments;
	}

}
