package e214b.puica.classes;
import e214b.puica.interfaces.AbstractPhoneFactory;
import e214b.puica.interfaces.Phone;
public class SmartPhoneFactory implements AbstractPhoneFactory {
	@Override
	public Phone createPhone() {
		SmartPhone phone= new SmartPhone();
		return phone;
	}
}
