package incapsulamentoDeiDati;

public class Gatto extends Animale {
	/*
	 * la classe Gatto estende la classe Animale,
	 * quindi eredita tutte le variabili d'istanza e i metodi della classe Animale,
	 * di conseguenza la classe animale sarà la superclasse di Gatto, mentre la classe Gatto sarà la sottoclasse di Animale.
	 */
	
	// Varialbili d'istanza.
	 
//	private String nome; 
//	private Sesso sesso; 
//	private byte anni;
//	private float altezza;
//	private float peso;
//	private ColoreOcchi coloreOcchi;
	private ColorePeloGatto colorePeloGatto;
	private RazzaGatto razzaGatto;
	
	// Variabili Constanti.
	private final byte min_anni = 0; 
	private final byte max_anni = 20; 
	private final byte default_anni = 3;
	
	private final float min_altezza = 7f; 
	private final float max_altezza = 50f; 
	private final float default_altezza = 15f; 
	
	private final float min_peso = 1f; 
	private final float max_peso = 10f; 
	private final float default_peso = 2f; 

	//Costruttore.
	public Gatto() {
		this("ND", Sesso.SCONOSCIUTO, (byte) 0, 0f, 0f, ColoreOcchi.SCONOSCIUTO, ColorePeloGatto.SCONOSCIUTO, RazzaGatto.SCONOSCIUTO);
		
		System.out.println("Gatto (0)"); // questo è il costruttore con 0 parametri
	}
	/*
	 * nel momento in cui chiamiamo il costruttore con 0 parametri,
	 * in automatico viene chiamato il costruttore con 8 parametri, 
	 * che inizializza tutte le variabili d'istanza con i valori di default,
	 * 
	 * dopo di che vengono effettuati tutti i controlli con i metodi setter all'interno del costruttore con 8 parametri,
	 * poi viene stampato "Gatto (8)" e successivamente viene stampato "Gatto (0)".
	 * questo succede perchè all'interno del costruttore con 0 parametri, viene chiamato il costruttore con 8 parametri,
	 */
	
	public Gatto(String nome,
			     Sesso sesso,
			     byte anni)
	{
		this(nome, sesso, anni, 0f, 0f, ColoreOcchi.SCONOSCIUTO, ColorePeloGatto.SCONOSCIUTO, RazzaGatto.SCONOSCIUTO);
		
		System.out.println("Gatto (3)"); //questo è il costruttore con 3 parametri
		
//		this.nome = nome;
//		this.sesso = sesso;
//		this.anni = anni;
	}
	
	public Gatto(String nome,
			     Sesso sesso,
			     byte anni,
			     float altezza,
			     float peso,
			     ColoreOcchi coloreOcchi,
			     ColorePeloGatto colorePeloGatto,
			     RazzaGatto razzaGatto)
	{
		System.out.println("Gatto (8)"); //questo è il costruttore con 8 parametri
		
		this.setNome(nome);
		this.setSesso(sesso);
		this.setAnni(anni);
		this.setAltezza(altezza);
		this.setPeso(peso);
		this.setColoreOcchi(coloreOcchi);
		this.setColorePeloGatto(colorePeloGatto);
		this.setRazzaGatto(razzaGatto);
	}
	
	    //per generare i metodi getter e setter si può utilizzare il seguente percorso:
		//tasto destro , Source , Generate Getter e Setter	
		
		//oppure si può usare la scorciatoia da tastiera: Alt + Shift + S , R
	
	// Metodi Getter e Setter.
	
		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			boolean nomeCorretto = true;
			
