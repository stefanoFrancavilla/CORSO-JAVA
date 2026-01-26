package incapsulamentoDeiDati;

public class EssereUmano {
	
	// Varialbili d'istanza.
	/*
	 * eseere umano ha delle caratteristiche che lo definiscono
	 * queste caratteristiche sono rappresentate dalle variabili d'istanza
	 * le variabili d'istanza sono dichiarate all'interno della classe
	 * ma fuori da qualsiasi metodo.
	 */
public String nome; 
public String cognome; 
public Sesso sesso; // qui si usa l'enum Sesso definito in un altro file.
public byte anni;
public float altezza;
public float peso;
public ColoreOcchi coloreOccihi;
public ColoreCapelli coloreCapelli;
public String nazioneDiNascita;

// Costruttori

/*
 * Il costruttore è una funzione , che deve avere lo stesso nome della classe
 * è una funzione speciale che viene chiamata quando si crea un oggetto della classe.
 * serve per inizializzare le variabili d'istanza.
 * Non ha un tipo di ritorno.
 * Può avere parametri.
 * si usa la parola chiave "new" per creare un oggetto della classe.
 * Se non viene definito un costruttore, Java ne crea uno di default senza parametri.
 * ogni essere umano potrà compiere o subire delle azioni.
 * 
 */
public EssereUmano() {
	
	// con la parola metodo si fa riferimento ad una funzione che appartiene ad una classe.
}

public void beve() {
	System.out.println(nome + " " + cognome + " beve");
}

public void mangia() {
	System.out.println(nome + " " + cognome + " mangia");
}

public void respira() {
	System.out.println(nome + " " + cognome + " respira");
}

public void dorme() {
	System.out.println(nome + " " + cognome + " dorme");
}

public void studia() {
	System.out.println(nome + " " + cognome + " studia");
}

public void lavora() {
	System.out.println(nome + " " + cognome + " lavora");
}

public void stampa() {
	System.out.println("----------");
	System.out.println("Nome: " + nome);
	System.out.println("Cognome: " + cognome);
	System.out.println("Sesso: " + sesso);
	System.out.println("Anni: " + anni);
	System.out.println("Altezza: " + altezza);
	System.out.println("Peso: " + peso);
	System.out.println("Colore Occhi: " + coloreOccihi);
	System.out.println("Colore Capelli: " + coloreCapelli);
	System.out.println("Nazione di Nascita: " + nazioneDiNascita);
	System.out.println("----------");
    
}
/* public significa che il metodo o la variabile è accessibile da qualsiasi altra classe.
 * mentre per i metodi public va bene , per le variabili d'istanza è meglio non usarlo
 * perché permette di accedere direttamente alle variabili dall'esterno della classe
 * cosa che va contro il principio di incapsulamento dei dati.
 *
 * private significa che il metodo o la variabile è accessibile solo all'interno della classe.
 * qui sotto un esempio di variabile privata.
 */
}
