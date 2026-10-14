package Esercizi_1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Esercizio_1_2 {

	
	public static Map<Integer, Integer> contaPunteggi(List<Integer> punteggi)
	{
		Map<Integer, Integer> punteggiEConteggio = new HashMap<>();
		
		for(Integer punteggio : punteggi)
		{
			if(punteggiEConteggio.containsKey(punteggio))
			{
				int counter = punteggiEConteggio.get(punteggio);
				counter++;
				punteggiEConteggio.put(punteggio, counter);
			}
			else
			{
				punteggiEConteggio.put(punteggio, 1);
			}
		}
		return punteggiEConteggio;	
	 }
	
	
	public static void main(String[] args) {
	    List<Integer> punteggi = List.of(10, 20, 10, 30, 20, 10);
	    System.out.println(contaPunteggi(punteggi));

	    List<Integer> altriPunteggi = List.of(5, 5, 5, 8, 8, 12);
	    System.out.println(contaPunteggi(altriPunteggi));
	}
}