			if (verificaCratteri("1234567890!?@", nome)) 
			{
				System.out.println("nome non consono"); 
				nomeCorretto = false;
			}
			else if ( verificaLunghezza(nome, 20))
			{
				System.out.println("nome troppo lungo");
				
				nomeCorretto = false;
			}
			if(nomeCorretto == true) 
			{
				System.out.println("nome ok");
				this.nome = nome;
			}
			else
			{
			if ( this.nome == null)
			{
				System.out.println(this.nome + " è null ");
				
				this.nome = "ND"; 
			}
			else if (!("ND".equals(this.nome))) 
				
				
			{
				System.out.println(this.nome + " è un nome sensato .");
			}
		}	
	}
		/*
		 * nel momento in cui il nome contiene caratteri non consoni,
		 * passa dal primo if verifica caratteri, che restituisce true e stampa "nome non consono" e imposta nomeCorretto a false.
		 * una volta che nomeCorretto è false, quando si arriva a : if(nomeCorretto == true) , non si entra nell'if, 
		 * ma si passa direttamente all'else, che verifica se this.nome è null
		 * nel nostro caso specifico non è null poichè in precedenza avevamo assegnato un nome corretto ( miagolino )
		 * quindi non si entra nell'if ( this.nome == null), ma si passa direttamente all'else if (!("ND".equals(this.nome))) , 
		 * nell'else if (!("ND".equals(this.nome))) si verifica se this.nome è diverso da "ND" , se è diverso da "ND"
		 * allora valuta qual'è il nome attuale di this.nome, che in questo caso è "miagolino" e stampa "miagolino è un nome sensato ."
		 */

		public Sesso getSesso() {
			return sesso;
		}

		public void setSesso(Sesso sesso) {
			this.sesso = sesso;
		}

		public byte getAnni() {
			return anni;
		}

		public void setAnni(byte anni) {
			System.out.println("max anni: " + max_anni);
			
			if(anni >= min_anni && anni <= max_anni) 
			{
				this.anni = anni;
				System.out.println(this.anni + " anni inizializzati");
			}
			else
			{
				if (this.anni >= min_anni && this.anni <= max_anni) 
				{
					System.out.println(this.anni + " anni validi da prima.");
				}
				else
				{
					this.anni = default_anni; 
					System.out.println(this.anni + " anni assegnati di default.");
				}
			}
		}
		/*
		 * nel mondo quando abbiamo assegnato a set anni il valore 127, va a finire in  setAnni(byte anni)
		 * poi viene verificaco dal primo if se 127 è compreso tra min_anni e max_anni,
		 *  poichè 127 è maggiore di max_anni, allora non si entra nell'if, ma si passa direttamente all'else
		 *  nel primo if dell'else, viene verificato se this.anni è compreso tra min_anni e max_anni, 
		 *  
		 */

		public float getAltezza() {
			return altezza;
		}

		public void setAltezza(float altezza) {
			if(altezza > min_altezza && altezza < max_altezza) {
				this.altezza = altezza;
				System.out.println(this.altezza + " altezza inizializzata");
			}
			
			else
			{
				
				if (this.altezza > min_altezza && this.altezza < max_altezza)
				{
					System.out.println(this.altezza + " altezza valida da prima.");
				}
			
				else
				{
					this.altezza = default_altezza; 
					System.out.println(this.altezza + " altezza assegnata di default.");
				}	
			}
		}

		public float getPeso() {
			return peso;
		}

		public void setPeso(float peso) {
			if(peso > min_peso && peso < max_peso)
			{
				this.peso = peso;
				System.out.println(this.peso + " peso inizializzato");
			}
			else
			{
				if (this.peso > min_peso && this.peso < max_peso)
				{
					System.out.println(this.peso + " peso valido da prima.");
				}
				else
				{
					this.peso = default_peso; 
					System.out.println(this.peso + " peso assegnato di default.");
				}
			}
		}

		public ColoreOcchi getColoreOcchi() {
			return coloreOcchi;
		}

		public void setColoreOcchi(ColoreOcchi coloreOcchi) {
			this.coloreOcchi = coloreOcchi;
		}

		public ColorePeloGatto getColorePeloGatto() {
			return colorePeloGatto;
		}

		public void setColorePeloGatto(ColorePeloGatto colorePeloGatto) {
			this.colorePeloGatto = colorePeloGatto;
		}

		public RazzaGatto getRazzaGatto() {
			return razzaGatto;
		}

		public void setRazzaGatto(RazzaGatto razzaGatto) {
			this.razzaGatto = razzaGatto;
		}
	
	// Metodi
	public void beve() 
	{
		System.out.println(nome + " beve");
	}

	public void mangia() 
	{
		System.out.println(nome + " mangia");
	}

	public void respira() 
	{
		System.out.println(nome + " respira");
	}

	public void dorme()
	{
		System.out.println(nome + " dorme");
	}
	
	public void faLeFusa() 
	{
		System.out.println(nome + " fa le fusa");
	}
	
	public void impasta() 
	{
		System.out.println(nome + " impasta");
	}

	public void stampa() 
	{
		System.out.println("----------");
		System.out.println("Nome: " + nome);
		System.out.println("Sesso: " + sesso);
		System.out.println("Anni: " + anni);
		System.out.println("Altezza: " + altezza);
		System.out.println("Peso: " + peso);
		System.out.println("Colore Occhi: " + coloreOcchi);
		System.out.println("Colore Pelo: " + colorePeloGatto);
		System.out.println("Razza: " + razzaGatto);
		System.out.println("----------");
	    
	 }
	
	//metodi di verifica
	
	private boolean verificaCratteri(String caratteri, String s) {
		boolean presente = false;
		for (int i = 0; i < caratteri.length(); i++) 
		{
			char carattereCorrente = caratteri.charAt(i);
			System.out.println("carattereCorrente" +  carattereCorrente);
			if (s.indexOf(caratteri.charAt(i)) != -1)
			{
				presente = true;
				break;
			}
	}
		return presente;
}
	private boolean verificaLunghezza(String s, int  limit)
	{
		boolean troppoLunga = false;
		
		if (s.length() > limit) 
		    troppoLunga = true;
		return troppoLunga;
	}
}