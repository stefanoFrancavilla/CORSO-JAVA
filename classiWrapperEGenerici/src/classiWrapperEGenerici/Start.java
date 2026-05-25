package classiWrapperEGenerici;

import java.util.ArrayList;

import classiWrapperEGenerici.generici.Coppia;
import classiWrapperEGenerici.generici.Scatoletta;
import classiWrapperEGenerici.generici.ScatolettaGenerica;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println();
		System.out.println("1--------------------------");
		System.out.println();
		
		/*
		 * le classi wrapper a differenza dei tipi primitivi sono classi e quindi hanno dei metodi,
		 *  ad esempio il metodo parseInt() della classe Integer che permette di convertire una stringa in un intero
		 *  sono classi che avvolgono i tipi primitivi e permettono di utilizzare i metodi su di essi
		 *  cioè in parole semplici i tipi primitivi non hanno metodi, mentre le classi wrapper si, 
		 *  e permettono di utilizzare i metodi su di essi.
		 */
		
		
		/*
		 * questo è un modo per incapsulare un tipo primitivo in una classe wrapper,
		 *  in questo caso stiamo incapsulando un intero in una classe Integer
		 */
		Integer il = 5;
		Float f1 = 3.4f;
		Double d1 = 2.8;
		//char c0 = new Character('a'); // non è più possibile creare un oggetto Character in questo modo, poiché il costruttore è stato deprecato,
		char c1 = Character.valueOf('a'); // questo è il modo corretto per creare un oggetto Character, utilizzando il metodo valueOf() della classe Character
		
		System.out.println("	il: " + il);
		System.out.println("	f1: " + f1);
		System.out.println("	d1: " + d1);
		System.out.println("	c1: " + c1);
		
		//Double d2 = 288; //no
		/*questo modo non è possibile, poiché non è possibile assegnare un intero ad una variabile di tipo Double, 
		 * poiché Double è un tipo wrapper per i numeri decimali, mentre 288 è un numero intero, 
		 * quindi è necessario utilizzare il metodo valueOf() della classe Double per convertire l'intero in un oggetto Double
		*/
		
		Double d2 = 288D; 
		/* questo è il modo corretto per assegnare un intero ad una variabile di tipo Double, 
		 * utilizzando il suffisso D per indicare che si tratta di un numero decimale
		 */
		System.out.println("	d2: " + d2);
		
		
		
		System.out.println();
		System.out.println("1.1--------------------------");
		System.out.println();
		
		Object o1 = 17; 
		 /*
		  * qui stiamo assegnando un intero ad una variabile di tipo Object,
		  * poiché Object è la superclasse di tutte le classi in Java,
		  *  è possibile assegnare qualsiasi tipo di dato ad una variabile di tipo Object,
		  */
		
	//	Integer o2 = o1 + 3; //no
		/*
		 * non è possibile assegnare una variabile di tipo Object ad una variabile di tipo Integer,
		 * quindi di conseguenza ci da errore di compilazione
		 */
		
		Integer o2 = (int) o1 + 3; //si
		/*
		 * questo è il modo corretto per assegnare una variabile di tipo Object ad una variabile di tipo Integer,
		 * utilizzando il cast per convertire la variabile di tipo Object in un intero,
		 */
		
		System.out.println("	o2: " + o2);
		
		
		
		System.out.println();
		System.out.println("2--------------------------");
		System.out.println();
		
		int n1 = 100;
		Integer i2 = Integer.valueOf(129);
		n1 = i2; 
		System.out.println("	n1: " + n1);
		System.out.println("	i2: " + i2);
		System.out.println("	n1 == i2: " + (n1 == i2)); //true
		/*
		 * usando il metodo valueOf() della classe Integer, stiamo creando un oggetto Integer che incapsula il valore 129,
		 * poi stiamo assegnando l'oggetto Integer alla variabile n1 di tipo int,
		 * questo è possibile grazie al processo di unboxing, che permette di convertire un oggetto wrapper in un tipo primitivo,
		 * in questo caso stiamo convertendo l'oggetto Integer in un intero, e assegnando il valore 129 alla variabile n1,
		 * quindi alla fine n1 avrà il valore 129, e i2 avrà il valore 129, ma i2 è un oggetto Integer, mentre n1 è un intero,
		 * 
		 * con unboxing si intende il processo di conversione automatica di un oggetto wrapper in un tipo primitivo,
		 * in questo caso stiamo convertendo l'oggetto Integer in un intero, e assegnando il valore 129 alla variabile n1,
		 * 
		 * anche se i2 è una referece ad un oggetto e n1 un primitivo ,il confronto restituisce true
		 * poiché in questo caso il valore di i2 è 129, e n1 è 129, quindi il confronto restituisce true,
		 */
		
		
		Integer i3 = Integer.valueOf(2090);
		int n2 = 2090;
		System.out.println("	i3 == n2: " + (i3 == n2)); //true
		
		
		
		System.out.println();
		System.out.println("3--------------------------");
		System.out.println();
		
		Integer i4 = Integer.valueOf(4000);
		Integer i5 = Integer.valueOf(4000);
		System.out.println("	i4 == i5: " + (i4 == i5)); //false
		/*
		 * in questo caso stiamo creando due oggetti Integer che incapsulano il valore 4000,
		 * poi stiamo confrontando i due oggetti Integer utilizzando l'operatore ==, che confronta le referenze degli oggetti,
		 * in questo caso i4 e i5 sono due oggetti diversi, quindi il confronto restituisce false,
		 * 
		 * nell'esempio precente avevamo un'oggeto e un tipo primitivo con il valore definito a 129,
		 *  in questo caso invece abbiamo due oggetti con lo stesso valore, ma sono due oggetti diversi,
		 *  quindi il confronto restituisce false,
		 */
		
		System.out.println();
		System.out.println("4--------------------------");
		System.out.println();
		
		Integer i6 = Integer.valueOf(5000);
		int n3 = 5000;
		System.out.println("	i6 == n3: " + (i6 == n3)); //true
		
		System.out.println();
		System.out.println("5--------------------------");
		System.out.println();
		
		Integer i7 = Integer.valueOf(127);
		Integer i8 = Integer.valueOf(127);
		System.out.println("	i7 == i8: " + (i7 == i8)); //true
		
		/*
		 * in questo caso stiamo creando due oggetti Integer che incapsulano il valore 127,
		 * poi stiamo confrontando i due oggetti Integer utilizzando l'operatore ==, che confronta le referenze degli oggetti,
		 * in questo caso i7 e i8 sono due oggetti diversi, ma poiché il valore 127 è compreso tra -128 e 127,
		 * la JVM utilizza un meccanismo di caching per i valori compresi tra -128 e 127, 
		 * quindi i7 e i8 fanno riferimento allo stesso oggetto Integer,
		 * quindi il confronto restituisce true,
		 */
		
		 i7 = Integer.valueOf(128);
		 i8 = Integer.valueOf(128);
		System.out.println("	i7 == i8: " + (i7 == i8));
		
		/*
		 * proprio perchè il valore 128 non è compreso tra -128 e 127,
		 *  la JVM non utilizza il meccanismo di caching per i valori compresi tra -128 e 127,
		 *  quindi essendo fuori da questo range, i7 e i8 fanno riferimento a due oggetti Integer diversi,
		 *  quindi il confronto restituisce false,
		 *  
		 *  tutto questo è valido sia per gli ogggetti Integer che per gli oggetti Long, Short, Byte, Character, Boolean, Float e Double,
		 *  danno true se rientrano nel range di caching, altrimenti false,
		 */
		
		
		Short short1 = Short.valueOf((short) -128); // sempre effettuare il cast quando utilizziamo i metodi valueOf delle classi wrapper
		Short short2 = Short.valueOf((short) -128);
		System.out.println("	short1 == short2: " + (short1 == short2)); //true
		
		short1 = Short.valueOf((short) -129);
		short2 = Short.valueOf((short) -129);
		System.out.println("	short1 == short2: " + (short1 == short2)); //false
		
		System.out.println();
		System.out.println("6--------------------------");
		System.out.println();
		
		Integer i9 = Integer.valueOf(10);
		int n4 = 20;
		Integer i10 = Integer.valueOf(200) + n4;
		int n5 = i10 + n4 * i9;
		
		System.out.println("	i10: " + i10);
		System.out.println("	n5: " + n5);
		
		 /*
		  * in questo caso stiamo utilizzando l'operatore + per sommare un oggetto Integer e un intero,
		  *  in questo caso la JVM effettua un processo di unboxing per convertire l'oggetto Integer in un intero,
		  *  quindi stiamo sommando il valore dell'oggetto Integer con l'intero, e assegnando il risultato alla variabile i10,
		  *  poi stiamo utilizzando l'operatore + per sommare un oggetto Integer, un intero e un altro intero,
		  *  in questo caso la JVM effettua un processo di unboxing per convertire l'oggetto Integer in un intero,
		  *  quindi stiamo sommando il valore dell'oggetto Integer con gli interi, e assegnando il risultato alla variabile n5,
		  */
		
		System.out.println();
		System.out.println("7--------------------------");
		System.out.println();
		
		Integer i11 = 1000;
		Integer i12 = 1000;
		System.out.println("	i11 == i12: " + (i11 == i12)); //false
		
		Integer i13 = 101;
		Integer i14 = 101;
		System.out.println("	i13 == i14: " + (i13 == i14)); //true
		
		 /*
		  * in questo caso stiamo creando due oggetti Integer che incapsulano il valore 1000,
		  * poi stiamo confrontando i due oggetti Integer utilizzando l'operatore ==, che confronta le referenze degli oggetti,
		  * in questo caso i11 e i12 sono due oggetti diversi, quindi il confronto restituisce false,
		  * 
		  * invece per i13 e i14, poiché il valore 101 è compreso tra -128 e 127, la JVM utilizza un meccanismo di caching per i valori compresi tra -128 e 127,
		  * quindi i13 e i14 fanno riferimento allo stesso oggetto Integer, quindi il confronto restituisce true,
		  */
		 
		int n6 = i13;
		
		System.out.println("	n6: " + n6);
		System.out.println("	i13: " + i13);
			
		Integer i15 = Integer.valueOf(129);
		byte b1 = i15.byteValue(); // questo è un metodo della classe Integer che permette di convertire un oggetto Integer in un byte
		byte b2 = (byte) 129;
		System.out.println("	b1: " + b1);
		System.out.println("	b2: " + b2);
		
		 /*
		  * in questo caso stiamo utilizzando il metodo byteValue() della classe Integer per convertire un oggetto Integer in un byte,
		  *  quindi stiamo convertendo l'oggetto Integer in un byte, e assegnando il valore del byte alla variabile b1,
		  *  in questo caso il valore di b1 sarà -127, poiché il valore 129 è fuori dal range dei byte, che è compreso tra -128 e 127,
		  *  quindi il valore di b1 sarà -127, poiché il byte utilizza la rappresentazione in complemento a due per rappresentare i numeri negativi,
		  *  quindi il valore 129 viene rappresentato come -127 in un byte,
		  */
		
		System.out.println();
		System.out.println("7.1--------------------------");
		System.out.println();
		
		int i16 = Integer.parseInt("48"); // questo è un metodo della classe Integer che permette di convertire una stringa in un intero
		System.out.println("	i16: " + i16);
		
		 /*
		  * in questo caso stiamo utilizzando il metodo parseInt() della classe Integer per convertire una stringa in un intero,
		  *  quindi stiamo convertendo la stringa "48" in un intero, e assegnando il valore dell'intero alla variabile i16,
		  *  in questo caso il valore di i16 sarà 48, poiché la stringa "48" viene convertita in un intero con il valore 48,
		  */
		 
		 try
		 {
			 int i17 = Integer.parseInt("Ciao");
		 }
		 catch(NumberFormatException e)
		 {
			// System.out.println(e);
			 e.printStackTrace();
		 }
		
		 /*
		  * se proviamoa convertire una stringa che non rappresenta un numero in un intero, come ad esempio la stringa "Ciao",
		  * inizialmente senza il blocco try-catch, otterremmo un errore di runtime,
		  *  poiché la stringa "Ciao" non può essere convertita in un intero,
		  * 
		  * una volta usato il blocco try-catch, invece di ottenere un errore di runtime, otterremo un'eccezione di tipo NumberFormatException,
		  *  che viene catturata dal blocco catch,
		  *  
		  *  con il blocco try-catch, possiamo gestire l'eccezione in modo appropriato, 
		  *  ad esempio stampando un messaggio di errore
		  *   o eseguendo un'azione alternativa,
		  *   si può usare il blocco try-catch per gestire le eccezioni in modo da evitare che il programma si blocchi
		  *    a causa di un errore di runtime,
		  *    quindi è sempre consigliabile utilizzare il blocco try-catch quando si effettuano operazioni che possono generare eccezioni,
		  *    
		  *    con il codice e.printStackTrace() possiamo stampare lo stack trace dell'eccezione,
		  *     che ci permette di capire dove si è verificata l'eccezione e quale è stata la causa dell'eccezione,
		  */
		 
		 float f2 = Float.parseFloat("12.3"); // questo è un metodo della classe Float che permette di convertire una stringa in un numero decimale
		 boolean bo1 = Boolean.parseBoolean("true"); // questo è un metodo della classe Boolean che permette di convertire una stringa in un booleano
		 //bo1 = Boolean.parseBoolean("trUe"); // il case non è rilevante per il metodo parseBoolean(), quindi anche se la stringa "trUe" non è esattamente "true", il metodo parseBoolean() restituirà comunque true
		 boolean bo2 = Boolean.parseBoolean("Ciccio");
		// byte b3 = Byte.valueOf((byte) 100);
		// short short3 = Short.valueOf((short) 2);
		 
		 System.out.println("	f2: " + f2);
		 System.out.println("	bo1: " + bo1);
		 System.out.println("	bo2: " + bo2);
		 System.out.println("	i16 + f2: " + (i16 + f2));
		 
		 
		    System.out.println();
			System.out.println("7.2--------------------------");
			System.out.println();
			
			byte b3 = Byte.MIN_VALUE ; //-128
			short sh1 = Short.MIN_VALUE; //-32768
			int n7 = Integer.MIN_VALUE; //-2147483648
			
			System.out.println("	b3: " + b3);
			System.out.println("	Byte.valueOf(b3): " + Byte.valueOf(b3));
