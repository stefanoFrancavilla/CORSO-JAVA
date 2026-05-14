package classiWrapperEGenerici;

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
			
			
		 
	}

}
