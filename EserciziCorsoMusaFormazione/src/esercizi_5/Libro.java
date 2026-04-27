package esercizi_5;

public class Libro {
//variabili di istanza
String autore;
String titolo;
int annoDiPubblicazione;
int numeroPagine;
String sinossi;


//costruttore
public Libro()
{
	
}

public Libro(String autore, String titolo, int annoDiPubblicazione, int numeroPagine, String sinossi )
{
	this.autore = autore;
	this.titolo = titolo;
	this.annoDiPubblicazione = annoDiPubblicazione;
	this.numeroPagine = numeroPagine;
	this.sinossi = sinossi;
}

//metodi getter/setter
public String getAutore() {
	return autore;
}


public void setAutore(String autore) {
	this.autore = autore;
}


public String getTitolo() {
	return titolo;
}


public void setTitolo(String titolo) {
	this.titolo = titolo;
}


public int getAnnoDiPubblicazione() {
	return annoDiPubblicazione;
}


public void setAnnoDiPubblicazione(int annoDiPubblicazione) {
	this.annoDiPubblicazione = annoDiPubblicazione;
}


public int getNumeroPagine() {
	return numeroPagine;
}


public void setNumeroPagine(int numeroPagine) {
	this.numeroPagine = numeroPagine;
}


public String getSinossi() {
	return sinossi;
}


public void setSinossi(String sinossi) {
	this.sinossi = sinossi;
}

public void stampa()
{
	System.out.println(this.titolo);
	System.out.println(this.autore);
	System.out.println(this.numeroPagine);
	System.out.println(this.annoDiPubblicazione);
	System.out.println(this.sinossi);
}




}
