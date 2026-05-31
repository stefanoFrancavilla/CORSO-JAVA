package incapsulamentoDeiDati;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import incapsulamentoDeiDati.Cittadino.Comune;
import incapsulamentoDeiDati.Cittadino.Nazione;

//1

//public final class Cantautore extends Cantante {
///*
// * dal momento in cui cantante è una classe sealed , impone alla classe 
// * cantautore di usare solo final o sealed.
// * non può in nessun caso essere una classe normale 
// * quindi dobbiamo per forza di cose dichiararla come final o sealed,
// *  altrimenti avremmo un errore di compilazione.
// */
//	
//	//variabili d'istanza
//	
//	private String[] titoliCanzoniScritte;
//	private byte contatoreCanzoniScritte;
//	private int maxCanzoniScritte;
//	
//	//costruttore
//	
//	public Cantautore() {
//		this("ND","ND",Sesso.SCONOSCIUTO);
//		System.out.println("Cantautore(0)");
//	}
//	
//	public Cantautore(String nome, String cognome, Sesso sesso) {
//		super(nome, cognome, sesso);
//		
//		System.out.println("Cantautore(3)");	
//		
//		this.setMaxCanzoniScritte(3);
//		//il max canzoni scritte ci serve per tenere traccia del limite	
//		//è stato messo al primo posto perchè devo inizializzare il limite prima di inizializzare l'array dei titoli delle canzoni scritte,
//		
//		this.inizializzaTitoliCanzoniScritte();
//		//ogni volta che viene creato un cantautore , ha la posibilità di creare al massimo 10 canzoni
//		
//		this.setContatoreCanzoniScritte((byte)0);
//		//il contatore ci serve per tenere traccia di quante canzoni ha scritto il cantautore, 
//		//in modo da non superare il limite di 10 canzoni
//		
//	}
//
//
//	
//	//metodi getter/setter
//
//	public byte getContatoreCanzoniScritte() {
//		return contatoreCanzoniScritte;
//	}
//
//	public void setContatoreCanzoniScritte(byte contatoreCanzoniScritte) {
//		this.contatoreCanzoniScritte = contatoreCanzoniScritte;
//	}
//	
//	public int getMaxCanzoniScritte() {
//		return maxCanzoniScritte;
//	}
//
//	private void setMaxCanzoniScritte(int maxCanzoniScritte) {
//		this.maxCanzoniScritte = maxCanzoniScritte;
//	}
//	
//	
//	//metodi
//	private void inizializzaTitoliCanzoniScritte() {
//		titoliCanzoniScritte = new String[maxCanzoniScritte];
//	}
//	
////	public void aggiungiTitoloCanzoneScritta(String titolo) {
////		
////		if(contatoreCanzoniScritte < titoliCanzoniScritte.length )
////		{
////		titoliCanzoniScritte[contatoreCanzoniScritte] = titolo;
////		contatoreCanzoniScritte++;
////		}
////		else
////		{
////			System.out.println("Arrey piena. Miglioreremo con le collection");
////	    }
////		
////	}
////	
//	
//	public void aggiungiTitoloCanzoneScritta(String titolo) {
//	
//	if(contatoreCanzoniScritte < maxCanzoniScritte )
//	{
////	titoliCanzoniScritte[contatoreCanzoniScritte] = titolo;
////	contatoreCanzoniScritte++;
//		aggiungiTitolo(titolo);
//	
//	System.out.println("contatore canzoni scritte: " + contatoreCanzoniScritte);
//	}
//	else
//	{
//		maxCanzoniScritte = maxCanzoniScritte + 3;
//		//quando il contatore delle canzoni scritte arriva al suo massimo (10) in questo caso,allora aumento il limite di canzoni scritte di 10
//		//quindi se il limite era 10, allora diventa 20, se era 20 diventa 30 e così via,
//		//in questo modo posso continuare ad aggiungere canzoni scritte senza dovermi preoccupare di superare il limite.
//		
//		String[] temp = new String[maxCanzoniScritte];
//		/*
//		 * questo nuovo array temp, mi serve per creare un nuovo array con il nuovo limite di canzoni scritte,	
//		 */
//		
//		for(int i = 0; i < titoliCanzoniScritte.length; i++) {
//			
//			temp[i] = titoliCanzoniScritte[i];
//		}
//		titoliCanzoniScritte = temp;
//		
//		System.out.println("titoli canzoni scritte: " + titoliCanzoniScritte.length);
//		
//        
////		titoliCanzoniScritte[contatoreCanzoniScritte] = titolo;
////		contatoreCanzoniScritte++;
//		aggiungiTitolo(titolo);
//        for(int i = 0; i < maxCanzoniScritte; i++) {
//			
//			System.out.println("titoli canzoni scritte:[" + i + "]" + titoliCanzoniScritte[i]);
//		}
//		System.out.println("Espando l'array");
//    }
//	
//}
//	private void aggiungiTitolo(String titolo) {
//		titoliCanzoniScritte[contatoreCanzoniScritte] = titolo;
//		contatoreCanzoniScritte++;
//	}
//	
//	public void stampaTitoliCanzoniScritte() {
//		
//		StringBuilder sb = new StringBuilder();
//		/*
//		 * con String Builder posso creare una stringa in modo più efficiente,
//		 * rispetto a concatenare le stringhe con l'operatore +, che crea una nuova stringa ogni volta,
//		 * cioe ci da la possibilità di creare una stringa in modo più efficiente,
//		 *  senza dover creare una nuova stringa ogni volta che concatenamo una nuova stringa.
//		 */
//		
//		for(int i = 0; i < titoliCanzoniScritte.length; i++)
//		{
//			if(titoliCanzoniScritte[i] != null) // se il titolo della canzone è diverso da null
//			{
//				sb.append(titoliCanzoniScritte[i]);//allora posso agganciare il titolo della canzone alla stringa che sto costruendo con StringBuilder
//				//sb.append(", ");//aggiungo una virgola e uno spazio dopo ogni titolo di canzone, per separare i titoli delle canzoni
//			}
//			else
//			{
//				break;
//			}
//			if (i< titoliCanzoniScritte.length - 1)
//			{
//				// se i è minore della lunghezza dell'array - 1,
//				/*
//				 *  con questo  controllo if (i< titoliCanzoniScritte.length - 1) , siginfica che se i è minore della lunghezza dell'array - 1,
//				 *   allora posso aggiungere una virgola e uno spazio dopo il titolo della canzone,
//				 *   
//				 *   se supponiamo di avere 3 canzoni scritte, e i è uguale a 0, allora posso aggiungere una virgola e uno spazio dopo il titolo della prima canzone,
//				 *   mentre se i è uguale a 2 (che è l'ultima posizione dell'array), 
//				 *   allora non posso aggiungere una virgola e uno spazio dopo il titolo della terza canzone, perchè sarebbe l'ultima canzone scritta, 
//				 *   e non ci sarebbe bisogno di separare i titoli delle canzoni con una virgola e uno spazio.
//				 */
//			
//			if(titoliCanzoniScritte[i + 1] != null)// se alla posizione i + 1 c'è un titolo di canzone diverso da null, 
//				//allora posso aggiungere una virgola e uno spazio dopo il titolo della canzone
//			{
//				sb.append(", ");//aggiungo una virgola e uno spazio dopo ogni titolo di canzone
//			}
//		  }
//			
//			
//	   }
//		
//		System.out.println(sb.toString());
//		
//	}
//}

