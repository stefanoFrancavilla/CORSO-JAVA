package Esercizi_avanzati;

public class Studente implements Comparable<Studente>{
	
	private String nome;
	private int media;
	
	public Studente(String nome, int media)
	{
		this.nome =nome ;
		this.media = media;
	}

	public String getNome()
	{
		return nome;
	}
	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public int getMedia() {
		return media;
	}

	public void setMedia(int media) {
		this.media = media;
	}
	
	public int compareTo(Studente s)
	{
		if(this.media < s.getMedia())
			return -1;
		if(this.media > s.getMedia())
			return 1;
		return 0;
	}
}
