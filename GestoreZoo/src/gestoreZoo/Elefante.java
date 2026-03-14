package gestoreZoo;

public class Elefante extends Mammifero {
	//variabili di istanza
private boolean proboscide;

//costruttore

public Elefante(String nome, double peso, boolean haPelo, boolean proboscide) {
	super(nome, peso, haPelo);
	this.proboscide = true;
}

//metodi getter/setter
public boolean isProboscide() {
	return proboscide;
}

public void setProboscide(boolean proboscide) {
	this.proboscide = proboscide;
}

//metodi
@Override

public void mangia() {
	System.out.println("L'elefante usa la proboscide!");
 }
}
