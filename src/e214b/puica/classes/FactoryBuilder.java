package e214b.puica.classes;

public class FactoryBuilder {
	public static AbstractPhoneFactory getFactory(String choice){
		//pot produce smarthone-uri sau telefoane obisnuite
		if(choice.equals("Smartphone")) 
		{
			return new SmartPhoneFactory();
		}
		else if(choice.equals("SimplePhone")){
			return new SimplePhoneFactory();
		}
		return null;
	}
	
}
