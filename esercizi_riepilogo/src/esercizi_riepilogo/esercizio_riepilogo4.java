package esercizi_riepilogo;

public class esercizio_riepilogo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

       /*
        * Esercizio: Esploriamo i codici Unicode
        * Scrivi un programma Java che:
        * Dichiari un array di caratteri Unicode usando il formato \ uXXXX, contenente:
        * una lettera latina (\u0041 → 'A')
        * un carattere greco (\u03B1 → 'α')

un simbolo matematico (\u221E → '∞')

un numero (\u0039 → '9')

e il carattere nullo (\u0000).

Stampi ogni carattere insieme al suo codice decimale (cioè il valore int associato al char).

Verifichi se uno dei caratteri è uguale a Character.MIN_VALUE.

Calcoli la somma dei codici numerici dei caratteri e la stampi.
        */
		
		char latino ='A';
		char greco ='Ω';
		char mate ='∞';
		char numero ='9';
		char nullo ='\u0000';
		
		System.out.println("carattere : " + latino + " codice decimale : " + (int) latino );
		System.out.println("carattere : " + greco + " codice decimale : " + (int) greco );
		System.out.println("carattere : " + mate + " codice decimale : " + (int) mate );
		System.out.println("carattere : " + numero + " codice decimale : " + (int) numero );
		System.out.println("carattere : " + nullo  + " codice decimale : " + (int) nullo );
	
		int somma = (int) latino + (int) greco + (int) mate + (int) numero + (int) nullo;
		
		System.out.println("la somma di tutti i valori numerici dei caratteri è: " + somma);
		System.out.println( latino == Character.MIN_VALUE);
		System.out.println( greco == Character.MIN_VALUE);
		System.out.println( mate == Character.MIN_VALUE);
		System.out.println( numero == Character.MIN_VALUE);
		System.out.println( nullo == Character.MIN_VALUE);
		
		
	}

}
