package Esercizi_avanzati;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.DoubleUnaryOperator;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class esercizio_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * 1. Lambda
Esercizi di codice
Esercizio 1 (base)
Scrivi una lambda che:

prende due interi a e b,

e retourna la loro differenza a - b.

Assegna la lambda a una variabile di tipo IntBinaryOperator e stampa il risultato per a = 10, b = 3.


java
import java.util.function.IntBinaryOperator;

public class LambdaEx1 {
    public static void main(String[] args) {
        // TODO: definisci la lambda e usa applyAsInt
    }
}
Esercizio 2 (medio)
Usa una lambda per:

creare un Function<String, Integer> che prende una stringa e retourna la sua lunghezza.

usa apply per trasformare la lista ["ana", "luigi", "mario"] in una lista di lunghezze [3, 5, 5].

Puoi usare ArrayList e un ciclo for.


java
import java.util.function.Function;
import java.util.ArrayList;

public class LambdaEx2 {
    public static void main(String[] args) {
        // TODO: definisci la lambda, trasformaa la lista di stringhe in lista di INTEGER
    }
}
Esercizio 3 (avanzato)
Scrivi un metodo:


java
public static int opera(IntBinaryOperator op, int x, int y)
che:

riceve una lambda (o qualsiasi implementazione di IntBinaryOperator) come primo parametro,

chiama op.applyAsInt(x, y) e retourna il risultato.

In main:

chiama opera con 3 lambda diverse: somma, differenza, prodotto.

stampa i risultati per x = 4, y = 5.


java
import java.util.function.IntBinaryOperator;

public class LambdaEx3 {
    public static void main(String[] args) {
        // TODO: definisci opera e chiamalo con 3 lambda
    }

    public static int opera(IntBinaryOperator op, int x, int y) {
        // TODO
    }
}
Domande di teoria (Lambda)
Cosa significa dire che una lambda è un “blocco di codice che può essere passato come valore”?

Perché le lambda in Java devono essere associata a un’interfaccia funzionale?

Quando è meglio usare una lambda invece di creare una classe separata?

Quali sono le differenze tra (int x, int y) -> x + y e (x, y) -> x + y?

Puoi usare una lambda per implementare un metodo che retourna qualcosa? Spiega con un esempio di interfaccia funzionale.
		 */
		
		//Esercizo 1
		
		IntBinaryOperator differenza = (int a, int b) -> a -b;
		int risultato = differenza.applyAsInt(10, 3);
		System.out.println(risultato);
		System.out.println("----------------------------------------");
		
		
	   //Esercizio 2
		
		Function<String, Integer> lunghezza = s -> s.length();
		
		List<String> nomi = Arrays.asList("ana", "luigi", "mario");
		
		ArrayList<Integer> risultatoLunghezza = new ArrayList<>();
		
		for(String nome : nomi)
		{
			risultatoLunghezza.add(lunghezza.apply(nome));
		}
		
		System.out.println(risultatoLunghezza);
		
		//Esarecizio 3
		
		System.out.println("----------------------------------------");
		
		
		IntBinaryOperator somma = (int a, int b) -> a + b;
		IntBinaryOperator prodotto = (int a, int b) -> a * b;
		IntBinaryOperator diff = (int a , int b) -> a - b;
		
		int x1 = 4;
		int y1 = 5;
		
		System.out.println(opera(somma, x1, y1));
		System.out.println(opera(prodotto, x1, y1));
		System.out.println(opera(diff, x1, y1));
	
		System.out.println("----------------------------------------");
		
		
		//esercizio conferma 1
		
		Predicate<Integer> isCorrect = f -> f > 10;
		List<Integer> listaNum = Arrays.asList(5, 12, 8, 20, 3);
		
		for (int i = 0; i < listaNum.size(); i++)
		{
			boolean numeroCorrente = isCorrect.test(listaNum.get(i));
			
			if (numeroCorrente == true)
			{
				System.out.println("Valide: " + listaNum.get(i));
			}
			
		}
		System.out.println("----------------------------------------");
		
		//esercizio conferma 2
		
		Function<Integer, Double> radiceQuadrata = a -> Math.sqrt(a);
		
		List<Integer> listaInt = Arrays.asList(1, 4, 9, 16, 25);
		
		ArrayList<Double> listaDouble = new ArrayList<>();
		
		for(Integer lista : listaInt)
		{
			listaDouble.add(radiceQuadrata.apply(lista));
		}
 		
		System.out.println(listaDouble);
		
		System.out.println("----------------------------------------");
		
		//esercizio conferma 3
		
		DoubleUnaryOperator doppio = x -> x * 2;
		DoubleUnaryOperator trio = x -> x * 3;
		DoubleUnaryOperator quadrato = x -> x * x;
		
	
		double x = 5;
		
		System.out.println("doppio: " + operaDoppio(doppio, x));
		System.out.println("trio: " + operaDoppio(trio, x));
		System.out.println("quadrato: " + operaDoppio(quadrato ,x));
		
		System.out.println("----------------------------------------");
		
		Predicate<String> stringa = str -> str.length() > 5;
		
		System.out.println(stringa.test("ciao"));
		System.out.println(stringa.test("programmazione"));
		System.out.println(stringa.test("luigi"));
		System.out.println(stringa.test("federico"));
		
		System.out.println("----------------------------------------");
		
		Predicate<String> stringa1 = str -> str.length() >= 5;
		
		List<String> nomi1 = Arrays.asList("Anna", "Luigi", "Marco", "Al", "Giulia");
		ArrayList<String> nomiLunghi = new ArrayList<>();
		
		for(String nome : nomi1)
		{
			if(stringa1.test(nome) == true)
			{
				nomiLunghi.add(nome);
			}
		}
		System.out.println(nomiLunghi);
		
		System.out.println("----------------------------------------");
		
		Consumer<String> stampa = s -> System.out.println(s.toUpperCase());
		stampa.accept("ciao");
		
		
		System.out.println("----------------------------------------");
		
		Supplier<Integer> n = () -> 100;
		System.out.println(n.get());
	}
	public static int opera(IntBinaryOperator a , int x , int y)
	{ 
		
		int risultato = a.applyAsInt(x , y );
		
		
		return risultato;
	}
	
	public static double operaDoppio ( DoubleUnaryOperator c , double x) 
	{
		return c.applyAsDouble(x);
	}
}
