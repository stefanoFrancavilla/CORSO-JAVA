package Argomento_4;

public class Esercizio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Esercizio 2 (Medio) — Figure Geometriche e Polimorfismo
Crea una classe astratta Figura con un metodo astratto public abstract double calcolaArea();.

Crea due sottoclassi concrete:

Rettangolo (con attributi base e altezza).

Cerchio (con attributo raggio).

Nel main, crea un array o lista polimorfica di tipo Figura[] contenente un mix di rettangoli e cerchi.
 Cicla l'array e stampa l'area di ciascuna figura sfruttando il polimorfismo.
		 */
		
		Figura[] figure = new Figura[4];
		
		figure[0] = new Rettangolo(5, 10);
		figure[1] = new Cerchio(3);
		figure[2] = new Rettangolo(7, 4);
		figure[3] = new Cerchio(5);
		
		for (Figura figura : figure) {
			System.out.println("Area: " + figura.calcolaArea());
		}
	}

}
