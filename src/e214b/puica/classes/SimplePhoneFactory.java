package e214b.puica.classes;

import e214b.puica.interfaces.Phone;


public class SimplePhoneFactory extends AbstractPhoneFactory{
@Override
	public Phone createPhone() { //functia care creeaza SimplePhone
		SimplePhone phone= new SimplePhone();
		return phone;
	}

}
