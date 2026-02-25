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
//	this("ND", "ND", Sesso.SCONOSCIUTO, (byte)0, 100f, 35f, ColoreOcchi.SCONOSCIUTO, ColoreCapelli.SCONOSCIUTO, "ND");
//	/*
//	 * quando chiamiamo il costruttore senza parametri, il this richiama il costruttore con parametri
//	 * e assegna dei valori di default alle variabili d'istanza.
//	 * in questo modo evitiamo di scrivere codice duplicato.
//	 * il this deve essere la prima istruzione del costruttore.
//	 */
//	System.out.println("EssereUmano (0)"); // per vedere quale costruttore viene chiamato
//}
//
//public EssereUmano(String nome, 
//		String cognome,
//		Sesso sesso)
//{
//	this(nome, cognome, sesso, (byte)0, 100f, 35f, ColoreOcchi.SCONOSCIUTO, ColoreCapelli.SCONOSCIUTO, "ND");
//	// per vedere quale costruttore viene chiamato
//	// this richiama il costruttore con 9 parametri
//	// e assegna dei valori di default alle variabili d'istanza non inizializzate.
//	// il this deve essere la prima istruzione del costruttore.
//	System.out.println("EssereUmano (3)");
////	this.nome = nome; 
////	this.cognome = cognome; 
////	this.sesso = sesso;
//}
//
//// 3
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
//	System.out.println("EssereUmano (9)"); // per vedere quale costruttore viene chiamato
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

//4
public class EssereUmano {
	
