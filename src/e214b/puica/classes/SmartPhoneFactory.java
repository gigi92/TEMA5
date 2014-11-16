package e214b.puica.classes;

import e214b.puica.interfaces.Phone;
public class SmartPhoneFactory extends AbstractPhoneFactory{
	@Override
	public Phone createPhone() { //creaza SmartPhone
		SmartPhone phone= new SmartPhone();
		return phone;
	}
}