//			System.out.println("	short3: " + short3);
//			System.out.println("	n7: " + n7);
			
			 /*
			  * in questo caso stiamo utilizzando le costanti MIN_VALUE delle classi wrapper per ottenere il valore minimo che può essere rappresentato da un byte, un short e un int,
			  *  quindi stiamo assegnando il valore minimo di un byte alla variabile b3, il valore minimo di un short alla variabile short3 e il valore minimo di un int alla variabile n7,
			  *  in questo caso il valore di b3 sarà -128, poiché è il valore minimo che può essere rappresentato da un byte,
			  *  il valore di short3 sarà -32768, poiché è il valore minimo che può essere rappresentato da un short,
			  *  e il valore di n7 sarà -2147483648, poiché è il valore minimo che può essere rappresentato da un int,
			  */
			 
		
			int b3Unsigned =Byte.toUnsignedInt(b3);
			/*
			 *  questo è un metodo della classe Byte che permette di convertire un byte in un intero senza segno
			 *  in questo caso stiamo convertendo il valore di b3, che è -128, in un intero senza segno, 
			 *  quindi il valore di b3Unsigned sarà 128,
			 */
			System.out.println("	b3Unsigned: " + b3Unsigned);
			System.out.println("	Byte.toUnsignedInt(b3): " + Byte.toUnsignedInt(b3));
			 /*
			  *  in questo caso stiamo utilizzando il metodo toUnsignedInt() della classe Byte per convertire un byte in un intero senza segno,
			  *  quindi stiamo convertendo il valore di b3, che è -128, in un intero senza segno, 
			  *  quindi il valore di Byte.toUnsignedInt(b3) sarà 128,
			  */
			
			
			/* 1000 0000 questo è il -128 in complemento a 2 avendo 8 bit a disposizione (byte)
			 * 0000 0000 0000 0000 0000 0000 1000 0000 
			 * qui invece abbiamo un'int  con 32 bit a disposizione, per cui il byte più a destra ( 1000 0000) 
			 * mi rappresenta il numero 128 (2^7)
			 */
			
			System.out.println("	sh1: " + sh1);
			System.out.println("	Short.toUnsignedInt(sh1): " + Short.toUnsignedInt(sh1));
			
			System.out.println("	n7: " + n7);
			System.out.println("	Integer.toUnsignedLong(n7): " + Integer.toUnsignedLong(n7));
			 /*
			  *  in questo caso stiamo utilizzando il metodo toUnsignedLong() della classe Integer per convertire un int in un long senza segno,
			  *  quindi stiamo convertendo il valore di n7, che è -2147483648, in un long senza segno, 
			  *  quindi il valore di Integer.toUnsignedLong(n7) sarà 2147483648,
			  */
			
			  System.out.println();
				System.out.println("7.3--------------------------");
				System.out.println();
		 
				int n8 = 5_500_000;
				String s0 = Integer.toUnsignedString(n8, 10); 
			
				System.out.println("	s0: " + s0);
				
				String s1 = Integer.toUnsignedString(n8, 2); 
				System.out.println("	s1: " + s1);
				
				String s2 = Integer.toUnsignedString(n8, 16); 
				System.out.println("	s2: " + s2);
				
				String s3 = Integer.toUnsignedString(n8, 8); 
				System.out.println("	s3: " + s3);
				/*
				 * con questo metodo della classe Integer, possiamo convertire un intero in una stringa rappresentata in una base specifica,
				 * nel primo caso stiamo convertendo l'intero nel sistema decimale
				 * nel secondo nel sistema binario
				 * nel terzo nel sistema esadecimale
				 * nel quarto caso nel sistema ottale
				 * il primo parametro del codice Integer.toUnsignedString() è l'intero che vogliamo convertire,
				 *  mentre il secondo parametro è la base in cui vogliamo rappresentare l'intero,
				 */
				
				 System.out.println();
					System.out.println("7.4--------------------------");
					System.out.println();
					
					Integer nTest = null;
					
					try
					{
						int nTest1 = nTest;
					}
					catch(NullPointerException e)
					{
						System.out.println("	e.getMessage(): " + e.getMessage());
					}
					/*
					 * nonostante nTest1 sia di tipo int, stiamo cercando di assegnare ad esso il valore di nTest, che è un oggetto Integer,
					 * normalmente questo non sarebbe possibile, poiché non è possibile assegnare un oggetto Integer ad una variabile di tipo int,
					 * ma con il try-catch, stiamo gestendo l'eccezione di tipo NullPointerException
					 *  che si verifica quando si cerca di unboxare un oggetto null,
					 *  quindi non avremo un errore di runtime, ma otterremo un'eccezione di tipo NullPointerException,
					 *   che viene catturata dal blocco catch,
					 */
					
					
					 System.out.println();
						System.out.println("7.5--------------------------");
						System.out.println();
						
						Short sTest = Short.valueOf((short) 10);
						nTest = Integer.valueOf(10);
						
						System.out.println("	nTest.equals(sTest): " + nTest.equals(sTest));
						
						/*
						 * in questo caso stiamo utilizzando il metodo equals() della classe Integer per confrontare un oggetto Integer
						 *  con un oggetto Short,
						 *  poiché nTest è un oggetto Integer e sTest è un oggetto Short, il metodo equals() restituirà false,
						 *  
						 *  quindi con il metodo equals() possiamo confrontare due oggetti di classi wrapper diverse, 
						 *  ma poiché sono di classi diverse, il confronto restituirà false,
						 */
						System.out.println("	sTest.equals(nTest): " + sTest.equals(nTest));
						
						Integer nTest2 = Integer.valueOf(255);
						Integer nTest3 = Integer.valueOf(255);
						System.out.println("	nTest2.equals(nTest3): " + nTest2.equals(nTest3));
						System.out.println("	nTest2 == nTest3 : " + (nTest2 == nTest3));
						
						/*
						 * questa volta stiamo confrontando due oggetti Integer che incapsulano lo stesso valore,
						 *  quindi il metodo equals() restituirà true,
						 *  
						 *  con il comando == stiamo confrontando non il valore degli oggetti , ma i loro rispettivi reference, 
						 *  quindi in questo caso nTest2 e nTest3 sono due oggetti diversi, quindi il confronto restituisce false,
						 */
						
						System.out.println("	sTest.equals(10): " + sTest.equals(10));
						
						/*
						 * naturalmente anche comparando con equals un oggetto Short con un intero, il confronto restituirà false,
						 *  poiché sTest è un oggetto Short e 10 è un intero primitivo,
						 */
						
						System.out.println("	sTest.equals((short)10): " + sTest.equals((short)10));
						
						/*
						 * una volta effettuato il cast dell'intero 10 in un short, il confronto restituirà true,
						 *  poiché sTest è un oggetto Short che incapsula il valore 10 che è lo stesso valore del short 10,
						 */
						
						System.out.println("	nTest.hashCode() : " + nTest.hashCode());
						System.out.println("	sTest.hashCode() : " + sTest.hashCode());
						
						
						/*
						 * il metodo hashCode() della classe Short e della classe Integer restituisce un valore hash code per l'oggetto,
						 *  in questo caso il valore hash code di sTest sarà 10,
						 *   poiché il metodo hashCode() della classe Short restituisce il valore del short incapsulato,
						 */
						
						    System.out.println();
							System.out.println("8--------------------------");
							System.out.println();
							
							Scatoletta scatoletta = new Scatoletta();
							
							scatoletta.setContenuto(Long.valueOf(1_000_000_000));
							
							//Integer contenuto = scatoletta.getContenuto();
							/*
							 * se proviamo a assegnare il valore restituito dal metodo getContenuto() della classe Scatoletta
							 *  ad una variabile di tipo Integer, otterremo un errore di compilazione,
							 *  poichè il metodo getContenuto() restituisce un oggetto di tipo Object,
							 *   e non è possibile assegnare un oggetto di tipo Object ad una variabile di tipo Integer,
							 */
							
							
							
							/*
							 * se provassimo ad insereire un cast per aggirare l'errore di compilazione, otterremmo un errore di runtime,
							 * poichè il metodo getContenuto() restituisce un oggetto di tipo Object che in realtà è un oggetto di tipo Long,
							 */
							
							try
							{
								Integer contenuto = (Integer) scatoletta.getContenuto();
							}
							catch(ClassCastException e)
							{
								System.out.println("	e.getMessage(): " + e.getMessage());
							}
							
							/*
							 * con il blocco try-catch, stiamo gestendo l'eccezione di tipo ClassCastException 
							 * che si verifica quando si cerca di effettuare un cast non valido,
							 * quindi non avremo un errore di runtime, ma otterremo un'eccezione di tipo ClassCastException,
							 *  che viene catturata dal blocco catch,
							 *  
							 */
							
							scatoletta.setContenuto(Integer.valueOf(100_000_000));
							//Integer contenuto2 = scatoletta.getContenuto();
							Integer contenuto2 = (Integer) scatoletta.getContenuto();
							System.out.println("	contenuto2: " + contenuto2);
							
							/*
							 * anche in questo caso, se proviamo ad assegnare il valore restituito dal metodo getContenuto() della classe Scatoletta
							 * ad una variabile di tipo Integer, otterremo un errore di compilazione,
							 * 
							 * se invece provassimo ad inserire un cast per aggirare l'errore di compilazione, otterremmo un errore di runtime,
							 * poichè il metodo getContenuto() restituisce un oggetto di tipo Object che in realtà è un oggetto di tipo Integer,
							 * con il blocco try-catch, stiamo gestendo l'eccezione di tipo ClassCastException
							 * che si verifica quando si cerca di effettuare un cast non valido,
							 * quindi non avremo un errore di runtime, ma otterremo un'eccezione di tipo ClassCastException,
							 * poiché in questo caso il metodo getContenuto() restituisce un oggetto di tipo Object 
							 * che in realtà è un oggetto di tipo Integer,
							 */
							
							//String contenuto3 = scatoletta.getContenuto();
							//String contenuto3 =(String)scatoletta.getContenuto();
							
							/*
							 * anche questa istruzone ci da errore di compilazione,
							 *  poiché il metodo getContenuto() restituisce un oggetto di tipo Object,
							 */
							
							try 
							{
								String contenuto3 =(String)scatoletta.getContenuto();
							}
							catch(ClassCastException e)
							{
								System.out.println("	e.getMessage(): " + e.getMessage());
							}
							
							scatoletta.setContenuto("Ciao, come va?");
							String contenuto4 = (String) scatoletta.getContenuto();
							
							System.out.println("	contenuto4: " + contenuto4);
					
							
							System.out.println();
							System.out.println("8.1------------------------");
							System.out.println();
							
							Object contenuto5 = scatoletta.getContenuto();
							if (contenuto5 instanceof Long)
							{
								Long nLong = (Long)contenuto5;
								System.out.println("	nLong: " + nLong);
							}	
							else if (contenuto5 instanceof Integer)
							{
								Integer nInteger = (Integer)contenuto5;
								System.out.println("	nInteger: " + nInteger);
							}
							else if (contenuto5 instanceof String)
							{
								String stringa = (String)contenuto5;
								System.out.println("	s: " + stringa);
							}
							
							/*
							 * con questo if stiamo verificando se il valore restituito dal metodo getContenuto() della classe Scatoletta 
							 * è un oggetto di tipo Long,
							 * con il codice instanceof stiamo verificando se l'oggetto contenuto5 è un'istanza della classe Long,
							 * 
							 * usando questo if possimao evitare di ottenere un'eccezione di tipo ClassCastException, 
							 * poiché stiamo verificando se l'oggetto è effettivamente un oggetto di tipo Long prima di effettuare il cast,
							 * 
							 * altrimenti se l'oggetto non è di tipo Long, stiamo verificando se è di tipo Integer, e così via,
							 * 
							 * invece con l'ultimo if stiamo verificando se l'oggetto è di tipo String,
							 * in questo modo possiamo gestire in modo appropriato il valore restituito dal metodo getContenuto()
							 *  della classe Scatoletta,
							 */
	
							
							System.out.println();
							System.out.println("8.2------------------------");
							System.out.println();
				
				if(contenuto5 instanceof Long nLong)
				{		
					System.out.println("	nLong: " + nLong);
				}	
				else if(contenuto5 instanceof Integer nInteger)
				{
					System.out.println("	nInteger: " + nInteger);
				}
				else if(contenuto5 instanceof String stringa)
				{
					System.out.println("	s: " + stringa);
				}	
	/*
	 * con il pattern matching per instanceof, possiamo dichiarare una nuova variabile all'interno del blocco if,
	 * così facendo compattiamo il codice, poiché non è più necessario dichiarare una variabile all'esterno del blocco
	 *  if e poi assegnarle il valore del cast,
	 *  
	 *  con l'if chiediamo se è il contenuto 5  un'istanza di un long?
	 *  se è vero che è un'istanza di un long allora dichiariamo una nuova variabile nLong di tipo Long e le assegnamo il valore di contenuto5,
	 */
				
				System.out.println();
				System.out.println("8.3------------------------");
				System.out.println();	
					
				ScatolettaGenerica<Long> scatolettaGenerica = new ScatolettaGenerica<Long>();
				//scatolettaGenerica.setContenuto(Integer.valueOf(1));		//no
			    //  scatolettaGenerica.setContenuto(1);		//no
				//scatolettaGenerica.setContenuto(Character.valueOf('c'));		//no
				scatolettaGenerica.setContenuto(Long.valueOf(1));		//si
				scatolettaGenerica.setContenuto(1L);		//si   ( autoboxing )
				Long contenutoGenerico = scatolettaGenerica.getContenuto();
				System.out.println("	contenutoGenerico: " + contenutoGenerico);
				//ScatolettaGenerica<long> scatolettaGenerica2 = new ScatolettaGenerica<long>(); //no
				
				
				ScatolettaGenerica<String> scatolettaGenerica2 = new ScatolettaGenerica<String>();
				//scatolettaGenerica2.setContenuto(Integer.valueOf(1));		//no
			    //  scatolettaGenerica2.setContenuto(1);		//no
				// scatolettaGenerica2.setContenuto(Long.valueOf(1)); // no
				// scatolettaGenerica2.setContenuto(Character.valueOf('c'));
				scatolettaGenerica2.setContenuto("Ciccio");		//si
				String contenutoGenerico2 = scatolettaGenerica2.getContenuto();
				System.out.println("	contenutoGenerico2: " + contenutoGenerico2);
				
				ScatolettaGenerica<Character> scatolettaGenerica3 = new ScatolettaGenerica<Character>();
				//scatolettaGenerica3.setContenuto(Character.valueOf((char) 97));		//si
				//scatolettaGenerica3.setContenuto(97);		//no 
				//scatolettaGenerica3.setContenuto((char)97);		//si 
				scatolettaGenerica3.setContenuto((char)127);		//si
				Character contenutoGenerico3 = scatolettaGenerica3.getContenuto();
				System.out.println("	contenutoGenerico3: " + contenutoGenerico3);
				
				ScatolettaGenerica<Character> scatolettaGenerica4 = new ScatolettaGenerica<Character>();
				scatolettaGenerica4.setContenuto((char)127);		//si
				Character contenutoGenerico4 = scatolettaGenerica4.getContenuto();
				System.out.println("	contenutoGenerico4: " + contenutoGenerico4);
				
				System.out.println("	contenutoGenerico3 == contenutoGenerico4 " + (contenutoGenerico3 == contenutoGenerico4) ); //true
				
				scatolettaGenerica3.setContenuto((char)161);		
			    contenutoGenerico3 = scatolettaGenerica3.getContenuto();
				System.out.println("	contenutoGenerico3: " + contenutoGenerico3);
				
				scatolettaGenerica4.setContenuto((char)161);		
			    contenutoGenerico4 = scatolettaGenerica4.getContenuto();
				System.out.println("	contenutoGenerico4: " + contenutoGenerico4);	
				
				System.out.println("	contenutoGenerico3 == contenutoGenerico4 " + (contenutoGenerico3 == contenutoGenerico4) ); // false
				
				/*
				 * il false deriva dal fatto che il valore 161 non è compreso tra -128 e 127, quindi la JVM non utilizza il meccanismo di caching per i valori compresi tra -128 e 127,
				 */
				
				System.out.println();
				System.out.println("8.3.1------------------------");
				System.out.println();	
				
				ScatolettaGenerica<Object> scatolettaGenerica5 = new ScatolettaGenerica<Object>();
				scatolettaGenerica5.setContenuto(Long.valueOf(1_000_000_000));		
				//Integer contenutoGenerico5 = scatolettaGenerica5.getContenuto();
				
				try
				{
					Integer contenutoGenerico5 = (Integer) scatolettaGenerica5.getContenuto();
				}
				catch(ClassCastException e)
				{
					System.out.println("	e.getMessage(): " + e.getMessage());
				}
				
				// si attiva il corrispettivo raw type, poiché non è possibile assegnare un oggetto di tipo Object ad una variabile di tipo Integer, quindi otteniamo un errore di compilazione,
				ScatolettaGenerica scatolettaGenerica6 = new ScatolettaGenerica();  // raw type
				scatolettaGenerica6.setContenuto(Long.valueOf(1_000_000_000));
				//Integer contenutoGenerico6 = scatolettaGenerica6.getContenuto();
				
				try
				{
					Integer contenutoGenerico6 = (Integer) scatolettaGenerica6.getContenuto();
				}
				catch(ClassCastException e)
				{
					System.out.println("	e.getMessage(): " + e.getMessage());
				}
				
				ScatolettaGenerica scatolettaGenerica7 = new ScatolettaGenerica();  
				scatolettaGenerica7.setContenuto(Integer.valueOf(100_000_000));
				
				Integer contenutoGenerico7 = (Integer) scatolettaGenerica7.getContenuto();
				System.out.println("	contenutoGenerico7: " + contenutoGenerico7);
				
				System.out.println();
				System.out.println("8.3.2------------------------");
				System.out.println();	
				
				Scatoletta scatoletta1 = new Scatoletta();
				scatoletta1.setContenuto(Integer.valueOf(100_000_000));
				
				Scatoletta scatoletta2 = new Scatoletta();
				scatoletta2.setContenuto(Integer.valueOf(1_000_000));
				
				Scatoletta scatoletta3 = new Scatoletta();
				scatoletta3.setContenuto(Short.valueOf((short)1_000));
				
				
				Scatoletta [] scatolette = new Scatoletta[3];
				scatolette[0] = scatoletta1;
				scatolette[1] = scatoletta2;
				scatolette[2] = scatoletta3;
				
				/*
				 * in questo caso ciclando i 3 oggetti abbiamo un errore di runtime
				 * quindi i primi due oggetti restituiscono un oggetto di tipo Integer, mentre il terzo oggetto restituisce un oggetto di tipo Short,
				 * quindi quando cerchiamo di effettuare un cast da Object a Integer per il terzo oggetto, otteniamo un'eccezione di tipo ClassCastException,
				 * ma una volta che eseguiamo , ci ritroviamo l'errore di run time
				 * 
				 * per ovviare a questo problema dobbiamo utilizzare un blocco try catch all'interno del ciclo for, 
				 * in modo da gestire l'eccezione di tipo ClassCastException che si verifica quando si cerca di effettuare un cast non valido,
				 * 
				 */
				for(int i = 0; i < scatolette.length; i++)
				{
					try
					{
					Integer scatolettaCorrente = (Integer) scatolette[i].getContenuto();
					System.out.println("	scatolettaCorrente: " + scatolettaCorrente);
					}
					catch(ClassCastException e)
					{
						e.printStackTrace(); //ritorna il messaggio di errore e lo stack trace dell'eccezione
					}
				}
				
				/*
				 * usando questo sistema ci accorgiamo che non è tipe safety utilizzare un array di oggetti di tipo Scatoletta,
				 *  poiché non possiamo garantire che tutti gli oggetti restituiti dal metodo getContenuto() siano dello stesso tipo,
				 */
				
				ScatolettaGenerica<Integer> scatolettaGenerica8 = new ScatolettaGenerica<Integer>();
				scatolettaGenerica8.setContenuto(Integer.valueOf(100_000_000));
				
				ScatolettaGenerica<Integer> scatolettaGenerica9 = new ScatolettaGenerica<Integer>();
				scatolettaGenerica9.setContenuto(Integer.valueOf(1_000_000));
				
				ScatolettaGenerica<Integer> scatolettaGenerica10 = new ScatolettaGenerica<Integer>();
				//scatolettaGenerica10.setContenuto(Short.valueOf((short)1_000));
				scatolettaGenerica10.setContenuto(Integer.valueOf((short)1_000));
			
