package classAndReference;  // il package di appartenenza. è un modo per distribuire in maniera logica diverse classi

public class Calendario {  // il nome della classe deve coincidere con il nome del file

	// questa classe creata non ha il punto di ingresso (main) , 
	// è una classe che verrà istanziata all'interno di un'altra classe.
	
	public byte giorno;    // i valori di default delle veriabili di tipo numerico avranno lo 0
	public byte mese;
	public short anno;
	public byte ora;
	public byte minuti;
	public byte secondi;
	public float frazioneDiGiorno;
	public double frazioneDiAnno;
	public long anniDalBigBang;
	public char inizialeGiorno;  // per il char il valore di default sarà il carattere null ( 'u\0000' )
	public boolean isDataDiNascita;  // il valore numerico di default sarà FALSE
	public final byte giornoScopertaAmerica = (byte) 12;  // a differenza delle altre public queste sono state inserite come final poichè la scoperta dell'america è un'anno definito
	public final byte meseScopertaAmerica = (byte) 10;  // con final abbiamo assegnato un valore che non può essere modificabile.
	public final short annoScopericaAmerica = (short) 1492;

    public Calendario () {  // questa è una funzione costruttrice o costruttore, e deve essere nominata come la classe di appartenenza 
	                        // è un blocco di codice , a cui è stato assegnato un'identificatore, e tutte le vote che il programma fa riferimento all'identificatore
    	                    // vengono eseguite le righe di codice , all'interno del blocco successivo all'identificatore.
    	
    	                    // il blocco è lo spazio che abbiamo tra una parentesi di apertura e una di chiusura
    	                    // tutte le righe di codice vengono eseguite quando , anche se da un'altra parte del programmma , chiamo per nome questa funzione , eseguendo il suo contenuto
    	
    System.out.println("giorno " + giorno);
    System.out.println("mese " + mese);
    System.out.println("anno " + anno);
    System.out.println("ora " + ora);
    System.out.println("minuti " + minuti);
    System.out.println("secondi " + secondi);
    System.out.println("frazioneDiGiorno " + frazioneDiGiorno);
    System.out.println("frazioneDiAnno  " + frazioneDiAnno);
    System.out.println("anniDalBigBang " + anniDalBigBang);
    System.out.println("inizialeGiorno " + inizialeGiorno);
    System.out.println("isDataDiNascita " + isDataDiNascita);
	
    // ogni istanza avrà i suoi valori, in modo tale che ogni istanza sia diversa l'una dall'altra
}
}