//2

public final class Cantautore extends Cantante {

	
	//variabili d'istanza
	
//	private String[] titoliCanzoniScritte;
//	private byte contatoreCanzoniScritte;
//	private int maxCanzoniScritte;
	private Canzone[] canzoni;
	private List<Canzone> canzoniLista;
	private byte contatoreCanzoni;
	private int maxCanzoni;
	
	private String tipo = "CANTAUTORE";
	
	
	/*
	 * prima avevamo una lista di titoli di canzoni scritte, 
	 * mentre adesso abbiamo una lista di canzoni scritte, che sono oggetti di tipo Canzone,
	 */

	
	
	
	
	//costruttore
	public Cantautore(String nome,
			String cognome,
			Sesso sesso,
			float altezza,
			float peso,
			ColoreOcchi coloreOcchi,
			ColoreCapelli coloreCapelli,
			Nazione nazioneDiNascita,
			LocalDate dataDiNascita,
			Comune comuneDiNascita) 
	{
		super(nome, cognome, sesso, altezza, peso, coloreOcchi, coloreCapelli,nazioneDiNascita, dataDiNascita,comuneDiNascita);
		System.out.println("--------------------------");
		System.out.println("Cantante (10)");
		
		this.setMaxCanzoni(20);
		this.inizializzaCanzoni();
		this.setContatoreCanzoni((byte)0);
	}

//	public Cantautore() {
//		this("ND","ND",Sesso.SCONOSCIUTO);
//		System.out.println("Cantautore(0)");
//	}
//	
//	public Cantautore(String nome, String cognome, Sesso sesso) {
//		super(nome, cognome, sesso);
//		
//		System.out.println("Cantautore(3)");	
//		
////		this.setMaxCanzoniScritte(3);
////		this.inizializzaTitoliCanzoniScritte();
////		this.setContatoreCanzoniScritte((byte)0);
//		
//		this.setMaxCanzoni(3);
//		this.inizializzaCanzoni();
//		this.setContatoreCanzoni((byte)0);
//	}
//	
	//metodi getter/setter
	
	
	public byte getContatoreCanzoni() {
		return contatoreCanzoni;
	}

