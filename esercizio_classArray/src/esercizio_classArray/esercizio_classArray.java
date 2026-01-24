package esercizio_classArray;
import java.util.Scanner;
public class esercizio_classArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Gestione di una Rubrica Semplice
Obiettivo

Creare un programma che gestisca una piccola rubrica di nomi.

Cosa devi fare

Crea un array di 5 nomi.

Stampa l’intero array utilizzando un ciclo while, mostrando ogni nome con il suo indice.

Crea una variabile nomiUniti (String).

Utilizzando un altro ciclo while:

unisci tutti i nomi in una singola stringa,

separandoli con "; " (punto e virgola + spazio),

ma l’ultimo nome deve terminare con un punto ".".

Stampa la stringa finale.

🎯 Requisiti aggiuntivi (per renderlo più interessante)

Alla fine del programma stampa anche:

quanti nomi sono lunghi più di 4 lettere

quanti nomi iniziano con la lettera "M" (maiuscola o minuscola)

📌 Esempio di output atteso (indicativo)
nome[0]: Luca
nome[1]: Sara
nome[2]: Marco
nome[3]: Giulia
nome[4]: Anna

Nomi uniti: Luca; Sara; Marco; Giulia; Anna.

Nomi con più di 4 lettere: 3
Nomi che iniziano con M: 1
 */
		
		Scanner scanner = new Scanner(System.in);
		
		String[] nomi = new String[5];
		
		System.out.println("inserisci primo nome");
		nomi[0] = scanner.nextLine();
		System.out.println();
		
		System.out.println("inserisci secondo nome");
	    nomi[1] = scanner.nextLine();
	    System.out.println();
	    
	    System.out.println("inserisci terzo nome");
	    nomi[2] = scanner.nextLine();
	    System.out.println();
	    
	    System.out.println("inserisci quarto nome");
	    nomi[3] = scanner.nextLine();
	    System.out.println();
	    
	    System.out.println("inserisci quinto nome");
	    nomi[4] = scanner.nextLine();
	    System.out.println();
	    
	    int counter = 0;
	    
	    while ( counter < nomi.length) {
	    	System.out.println("nome[" + counter + "]: " + nomi[counter]);
	    	counter++;
	    	}
	    System.out.println();
	    
	    int counter2 = 0;
	    String nomiUniti = "";
	    
	    while ( counter2 < nomi.length) {
	    	String spazio = "; ";
	    	String punto = ". ";
	    	
	    
	    	
	    	
	    	if (counter2 == 4) {
	    		
	    		nomiUniti += nomi[counter2] + punto;
	    	}
	    	else
	    	{
	    	nomiUniti += nomi[counter2] + spazio;
	    	}
	    	counter2++;
	    }
	    
	    System.out.println(nomiUniti);
	    	
	       int nomiConM = 0;
	    	int nomiLunghi = 0;
	    	
	    	for ( int i = 0; i < nomi.length; i++) {
	    	    
	    		if (nomi[i].indexOf("m") != -1) {
	    				nomiConM ++;
	    		}
	    		if ( nomi[i].length() > 4) {
    				nomiLunghi ++;
    			}
	    		
	    	}
	    	System.out.println();
	    	System.out.println("i nomi con più di 4 lettere sono: " + nomiLunghi);
	    	System.out.println();
	    	
	    	System.out.println("i nomi che iniziano con la m sono: " + nomiConM);
	    	
	    	
	    	scanner.close();
	}

}
