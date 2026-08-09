package Argomento_2;

public class Esercizio_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Dato un array double[] voti = {7.5, 8.0, 6.5, 9.0, 5.5};,
		 *  scrivi un programma che calcoli la media aritmetica di tutti i voti e la stampi in console.
		 */
		double[] voti = {7.5, 8.0, 6.5, 9.0, 5.5};
		double valoreTotaleVoti = 0;
		
		for (int i = 0; i < voti.length; i++)
		{
			valoreTotaleVoti += voti[i];
		}
		
		double mediaVoti = valoreTotaleVoti/voti.length;
		System.out.println(mediaVoti);
	}

}