	// Varialbili d'istanza.
	 
private String nome; 
private String cognome; 
private Sesso sesso; 
private byte anni;
private float altezza;
private float peso;
private ColoreOcchi coloreOcchi;
private ColoreCapelli coloreCapelli;
private String nazioneDiNascita;


//Costanti.
private final byte min_anni = 0; // età minima in anni
private final byte max_anni = 	Byte.MAX_VALUE; // età massima in anni, usiamo il valore massimo di byte perché la variabile anni è di tipo byte
private final byte default_anni = 18; // età di default in anni

private final float min_altezza = 20f; // altezza minima in cm
private final float max_altezza = 250f; // altezza massima in cm
private final float default_altezza = 100f; // altezza di default in cm

private final float min_peso = 35f; // peso minimo in kg
private final float max_peso = 600f; // peso massimo in kg
private final float default_peso = 40f; // peso di default in kg


/*
 * queste costanti ci permettono di modificare in futuro il range di altezza senza dover cambiare il valore nei metodi setter.
 * in questo modo rendiamo il codice più flessibile e manutenibile.
 * una manovra che ci consente di modificare ed evitare eventuali errori di dimenticanza di modificare il valore in tutti
 *  i metodi setter che usano il range di altezza.
 */

/*
 * con private intendiamo che le variabili d'istanza sono accessibili solo all'interno della classe EssereUmano
 * in questo modo proteggiamo i dati dell'oggetto e impediamo l'accesso diretto dall'esterno della classe
 * per accedere alle variabili d'istanza dall'esterno della classe, si usano i metodi getter e setter
 * i metodi getter e setter sono dei metodi pubblici che permettono di accedere e modificare le variabili d'istanza private
 * i metodi getter e setter sono usati per controllare i dati inseriti negli oggetti e per evitare di inserire dati non realistici
 * ad esempio, con i metodi setter possiamo inserire dei controlli sui dati inseriti, come ad esempio non permettere di inserire età negative o altezze e pesi irrealistici.
 * mentre con i metodi getter possiamo restituire i valori delle variabili d'istanza private all'esterno della classe.
 */
// Costruttori


public EssereUmano()
{
	this("ND", "ND", Sesso.SCONOSCIUTO, (byte)0, 0f, 0f, ColoreOcchi.SCONOSCIUTO, ColoreCapelli.SCONOSCIUTO, "ND");
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
	this(nome, cognome, sesso, (byte)0, 0f, 0f, ColoreOcchi.SCONOSCIUTO, ColoreCapelli.SCONOSCIUTO, "ND");
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
	//this.nome = nome; // uso la parola chiave this per distinguere la variabile d'istanza dal parametro
	this.setNome(nome); // invece di assegnare direttamente il valore del parametro nome alla variabile d'istanza nome, usiamo il metodo setter setNome(nome) per controllare il valore inserito.
	this.cognome = cognome; 
	this.sesso = sesso;
	
	//1
//	this.anni = anni;
//	this.altezza = altezza;
//	this.peso = peso;
	/*
	 * usando this.altezza e this.peso, stiamo accedendo alle variabili d'istanza altezza e peso dell'oggetto corrente
	 * quindi quando assegnamo il valore del parametro altezza alla variabile d'istanza altezza, 
	 * stiamo modificando il valore della variabile d'istanza altezza dell'oggetto corrente.
	 * ed il valore non viene controllato, quindi è possibile inserire valori non realistici per l'altezza e il peso di un essere umano.
	 */
	
//
	this.setAnni(anni);
	this.setAltezza(altezza);
	this.setPeso(peso);
	/*
	 * invece usando stetAltezza(altezza) e setPeso(peso), 
	 * stiamo chiamando i metodi setter che abbiamo definito per le variabili d'istanza altezza e peso
	 * quindi il valore inserito dovrà passare attraverso i controlli che abbiamo inserito nei metodi setter,
	 */
	
	this.coloreOcchi = coloreOcchi;
	this.coloreCapelli = coloreCapelli;
	this.nazioneDiNascita = nazioneDiNascita;
	// this si riferisce all'oggetto corrente
	// viene usato per accedere alle variabili d'istanza e ai metodi dell'oggetto corrente
	// si usa quando c'è ambiguità tra variabili d'istanza e parametri
	// in questo caso i nomi sono uguali
	// quindi per distinguere si usa this.
	// questo è un'altro modo per scrivere i costruttori.
}

//Metodi getter e setter

public String getNome() {
	//return this.nome;
	return nome;
}
/*
 * il metodo getter restituisce il valore della variabile d'istanza nome
 * il metodo getter non ha parametri
 * il metodo getter ha come tipo di ritorno lo stesso tipo della variabile d'istanza
 * il metodo getter è pubblico per permettere l'accesso dall'esterno della classe
 * il metodo getter non modifica il valore della variabile d'istanza
 * il metodo getter può essere usato per restituire il valore della variabile d'istanza in modo controllato
 * ad esempio, possiamo restituire il valore della variabile d'istanza solo se soddisfa determinate condizioni
 * ad esempio, possiamo restituire il valore della variabile d'istanza solo se non è null o vuota
 * in questo modo evitiamo di restituire valori non validi
 */

public void setNome(String nome) {
	
	boolean nomeCorretto = true;
	
	if (verificaCratteri("1234567890!?@", nome)) 
	{
		System.out.println("nome non consono");
		
		nomeCorretto = false;
		
	  /*  if ( this.nome == null)
		{
			System.out.println(this.nome + " è null");
			
			this.nome = "ND"; // se il nome è null, assegniamo un valore di default "ND" alla variabile d'istanza nome.
		}
		else if (!("ND".equals(this.nome))) // se il nome corrente dell'oggetto non è "ND", manteniamo il valore corrente di nome.
			// se this.nome è diverso da "ND", significa che il nome corrente dell'oggetto è valido, e quindi manteniamo il valore corrente di nome.
			
		{
			System.out.println(this.nome + " è un nome sensato.");
		}*/
		
		//this.nome = "ND"; // se il nome contiene caratteri non validi, assegniamo un valore di default "ND" alla variabile d'istanza nome.
	}
	else if ( verificaLunghezza(nome, 15))
	{
		System.out.println("nome troppo lungo");
		
		nomeCorretto = false;
	/*	if ( this.nome == null)
		{
			System.out.println(this.nome + " è null 2");
			
			this.nome = "ND"; 
		}
		else if (!("ND".equals(this.nome))) 
			
			
		{
			System.out.println(this.nome + " è un nome sensato 2.");
		}*/
	}
	
	if(nomeCorretto == true) // se il nome è corretto, lo assegniamo alla variabile d'istanza nome
	{
		System.out.println("nome ok");
		this.nome = nome;
	}
	else if ( this.nome == null)
	{
		System.out.println(this.nome + " è null ");
		
		this.nome = "ND"; 
	}
	else if (!("ND".equals(this.nome))) 
		
		
	{
		System.out.println(this.nome + " è un nome sensato .");
	}
	
	/*
	 * scriverlo in questo modo ci consente di modificare solo una parte del codice in caso di errori
	 * in questo modo evitiamo di inserire codice duplicato, e rendiamo il codice più leggibile e manutenibile.
	 */
	
/*	else
	{
		System.out.println("nome ok");
		this.nome = nome;
		// se il nome è valido, lo assegniamo alla variabile d'istanza nome
	}*/
	// con questo metodo di verifica, stiamo controllando se la stringa nome contiene solo caratteri validi, ovvero lettere e spazi, e non contiene numeri o caratteri speciali.
}
/*
 * il metodo setter modifica il valore della variabile d'istanza nome
 * il metodo setter ha come tipo di ritorno void
 * il metodo setter ha come parametro lo stesso tipo della variabile d'istanza
 * il metodo setter è pubblico per permettere l'accesso dall'esterno della classe
 * il metodo setter può essere usato per modificare il valore della variabile d'istanza in modo controllato
 * ad esempio, possiamo inserire dei controlli sul valore del parametro prima di assegnarlo alla variabile d'istanza
 * ad esempio, possiamo non permettere di assegnare valori null o vuoti alla variabile d'istanza
 * in questo modo evitiamo di inserire valori non validi
 */


public String getCognome() {
	return cognome;
}

public void setCognome(String cognome) {
	this.cognome = cognome;
}

public Sesso getSesso() {
	return sesso;
}

public void setSesso(Sesso sesso) {
	this.sesso = sesso;
}

public byte getAnni() {
	return anni;
}

public void setAnni(byte anni) {
	System.out.println("max anni: " + max_anni);
	
	if(anni >= min_anni && anni <= max_anni) // per dare una misura reale a essere umano abbiamo inserito un controllo sull'età, 
	{
		this.anni = anni;
		System.out.println(this.anni + " anni inizializzati");
	}
	else
	{
		if (this.anni >= min_anni && this.anni <= max_anni) // se l'età corrente dell'oggetto rientra nel range di età valido per un essere umano, manteniamo il valore corrente di anni.
		{
			System.out.println(this.anni + " anni validi da prima.");
		}
		else
		{
			this.anni = default_anni; // se viene inserito un valore non valido, assegniamo un valore di default di 18 anni.
			System.out.println(this.anni + " anni assegnati di default.");
		}
	}
}

public float getAltezza() {
	return altezza;
	
}

public void setAltezza(float altezza) {
	
	if(altezza > min_altezza && altezza < max_altezza) // per dare una misura reale a essere umano abbiamo inserito un controllo sull'altezza, 
	{                                 //che deve essere compresa tra 20 cm e 250 cm.
		this.altezza = altezza;
		System.out.println(this.altezza + " altezza inizializzata");
	}
	/*
	 * quindi con questo controllo evitiamo di inserire valori che non sono realistici per un'essere umano
	 */
	else
	{
		//quello che chiedo è: se l'altezza corrente(this.altezza) rientra nel range
		if (this.altezza > min_altezza && this.altezza < max_altezza)
		{
			System.out.println(this.altezza + " altezza valida da prima.");
		//se rientra nel range ,manderà a schermo il valore di this.altezza
		}
		// altrimenti se anche l'altezza corrente dell'oggetto non è valida, assegniamo un valore di default di 100 cm.
		else
		{
			this.altezza = default_altezza; // se viene inserito un valore non valido, assegniamo un valore di default di 100 cm.
			System.out.println(this.altezza + " altezza assegnata di default.");
		}
		//System.out.println(altezza + " non è un'altezza valida per un essere umano");
	}
}

public float getPeso() {
	return peso;
}

public void setPeso(float peso) {
	
	if(peso > min_peso && peso < max_peso)
	{
		this.peso = peso;
		System.out.println(this.peso + " peso inizializzato");
	}
	else
	{
		//if(this.getPeso() < min_peso && this.getPeso() > max_peso)
		/*
		 * e possibile chiedere anche con getPeso() se il peso corrente dell'oggetto rientra nel range di peso valido per un essere umano
		 * sono due modi diversi per fare lo stesso controllo, ma in questo caso è più semplice usare this.peso
		 *  invece di this.getPeso() perché getPeso() restituisce il valore di peso e quindi è più lungo da scrivere.
		 */
		
		//System.out.println(peso + " non è un peso valido per un essere umano");
		if (this.peso > min_peso && this.peso < max_peso)
		{
			System.out.println(this.peso + " peso valido da prima.");
			//se rientra nel range ,manderà a schermo il valore di this.peso
		}
		else
		{
			this.peso = default_peso; // se viene inserito un valore non valido, assegniamo un valore di default di 35 kg.
			System.out.println(this.peso + " peso assegnato di default.");
		}
	}
	
	
}

public ColoreOcchi getColoreOcchi() {
	return coloreOcchi;
}

public void setColoreOcchi(ColoreOcchi coloreOcchi) {
	this.coloreOcchi = coloreOcchi;
}

public ColoreCapelli getColoreCapelli() {
	return coloreCapelli;
}

public void setColoreCapelli(ColoreCapelli coloreCapelli) {
	this.coloreCapelli = coloreCapelli;
}

public String getNazioneDiNascita() {
	return nazioneDiNascita;
}

public void setNazioneDiNascita(String nazioneDiNascita) {
	this.nazioneDiNascita = nazioneDiNascita;
}
//metodi di verifica.

//sono metodi che servono a verificare i dati di input inseriti nei metodi setter, e a restituire un messaggio di errore se i dati non sono validi.
//saranno privati poichè solo i metodi setter all'interno della classe possono accedere a questi metodi di verifica, e non devono essere accessibili dall'esterno della classe.

private boolean verificaCratteri(String caratteri, String s) {
	// caratteri = 1234567890!?@
	//vogliamo controllare se la stringa s contiene solo caratteri validi, ovvero lettere e spazi, e non contiene numeri o caratteri speciali.
	//se restituisce true, significa che all'interno della stringa ci sono caratteri non validi, mentre se restituisce false, significa che la stringa è valida.
	
	boolean presente = false;
	for (int i = 0; i < caratteri.length(); i++) 
	{
		char carattereCorrente = caratteri.charAt(i);
		System.out.println("carattereCorrente" +  carattereCorrente);
		
		if (s.indexOf(caratteri.charAt(i)) != -1) // se il carattere presente nella stringa caratteri è presente anche nella stringa s, allora restituisco true.
			//se non ci restituisce -1 allora significa che il carattere è presente nella stringa caratteri 
			                                      //mentre se il carattere controllato da indexOf non è presente nella stringa s, restituisce -1, e quindi non entra nell'if.
			                                       //quindi se troviamo un carattere non valido, impostiamo la variabile presente a true
		{
			presente = true;
			break; // se troviamo un carattere non valido, usciamo dal ciclo for per evitare di continuare a controllare gli altri caratteri.
			
			/*
			 * con questo if stiamo controllando se la stringa s contiene un carattere non valido, ovvero un carattere presente nella stringa caratteri.
			 * s.indexOf(caratteri.charAt(i)) restituisce l'indice del primo carattere presente nella stringa s, se il carattere è presente, altrimenti restituisce -1.
			 * quindi se s.indexOf(caratteri.charAt(i)) != -1, significa che il carattere è presente nella stringa s, e quindi la stringa s non è valida.
			 * mentre con caratteri.chaAt(i) stiamo prendendo il carattere presente nella stringa caratteri alla posizione i, e lo stiamo confrontando con la stringa s.
			 * se troviamo un carattere non valido, impostiamo la variabile presente a true
			 */
		}
	}
	return presente;
}


private boolean verificaLunghezza(String s, int  limit)
{
	boolean troppoLunga = false;
	
	if (s.length() > limit) 
	    troppoLunga = true;
	return troppoLunga;
}
/*
 * con questo metodo stiamo controllando se la stringa s è troppo lunga, ovvero se la sua lunghezza è maggiore di un limite specificato.
 * se s.length() > limit, significa che la stringa s è troppo lunga, e quindi restituiamo true, altrimenti restituiamo false.
 * questo metodo può essere usato ad esempio per controllare la lunghezza di una stringa inserita nei metodi setter, come ad esempio il nome o il cognome, per evitare di inserire stringhe troppo lunghe che potrebbero non essere realistiche per un essere umano.
 */


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
	System.out.println("Colore Occhi: " + coloreOcchi);
	System.out.println("Colore Capelli: " + coloreCapelli);
	System.out.println("Nazione di Nascita: " + nazioneDiNascita);
	System.out.println("----------");
    
 }

}