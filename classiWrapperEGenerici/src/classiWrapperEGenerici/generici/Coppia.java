package classiWrapperEGenerici.generici;

public class Coppia <T> {
	
	/*
	 * La classe Coppia è una classe generica che rappresenta una coppia di oggetti dello stesso tipo.
	 * Il tipo degli oggetti è specificato dal parametro di tipo T, che viene definito al momento della creazione dell'istanza della classe.
	 * La classe Coppia ha due variabili di istanza, primoMembro e secondoMembro, che rappresentano i due oggetti della coppia.
	 * con questa classe possiamo creare coppie di qualsiasi tipo di oggetto,
	 *  ad esempio coppie di interi, coppie di stringhe, coppie di oggetti personalizzati, ecc.
	 *  
	 *  questo ci potrebbe servire ad esempio per rappresentare una coppia di coordinate (x, y),
	 *   una coppia di nomi (nome, cognome), una coppia di oggetti (oggetto1, oggetto2), ecc.
	 */
	
	
	//variabili di istanza
	private T primoMembro;
	private T secondoMembro;
	
	//costruttore
	public Coppia(T primoMembro, T secondoMembro) {
		this.primoMembro = primoMembro;
		this.secondoMembro = secondoMembro;
	}
	
	//metodi getters e setters
	public T getPrimoMembro() {
		return primoMembro;
	}
	
	public void setPrimoMembro(T primoMembro) {
		this.primoMembro = primoMembro;
	}
	
	public T getSecondoMembro() {
		return secondoMembro;
	}
	
	public void setSecondoMembro(T secondoMembro) {
		this.secondoMembro = secondoMembro;
	}
	
	//metodi
	@Override
	public String toString() {
		return "( " + this.primoMembro + ", " + this.secondoMembro + " ) ";
	}

}
