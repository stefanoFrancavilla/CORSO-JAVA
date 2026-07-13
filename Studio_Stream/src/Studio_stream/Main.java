package Studio_stream;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
	List<Persona> persone = List.of(
	        new Persona("Anna", 17),
	        new Persona("Marco", 25),
	        new Persona("Luca", 30),
	        new Persona("Giulia", 15),
	        new Persona("Sara", 40)
	);
	
	List<Persona> personeMaggiorenni = new ArrayList<>();
	
	for(int i = 0; i < persone.size(); i ++)
	{
		if (persone.get(i).getEta() >= 18)
		{
			personeMaggiorenni.add(persone.get(i));
		}	
	}
	
	for(Persona persona : personeMaggiorenni)
	{
		System.out.println(persona);
	}

}
}