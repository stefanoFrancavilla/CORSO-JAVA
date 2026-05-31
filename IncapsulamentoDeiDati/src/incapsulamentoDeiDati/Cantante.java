package incapsulamentoDeiDati;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;



public sealed class Cantante extends Cittadino permits Cantautore{
/*
 * con la classe sealed,posso decidere quali classi possono estendere la classe Cantante,
 * a differenza di final , che non permette a nessuno di estenderla 
 * con la classe sealed invece, posso decidere io quali classi possono estenderla,
 * 
 *  in questo caso cantante estende EssereUmano, poichè un cantante è un essere umano,
 *  e poi ho deciso che la classe cantante può essere estesa da cantautore,
 *   poichè un cantautore è un cantante,
 *    ma non da altre classi, come ad esempio chitarrista o batterista,
 *     che non sono cantanti, ma musicisti.
 *     
 *     quindi con la classe sealed sono io a decidere quali classi possono estendere
 *     la classe cantante, in questo caso specifico, solo cantautore
 */
	
	
	//variabili d'istanza
	private GenereMusicale genereMusicale;
	//private int totaleConcerti;
	//private Concerto[] concerti;
	private List<Concerto> concertiLista;
	private byte contatoreConcerti;
	private int maxConcerti;
	
	

	//costruttore
	public Cantante(String nome,
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
		
		this.setGenereMusicale(genereMusicale.MUSICA_LEGGERA);
		//this.setTotaleConcerti(0);
		this.setMaxConcerti(20);
		this.inizzializzaConcerti();
		this.setContatoreConcerti((byte)0);
	}
//	public Cantante() {
//		
//		this("ND","ND",Sesso.SCONOSCIUTO);
//		System.out.println("Cantante(0)");
//	}
//	
//	public Cantante(String nome, String cognome, Sesso sesso)
//	{
//		super(nome, cognome, sesso);
//		System.out.println("Cantante(3)");
//		this.setGenereMusicale(genereMusicale.MUSICA_LEGGERA);
//		//this.setTotaleConcerti(0);
//		this.setMaxConcerti(3);
//		this.inizzializzaConcerti();
//		this.setContatoreConcerti((byte)0);
//	}
	
	public GenereMusicale getGenereMusicale() 
	{
		return this.genereMusicale;
	}
	
	public void setGenereMusicale(GenereMusicale genereMusicale) 
	{
		this.genereMusicale = genereMusicale;
	}

//	public int getTotaleConcerti() {
//		return totaleConcerti;
//	}
//
//	public void setTotaleConcerti(int totaleConcerti) {
//		this.totaleConcerti = totaleConcerti;
		
		/*
		 * esercizio implementare le logiche di controllo per evitare
		 * che vengano assegnati dei valori strampalati alla variabile totale Concerti
		 */
//		if (totaleConcerti < 0) {
//			this.totaleConcerti = 0;
//			System.out.println("Il totale dei concerti non può essere negativo. Impostato a 0.");
//		}
//		else {
//			this.totaleConcerti = totaleConcerti;
//		}
//	}
	public byte getContatoreConcerti() {
		return contatoreConcerti;
	}

	public void setContatoreConcerti(byte contatoreConcerti) {
		this.contatoreConcerti = contatoreConcerti;
	}

	public int getMaxConcerti() {
		return maxConcerti;
	}

	public void setMaxConcerti(int maxConcerti) {
		this.maxConcerti = maxConcerti;
	}
	
	private void inizzializzaConcerti()
	{
		//concerti = new Concerto[maxConcerti];
		//concertiLista = new ArrayList<Concerto>(maxConcerti);
		concertiLista = new LinkedList<Concerto>();
	}
	
	public void aggiungiConcerto(Concerto concerto)
	{
		concertiLista.add(concerto);
	}
	
