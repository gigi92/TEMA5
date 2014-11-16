package classes;

import e124b.puica.interfaces.Phone;

public class SmartPhone implements Phone {

	@Override
	public void call() {
		System.out.println("Calling someone from smartphone");
		
	}

	@Override
	public void answer() {
		System.out.println("Answering someone from smartphone");
		
	}

}
