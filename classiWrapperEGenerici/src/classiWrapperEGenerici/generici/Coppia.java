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
		System.out.println("Coppia -> setSecondoMembro()"); 
		this.secondoMembro = secondoMembro;
	}
	
	
	
//	public void setSecondoMembro(Object secondoMembro) {
//		System.out.println("Coppia -> setSecondoMembro()"); 
//		this.secondoMembro = secondoMembro;
//	}
	/*
	 * dopo la type erasure, il metodo setSecondoMembro(Object secondoMembro) diventa un metodo ponte ( bridge method), creato dal compilatore,
	 * cioè anche se abbiamo usato l'Override nella classe IntervalloDiTempo, il metodo setSecondoMembro(Object secondoMembro) è ancora presente nella classe Coppia,
	 *  e viene chiamato quando si chiama il metodo setSecondoMembro() sulla classe IntervalloDiTempo.
	 *  
	 *  quindi diventano due metodi distinti, uno con la firma setSecondoMembro(LocalDate secondoMembro) e l'altro con la firma setSecondoMembro(Object secondoMembro),
	 *  
	 *  con ( bridge method), il compilatore crea un metodo ponte che ha la stessa firma del metodo originale, ma che chiama il metodo sovrascritto con il tipo corretto.
	 *  in parole semplici, il metodo ponte è un metodo che viene creato dal compilatore per garantire la compatibilità tra i metodi sovrascritti e i metodi originali,
	 *  cioè quando si sovrascrive un metodo con un tipo specifico,
	 *   il compilatore crea un metodo ponte che ha la stessa firma del metodo originale, ma che chiama il metodo sovrascritto con il tipo corretto.
	 */
	
	
	//metodi
	@Override
	public String toString() {
		return "( " + this.primoMembro + ", " + this.secondoMembro + " ) ";
	}

}
