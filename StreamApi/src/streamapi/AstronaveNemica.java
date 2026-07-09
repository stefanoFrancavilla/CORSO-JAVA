package streamapi;

public class AstronaveNemica {

	private final int numeroDiProiettili;
	
	public AstronaveNemica()
	{
		this.numeroDiProiettili = (int)  (Math.random() * 100); // genera un numero casuale tra 0 e 99
	}

	public int getNumeroDiProiettili() {
		return numeroDiProiettili;
	}
	
	
}
