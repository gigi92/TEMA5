package e214b.puica.main;
import e214b.puica.classes.*;
import e214b.puica.interfaces.Phone;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//am creat factory pt simplephone
		AbstractPhoneFactory simplePhoneFactory = FactoryBuilder.getFactory("SimplePhone");
		Phone phone1=simplePhoneFactory.createPhone();
		phone1.answer();
	}

}
