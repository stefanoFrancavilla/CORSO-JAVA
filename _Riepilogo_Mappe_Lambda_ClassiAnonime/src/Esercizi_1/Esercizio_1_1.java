package Esercizi_1;

import java.util.HashMap;
import java.util.Map;

public class Esercizio_1_1 {

	
	public static Map<Character, Integer> contaCaratteri(String testo) 
	{
		Map<Character, Integer> caratteriEValori = new HashMap<>();
		
		for (int i = 0; i < testo.length(); i++)
		{
			char carattereCorrente = testo.charAt(i);
			
			if(caratteriEValori.containsKey(carattereCorrente))
			{
				int counter = caratteriEValori.get(carattereCorrente);
				counter++;
				caratteriEValori.put(carattereCorrente, counter);
			}
			else
			{
				caratteriEValori.put(carattereCorrente, 1);
			}
		}
		
		return caratteriEValori;
	}


public static void main(String[] args) {
    System.out.println(contaCaratteri("java"));
    System.out.println(contaCaratteri("ciao mondo"));
}

}