//				ScatolettaGenerica<Integer> [] scatoletteGeneriche = new ScatolettaGenerica<Integer>[3];
//				ScatolettaGenerica[0] = scatolettaGenerica8;
//				ScatolettaGenerica[1] = scatolettaGenerica9;
//				ScatolettaGenerica[2] = scatolettaGenerica10;
				
				
				ArrayList<ScatolettaGenerica<Integer>> scatoletteGeneriche = new ArrayList<ScatolettaGenerica<Integer>>();
				scatoletteGeneriche.add(scatolettaGenerica8);
				scatoletteGeneriche.add(scatolettaGenerica9);
				scatoletteGeneriche.add(scatolettaGenerica10);
				
				for(int i = 0; i < scatoletteGeneriche.size(); i++)
				{
					ScatolettaGenerica<Integer> scatolettaGenericaCorrente = scatoletteGeneriche.get(i);
					Integer contenutoGenericoCorrente = scatolettaGenericaCorrente.getContenuto();
					System.out.println("	contenutoGenericoCorrente: " + contenutoGenericoCorrente);
				}
				
				System.out.println();
				System.out.println("8.4------------------------");
				System.out.println();	
				/*
				 * nel primo caso abbiamo specificato che si trattava di una coppia di Stringhe
				 * quindi possiamo inserire solo Stringhe all'interno della coppia, 
				 * e quando andiamo a stampare la coppia, vedremo che contiene due Stringhe,
				 */
				Coppia<String> fidanzati = new Coppia<String>("Luca", "Elena");
				System.out.println("	fidanzati: " + fidanzati);
				
				/*
				 * nel secondo caso abbiamo specificato che si trattava di una coppia di Float,
				 * quindi possiamo inserire solo Float all'interno della coppia,
				 */
				Coppia<Float> punto = new Coppia<Float>(34.5f, 3f);
				System.out.println("	punto: " + punto);
				
				/*
				 * nel terzo caso abbiamo specificato che si trattava di una coppia di Object,
				 * quindi possiamo inserire qualsiasi tipo di oggetto all'interno della coppia,
				 * in questo caso abbiamo inserito una Stringa e un intero, ma avremmo potuto inserire qualsiasi altro tipo di oggetto,
				 * con la coppia di Object, non abbiamo alcuna garanzia sul tipo di oggetto che stiamo inserendo all'interno della coppia,
				 * 
				 * in pratica annullo la potenza dei generici
				 */
				Coppia<Object> coppiaObject = new Coppia<Object>("Luca", 2);
				System.out.println("	coppiaObject: " + coppiaObject);
				
				/*
				 * anche in questo caso, se provassimo ad inserire una coppia di Object, 
				 * potremmo inserire qualsiasi tipo di oggetto all'interno della coppia,
				 * in questo caso abbiamo inserito una Stringa e un carattere,
				 *  ma avremmo potuto inserire qualsiasi altro tipo di oggetto,
				 *  
				 *  questo è un esempio di come non utilizzare i generici, 
				 *  poiché non abbiamo alcuna garanzia sul tipo di oggetto che stiamo inserendo all'interno della coppia,
				 */
			
				Coppia coppiaObject2 = new Coppia("Elena", 'p');
				System.out.println("	coppiaObject2: " + coppiaObject2);
				
				
				/*
				 * con la porzione di codice che segue, stiamo verificando il tipo di oggetto che abbiamo inserito all'interno della coppia di Object,
				 * in questo caso abbiamo inserito una Stringa e un intero, quindi il primo membro della coppia è una Stringa e il secondo membro è un intero,
				 * questo ci viene dato dalla porzione di codice che segue,
				 *  in cui stiamo chiamando il metodo getClass() sui membri della coppia, 
				 *  che ci restituisce il tipo di oggetto che abbiamo inserito all'interno della coppia,
				 */
				System.out.println("	coppiaObject.getPrimoMembro().getClass: " + coppiaObject.getPrimoMembro().getClass());
				System.out.println("	coppiaObject.getSecondoMembro().getClass: " + coppiaObject.getSecondoMembro().getClass());
				
				System.out.println();
				System.out.println("9------------------------");
				System.out.println();	
				
				/*
				 * le arrayList sono una classe che implementa l'interfaccia List, e che utilizza un array per memorizzare gli elementi della lista,
				 * in questo caso stiamo creando una nuova arrayList di interi,
				 * quello che non si potrebbe fare è creare una arrayList di tipi primitivi,
				 *  come ad esempio int, poiché le arrayList possono contenere solo oggetti,
				 *  quindi se volessimo usare un'arrayList di interi dobbiamo per forza utilizzare la classe wrapper Integer,
				 *   che ci permette di incapsulare un intero all'interno di un oggetto,
				 * 
				 * possiamo però , grazie all' autoboxing , inserire direttamente un intero all'interno dell'arrayList,
				 *  poiché la JVM si occuperà di convertire automaticamente l'intero in un oggetto Integer,
				 *  senza stare a specificare che l'oggetto è di tipo integer, 
				 *  ma semplicemente inserendo un intero, la JVM si occuperà di fare l'autoboxing e di convertire l'intero in un oggetto Integer,
				 */
				ArrayList<Integer> integers = new ArrayList<Integer>();
				integers.add(Integer.valueOf(1_000_000_000));
				integers.add(1); // autoboxing
				//integers.add(Short.valueOf((short) 1000)); // no
				//integers.add(0.12345); // no
				//integers.add(Character.valueOf('c')); // no
				
				Integer int0 = integers.get(0);
				Integer int1 = integers.get(1);
				
				/*
				 * con il metodo get() della classe ArrayList, stiamo ottenendo gli elementi della lista, che sono di tipo Integer,
				 * quindi int0 e int1 sono di tipo Integer, e possiamo chiamare il metodo getClass() su di essi per verificare il loro tipo,
				 */
				System.out.println("	int0.getClass: " + int0.getClass());
				System.out.println("	int1.getClass: " + int1.getClass());
				
				/*
				 * qui stiamo assegnando il valore restituito dal metodo get() della classe ArrayList a due variabili di tipo Integer,
				 * quindi int2 e int3 sono di tipo Integer, e possiamo chiamare il metodo getClass() su di essi per verificare il loro tipo,
				 */
				int int2 = integers.get(0); // unboxing
				int int3 = integers.get(1); // unboxing
				
				System.out.println("	int2 + int3 " + int2 + int3);
				
				System.out.println("------------------------");
				
				/*
				 * con numbers stiamo chiamando la superclasse Number, che è la superclasse di tutte le classi wrapper che rappresentano i tipi numerici,
				 * quindi con numbers possiamo creare una lista di oggetti di tipo Number,
				 *  che possono essere di qualsiasi classe wrapper che rappresenta un tipo numerico,
				 *  
				 *  quindi possiamo inserire all'interno della lista di numbers, 
				 *  oggetti di tipo Integer, Float, Double, Short, Byte, Long, poiché tutte queste classi wrapper sono sottoclassi della classe Number,
				 */
				ArrayList<Number> numbers = new ArrayList<Number>();
				
				numbers.add(Integer.valueOf(1_000_000_000));
				numbers.add(1); // autoboxing
				numbers.add(Short.valueOf((short) 1000));
				numbers.add(0.12345);
				//integers.add(Character.valueOf('c')); // no
				
				Number int4 = numbers.get(0);
				Number int5 = numbers.get(1);
				Number int6 = numbers.get(2);
				Number int7 = numbers.get(3);
				
				
				System.out.println("	int4.getClass: " + int4.getClass());
				System.out.println("	int4: " + int4);//autoboxing
				
				System.out.println("	int5.getClass: " + int5.getClass());
				System.out.println("	int5: " + int5);//autoboxing
				
				System.out.println("	int6.getClass: " + int6.getClass());
				System.out.println("	int6: " + int6);//autoboxing
				
				System.out.println("	int7.getClass: " + int7.getClass());
				System.out.println("	int7: " + int7);//autoboxing
				
				
				int int8 = (Integer) numbers.get(0);
				int int9 = (Integer) numbers.get(1);
				short int10 = (Short) numbers.get(2);
				double int11 = (Double) numbers.get(3);
				
				System.out.println("	int8: " + int8);
				System.out.println("	int9: " + int9);
				System.out.println("	int10: " + int10);
				System.out.println("	int11: " + int11);
				
				
				System.out.println("------------------------");
				
				/*
				 * con numbers2 stiamo creando una lista di oggetti di tipo Object, che è la superclasse di tutte le classi in Java,
				 * quindi con numbers2 possiamo inserire all'interno della lista di numbers2,
				 * oggetti di qualsiasi tipo, come ad esempio
				 *  Integer, Short, Double, Character, String, poiché tutte queste classi sono sottoclassi della classe Object,
				 */
                ArrayList<Object> numbers2 = new ArrayList<>();
				
                numbers2.add(Integer.valueOf(1_000_000_000));
                numbers2.add(1); // autoboxing
                numbers2.add(Short.valueOf((short) 1000));
                numbers2.add(0.12345);
                numbers2.add(Character.valueOf('c')); 
                
                for(int i = 0; i < numbers2.size(); i++)
				{
					Object obj = numbers2.get(i);
					
					System.out.println("	obj.getClass: " + obj.getClass());
					System.out.println("	obj: " + obj);
				
				/*
				 * con questi if stiamo verificando il tipo di oggetto che abbiamo inserito all'interno della lista di numbers2,
				 * poiché abbiamo inserito oggetti di tipo Integer, Short, Double, Character, 
				 * quindi stiamo verificando se l'oggetto è di tipo Integer, Short, Double o Character,
				 * 
				 * questo potrebbe essere utile quando abbiamo una lista di oggetti di tipo Object,
				 *  e vogliamo gestire in modo appropriato gli oggetti in base al loro tipo,
				 */
				if(obj instanceof Integer nInteger)
				{
					System.out.println("	nInteger: " + nInteger);
				}
				else if(obj instanceof Short nShort)
				{
					System.out.println("	nShort: " + nShort);
				}
				else if(obj instanceof Double nDouble)
				{
					System.out.println("	nDouble: " + nDouble);
				}
				else if(obj instanceof Character nCharacter)
				{
					System.out.println("	nCharacter: " + nCharacter);
				}
			}
                
                System.out.println();
				System.out.println("9.1------------------------");
				System.out.println();	
				
				/*
				 * prima di java5 non avevamo i generici, quindi non potevamo specificare il tipo di oggetto che volevamo inserire all'interno della lista,
				 * quindi non avevamo alcuna garanzia sul tipo di oggetto che stavamo inserendo all'interno della lista,
				 */
				//prima di java 5
				ArrayList nList2 = new ArrayList();
				//nList2.add(2.17F); no prima di java 5
				//nList2.add(3.14); no prima di java 5
				//nList2.add(100); // no prima di java 5
				
				nList2.add(new Float(2.17F)); // questa era il modo di passare un'informazione numerica prima di java5
				nList2.add(new Double(3.14)); // questa era il modo di passare un'informazione numerica prima di java5
				nList2.add(new Integer(100)); // questa era il modo di passare un'informazione numerica prima di java5
				//nList2.add("aaa"); // questa era il modo di passare una stringa prima di java5
				/*
				 * prima di java 5 non essendoci i generici potevamo passare qualsiasi tipo di oggetto all'interno della lista,
				 */
				Float floatItem1 = (Float) nList2.get(0);
				/*
				 * con questo float abbiamo un'errore poiche il metodo get() della classe ArrayList restituisce un oggetto di tipo Object, 
				 * e non è possibile assegnare un oggetto di tipo Object ad una variabile di tipo Float,
				 * 
				 * per ovviare a questo problema bisognava effettuare un cast da object a float
				 */
				Double doubleItem = (Double) nList2.get(1);
				Integer intItem = (Integer) nList2.get(2);
				/*
				 * con questo codice avevamo in console solo il reference dell'oggetto, e non il valore dell'oggetto,
				 *  poiché il metodo toString() della classe Object restituisce il nome della classe seguito dal simbolo @ e dal valore hash code dell'oggetto,
				 */
				
				float floatItem1p = floatItem1.floatValue(); // unboxing
				//per recuperare il valore numerico da  un oggetto dovevamo chiamare il metodo floatValue() della classe Float,
				//che ci restituisce il valore numerico del float incapsulato all'interno dell'oggetto Float
				
				double doubleItemp = doubleItem.doubleValue(); // unboxing
				int intItemp = intItem.intValue(); // unboxing
				
				System.out.println("	floatItem1p: " + floatItem1p);
				System.out.println("	doubleItemp: " + doubleItemp);
				System.out.println("	intItemp: " + intItemp);
	}

}
