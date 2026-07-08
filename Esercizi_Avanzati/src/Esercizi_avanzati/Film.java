package Esercizi_avanzati;

public class Film implements Comparable<Film> {
	
	private String titolo;
	private int anno;
	
	public Film(String titolo, int anno)
	{
		this.titolo = titolo;
		this.anno = anno;
		
	}

	public String getTitolo()
	{
		return titolo;
	}
	
	public void setTitolo(String titolo)
	{
		this.titolo = titolo;
	}

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}
	
	public int compareTo(Film f )
	{
		if (this.anno < f.getAnno())
			return -1;
		
		if (this.anno > f.getAnno())
			return 1;
		return 0;
		
	}
}
