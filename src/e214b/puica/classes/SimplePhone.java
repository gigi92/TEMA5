package e214b.puica.classes;

import e214b.puica.interfaces.Phone;

public class SimplePhone implements Phone {//implementarea metodelor unui telefon pentru un simplephone

	@Override
	public void call() {
		System.out.println("Calling someone from a simple phone");
		
	}

	@Override
	public void answer() {
		System.out.println("Answering someone from a simple phone");
		
	}

}
