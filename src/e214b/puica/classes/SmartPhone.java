package e214b.puica.classes;

import e214b.puica.interfaces.Phone;

public class SmartPhone implements Phone { //implementarea metodelor unui telefon pentru un smartphone

	@Override
	public void call() {
		System.out.println("Calling someone from smartphone");
		
	}

	@Override
	public void answer() {
		System.out.println("Answering someone from smartphone");
		
	}

}