	/*public void aggiungiConcerto(Concerto concerto) // metodo per aggiugnere un concerto all'array concerti
	{
		if(contatoreConcerti < concerti.length) // se il contatore dei concerti è minore della lunghezza dell'array concerti, allora posso aggiungere il concerto all'array concerti
		{
			aggiungiConcertoInner(concerto); // aggiungo il concerto all'array concerti, e incremento il contatore dei concerti
			System.out.println("concerto: " + concerto);
			System.out.println("contatore concerti: " + contatoreConcerti);
		}
		else
		{
			maxConcerti = maxConcerti + 3; // se il contatore dei concerti è maggiore o uguale  alla lunghezza dell'array , lo espando di 3 unità
			
			Concerto[] temp = new Concerto[maxConcerti];  // creo un nuovo array temporaneo con una lunghezza maggiore, in questo caso maxConcerti + 3
			for(int i = 0; i < concerti.length; i++) // copio i valori dell'array concerti nel nuovo array temporaneo, in questo modo non perdo i valori già presenti nell'array concerti
			{
				temp[i] = concerti[i]; // copio i valori dell'array concerti nel nuovo array temporaneo, in questo modo non perdo i valori già presenti nell'array concerti
			}
			concerti = temp; // assegno il nuovo array temporaneo all'array concerti, in questo modo posso aggiungere il concerto all'array concerti senza perdere i valori già presenti nell'array concerti
			System.out.println("concerti.length: " + concerti.length);
			aggiungiConcertoInner(concerto); // aggiungo il concerto all'array concerti, e incremento il contatore dei concerti
			
			for(int i = 0; i < maxConcerti; i++)
			{
				System.out.println("concerti[" + i + "]: " + concerti[i]);
			}
			
			System.out.println("Espando l'array");
		}
		
	}*/
	
	/*
	 * lo scopo di questo metodo aggiungiConcerto  è quello di aggiungere un concerto all'array concerti,
	 * ma prima di aggiungere il concerto, controllo se il contatore dei concerti è minore della lunghezza dell'array concerti,
	 * se è minore, allora posso aggiungere il concerto all'array concerti, altrimenti, se il contatore dei concerti è maggiore o uguale alla lunghezza dell'array concerti,
	 * allora devo espandere l'array concerti, creando un nuovo array temporaneo con una lunghezza maggiore,
	 *  copiando i valori dell'array concerti nel nuovo array temporaneo, e poi assegnando il nuovo array temporaneo all'array concerti,
	 *   in questo modo posso aggiungere il concerto all'array concerti senza perdere i valori già presenti nell'array concerti.
	 *   quinid stiamo espandendo il nostro array concerti, in modo dinamico, quando il contatore dei concerti raggiunge la lunghezza dell'array concerti,
	 *    in questo modo possiamo aggiungere un numero illimitato di concerti all'array concerti, senza doverci preoccupare di superare la lunghezza dell'array concerti.
	 *    
	 */
	/*
	private void aggiungiConcertoInner(Concerto concerto)
	{
		concerti[contatoreConcerti] = concerto;
		contatoreConcerti++;
		
	}*/
	
	public void stampaConcerti()
	{
		System.out.println("	concertiLista:" + concertiLista);
	}
	/*
	public void stampaConcerti()
	{
		for(int i = 0; i < concerti.length; i++)
		{
			Concerto concerto = concerti[i];
			if(concerto != null)
			{
				concerti[i].stampa();
			}
			else 
			{
				break;
			}
		}
	}
	*/
	//Classi annidate statiche
	


	public static class Concerto
	{
		//variabili d'istanza
		private String luogo;
		private LocalDate data;
	
		//costruttore
		public Concerto(String luogo, LocalDate data) {
			System.out.println("Concerto(2)");
			
			setLuogo(luogo);
			setData(data);
			
		}
		
		//metodi getter/setter
		
		public String getLuogo()
		{
			return luogo;
		}

		public void setLuogo(String luogo) 
		{
			this.luogo = luogo;
		}

		public LocalDate getData()
		{
			return data;
		}

		public void setData(LocalDate data) 
		{
			this.data = data;
		}
		
		@Override
		public String toString() {
			return "Concerto [luogo=" + luogo + ", data=" + data + "]";
		}
		
	

		//metodi
		
		
		public void stampa()
		{
			System.out.println(this.luogo + " " + this.data);
		}
	}
	

	
	/*
	 * Esercizio
	 * ragionare sul fatto che possa avere senso dare un'implementazione
	 * del concetto di cantare, per un cantante, e se si specializzare questa azione rispetto
	 * alla controparte definita nella classe essere umano, che può essere vista con
	 * una valenza più generica
	 * 
	 * può avere senso pensare di definire canta , anche nella classe Animale?
	 */
	
	
	public void canta() {
		System.out.println("Il cantante sta cantando una canzone del genere " + this.getGenereMusicale());
	}
	
	/*
	 * esercizio
	 * 
	 * ragionare sulle classi definite fino ad ora nel corso e provare ad individuare eventuali
	 *  classi annidate (statiche e non) da inserire ed utilizzare al loro interno con le sintassi viste a lezione.
	 */
	
}
