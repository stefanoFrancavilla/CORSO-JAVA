package incapsulamentoDeiDati;

public abstract class Animale {

	/* con la parola chiave "abstract" stiamo dichiarando una classe astratta,
	*  che non può essere istanziata direttamente, 
	*  ma può essere estesa da altre classi concrete.
	*/
	
	//variabili di istanza
	protected String nome; 
	protected Sesso sesso; 
	protected byte anni;
	protected float altezza;
	protected float peso;
	protected ColoreOcchi coloreOcchi;
	
	/*
	 * le variabili d'istanza sono dichiarate con il modificatore di accesso "protected",
	 * quindi con protected possono essere accedute direttamente dalle classi che estendono la classe Animale,
	 * mentre con private non potrebbero essere accedute direttamente dalle classi che estendono la classe Animale,
	 */
	
	
	// metodi getter/setter
	
	/*
	 * nel momento in cui andiamo a chiamare dal main il metodo get nome,
	 * parte la ricerca nelle classi che estendono la classe Animale, se non viene trovato il metodo get nome,
	 * allora viene cercato nella super classe Animale
	 * 
	 * con quetso sistema possiamo alleggerire il codice nelle sottoClassi, 
	 * evitando di dover scrivere il metodo get nome in ogni classe che estende la classe Animale,
	 */
	
	//costruttore
	
	public Animale() {
		System.out.println("Animale (0)");
	}
	/*
	 * il procedimento della chiamata del costruttore è il seguente:
	 * nel momento in cui nel main viene chiamato il costruttore con 8 parametri della classe Gatto,
	 * prima di entrare nel costruttore con 8 parametri della classe Gatto, 
	 * viene chiamato per primo il costruttore della classe Animale,
	 * poi viene chiamato il costruttore con 8 parametri della classe Gatto,
	 * e questo succede perchè la classe Gatto estende la classe Animale,
	 *  quindi prima di entrare nel costruttore con 8 parametri della classe Gatto,
	 *  viene chiamato per primo il costruttore della classe Animale,
	 *  
	 *  *  se invece nel main viene chiamato il costruttore con 0 parametri della classe Gatto,
	 *   prima di entrare nel costruttore con 0 parametri della classe Gatto,
	 *   viene chiamato per primo il costruttore della classe Animale,
	 *   poi viene chiamato il costruttore con 8 parametri della classe Gatto,
	 *   quindi non appena chiamiamo il costruttore della sotto classe, in questo caso gatto,
	 *   viene chiamato per primo il costruttore della super classe, in questo caso Animale,
	 *   per poi ritornare nella sottoclasse e chiamare il costruttore con 8 parametri,
	 *    che inizializza tutte le variabili d'istanza con i valori di default,
	 */
	
	public Animale(String nome,
				   Sesso sesso,
				   byte anni,
				   float altezza,
				   float peso,
				   ColoreOcchi coloreOcchi) {
		
		this.setNome(nome);
		this.setSesso(sesso);
		this.setAnni(anni);
		this.setAltezza(altezza);
		this.setPeso(peso);
		this.setColoreOcchi(coloreOcchi);
	    System.out.println("Animale (6)");
	    
	    /*
	     * con questo costruttore stiamo inizializzando tutte le variabili in comune con le sottoclassi
	     * questo ci consente di non scrivere più volte il codice nelle sotto classi,
	     * e di conseguenza di alleggerire il codice nelle sotto classi
	     * 
	     * quindi nelle sotto classi rimangono solo le variabili specifiche della sottoclasse stessa
	     * es: in gatto rimarrà solo il colore del pelo e la razza, mentre tutte le variabili in comune con la super classe Animale,
	     * 
	     * stessa cosa per la classe EssereUmano, rimarranno solo le variabili specifiche della classe EssereUmano, 
	     * come il colore dei capelli e la nazione di nascita,
	     */
	}
	
	//metodi getter/setter
	public String getNome() {
		return nome;
	}
	
	public abstract void setNome(String nome);
	
	/*
	 * con la parola chiave "abstract" stiamo dichiarando un metodo astratto,
	 * in qualche modo obbliga le classi che estendono la classe Animale a implementare il metodo set nome,
	 * cioè a scrivere il metodo set nome nelle sottoClassi, altrimenti non potrebbero essere istanziate,
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
	
	public abstract void setAnni(byte anni);
	
	public float getAltezza() {
		return altezza;
	}
	
	public abstract void setAltezza(float altezza);
	
	public float getPeso() {
		return peso;
	}

	public abstract void setPeso(float peso);
	
	public ColoreOcchi getColoreOcchi() {
		return coloreOcchi;
	}

	public void setColoreOcchi(ColoreOcchi coloreOcchi) {
		this.coloreOcchi = coloreOcchi;
	}
	
	//Metodi
	
	public abstract void respira();
	
	public abstract void mangia();
	
	public abstract void beve();
	
	/*
	 * con la dicitura public abstract void mangia() stiamo dichiarando un metodo astratto,
	 * in pratica stiamo obbligando alle sotto classi di implementare il metodo mangia,
	 * 
	 * e vero che sia EssereUmano che Gatto mangiano, ma lo fanno in modo diverso,
	 * quindi è giusto che ogni classe implementi il metodo mangia in modo diverso,
	 * 
	 * stessa cosa per respira e beve, anche se sia EssereUmano che Gatto respirano e bevono, lo fanno in modo diverso,
	 */
	
	//1
	//public abstract void dorme();
	
	//2
	public void dorme()
	{
		System.out.println("Questo animale è in uno stato in cui non si è coscienti e ci si riposa");
	}

	public void stampa() {
		System.out.println("--------------------------");
		System.out.println("nome: " + this.getNome());
		System.out.println("sesso: " + this.getSesso());
		System.out.println("anni: " + this.getAnni());
		System.out.println("altezza: " + this.getAltezza());
		System.out.println("peso: " + this.getPeso());
		System.out.println("colore occhi: " + this.getColoreOcchi());
		System.out.println("--------------------------");
	}
	
	
}
