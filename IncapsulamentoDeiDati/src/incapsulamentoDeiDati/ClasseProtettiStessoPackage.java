package incapsulamentoDeiDati;

public class ClasseProtettiStessoPackage {

	protected String nome;
	protected String cognome;
	protected byte anni;
	
	public ClasseProtettiStessoPackage() {
		
	}
	
	protected void stampa() {
		System.out.println("nome: " + nome);
	
	}
}