	public void setContatoreCanzoni(byte contatoreCanzoni) {
		this.contatoreCanzoni = contatoreCanzoni;
	}

	public int getMaxCanzoni() {
		return maxCanzoni;
	}

	public void setMaxCanzoni(int maxCanzoni) {
		this.maxCanzoni = maxCanzoni;
	}
	

//	public byte getContatoreCanzoniScritte() {
//		return contatoreCanzoniScritte;
//	}
//
//	public void setContatoreCanzoniScritte(byte contatoreCanzoniScritte) {
//		this.contatoreCanzoniScritte = contatoreCanzoniScritte;
//	}
//	
//	public int getMaxCanzoniScritte() {
//		return maxCanzoniScritte;
//	}
//
//	private void setMaxCanzoniScritte(int maxCanzoniScritte) {
//		this.maxCanzoniScritte = maxCanzoniScritte;
//	}
//	
//	
//	//metodi
	
	private void inizializzaCanzoni() {
		//canzoni = new Canzone[maxCanzoni];
		canzoniLista = new ArrayList<Canzone>(maxCanzoni);
	}
	
	public void aggiungiCanzone (Canzone canzone)
	{
		canzoniLista.add(canzone);
	}
	
	public void ordinaCanzoniPerTitolo()
	{
		canzoniLista.sort(null);// con il null induciamo a usare l'ordinamento scelto nella funzione compareTo di canzoni
		
		
	}
	/*public void aggiungiCanzone(Canzone canzone)
	{
		if(contatoreCanzoni < maxCanzoni)
		{
			aggiungiCanzoneInner(canzone);
			
			System.out.println("canzone: " + canzone);
			System.out.println("contatoreCanzoni: " + contatoreCanzoni);
			
		}
		else
		{
			maxCanzoni = maxCanzoni + 3;
			
			Canzone[] temp = new Canzone[maxCanzoni];
			
			for(int i = 0; i < canzoni.length; i++) {
				
				temp[i] = canzoni[i];
			}
			
			canzoni = temp;
			
			System.out.println("canzoni.length: " + canzoni.length);
			
			aggiungiCanzoneInner(canzone);
			
			for(int i = 0; i < maxCanzoni; i++) {
				
				System.out.println("canzoni[" + i + "]: " + canzoni[i]);
			}
			
			System.out.println("Espando l'array");
		}
	}
	

	private void aggiungiCanzoneInner(Canzone canzone)
	{
		canzoni[contatoreCanzoni] = canzone;
		contatoreCanzoni++;
	}*/
	
