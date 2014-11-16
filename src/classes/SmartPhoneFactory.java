package classes;
import e124b.puica.interfaces.AbstractPhoneFactory;
import e124b.puica.interfaces.Phone;
public class SmartPhoneFactory implements AbstractPhoneFactory {
	@Override
	public Phone createPhone() {
		SmartPhone phone= new SmartPhone();
		return phone;
	}
}
