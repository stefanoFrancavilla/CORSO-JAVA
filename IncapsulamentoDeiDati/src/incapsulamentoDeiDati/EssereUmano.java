package incapsulamentoDeiDati;

//1
/*
public class EssereUmano {
	
	// Varialbili d'istanza.
	/*
	 * eseere umano ha delle caratteristiche che lo definiscono
	 * queste caratteristiche sono rappresentate dalle variabili d'istanza
	 * le variabili d'istanza sono dichiarate all'interno della classe
	 * ma fuori da qualsiasi metodo.
	 */
/*public String nome; 
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
/*public EssereUmano() {
	
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
 *
}
*/

//2

//public class EssereUmano {
//	
//	// Varialbili d'istanza.
//	 
//public String nome; 
//public String cognome; 
//public Sesso sesso; 
//public byte anni;
//public float altezza;
//public float peso;
//public ColoreOcchi coloreOccihi;
//public ColoreCapelli coloreCapelli;
//public String nazioneDiNascita;
//
//// Costruttori
//
//
//public EssereUmano()
//{
//	
//	
//}
//// 2.1
////public EssereUmano(String pNome,
////		String pCognome,
////		Sesso pSesso,
////		byte pAnni,
////		float pAltezza,
////		float pPeso,
////		ColoreOcchi pColoreOcchi,
////		ColoreCapelli pColoreCapelli,
////		String pNazioneDiNascita
////		)
/////*
//// * nelle parentesi del costruttore ci sono i parametri
//// * i parametri sono delle variabili locali che servono per inizializzare le variabili d'istanza
//// * i parametri hanno lo stesso tipo delle variabili d'istanza
//// * i parametri hanno nomi diversi dalle variabili d'istanza per evitare ambiguità
//// */
////{
////	nome = pNome; // inizializzo la variabile d'istanza nome con il parametro pNome
////	cognome = pCognome; 
////	sesso = pSesso;
////	anni = pAnni;
////	altezza = pAltezza;
////	peso = pPeso;
////	coloreOccihi = pColoreOcchi;
////	coloreCapelli = pColoreCapelli;
////	nazioneDiNascita = pNazioneDiNascita;
//	
//// 2.2
//public EssereUmano(String nome,
//		String cognome,
//		Sesso sesso,
//		byte anni,
//		float altezza,
//		float peso,
//		ColoreOcchi coloreOcchi,
//		ColoreCapelli coloreCapelli,
//		String nazioneDiNascita
//		)
//
//{
//	this.nome = nome; // uso la parola chiave this per distinguere la variabile d'istanza dal parametro
//	this.cognome = cognome; 
//	this.sesso = sesso;
//	this.anni = anni;
//	this.altezza = altezza;
//	this.peso = peso;
//	this.coloreOccihi = coloreOcchi;
//	this.coloreCapelli = coloreCapelli;
//	this.nazioneDiNascita = nazioneDiNascita;
//	// this si riferisce all'oggetto corrente
//	// viene usato per accedere alle variabili d'istanza e ai metodi dell'oggetto corrente
//	// si usa quando c'è ambiguità tra variabili d'istanza e parametri
//	// in questo caso i nomi sono uguali
//	// quindi per distinguere si usa this.
//	// questo è un'altro modo per scrivere i costruttori.
//}
//
//// Metodi
//public void beve() 
//{
//	System.out.println(nome + " " + cognome + " beve");
//}
//
//public void mangia() 
//{
//	System.out.println(nome + " " + cognome + " mangia");
//}
//
//public void respira() 
//{
//	System.out.println(nome + " " + cognome + " respira");
//}
//
//public void dorme()
//{
//	System.out.println(nome + " " + cognome + " dorme");
//}
//
//public void studia()
//{
//	System.out.println(nome + " " + cognome + " studia");
//}
//
//public void lavora()
//{
//	System.out.println(nome + " " + cognome + " lavora");
//}
//
//public void stampa() 
//{
//	System.out.println("----------");
//	System.out.println("Nome: " + nome);
//	System.out.println("Cognome: " + cognome);
//	System.out.println("Sesso: " + sesso);
//	System.out.println("Anni: " + anni);
//	System.out.println("Altezza: " + altezza);
//	System.out.println("Peso: " + peso);
//	System.out.println("Colore Occhi: " + coloreOccihi);
//	System.out.println("Colore Capelli: " + coloreCapelli);
//	System.out.println("Nazione di Nascita: " + nazioneDiNascita);
//	System.out.println("----------");
//    
// }
//
//}