	public void stampaCanzoni()
	{
		System.out.println("------------------------------------------");
		System.out.println("Cantautore -> stampaCanzoni()");
		
		System.out.println("	canzoniLista: " + canzoniLista);
	}
		
	
	/*public void stampaCanzoni()
	{
		for(int i = 0; i < canzoni.length; i++)
		{
			Canzone canzone = canzoni[i];
			
			if(canzone != null)
			{
				canzone.stampa();
			}
			else
			{
				break;
			}
		}
	}/*
		
	
	
//	private void inizializzaTitoliCanzoniScritte() {
//		titoliCanzoniScritte = new String[maxCanzoniScritte];
//	}
//	
//	
//	public void aggiungiTitoloCanzoneScritta(String titolo) {
//	
//	if(contatoreCanzoniScritte < maxCanzoniScritte )
//	{
//
//		aggiungiTitolo(titolo);
//	
//	System.out.println("contatore canzoni scritte: " + contatoreCanzoniScritte);
//	}
//	else
//	{
//		maxCanzoniScritte = maxCanzoniScritte + 3;
//	
//		
//		String[] temp = new String[maxCanzoniScritte];
//		
//		
//		for(int i = 0; i < titoliCanzoniScritte.length; i++) {
//			
//			temp[i] = titoliCanzoniScritte[i];
//		}
//		titoliCanzoniScritte = temp;
//		
//		System.out.println("titoli canzoni scritte: " + titoliCanzoniScritte.length);
//		
//        
//
//		aggiungiTitolo(titolo);
//        for(int i = 0; i < maxCanzoniScritte; i++) {
//			
//			System.out.println("titoli canzoni scritte:[" + i + "]" + titoliCanzoniScritte[i]);
//		}
//		System.out.println("Espando l'array");
//    }
//	
//}
//	private void aggiungiTitolo(String titolo) {
//		titoliCanzoniScritte[contatoreCanzoniScritte] = titolo;
//		contatoreCanzoniScritte++;
//	}
//	
//	public void stampaTitoliCanzoniScritte() {
//		
//		StringBuilder sb = new StringBuilder();
//		
//		
//		for(int i = 0; i < titoliCanzoniScritte.length; i++)
//		{
//			if(titoliCanzoniScritte[i] != null) 
//			{
//				sb.append(titoliCanzoniScritte[i]);
//			}
//			else
//			{
//				break;
//			}
//			if (i< titoliCanzoniScritte.length - 1)
//			{
//			if(titoliCanzoniScritte[i + 1] != null)
//			{
//				sb.append(", ");
//			}
//		  }
//	   }
//		System.out.println(sb.toString());
//		
//	}
//	
	//Classi interne (annidate non statiche)
	
	/*
	 * in questo caso con questa classe intendiamo le canzoni scritte dal cantautore,
	 */
	public class Canzone implements Comparable<Canzone>
	{
		//variabili di istanza
		
		private String titolo;
		private String testo;
		
		private String tipo = "CANZONE";
		//ogni oggetto avrà un titolo e unn testo scelti dal cantautore
		
		//costruttore
		public Canzone(String titolo, String testo)
		{
			System.out.println("Canzone(2)");// stampa "Canzone(2)" ogni volta che viene creato un oggetto di tipo Canzone, con 2 parametri (titolo e testo)
			
			this.setTitolo(titolo);
			this.setTesto(testo);
			//System.out.println(getGenereMusicale());
		}

		
		// metodi getter/setter
		public String getTitolo() {
			return titolo;
		}

		public void setTitolo(String titolo) {
			this.titolo = titolo;
		}

		public String getTesto() {
			return testo;
		}

		public void setTesto(String testo) {
			this.testo = testo;
		}

		@Override
		public String toString() {
			return "Canzone [titolo=" + titolo + "]";
		}
		@Override
		public int compareTo(Canzone o) {
			return this.titolo.compareTo(o.getTitolo());
		}
		
		/*
		 * una volta implementata l'interfaccia compareble , bisogna ridefinire la funzione compareTo , in base al nostro criterio di ordinamento
		 * in questo caso voglio che mi ritorni l'oggetto canzone per a quale sto chiamando compareTo
		 * e comfrontarlo con il titolo della canzone referenziata dal parametro o
		 * 
		 */
		//metodi
		
		public void stampa()
		
		{
			
			System.out.println("Titolo: " + this.titolo + "\n\nTesto: " + this.testo);
	
			/*
			 * con questa scrittura in console vedremo prima il titolo della canzone, poi andremo a capo due volte, e poi vedremo il testo della canzone, 
			 * con una scrittura più ordinata e leggibile, rispetto a scrivere tutto in una sola riga.
			 */
		}
		
		public void stampaInfoAutore()
		{
			System.out.println( getNome());
			System.out.println( getCognome());
			System.out.println( getGenereMusicale());
			
		}
		
		public void stampaTipo(String tipo)
		{
			System.out.println("Tipo: " + tipo);
			System.out.println("this.Tipo: " + this.tipo);
			System.out.println(" Cantautore.this.tipo: " + Cantautore.this.tipo);
		}


		
		
		
		
	}
}

