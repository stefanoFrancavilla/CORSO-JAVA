package esercizio_classArray;
import java.util.Scanner;
public class esercizio_classArray8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ESERCIZIO SEMPLICE
"Stampa solo i punti che hanno la coordinata X maggiore di 2"

Crea un array di 5–6 oggetti Punto (come nel tuo esercizio).

Con un ciclo for, controlla per ogni punto se x > 2.

Se la condizione è vera, stampa il punto (o almeno le sue coordinate).

🎯 Obiettivo

Allenarti con:

iterazione sugli array di oggetti

accesso alle proprietà (punto.x e punto.y)

condizione if

stampa selettiva
		 */
		Scanner scanner = new Scanner(System.in);
		
		Punto[] punti = new Punto[5];
		
		for (int i = 0; i < punti.length; i++)
		{
			System.out.println("Inserisci le coordinate x , y del punto: " + i);
			
			double x = scanner.nextDouble();
			double y = scanner.nextDouble();
			
			punti[i] = new Punto(x, y);
			System.out.println();
		}
		
		for (int s = 0; s < punti.length; s++)
		{
			if(punti[s].x > 2) 
			{
				System.out.println("Le coordinate sono: x " + punti[s].x + ", y " + punti[s].y);
			}
		}
		scanner.close();
		}

}
