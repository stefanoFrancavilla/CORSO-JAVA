package Argomento2_Set;

public class Pianta {

	private int codicePianta;
	private String nome;
	private String specie;
	private boolean sempreVerde;
	
	//costruttore
	public Pianta(int codicePianta, String nome, String specie, boolean sempreVerde) {
	
		setCodicePianta(codicePianta);
		setNome(nome);
		setSpecie(specie);
	    this.sempreVerde = sempreVerde;
	}

	//metodi getter setter
	public int getCodicePianta() {
		return codicePianta;
	}

	public void setCodicePianta(int codicePianta) {
		if (codicePianta <= 0)
		{
			System.out.println("Il codice pianta deve essere superiore a 0");
			return;
		}
		else
		{
			this.codicePianta = codicePianta;
		}
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if ( nome == null || nome.isBlank())
		{
			System.out.println("Il nome non può essere null o vuoto");
			return;
		}
		else
		{
			this.nome = nome;
		}
		
	}

	public String getSpecie() {
		return specie;
	}

	public void setSpecie(String specie) {
		if (specie == null || specie.isBlank())
		{
			System.out.println("La specie non può essere null o vuota");
			return;
		}
		else
		{
			this.specie = specie;
		}
		
	}

	public boolean isSempreVerde() {
		return sempreVerde;
	}

	public void setSempreVerde(boolean sempreVerde) {
		this.sempreVerde = sempreVerde;
	}

	//metodo to string
	
	@Override
	public String toString() {
		return "Pianta [codicePianta=" + codicePianta + ", nome=" + nome + ", specie=" + specie + ", sempreVerde="
				+ sempreVerde + "]";
	}
	
}
