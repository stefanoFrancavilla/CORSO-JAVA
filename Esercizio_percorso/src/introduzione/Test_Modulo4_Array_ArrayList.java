package introduzione;

import java.util.ArrayList;

public class Test_Modulo4_Array_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * 📝 TEST MODULO 4 - INIZIA QUI
DOMANDE TEORIA (1-7)
1. Cosa è un array in Java? Differenza principale tra array e ArrayList.

un'array ha una capacità limiitata a differenza di un'arrayList
un'array accetta solo elementi dello stesso tipo
un'arrayList lavora solo con oggetti e non primitivi
un'arrayList lavora con oggetti anche divesi tra loro
un'array ha una velocità superiore rispetto ad un'arrayList
 
2. Qual è la lunghezza di un array? Come si ottiene?

la lunghezza di un'array si ottiene con il codice .length() 

3. Qual è l'indice del primo elemento di un array? Qual è l'indice del ultimo elemento?
supponiamo di avere un'array int[] arr = new int[3]
il primo elemento sarà arr[0]
mentre l'utlimo sarà arr[2]

se non conosciamo la capacità di un'array allora l'ultimo elemento sarà .length -1, cosi possiamo trovare l'ultimo indice

4. Cosa succede se accedi a un indice fuori bounds (es: array di 5 elementi, indice 10)?
avremo un'errore.
è un po come le stanze di un'albergo, se l'albergo ha 5 camere e tu vorresti accedere nella decima camera,
 letteralmente non esiste


5. Differenza tra array.length e ArrayList.size().
con array.length staimo chiedendo quanto è la capacità del nostro array
con ArrayList.size stiamo chiedendo la capacità della nostra arraylist

6. Come si crea un ArrayList di Integer? Scrivi il codice.

ArrayList<Integer> integer = new ArrayList<>();

7. Cosa è il "bounds checking" in Java?
 il bound checking e il controllo di java sugli oggetti che sono stati creati ma non usati,
  di conseguenza li cancella automaticamente 

DOMANDE CODICE (8-16)
8. Scrivi un array di 5 int con valori {1, 2, 3, 4, 5} e stampa il terzo elemento.

9. Qual è l'output?

java
int[] arr = {10, 20, 30, 40, 50};
System.out.println(arr[2]);

l'output sarà 30
questo perchè quando si conta l'indice si parte a contare da 0

10. Scrivi un ciclo for che stampa tutti gli elementi di un array {1, 3, 5, 7, 9}.

11. Qual è l'errore? Correggilo:

java
int[] arr = new int[5];
arr[5] = 10;

l'array è di 5 elementi ma l'indice 5 non esiste 
questo perchè si parte a contare l'indice dallo zero, quindi l'ultimo indice sarà 4

12. Scrivi un ArrayList di String con 3 nomi: "Ana", "Bob", "Carlo".

13. Qual è l'output?

java
ArrayList<Integer> lista = new ArrayList<>();
lista.add(5);
lista.add(10);
lista.add(15);
System.out.println(lista.size());

l'output sarà 3 poichè al suo interno ci sono 3 oggetti;

14. Scrivi codice per rimuovere il secondo elemento (indice 1) da un ArrayList.

lista.remove(1);

15. Qual è l'errore? Correggilo:

java
int[] arr = new int[3];
arr = new int[5];

qui abbiamo creato inizialmente un'array di 3 elementi
poi abbiamo creato un nuovo array di 5 elementi quindi arr di 5 elementi non punta più al arr iniziale
questo perchè una volta che l'array è stato definito non può essere ampliato

16. Qual è l'output?

java
int[][] matrice = {
    {1, 2, 3},
    {4, 5, 6}
};
System.out.println(matrice[1][2]);

l'output in uscita sarà 6 
va visto un po come una battaglia navale con colonne e righe
con il primo indice cioè 1 indichiamo le righe mentre con il secondo le colonne
quindi riga ad indice 1 e colonna a indice 2
DOMANDE RISPOSTA APERTA (17-20)
17. Spiega la differenza tra array e ArrayList con 3 punti chiari.

l'arrayList ha una memoria dinamica
 e si espande automaticamente di una volta e mezza la sua capacità una volta che ha raggiunto il suo limite massimo
 
 l'arrayList lavora solo con gli oggetti
 con l'arrayList possiamo inserire al suo interno oggetti anche di diversi tra loro
 
 l'ArrayList è più lento rispetto ad un'arry normale
 
 l'array lavora solo con elementi dello stesso tipo (non ogetti)
 l'array ha una capacità definita
 l'array è piu veloce rispetto ad un'ArrayList
 
 
 
 

18. Scrivi e spiega un ciclo annidato che stampa una matrice 2x3.

	int [][] matrice = new int[2][3];
		for(int i = 0; i < matrice.length; i++)
		{
			for(int j = 0; j < matrice[i].length; j++)
			{
				System.out.println(matrice[i][j]);
			}
		}
		
		con il primo ciclo stiamo iterando le righe
		metre con il secondo ciclo stiamo iterando le colonne

19. Perché gli array hanno size fisso mentre ArrayList è dinamico?

gli array hanno una lunghezza definita inizialmente che non può essere modificata.
mentre le arrayList non hanno una size fissa e definita, poichè hanna la possibilità di adattarsi automaticamente,
in base agli oggetti che si inseriscono.

20. Scrivi un metodo che prende un array di int e retorna la somma di tutti gli elementi.
		 */
		
		
		/*
		 * array.length vs ArrayList.size(),

bounds checking,

indice fuori bounds,

array 2D,

ArrayList add/remove.
		 */
		//8.
		int[] array = {1, 2, 3, 4, 5};
		System.out.println(array[2]);
		
		//10.
		
		int[] array2 = {1, 3, 5, 7, 9};
		
		for(int numeri: array2)
		{
			System.out.println(numeri);
		}
		//12
		ArrayList<String> nomi = new ArrayList<>();
		nomi.add("Ana");
		nomi.add("Bob");
		nomi.add("Carlo");
		System.out.println("------------------------------");
		//18.
	
	}
	
	//20
	public static int somma(int[] ars)
	{
		int risultato = 0;
		for(int numero : ars)
		{
			risultato += numero;
		}
		return risultato;
	}

}
