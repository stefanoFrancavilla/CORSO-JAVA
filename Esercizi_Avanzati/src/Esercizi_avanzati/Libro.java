package Esercizi_avanzati;

public class Libro implements Comparable<Libro> {

	private String titolo;
	private int numeroPagine;
	
	
	public Libro(String titolo, int numeroPagine)
	{
		this.titolo = titolo;
		this.numeroPagine = numeroPagine;
	}


	public String getTitolo() {
		return titolo;
	}


	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}


	public int getNumeroPagine() {
		return numeroPagine;
	}


	public void setNumeroPagine(int numeroPagine) {
		this.numeroPagine = numeroPagine;
	}


	public int compareTo(Libro l)
	{
		if(this.numeroPagine < l.numeroPagine)
			return -1;
		
		if(this.numeroPagine > l.numeroPagine)
			return +1;
		return 0;
	}
}
