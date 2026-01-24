package esercizio_classArray;

public class esercizio_classArray9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Esercizio: Somma di coordinate tra array di punti

Hai due array di punti:

Punto[] punti1 = {
    new Punto(1, 2),
    new Punto(3, 1),
    new Punto(4, 5),
    new Punto(2, 2)
};

Punto[] punti2 = {
    new Punto(0, 1),
    new Punto(1, 3),
    new Punto(2, 0),
    new Punto(3, 3)
};

🎯 Obiettivo

Crea un terzo array puntiSomma che contiene tanti punti quanti sono quelli dei due array, dove ogni punto ha:

x = somma delle x dei punti ai rispettivi indici

y = somma delle y dei punti ai rispettivi indici

Esempio:

punti1[0] = (1,2)
punti2[0] = (0,1)

puntiSomma[0] = (1+0 , 2+1) = (1,3)

✨ Cosa devi fare

Creare il nuovo array di tipo Punto[] con la stessa lunghezza degli altri.

Scorrere gli array con un ciclo for.

Sommare le coordinate.

Salvare il nuovo punto nell’array puntiSomma.

Stampare l’array risultante.
		 */
		
		Punto[] punti1 = {
				new Punto (1, 2),
				new Punto (3, 1),
				new Punto (4, 5),
				new Punto (2, 2)
		};
		Punto[] punti2 = {
			    new Punto(0, 1),
			    new Punto(1, 3),
			    new Punto(2, 0),
			    new Punto(3, 3)
			};
		Punto[] puntiSomma = {
				new Punto(0, 0),
			    new Punto(0, 0),
			    new Punto(0, 0),
			    new Punto(0, 0)
		};
		
		for(int i = 0; i < punti1.length; i++)
		{
			puntiSomma[i].x = punti1[i].x + punti2[i].x;
			puntiSomma[i].y = punti1[i].y + punti2[i].y;
		}
		
		for(int s = 0; s < punti1.length; s++)
		{
			System.out.println("La somma delle x degliarray punti1 + punti2 , del punto " + s + " è: " + puntiSomma[s].x);
			System.out.println("La somma delle y degliarray punti1 + punti2 , del punto " + s + " è: " + puntiSomma[s].y);
			System.out.println();
		}
				
		}
	}


