package incapsulamentoDeiDati.customthread;

import incapsulamentoDeiDati.singletons.MacchinettaDelCaffe;

public class MacchinettaDelCaffeThread extends Thread {

	MacchinettaDelCaffe macchinettaDelCaffe;
	@Override
	public void run()
	{
		macchinettaDelCaffe = MacchinettaDelCaffe.getInstance(); 
	}
	
	
}
