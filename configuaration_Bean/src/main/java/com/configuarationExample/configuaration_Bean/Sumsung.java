package com.configuarationExample.configuaration_Bean;

import org.springframework.beans.factory.annotation.Autowired;

public class Sumsung {

	
	@Autowired
	MobilePro mp;
	
	public MobilePro getMp() {
		return mp;
	}

	public void setMp(MobilePro mp) {
		this.mp = mp;
	}

	public void config()
	{
		System.out.println("octa core ,4gb,12mp camera");
		mp.process();
	}
	
	
}
