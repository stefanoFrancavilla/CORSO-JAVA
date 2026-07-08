package esame1;

public class Prodotti implements Comparable<Prodotti> {

	private String nome;
	private double prezzo;
	
	public Prodotti(String nome, double prezzo)
	{
		this.nome = nome;
		this.prezzo = prezzo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	
    @Override
    public int compareTo(Prodotti altro) {
        if (this.prezzo < altro.prezzo) {
            return -1;
        } else if (this.prezzo > altro.prezzo) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return nome + " - " + prezzo + " €";
    }
}
