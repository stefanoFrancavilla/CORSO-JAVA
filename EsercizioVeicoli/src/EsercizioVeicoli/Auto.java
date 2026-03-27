package EsercizioVeicoli;

public class Auto extends Mezzo {
	//variabili di istanza
	
private int cilindrata;
private int numeroPorte;

//costruttore

public Auto(String marca, String modello, int cilindrata, int numeroPorte)
{
	super(marca, modello);
	this.cilindrata = cilindrata;
	this.numeroPorte = numeroPorte;
}


//metodi getter/setter
public int getCilindrata() {
	return cilindrata;
}

public void setCilindrata(int cilindrata) {
	this.cilindrata = cilindrata;
}

public int getNumeroPorte() {
	return numeroPorte;
}

public void setNumeroPorte(int numeroPorte) {
	this.numeroPorte = numeroPorte;
}



//metodi

@Override
public void mostraInfo() {
	// TODO Auto-generated method stub
	System.out.println("marca auto " + marca + " " + modello + " cilidrata " + cilindrata + " numero porte " + numeroPorte);
}


@Override
public int getNumeroruote() {
	// TODO Auto-generated method stub
	return 4;
}


}
