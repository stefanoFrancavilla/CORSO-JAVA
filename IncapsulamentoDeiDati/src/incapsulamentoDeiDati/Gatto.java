package incapsulamentoDeiDati;
import incapsulamentoDeiDati.utilities.Verifica;
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
	private static final byte MIN_ANNI = 0; 
	private static final byte MAX_ANNI = 20; 
	private static final byte DEFAULT_ANNI = 3;
	
	private static final float MIN_ALTEZZA = 7f; 
	private static final float MAX_ALTEZZA = 50f; 
	private static final float DEFAULT_ALTEZZA = 15f; 
	
	private static final float MIN_PESO = 1f; 
	private static final float MAX_PESO = 10f; 
	private static final float DEFAULT_PESO = 2f; 
	
	private static int totaleGatti; // variabile statica che conta il numero totale di gatti creati

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
		super(nome, sesso, anni, altezza, peso, coloreOcchi);
		System.out.println("Gatto (8)"); //questo è il costruttore con 8 parametri
		
//		this.setNome(nome);
//		this.setSesso(sesso);
//		this.setAnni(anni);
//		this.setAltezza(altezza);
//		this.setPeso(peso);
//		this.setColoreOcchi(coloreOcchi);
		this.setColorePeloGatto(colorePeloGatto);
		this.setRazzaGatto(razzaGatto);
		this.nasce();
	}
	
	    //per generare i metodi getter e setter si può utilizzare il seguente percorso:
		//tasto destro , Source , Generate Getter e Setter	
		
		//oppure si può usare la scorciatoia da tastiera: Alt + Shift + S , R
	
	// Metodi Getter e Setter.
	
