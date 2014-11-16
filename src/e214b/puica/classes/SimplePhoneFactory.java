package e214b.puica.classes;
import e124b.puica.interfaces.AbstractPhoneFactory;
import e124b.puica.interfaces.Phone;
public class SimplePhoneFactory implements AbstractPhoneFactory {

	public Phone createPhone() {
		SimplePhone phone= new SimplePhone();
		return phone;
	}

}
