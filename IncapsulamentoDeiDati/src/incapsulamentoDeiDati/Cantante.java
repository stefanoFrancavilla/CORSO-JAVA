package incapsulamentoDeiDati;

public sealed class Cantante extends EssereUmano permits Cantautore{
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
	private int totaleConcerti;
	
	//costruttore
	public Cantante() {
		
		this("ND","ND",Sesso.SCONOSCIUTO);
		System.out.println("Cantante(0)");
	}
	
	public Cantante(String nome, String cognome, Sesso sesso)
	{
		super(nome, cognome, sesso);
		System.out.println("Cantante(3)");
		this.setGenereMusicale(genereMusicale.MUSICA_LEGGERA);
		this.setTotaleConcerti(0);
	}
	
	public GenereMusicale getGenereMusicale() 
	{
		return this.genereMusicale;
	}
	
	public void setGenereMusicale(GenereMusicale genereMusicale) 
	{
		this.genereMusicale = genereMusicale;
	}

	public int getTotaleConcerti() {
		return totaleConcerti;
	}

	public void setTotaleConcerti(int totaleConcerti) {
		this.totaleConcerti = totaleConcerti;
		
		/*
		 * esercizio implementare le logiche di controllo per evitare
		 * che vengano assegnati dei valori strampalati alla variabile totale Conceerti
		 */
	}
	
	//metodi
	
	/*
	 * Esercizio
	 * ragionare sul fatto che possa avere senso dare un'implementazione
	 * del concetto di cantare, per un cantante, e se si specializzare questa azione rispetto
	 * alla controparte definita nella classe essere umano, che può essere vista con
	 * una valenza più generica
	 * 
	 * può avere senso pensare di definire canta , anche nella classe Animale?
	 */
	
	
	
	
	
	
}