public class EssereUmano {
	
	// Varialbili d'istanza.
	 
public String nome; 
public String cognome; 
public Sesso sesso; 
public byte anni;
public float altezza;
public float peso;
public ColoreOcchi coloreOccihi;
public ColoreCapelli coloreCapelli;
public String nazioneDiNascita;

// Costruttori


public EssereUmano()
{
	this("ND", "ND", Sesso.SCONOSCIUTO, (byte)0, 100f, 35f, ColoreOcchi.SCONOSCIUTO, ColoreCapelli.SCONOSCIUTO, "ND");
	/*
	 * quando chiamiamo il costruttore senza parametri, il this richiama il costruttore con parametri
	 * e assegna dei valori di default alle variabili d'istanza.
	 * in questo modo evitiamo di scrivere codice duplicato.
	 * il this deve essere la prima istruzione del costruttore.
	 */
	System.out.println("EssereUmano (0)"); // per vedere quale costruttore viene chiamato
}

public EssereUmano(String nome, 
		String cognome,
		Sesso sesso)
{
	this(nome, cognome, sesso, (byte)0, 100f, 35f, ColoreOcchi.SCONOSCIUTO, ColoreCapelli.SCONOSCIUTO, "ND");
	// per vedere quale costruttore viene chiamato
	// this richiama il costruttore con 9 parametri
	// e assegna dei valori di default alle variabili d'istanza non inizializzate.
	// il this deve essere la prima istruzione del costruttore.
	System.out.println("EssereUmano (3)");
//	this.nome = nome; 
//	this.cognome = cognome; 
//	this.sesso = sesso;
}

// 3
public EssereUmano(String nome,
		String cognome,
		Sesso sesso,
		byte anni,
		float altezza,
		float peso,
		ColoreOcchi coloreOcchi,
		ColoreCapelli coloreCapelli,
		String nazioneDiNascita
		)

{
	System.out.println("EssereUmano (9)"); // per vedere quale costruttore viene chiamato
	this.nome = nome; // uso la parola chiave this per distinguere la variabile d'istanza dal parametro
	this.cognome = cognome; 
	this.sesso = sesso;
	this.anni = anni;
	this.altezza = altezza;
	this.peso = peso;
	this.coloreOccihi = coloreOcchi;
	this.coloreCapelli = coloreCapelli;
	this.nazioneDiNascita = nazioneDiNascita;
	// this si riferisce all'oggetto corrente
	// viene usato per accedere alle variabili d'istanza e ai metodi dell'oggetto corrente
	// si usa quando c'è ambiguità tra variabili d'istanza e parametri
	// in questo caso i nomi sono uguali
	// quindi per distinguere si usa this.
	// questo è un'altro modo per scrivere i costruttori.
}

// Metodi
public void beve() 
{
	System.out.println(nome + " " + cognome + " beve");
}

public void mangia() 
{
	System.out.println(nome + " " + cognome + " mangia");
}

public void respira() 
{
	System.out.println(nome + " " + cognome + " respira");
}

public void dorme()
{
	System.out.println(nome + " " + cognome + " dorme");
}

public void studia()
{
	System.out.println(nome + " " + cognome + " studia");
}

public void lavora()
{
	System.out.println(nome + " " + cognome + " lavora");
}

public void stampa() 
{
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

}
