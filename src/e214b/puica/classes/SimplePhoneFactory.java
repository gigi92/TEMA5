package e214b.puica.classes;
import e214b.puica.interfaces.AbstractPhoneFactory;
import e214b.puica.interfaces.Phone;
public class SimplePhoneFactory implements AbstractPhoneFactory {

	public Phone createPhone() {
		SimplePhone phone= new SimplePhone();
		return phone;
	}

}
