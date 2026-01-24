package nuovo_corso;

public class lezione_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println();
		System.out.println("-----lezione 3----- ");
		System.out.println();
		
		System.out.println(1 / 3); // il risultao è 0 (prende in considerazione solo l'intero di un numero e non prende in considerazione i numeri con la virgola) 
		System.out.println(7 / 3); // il risultato è 2 (per lo stesso motivo mantiene solo l'intero del numero)
		
		System.out.println(1 / 3.F); //il risultato è 0.33333334 (con la :F specifichiamo che è un float e ci darà un numero con la virgola)
		System.out.println(1.F / 3); // il risultato non cambia , si comporterà come un float , purchè almeno 1 dei 2 denominatori sia dichiarato float.
		
		// la mantissa sono i numeri che stanno dopo la virgola, infatti nell'esempio precedente dopo 7 3 avviene l'approssimazione. 
		
		System.out.println(1 / 3.); // scrivendolo in questa maniera con solo il punto dopo 1 dei denominatori , si comporta come un double 
		
		System.out.println((float) (1 / 3)); // il risultato sarà 0.0 poichè come in un'equazione risolve prima quello nelle parentesi,
		                                     // in questo caso 1 / 3 ,che da risultato 0 
		                                     // e poi lo trasforma in float , ma ormai 0 trasformato in float ci da 0.0
		
		System.out.println((float) 1 / 3); // togliendo le parentesi il float non sarà più sul risultato di 1 / 3 ,
		                                   // ma sarà sull'1 , quindi dichiarerà prima che è un float e poi svolgerà l'operazione
		                                   // in pratica l'1 viene trattato come un float.
		
		System.out.println( 1 / (float) 3); // il risultato sarà uguale poichè è il 3 a essere trattato da float.
		
		
		// h-schmidt.net/FloatConverter/IEEE754.html
		// questo sito ci permette di convertire un numerofloat in tutta ola sua struttura binaria o esadecimale o decimale.
		// spiega nel dettaglio come è stato convertito il numero
		
		System.out.println();
		System.out.println("-----lezione 4----- ");
		System.out.println();
		
		System.out.println();
		System.out.println("-----lezione 4.1----- ");
		System.out.println();
		
		
		if ((8 - 6.4) == 1.6) // l'operatore == sta a dire se quello che sta a sinitra è uguale a quello che sta a destra
		{
			System.out.println("ok");
		}
		else
		{ System.out.println("ko");
		}	
		// il risultato sarà ko , per via dell'approssimazione 
		// non si utilizza MAI le ugualianze strette con i numeri a virgola mobile (ERRORE GRAVE)
		
		if((8 - 6) == 2 ) {
			System.out.println("ok int");
		}
		else {
			System.out.println("ko int");
		}
		// il problema non si pone con i numeri interi
		
		
		System.out.println();
		System.out.println("-----lezione 4.2----- ");
		System.out.println();
		
		System.out.println( 8 - 6.4); // il risultato sarà 1.5999999999999996  quindi sarà trattato come un double.
		System.out.println(1.6);
	    // questo è il motivo perchè nell'esercizio precedente non ci dava come risultato ok
		
		
		System.out.println();
		System.out.println("-----lezione 4.3----- ");
		System.out.println();
		
		System.out.println( 1.5999999999999996 - 1.6); // il risultato sarà -4.440892098500626E-16 , cioè i6 numeri prima della virgola (0.0000000000000004)
		System.out.println(1.6 - 1.5999999999999996 ); // il risultato sarà il medesimo ma con segno diverso
		
		System.out.println();
		System.out.println("-----lezione 4.4----- ");
		System.out.println();
		
		System.out.println(Math.abs( 1.5999999999999996 - 1.6)); // ci da il valore assoluto del numero (la stessa cifra senza il segno)
		System.out.println(Math.abs(1.6 - 1.5999999999999996 )); // il valore sarà uguale poichè ci mostra il valore assoluto ma senza segno
		
		System.out.println();
		System.out.println("-----lezione 4.5----- ");
		System.out.println();
		
		/*/if (8 - 6.4){
			System.out.println("ok int");
		}
		else {
			System.out.println("ko int");
		}*/
		
		if (Math.abs(1.5999999999999996 - 1.6) < .00001) {  //scrivendolo in questo modo creiamo una tolleranza.
			System.out.println("ok "); // è vero che il risultato della sottrazione è minore del valore 00001?
		}
		else
		{
			System.out.println("ko "); // altrimenti 
		}
		
		if (Math.abs((8 - 6.4) - 1.6) < .00001) {  // anche qui stiamo creando una tolleranza.
			System.out.println("ok ");  // è vero che il risultato della sottrazione è minore del valore 00001?
		}
		else
		{
			System.out.println("ko "); // altrimenti
		}	
		//più 0 aggiungiamo più stiamo restringendo la tolleranza.
		
		
		System.out.println();
		System.out.println("-----lezione 4.6----- ");
		System.out.println();
		
		float float2 = 0.5F;
		float float3 = 0.75F;
		float float4 = 0.875F;
		
		System.out.println("float2: " + float2 + " è uguale a 0.5? " + (float2 == 0.5)); // la porzione (float2 == 0.5 ) si comporta come un'if implicito
	    // è come se stessi chiedendo: è vero che il valore della variabile float2 è uguale a 0.5F ? , se è vero sarà true se non è vero sarà false.
         
		System.out.println("float3: " + float3 + " è uguale a 0.75? " + (float3 == 0.75));
		
		System.out.println("float4: " + float4 + " è uguale a 0.875? " + (float2 == 0.875));
		//questi numeri sono scelti apposta poichè sono casi speciali , dove si riesce a fare un'ugualianza con numeri con la virgola, ecco perchè il risultato sarà true
		// sono casi speciali perchè sono la rappresentazione decimale di sommatorie di potenze negative del 2
		// infatti 0.5 è 2 alla -1  --------  0.75 è 2 alla - 1 + 2 alla - 2 --------- 0.875 è 2 alla - 1 + 2 alla -2 + 2 alla -3  cioè 1/2 + 1/4 + 1/8
		// equivalente di Math.pow(2, -1)   ----------- Math.pow(2, -1) + Math.pow(2, -2) ------------Math.pow(2, -1) + Math.pow(2, -2) + Math.pow(2, -3)
		
	
	}

}
