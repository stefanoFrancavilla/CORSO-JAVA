package introduzione;

public class Test_Modulo_2_controlloDelFlusso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 📝 TEST MODULO 2 - INIZIA QUI
DOMANDE TEORIA (1-7)
1. Qual è la differenza tra if-else e switch? Quando usi ciascuno?

/*
 * La differeza tra if-else e swich è: 
 * nell'if else abbiamo la possibilita di verifare se una codizione che abbiamo dato sia vera o falsa,
 * se la condizione che abbiamo inserito nell'if non fosse vera allora subentra l'if, è come se dicessimo
 * se (if) è vero che... fai questo.
 * altrimenti (else) se non è vero che .... fai quest'altro.
 * 
 * con lo switch case abbiamo la possibilita di verificare più casi
 * con lo swich possiamo anzichè fare troppi if-else , possiamo compattare drasticamente il codice
 * rendendolo più leggibile ed avendo la possibilità di affrontare più casi alla vota.
 */
/*
2. Cosa succede se non metti break in un caso switch? (switch "fall-through")

/*
 * se al termine di un caso che stiamo gestendo non mettiamo il break , per via del fall-through
 * passa automaticamente al caso successivo
 */
/*
3. Qual è la differenza tra while e do-while?
/*
 * il ciclo while prima verifica la condizione e poi una volta verificata svolge il ciclo.
 * mentre il ciclo do-while esegue comunque il ciclo almeno una volta , anche se la condizione non è verificata.
 */
/*
4. Quando usi for-each invece di for classico?
/*
 * Con il ciclo for-each a differenza del ciclo for è molto più compatto nella scrittura di codice.
 * quindi quando dobbiamo fare cicli veloci non complessi conviene usare il for-each, 
 * metre se il nostro ciclo è più articolato abbiamo bisogno di usare il ciclo for ,
 *  che ci consente di essere molto più precisi e chiari sia nella scrittura che nella lettura
 */
		/*

5. Cosa fa break dentro un ciclo?
/*
 * il break ha la funzione di bloccare il ciclo
 */
/*
6. Cosa fa continue dentro un ciclo?
/*
 *  con il codice continue si ha la possibilità di passare alla condizione successiva
 */
/*
7. Cosa sono i cicli annidati? Fai un esempio.

/*
 * il ciclo annidato lo possiamo vedere per esempio negli array 2d 
 * quando il primo ciclo serve ad individuare la cella di appartenenza dell'elementio che ci occorre,
 * ed il secondo a ricercare l'elemento nella sua precisa posizione.
 * 
 */
		/*

DOMANDE CODICE (8-16)
8. Scrivi un if-else che stampa "positivo" se x > 0, "negativo" se x < 0, "zero" se x == 0.

9. Qual è l'output?

java
int x = 5;
if (x > 3) {
    System.out.println("A");
} else {
    System.out.println("B");
}
10. Scrivi un ciclo for che stampa da 1 a 10.

11. Qual è l'output?

java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
12. Scrivi un ciclo while che stampa da 5 a 1 (decrescente).

13. Qual è l'output?

java
int x = 0;
do {
    System.out.println(x);
    x++;
} while (x < 3);
14. Scrivi uno switch che prende un numero 1-3 e stampa "Uno", "Due", "Tre".

15. Qual è l'errore? Correggilo:

java
int x = 5;
if (x = 5) {
    System.out.println("cinque");
}
16. Qual è l'output?

java
for (int i = 0; i < 5; i++) {
    if (i == 3) {
        break;
    }
    System.out.println(i);
}
DOMANDE RISPOSTA APERTA (17-20)
17. Spiega la differenza tra while e for con un esempio per ciascuno.

/*
 * con il ciclo for abbiamo la possibilità di compattare il codice drasticamente
 * infatti nelle parentesi del ciclo for dobbiamo creare una variabile di partenza , una codizione , e un'incremento o decremento del ciclo
 * 
 *  mentre nel ciclo while dobbiamo prima creare una variabile di partenza fuori dal ciclo.
 *  poi nelle parentesi specificare la condizione 
 *  e alla fine del ciclo specificare un'incremento o decremento 
 */
/*
18. Perché i cicli annidati sono utili? Fai un esempio pratico (es: matrice 2D).

i cicli annidati sono utilissimi per andare a trovare elementi nelle sotto celle
esempio gli array2d

int matrice [2][3] = {
{1, 2, 3}
{4, 5, 6} };
mettiamo il caso che dobbiamo andare a ricercare la posizione del numero 6 , con il primo ciclo 
andiamo a verificare se blocco 0 o blocco1
mentre con il secondo ciclo andiamo a iterare nel blocco specifico

19. Cosa succede se un ciclo while ha sempre la condizione vera? (ciclo infinito)
/*
 * se un ciclo while ha sempre condizione vera si va a creare un ciclo infinito e quindi avremo un loop infinito
 */
		
		
		
		
