package incapsulamentoDeiDati;

public class Gatto {
	// Varialbili d'istanza.
	 
	private String nome; 
	private Sesso sesso; 
	private byte anni;
	private float altezza;
	private float peso;
	private ColoreOcchi coloreOcchi;
	private ColorePeloGatto colorePeloGatto;
	private RazzaGatto razzaGatto;
	
	
	
	
	

	//Costruttore.
	public Gatto() {
		System.out.println("Gatto (0)"); // questo è il costruttore con 0 parametri
	}
	
	    //per generare i metodi getter e setter si può utilizzare il seguente percorso:
		//tasto destro , Source , Generate Getter e Setter	
		
		//oppure si può usare la scorciatoia da tastiera: Alt + Shift + S , R
	
	// Metodi Getter e Setter.
	
		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

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
			this.anni = anni;
		}

		public float getAltezza() {
			return altezza;
		}

		public void setAltezza(float altezza) {
			this.altezza = altezza;
		}

		public float getPeso() {
			return peso;
		}

		public void setPeso(float peso) {
			this.peso = peso;
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

}
