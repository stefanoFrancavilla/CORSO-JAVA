package Esercizi_1;

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class Farmacia {

	public static void main(String[] args) {
		
		
		Queue<String> fila = new LinkedList<>();	

		fila.add("Anna");
		fila.add("Luca");
		fila.add("Marco");
		fila.add("Sara");
		fila.add("Paolo");
		
		
		fila.forEach(n -> System.out.println(n));
		
		System.out.println();
		System.out.println("----------------------------------");
		
		String primo = fila.peek();
		fila.remove(primo);
		System.out.println("Servito: " + primo);
		
		String secondo = fila.peek();
		fila.remove(secondo);
		System.out.println("Servito: " + secondo);
		
		System.out.println();
		System.out.println("----------------------------------");
		
		fila.forEach(n -> System.out.println(n));
		
		System.out.println();
		System.out.println("----------------------------------");
		
		System.out.println(contaPerIniziale(fila));
		
		System.out.println();
		System.out.println("----------------------------------");
		
		System.out.println(personaConNomePiuLungo(fila));
		
		System.out.println();
		System.out.println("----------------------------------");
		
		Deque<String> filaDeque = (Deque<String>) fila;
		filaDeque.addFirst("Giulia");
		filaDeque.forEach(n -> System.out.println(n));
		
		System.out.println();
		System.out.println("----------------------------------");
		
		System.out.println(riepilogoPersone(filaDeque));
	}

	
	public static Map<Character, Integer> contaPerIniziale(Queue<String> fila)
	{
		Map<Character, Integer> contaIniziali = new LinkedHashMap<>();
		for (String persona : fila)
		{
			char primoCarattere = persona.toUpperCase().charAt(0);
			
			if (contaIniziali.containsKey(primoCarattere))
			{
				int count = contaIniziali.get(primoCarattere) +1;
				contaIniziali.put(primoCarattere, count);
			}
			else
			{
				contaIniziali.put(primoCarattere, 1);
			}
		}
		return contaIniziali;
	}
	
	public static String personaConNomePiuLungo(Queue<String> fila)
	{
		int count = 0;
		String nomeLungo = "";
		
		for(String persona : fila)
		{
			if (persona.length() > count)
			{
				count = persona.length();
				nomeLungo = persona;
			}
		}
		return nomeLungo;
	}
	
	public static String riepilogoPersone(Queue<String> fila)
	{
		StringBuilder riepilogo = new StringBuilder("Persone in fila:");
		
		Set<String> riepilogoPersone = new HashSet<>();
		for(String persone : fila)
		{
			riepilogoPersone.add(persone);
		}
		
		int count = 0;
		for(String nome : riepilogoPersone)
		{
			count++;
			if (count == riepilogoPersone.size())
			{
				riepilogo.append(" ").append(nome);
			}
			else
			{
				riepilogo.append(" ").append(nome).append(",");
			}
		}
		String riepilogoFinale = riepilogo.toString();
		return riepilogoFinale;
		
	}
}