/*
 * 
20. Scrivi e spiega un esempio che usa continue per saltare solo i numeri pari da 1 a 10.

for ( int i = 1; i < 10; i++) // ciclo for 
{
if (i %2==0) // se i è pari
{
continue; // passa all'iterazione successiva
}
System.out.println(i); // manda in output
}

qui stiamo dicendo di iterare tutti i numeri da 1 a 10,
ma quando i ha volre pari allora con il continue stiamo dicendo di passare all'iterazione successiva.


		 */
		
	//8.
		
	int x = 10;
	
	if(x < 0)
	{
		System.out.println("Negativo");
	}
	else if (x > 0)
	{
		System.out.println("Positivo");
	}
	else 
	{
		System.out.println("zero");
	}
	System.out.println("--------------------");
	//9.
	
	//l'output in questione sarà "A" , poichè x ha volore 5 ed è maggiore di 3.
	
	//10.
	
	for (int i = 0; i <= 10; i++)
	{
		System.out.println(i);
	}
	//11.
	/*
	 * l'output in questione sarà: 0 1 2 3 4
	 * poichè il ciclo comincia da 0 e finisce con il 4 , questo perchè una volta che siamo arrivati alla
	 * condizione che i ha lo stesso valore di 5 allora il ciclo non va più avanti pioche i è = a 5 e non è o più minore di 5
	 */
	
	//12.
	System.out.println("--------------------");
	int i = 5;
	
	while (i >= 1)
	{
		System.out.println(i);
		i--;
	}
	System.out.println("--------------------");
	//13.
	int x1 = 0;
	do {
	    System.out.println(x1);
	    x1++;
	} while (x1 < 3);
	
	/*
	 * in questo caso abbiamo x1 che vale 0 una volta che abbiamo creato il ciclo do-while mandiamo a stampa il valore di x
	 * poi lo incrementiamo di 1
	 * infine diamo a while la codizione cioè x1 < 3 ( cioè fino a che x1 è minore di 3 il ciclo funziona)
	 * quindi l'output sarà 0 1 2
	 */
	System.out.println("--------------------");
	//14.
	
	int y = 2;
	switch(y) {
	case 1:
	    System.out.println("uno"); //se y è uguale a 1 , allora stampa questo
	break;
	
	case 2:
		System.out.println("due");//se y è uguale a 2 , allora stampa questo
		break;
	
	case 3:
		System.out.println("tre");//se y è uguale a 3 , allora stampa questo
		break;
	
		default:
			System.out.println("numero no valido"); // con default stiamo gestendo tutti gli altri casi
			break;
	}
	System.out.println("--------------------");
	//15.
	
//	int x = 5;
//	if (x = 5) {
//	    System.out.println("cinque");
	/*
	 * qui l'errore sta nella condizione (x = 5) 
	 * l'uso corretto della condizione è (x == 5)
	 */
	
	//16.
	/*
	 * for (int i = 0; i < 5; i++) {
    if (i == 3) {
        break;
    }
    System.out.println(i);
}

l'output di questo ciclo for sarà 0 1 2
questo perchè una volta che i raggiunge il valore 3 , entra in gioco l'if 
una volta che verifica che i == 3 con il break blocchiamo il ciclo;
	 */

	
	//extra.
	
	/*
	 * 
	 * 1.Spiega con una frase la differenza tra break e continue.

       2.Scrivi un esempio di for-each su un array di interi.

	   3.Scrivi uno switch con casi 1, 2, 3 che stampa Uno, Due, Tre.

       4.Scrivi un continue che salta i numeri pari da 1 a 10.

       5.Spiega in una frase la differenza tra while e do-while.
	 */
	
	//1.
	/*
	 * in un ciclo con il break andiamo ad interrompere il ciclo, con il continue passiamo all'iterazione successiva.
	 */
	
	//2.
	System.out.println("--------------------");
	int[] interi = {1, 2, 3, 4, 5,};
	
	for(int numero : interi)
	{
		System.out.println(numero);
	}
	System.out.println("--------------------");
	//3.
	
	int numero = 1;
	switch (numero) {
	case 1:
		System.out.println("Uno");
		break;
	case 2:
		System.out.println("Due");
		break;
	case 3: 
		System.out.println("Tre");
	    break;
	}
	System.out.println("--------------------");
	//4.
	
	for ( int j = 1; j < 10; j++) // 
	{
	if (j %2==0) 
	{
	continue; 
	}
	System.out.println(j); 
	}
	
	System.out.println("--------------------");
	
	//5
	/*
	 * con il do-while il ciclo entra in azione almeno 1 volta anche se la codizione non è riscontrata
	 * con il ciclo while se non viene riscontrata la condizione non si entra nel ciclo
	 */
	}

}
