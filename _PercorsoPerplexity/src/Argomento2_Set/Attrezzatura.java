package Argomento2_Set;

public class Attrezzatura {

	private int codiceAttrezzatura;
	private String nome;
	private String categoria;
	private double costoGiornaliero;
	private int numeroGiorniNoleggio;
	private boolean disponibile;
	
	//costruttore
	
	public Attrezzatura(int codiceAttrezzatura, String nome, String categoria, double costoGiornaliero,
			boolean disponibile) {
		
	    setCodiceAttrezzatura(codiceAttrezzatura);
		setNome(nome);
		setCategoria(categoria);
		setCostoGiornaliero(costoGiornaliero);
		this.disponibile = disponibile;
	}

	//metodi getter setter
	public int getCodiceAttrezzatura() {
		return codiceAttrezzatura;
	}

	public void setCodiceAttrezzatura(int codiceAttrezzatura) {
		if (codiceAttrezzatura <= 0)
		{
			return;
		}
		this.codiceAttrezzatura = codiceAttrezzatura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if ( nome == null || nome.isBlank())
		{
			return;
		}
		this.nome = nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		if (categoria == null || categoria.isBlank())
				{
			       return;
				}
		this.categoria = categoria;
	}

	public double getCostoGiornaliero() {
		return costoGiornaliero;
	}

	public void setCostoGiornaliero(double costoGiornaliero) {
		
		if (costoGiornaliero <= 0)
		{
			return;
		}
		this.costoGiornaliero = costoGiornaliero;
	}

	public boolean isDisponibile() {
		return disponibile;
	}

	public void setDisponibile(boolean disponibile) {
		this.disponibile = disponibile;
	}
	

	public int getNumeroGiorniNoleggio() {
		return numeroGiorniNoleggio;
	}

	public void setNumeroGiorniNoleggio(int numeroGiorniNoleggio) {
		this.numeroGiorniNoleggio = numeroGiorniNoleggio;
	}

	//metodo to string
	@Override
	public String toString() {
		return "Attrezzatura [codiceAttrezzatura=" + codiceAttrezzatura + ", nome=" + nome + ", categoria=" + categoria
				+ ", costoGiornaliero=" + costoGiornaliero + ", disponibile=" + disponibile + "]";
	}
}