//		public String getNome() {
//			return nome;
	//	}

		@Override
		public void setNome(String nome) {
			boolean nomeCorretto = true;
			
			if (Verifica.verificaCratteri("1234567890!?@", nome)) 
			{
				System.out.println("nome non consono"); 
				nomeCorretto = false;
			}
			else if ( Verifica.verificaLunghezza(nome, 20))
			{
				System.out.println("nome troppo lungo");
				
				nomeCorretto = false;
			}
			if(nomeCorretto == true) 
			{
				System.out.println("nome ok");
				super.setNome(nome);
			}
			else
			{
				String nomeCorrente = super.getNome();
			if ( nomeCorrente == null)
			{
				System.out.println(nomeCorrente + " è null ");
				
				super.setNome("ND");
			}
			else if (!("ND".equals(nomeCorrente))) 
				
				
			{
				System.out.println(nomeCorrente + " è un nome sensato .");
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

//		public Sesso getSesso() {
//			return sesso;
//		}
//
//		public void setSesso(Sesso sesso) {
//			this.sesso = sesso;
//		}

//		public byte getAnni() {
//			return anni;
//		}

//		 @Override
//		public void setAnni(byte anni) {
//			System.out.println("max anni: " + Gatto.MAX_ANNI);
//			
//			if(anni >= Gatto.MIN_ANNI && anni <= Gatto.MAX_ANNI) 
//			{
//				super.setAnni(anni);
//				System.out.println(super.getAnni() + " anni inizializzati");
//			}
//			else
//			{
//				byte anniCorrenti = super.getAnni();
//				if (anniCorrenti >= Gatto.MIN_ANNI && anniCorrenti <= Gatto.MAX_ANNI) 
//				{
//					System.out.println(anniCorrenti + " anni validi da prima.");
//				}
//				else
//				{
//					super.setAnni(Gatto.DEFAULT_ANNI); 
//					System.out.println(anniCorrenti + " anni assegnati di default.");
//				}
//			}
//		}
		/*
		 * nel mondo quando abbiamo assegnato a set anni il valore 127, va a finire in  setAnni(byte anni)
		 * poi viene verificaco dal primo if se 127 è compreso tra min_anni e max_anni,
		 *  poichè 127 è maggiore di max_anni, allora non si entra nell'if, ma si passa direttamente all'else
		 *  nel primo if dell'else, viene verificato se this.anni è compreso tra min_anni e max_anni, 
		 *  
		 */

//		public float getAltezza() {
//			return altezza;
//		}

		 @Override
		public void setAltezza(float altezza) {
			if(altezza > Gatto.MIN_ALTEZZA && altezza < Gatto.MAX_ALTEZZA) {
				super.setAltezza(altezza);
				System.out.println(super.getAltezza() + " altezza inizializzata");
			}
			
			else
			{
				float altezzaCorrente = super.getAltezza();
				if (altezzaCorrente > Gatto.MIN_ALTEZZA && altezzaCorrente < Gatto.MAX_ALTEZZA)
				{
					System.out.println(altezzaCorrente + " altezza valida da prima.");
				}
			
				else
				{
					super.setAltezza(Gatto.DEFAULT_ALTEZZA);
					System.out.println(altezzaCorrente + " altezza assegnata di default.");
				}	
			}
		}

//		public float getPeso() {
//			return peso;
//		}

		 @Override
		public void setPeso(float peso) {
			if(peso > Gatto.MIN_PESO&& peso < Gatto.MAX_PESO)
			{
				super.setPeso(peso);
				System.out.println(super.getPeso() + " peso inizializzato");
			}
			else
			{
				float pesoCorrente = super.getPeso();
				if (pesoCorrente > Gatto.MIN_PESO && pesoCorrente < Gatto.MAX_PESO)
				{
					System.out.println(pesoCorrente + " peso valido da prima.");
				}
				else
				{
					super.setPeso(Gatto.DEFAULT_PESO); 
					System.out.println(pesoCorrente + " peso assegnato di default.");
				}
			}
		}

//		public ColoreOcchi getColoreOcchi() {
//			return coloreOcchi;
//		}
//
//		public void setColoreOcchi(ColoreOcchi coloreOcchi) {
//			this.coloreOcchi = coloreOcchi;
//		}

		
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
		
	//metodi getter per le costanti statiche

		public byte getMinAnni() {
			return Gatto.MIN_ANNI;
		}

		public byte getMaxAnni() {
			return Gatto.MAX_ANNI;
		}

		public byte getDefaultAnni() {
			return Gatto.DEFAULT_ANNI;
		}
	
	// Metodi
		
		@Override	
		public void nasce()
		{
			super.nasce();
			Gatto.totaleGatti++;
			System.out.println("totaleGatti:" + Gatto.totaleGatti);
		}
		@Override
	public void beve() 
	{
		System.out.println(super.getNome() + " beve");
	}
		@Override
	public void mangia() 
	{
		System.out.println(super.getNome() + " mangia");
	}
		@Override
	public void respira() 
	{
		System.out.println(super.getPeso() + " respira");
	}
		public void muore()
		{
			super.muore();
			Gatto.totaleGatti--;
			System.out.println("totaleGatti:" + Gatto.totaleGatti);
		}
		@Override
	public void dorme()
	{
			super.dorme();
			System.out.println(super.getAltezza() + " dorme accovacciato con il musino rivolto verso l'alto");	
		//System.out.println(nome + " dorme");
	}
	
	public void faLeFusa() 
	{
		System.out.println(super.getNome() + " fa le fusa");
	}
	
	public void impasta() 
	{
		System.out.println(super.getNome() + " impasta");
	}
       @Override
	public void stampa() 
	{
    	   super.stampa();
		System.out.println("----------");
//		System.out.println("Nome: " + nome);
//		System.out.println("Sesso: " + sesso);
//		System.out.println("Anni: " + anni);
//		System.out.println("Altezza: " + altezza);
//		System.out.println("Peso: " + peso);
//		System.out.println("Colore Occhi: " + coloreOcchi);
     	System.out.println("Colore Pelo: " + colorePeloGatto);
		System.out.println("Razza: " + razzaGatto);
		
	    
	 }
	
	//metodi di verifica
	
//	private boolean verificaCratteri(String caratteri, String s) {
//		boolean presente = false;
//		for (int i = 0; i < caratteri.length(); i++) 
//		{
//			char carattereCorrente = caratteri.charAt(i);
//			System.out.println("carattereCorrente" +  carattereCorrente);
//			if (s.indexOf(caratteri.charAt(i)) != -1)
//			{
//				presente = true;
//				break;
//			}
//	}
//		return presente;
//}
//	private boolean verificaLunghezza(String s, int  limit)
//	{
//		boolean troppoLunga = false;
//		
//		if (s.length() > limit) 
//		    troppoLunga = true;
//		return troppoLunga;
//	}
}