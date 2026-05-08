package incapsulamentoDeiDati;
import java.time.LocalDate;
import java.time.Month;

import incapsulamentoDeiDati.utilities.Calcolo;
import incapsulamentoDeiDati.utilities.Verifica;
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
public class EssereUmano extends Animale implements IVolatile {
	
	/*
	 * con la parola chiave extends, stiamo dichiarando che la classe EssereUmano
	 *  è una sottoclasse della classe Animale,
	 *  
	 *  mentre con la parola chiave implements, stiamo dichiarando che la classe EssereUmano
	 *  implementa l'interfaccia IVolatile,
	 *   quindi deve implementare tutti i metodi dichiarati nell'interfaccia IVolatile,
	 *   
	 *   questo perchè in java non esiste l'ereditarietà multipla,
	 *    quindi una classe può estendere solo una classe,
	 *     ma può implementare più interfacce.
	 */
	
	
	// Varialbili d'istanza.
	 
//private String nome; 
private String cognome; 
//private Sesso sesso; 
//private byte anni;
//private float altezza;
//private float peso;
//private ColoreOcchi coloreOcchi;
private ColoreCapelli coloreCapelli;
private String nazioneDiNascita;
private LocalDate dataDiNascita;  // con LocalDate possiamo gestire dei punti temporali, 
                                  //come ad esempio la data di nascita di un essere umano,
                                  //e possiamo fare dei calcoli con le date, come ad esempio calcolare l'età di un essere umano 
                                  //a partire dalla sua data di nascita.
private Comune comuneDiNascita;
private String codiceFiscale;  


//Costanti.
private static final byte MIN_ANNI = 0; // età minima in anni
private static final byte MAX_ANNI = 	Byte.MAX_VALUE; // età massima in anni, usiamo il valore massimo di byte perché la variabile anni è di tipo byte
private static final byte DEFAULT_ANNI = 0; // età di default in anni

private static final float MIN_ALTEZZA = 40f; // altezza minima in cm
private static final float MAX_ALTEZZA = 250f; // altezza massima in cm
private static final float DEFAULT_ALTEZZA = 50f; // altezza di default in cm

private static final float MIN_PESO = 2.5f; // peso minimo in kg
private static final float MAX_PESO = 600f; // peso massimo in kg
private static final float DEFAULT_PESO = 3.3f; // peso di default in kg


/*
 * aggiungenso static alle costanti, stiamo dichiarando che queste costanti appartengono alla classe EssereUmano,
 *  e non agli oggetti della classe EssereUmano.
 *  in questo modo, possiamo accedere a queste costanti direttamente dalla classe EssereUmano,
 *   senza dover creare un oggetto della classe EssereUmano.
 *   
 *   cioe in parole semplici, le costanti sono condivise da tutti gli oggetti della classe EssereUmano,
 *    e non appartengono a nessun oggetto in particolare.
 */


//prorietà statiche

private static int totaleEssereUmani = 0; // variabile statica per contare il numero totale di oggetti della classe EssereUmano creati
/*
 * la variabile totaleEssereUmani è dichiarata come static perché deve essere condivisa da tutti gli oggetti della classe EssereUmano,
 * quindi non appartiene a nessun oggetto in particolare, ma è una variabile di classe che viene condivisa da tutti gli oggetti della classe EssereUmano.
 * in questo modo, ogni volta che viene creato un nuovo oggetto della classe EssereUmano, la variabile totaleEssereUmani viene incrementata di 1,
 * e possiamo tenere traccia del numero totale di oggetti della classe EssereUmano creati.
 * 
 * questo ci permette di avere un contatore che ci dice quanti oggetti della classe EssereUmano sono stati creati,
 * senza dover creare un contatore esterno al main, o senza dover creare un contatore all'interno del main,
 */



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
	//this("ND", "ND", Sesso.SCONOSCIUTO, (byte)0, 0f, 0f, ColoreOcchi.SCONOSCIUTO, ColoreCapelli.SCONOSCIUTO, "ND", LocalDate.of(1900, Month.JANUARY, 1), "ND");
	this("ND", "ND", Sesso.SCONOSCIUTO,0f, 0f, ColoreOcchi.SCONOSCIUTO, ColoreCapelli.SCONOSCIUTO, "ND", LocalDate.now(), Comune.SCONOSCIUTO);
	
	/*
	 * quando chiamiamo il costruttore senza parametri, il this richiama il costruttore con 9 parametri
	 * e assegna dei valori di default alle variabili d'istanza.
	 * in questo modo evitiamo di scrivere codice duplicato.
	 * il this deve essere la prima istruzione del costruttore.
	 */
	System.out.println("--------------------------");
	System.out.println("EssereUmano (0)"); // per vedere quale costruttore viene chiamato
}

public EssereUmano(String nome, 
		String cognome,
		Sesso sesso)
{
	//this(nome, cognome, sesso, (byte)0, 0f, 0f, ColoreOcchi.SCONOSCIUTO, ColoreCapelli.SCONOSCIUTO, "ND", LocalDate.of(1900, Month.JANUARY, 1), "ND");
	
	this(nome, cognome, sesso, 0f, 0f, ColoreOcchi.SCONOSCIUTO, ColoreCapelli.SCONOSCIUTO, "ND", LocalDate.now(), Comune.SCONOSCIUTO);
	
	/*
	 * nel costruttore con 0 parametri, abbiamo assegnato dei valori di default alle variabili d'istanza,
	 * mentre per il costruttore , con 3 parametri abbiamo assegnato a nome, cognome e sesso i valori dei parametri,
	 */
	
	// per vedere quale costruttore viene chiamato
	// this richiama il costruttore con 9 parametri
	// e assegna dei valori di default alle variabili d'istanza non inizializzate.
	// il this deve essere la prima istruzione del costruttore.
	
	System.out.println("--------------------------");
	System.out.println("EssereUmano (3)");
	
	
//	this.nome = nome; 
//	this.cognome = cognome; 
//	this.sesso = sesso;
	
	/*
	 * qui abbiamo commentato l'assegnazione diretta dei valori dei parametri alle variabili d'istanza,
	 * cioè this.nome = nome; this.cognome = cognome; this.sesso = sesso;
	 * perchè abbiamo aggiunto dei paramenti al costruttore,
	 *  cioè : this(nome, cognome, sesso, (byte)0, 0f, 0f, ColoreOcchi.SCONOSCIUTO, ColoreCapelli.SCONOSCIUTO, "ND");
	 *  quindi stiamo richiamando il costruttore con 9 parametri, e stiamo assegnando dei valori di default alle variabili d'istanza 
	 */
}

// 3
public EssereUmano(String nome,
		String cognome,
		Sesso sesso,
		//byte anni,
		float altezza,
		float peso,
		ColoreOcchi coloreOcchi,
		ColoreCapelli coloreCapelli,
		String nazioneDiNascita,
		LocalDate dataDiNascita,
		Comune comuneDiNascita
		)

{
	//super(nome, sesso, anni, altezza, peso, coloreOcchi);
	super(nome, sesso, altezza, peso, coloreOcchi, dataDiNascita);
	
	System.out.println("--------------------------");
	System.out.println("EssereUmano (10)");
	
	// per vedere quale costruttore viene chiamato
	//this.nome = nome; // uso la parola chiave this per distinguere la variabile d'istanza dal parametro
	//this.setNome(nome); // invece di assegnare direttamente il valore del parametro nome alla variabile d'istanza nome, usiamo il metodo setter setNome(nome) per controllare il valore inserito.
	//this.cognome = cognome; 
	
	this.setCognome(cognome);
	
	//this.sesso = sesso;
	
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
	//this.setAnni(anni);
	//this.setAltezza(altezza);
	//this.setPeso(peso);
	/*
	 * invece usando stetAltezza(altezza) e setPeso(peso), 
	 * stiamo chiamando i metodi setter che abbiamo definito per le variabili d'istanza altezza e peso
	 * quindi il valore inserito dovrà passare attraverso i controlli che abbiamo inserito nei metodi setter,
	 */
	
	//this.coloreOcchi = coloreOcchi;
	this.coloreCapelli = coloreCapelli;
	/*
	 * sia per colore occhi che per colore capelli, non abbiamo inserito dei controlli nei metodi setter,
	 * perchè i loro rispettivi valori vengono da una lista di enumerazioni già definita
	 * di conseguenza non è possibile inserire valori non validi per queste variabili d'istanza,
	 * allora va bene anche scriverli direttamente senza usare i metodi setter.
	 */
	this.nazioneDiNascita = nazioneDiNascita;
	
	//this.setDataDiNascita(dataDiNascita);
	
	this.comuneDiNascita = comuneDiNascita;
	
	//this.setCodiceFiscale(codiceFiscale);
	
	this.codiceFiscale = "ND"; // per evitare di inserire un codice fiscale non valido, assegniamo un valore di default "
	
	this.nasce(); // quando viene creato un oggetto della classe EssereUmano,
	//viene chiamato il metodo nasce() che stampa a video "EssereUmano nasce".
	//
	// this si riferisce all'oggetto corrente
	// viene usato per accedere alle variabili d'istanza e ai metodi dell'oggetto corrente
	// si usa quando c'è ambiguità tra variabili d'istanza e parametri
	// in questo caso i nomi sono uguali
	// quindi per distinguere si usa this.
	// questo è un'altro modo per scrivere i costruttori.
}

//Metodi getter e setter

//public String getNome() {
//	//return this.nome;
//	return nome;
//}
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
@Override
public void setNome(String nome) {
	System.out.println("--------------------------");
	System.out.println("EssereUmano -> setNome()"); 
	
	boolean nomeCorretto = true;
	/*
	 * se nomecorretto rimane a true vuol dire che tutti i controlli sono stati superati, e quindi il nome è corretto, 
	 * mentre se nomeCorretto diventa false vuol dire che almeno uno dei controlli non è stato superato, e quindi il nome non è corretto.
	 */
	
	if (Verifica.verificaCratteri("1234567890!?@", nome)) 
		
		/*
		 * se la funzione verifica caratteri restituisce true significa che la stringa nome contiene almeno un carattere non valido,
		 *  ovvero un numero o un carattere speciale, e quindi il nome non è corretto.
		 */
	{
		System.out.println("	nome non consono"); //quindi manderà a stampa nome non consono.
		
		nomeCorretto = false; // di conseguenza, impostiamo nomeCorretto a false per indicare che il nome non è corretto.
		
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
	else if ( Verifica.verificaLunghezza(nome, 15))
	{
		System.out.println("	nome troppo lungo");
		
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
		System.out.println("	nome ok");
		//this.nome = nome;
		super.setNome(nome);
		// invece di assegnare direttamente il valore del parametro nome alla variabile d'istanza nome,
		// usiamo il metodo setter setNome(nome) per controllare il valore inserito.
	}
	else
	{
		String nomeCorrente = super.getNome(); 
		//con super.getNome() stiamo chiamando il metodo getter getNome() della classe padre Animale
		// per ottenere il valore corrente del nome dell'oggetto, e lo stiamo assegnando alla variabile locale nomeCorrente.

    if ( nomeCorrente == null)
	{
		System.out.println("	" + nomeCorrente + " è null ");
		
		super.setNome("ND"); 
	}
	else if (!("ND".equals(nomeCorrente))) 
		
		
	{
		System.out.println("	" + nomeCorrente + " è un nome sensato .");
	}
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
	System.out.println("--------------------------");
	System.out.println("EssereUmano -> setCognome()"); 
	
	boolean cognomeCorretto = true;
	
	if (Verifica.verificaCratteri("1234567890!?@", cognome)) 
	{
		System.out.println("	Cognome non consono"); 
		cognomeCorretto = false;
	}
	else if ( Verifica.verificaLunghezza(cognome, 15))
	{
		System.out.println("	Cognome troppo lungo");
		
		cognomeCorretto = false;
	}
	if(cognomeCorretto == true) 
	{
		System.out.println("	cognome ok");
		this.cognome = cognome;
	}
	if ( this.cognome == null)
	{
		System.out.println("	" + this.cognome + " è null ");
		
		this.cognome = "ND"; 
	}
	else if (!("ND".equals(this.cognome))) 
		
		
	{
		System.out.println("	" + this.cognome + " è un cognome sensato");
	}
	this.cognome = cognome;
}

//public Sesso getSesso() {
//	return sesso;
//}
//
//public void setSesso(Sesso sesso) {
//	this.sesso = sesso;
//}

//public byte getAnni() {
//	return anni;
//}

//public void setAnni(byte anni) {
//	System.out.println("max anni: " + EssereUmano.MAX_ANNI);
//	
//	if(anni >= EssereUmano.MIN_ANNI && anni <= EssereUmano.MAX_ANNI) // per dare una misura reale a essere umano abbiamo inserito un controllo sull'età, 
//	{
//		//this.anni = anni;
//		super.setAnni(anni);
//		System.out.println(super.getAnni() + " anni inizializzati");
//	}
//	else
//	{
//		byte anniCorrenti = super.getAnni();
//		if (anniCorrenti >= EssereUmano.MIN_ANNI && anniCorrenti <= EssereUmano.MAX_ANNI) // se l'età corrente dell'oggetto rientra nel range di età valido per un essere umano, manteniamo il valore corrente di anni.
//		{
//			System.out.println(anniCorrenti + " anni validi da prima.");
//		}
//		else
//		{
//			// this.anni = default_anni; // se viene inserito un valore non valido, assegniamo un valore di default di 18 anni.
//			super.setAnni(DEFAULT_ANNI);
//			
//			System.out.println(super.getAnni() + " anni assegnati di default.");
//			//System.out.println(getAnni() + " anni assegnati di default.");
//		}
//	}
//}

//public float getAltezza() {
//	return altezza;
//	
//}

//public void setAltezza(float altezza) {
//	
//	if(altezza > MIN_ALTEZZA && altezza < MAX_ALTEZZA) // per dare una misura reale a essere umano abbiamo inserito un controllo sull'altezza, 
//	{                                 //che deve essere compresa tra 20 cm e 250 cm.
//		super.setAltezza(altezza);
//		System.out.println(super.getAltezza() + " altezza inizializzata");
//	}
//	/*
//	 * quindi con questo controllo evitiamo di inserire valori che non sono realistici per un'essere umano
//	 */
//	else
//	{
//		float altezzaCorrente = super.getAltezza();
//		//quello che chiedo è: se l'altezza corrente(this.altezza) rientra nel range
//		if (altezzaCorrente > MIN_ALTEZZA && altezzaCorrente < MAX_ALTEZZA)
//		{
//			System.out.println(altezzaCorrente + " altezza valida da prima.");
//		//se rientra nel range ,manderà a schermo il valore di this.altezza
//		}
//		// altrimenti se anche l'altezza corrente dell'oggetto non è valida, assegniamo un valore di default di 100 cm.
//		else
//		{
//			super.setAltezza(DEFAULT_ALTEZZA); // se viene inserito un valore non valido, assegniamo un valore di default di 100 cm.
//			System.out.println(super.getAltezza() + " altezza assegnata di default.");
//		}
//		//System.out.println(altezza + " non è un'altezza valida per un essere umano");
//	}
//}

//public float getPeso() {
//	return peso;
//}

//public void setPeso(float peso) {
//	
//	if(peso > MIN_PESO && peso < MAX_PESO)
//	{
//		super.setPeso(peso);
//		System.out.println(super.getPeso() + " peso inizializzato");
//	}
//	else
//	{
//		float pesoCorrente = super.getPeso();
//		//if(this.getPeso() < min_peso && this.getPeso() > max_peso)
//		/*
//		 * e possibile chiedere anche con getPeso() se il peso corrente dell'oggetto rientra nel range di peso valido per un essere umano
//		 * sono due modi diversi per fare lo stesso controllo, ma in questo caso è più semplice usare this.peso
//		 *  invece di this.getPeso() perché getPeso() restituisce il valore di peso e quindi è più lungo da scrivere.
//		 */
//		
//		//System.out.println(peso + " non è un peso valido per un essere umano");
//		if (pesoCorrente > MIN_PESO && pesoCorrente < MAX_PESO)
//		{
//			System.out.println(pesoCorrente + " peso valido da prima.");
//			//se rientra nel range ,manderà a schermo il valore di this.peso
//		}
//		else
//		{
//			super.setPeso(DEFAULT_PESO); // se viene inserito un valore non valido, assegniamo un valore di default di 35 kg.
//			System.out.println(super.getPeso() + " peso assegnato di default.");
//		}
//	}
//	
//	
//}

//public ColoreOcchi getColoreOcchi() {
//	return coloreOcchi;
//}
//
//public void setColoreOcchi(ColoreOcchi coloreOcchi) {
//	this.coloreOcchi = coloreOcchi;
//}

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

//public LocalDate getDataDiNascita() {
//	return dataDiNascita;
//}
//
//public void setDataDiNascita(LocalDate dataDiNascita) {
//	this.dataDiNascita = dataDiNascita;
//}

public String getCodiceFiscale() {
	return codiceFiscale;
}

//public void setCodiceFiscale(String codiceFiscale) {
//	this.codiceFiscale = codiceFiscale;
//}

public void setCodiceFiscale(String codiceFiscale) {
	System.out.println("--------------------------");
	System.out.println("EssereUmano -> setCodiceFiscale()"); 
	
	
	this.codiceFiscale = codiceFiscale;
}

private String buildCodiceFiscale() 

/*
 * in questa funzione voglio creare una classe locale
 * che mi cosente di creare un'oggetto della classe CodiceFiscale, che mi consente di costruire un codice fiscale a partire dai dati dell'oggetto EssereUmano.
 */
{
	System.out.println("--------------------------");
	System.out.println("EssereUmano -> buildCodiceFiscale()"); 
	
	class CodiceFiscale 
	{
		//variabile di istanza
		private String codiceFiscale;
		
		//costruttore
		CodiceFiscale()
		{
			codiceFiscale = getPorzioneCognome() +
					getPorzioneNome() +
			        getAnnoDiNascita() +
			        getMeseDiNascita() + 
			        getGiornoDiNascita() ;
			
		}
		
		//metodi getter /setter
		private String getCodiceFiscale()
		{
			return codiceFiscale;
		}
		
		//metodi /funzioni
		
		private String getPorzioneCognome()
		{
			String cognome = getCognome();
			String porzioneCognome = "";
			String caratterePadding = "X"; // questo serve per riempire eventuali buchi. esempio se ho bisogno di tre caratter e il cognome è solo di due , aggiunge la X per completare
			String vocali = "AEIOU";
			
			cognome = cognome.toUpperCase();
			
			if(cognome.length() == 1)
			{
				porzioneCognome = cognome + caratterePadding + caratterePadding;
			}
			else if (cognome.length() == 2)
			{
				porzioneCognome = cognome;
				/*
				 * se la Stringa vocali contiene il primo carattere di cognome, ( quindi è una vocale)
				 * mentre nella seconda parte dell'if stiamo chiedendo che
				 * se non è vero che (!) nella stringa vocali è contenuto il secondo carattere di cognome ( quindi è una consonante)
				 */
				if(vocali.contains(String.valueOf(cognome.charAt(0))) &&   //se è vero che il primo carattere del cognome è una vocale
						!vocali.contains(String.valueOf(cognome.charAt(1)))) // e contemporaneamente il secondo carattere non è una vocale ma una consonate
					//con String.valueOf non faccio altro che convertire un char in una stringa
			     {
					porzioneCognome  = String.valueOf(cognome.charAt(1)) +
							           String.valueOf(cognome.charAt(0)); 
					//in pratica stiamo invertendo le posizioni delle lettere, se prima avevamo A/C adesso abbiamo C/A
					System.out.println("	porzioneCognome 2: " + porzioneCognome);
			     }
				porzioneCognome = porzioneCognome + caratterePadding;
			}
			else
			{
				/*
				 * Esercizio: provare ad implementare il reale algoritmo per la costruzione del codice fiscale
				 * http://it.wikipedia.org/wiki/Codice_Fiscale
				 */
				
				//semplificazione
				
				porzioneCognome = cognome.substring(0, 3); // con questo comando stiamo prendendo solo i primi 3 caratteri della Stringa cognome
				
			}
			System.out.println("	porzioneCognome: " + porzioneCognome);
			
			return porzioneCognome;
		}
		
		private String getPorzioneNome()
		{
			String nome = getNome();
			String porzioneNome = "";
			String caratterePadding = "X"; // questo serve per riempire eventuali buchi. esempio se ho bisogno di tre caratter e il cognome è solo di due , aggiunge la X per completare
			String vocali = "AEIOU";
			
			nome = nome.toUpperCase();
			
			if(nome.length() == 1)
			{
				porzioneNome = nome + caratterePadding + caratterePadding;
			}
			else if (nome.length() == 2)
			{
				porzioneNome = nome;
				/*
				 * se la Stringa vocali contiene il primo carattere di cognome, ( quindi è una vocale)
				 * mentre nella seconda parte dell'if stiamo chiedendo che
				 * se non è vero che (!) nella stringa vocali è contenuto il secondo carattere di cognome ( quindi è una consonante)
				 */
				if(vocali.contains(String.valueOf(nome.charAt(0))) &&   //se è vero che il primo carattere del cognome è una vocale
						!vocali.contains(String.valueOf(nome.charAt(1)))) // e contemporaneamente il secondo carattere non è una vocale ma una consonate
					//con String.valueOf non faccio altro che convertire un char in una stringa
			     {
					porzioneNome  = String.valueOf(nome.charAt(1)) +
							           String.valueOf(nome.charAt(0)); 
					//in pratica stiamo invertendo le posizioni delle lettere, se prima avevamo A/C adesso abbiamo C/A
					System.out.println("	porzioneCognome 2: " + porzioneNome);
			     }
				porzioneNome = porzioneNome + caratterePadding;
			}
			else
			{
				/*
				 * Esercizio: provare ad implementare il reale algoritmo per la costruzione del codice fiscale
				 * http://it.wikipedia.org/wiki/Codice_Fiscale
				 */
				
				//semplificazione
				
				porzioneNome = nome.substring(0, 3); // con questo comando stiamo prendendo solo i primi 3 caratteri della Stringa cognome
				
			}
			System.out.println("	porzioneNome: " + porzioneNome);
			
			return porzioneNome;
		}
		
		private String getAnnoDiNascita()
		{
			String annoDiNascita = String.valueOf(getDataDiNascita().getYear()).substring(2, 4); 
			/*
			 *  con String.valueOf stiamoconvetrendo la data di nascita in una stringa
			 *  getDataDiNascita() ci restituisce la data di nascita
			 *  getYear() ci restituisce solo l'anno di nascita
			 *  subString (2, 4) ci permette di prendere solo gli ultimi 2 caratteri dell'anno di nascita
			 *  ad esempio se l'anno di nascita è 1990, con subString(2, 4) prendiamo solo il 90,
			 *  quindi tutta la riga di codice ci restituisce gli ultimi 2 caratteri dell'anno di nascita
			 *  
			 *  per far si che subString prenda solo le ultime 2 cifre bisogna mettere come indice
			 *  l'ultimo indice deve essere 3 + 1, 
			 *  perchè subString prende i caratteri dall'indice di inizio (incluso) all'indice di fine (escluso)
			 *     
			 */
			
			System.out.println("	annoDiNascita: " + annoDiNascita);
			
			return annoDiNascita;
		}
		private String getMeseDiNascita()
		{
			String meseDiNascita;
			
			enum CodiceMese
			{
				A, // Gennaio
				B, // Febbraio
				C, // Marzo
				D, // Aprile
				E, // Maggio
				H, // Giugno
				L, // Luglio
				M, // Agosto
				P, // Settembre
				R, // Ottobre
				S, // Novembre
				T  // Dicembre
			}
			
			CodiceMese codiceMese = switch(getDataDiNascita().getMonth())
					{
						case JANUARY -> CodiceMese.A;
						case FEBRUARY -> CodiceMese.B;
						case MARCH -> CodiceMese.C;
						case APRIL -> CodiceMese.D;
						case MAY -> CodiceMese.E;
						case JUNE -> CodiceMese.H;
						case JULY -> CodiceMese.L;
						case AUGUST -> CodiceMese.M;
						case SEPTEMBER -> CodiceMese.P;
						case OCTOBER -> CodiceMese.R;
						case NOVEMBER -> CodiceMese.S;
						case DECEMBER -> CodiceMese.T;
					};
					
					meseDiNascita = codiceMese.toString();
					
					System.out.println("	meseDiNascita: " + meseDiNascita);
					
					return meseDiNascita;
					
					/*
					 * con questo switch stiamo associando ad ogni mese dell'anno un codice corrispondente,
					 * questo ci permette di usare un unum per rappresentare i mesi dell'anno, 
					 * e di associare ad ogni mese un codice corrispondente,
					 */
		}
		
		private String getGiornoDiNascita()
		{
			String giornoDiNascita;
			int giorno = getDataDiNascita().getDayOfMonth();
			
			if(getSesso() == Sesso.FEMMINA)
			
				giorno = giorno + 40; // per le femmine al giorno di nascita si aggiunge 40, in modo da distinguere i codici fiscali maschili da quelli femminili.
			if(giorno < 10)
				giornoDiNascita = "0" + giorno; // se il giorno di nascita è minore di 10, aggiungiamo uno 0 davanti al numero del giorno, in modo da avere sempre due cifre per il giorno di nascita.
			else
				giornoDiNascita = String.valueOf(giorno); // altrimenti, se il giorno di nascita è maggiore o uguale a 10, lo convertiamo in una stringa e lo restituiamo così com'è.
			System.out.println("	giornoDiNascita: " + giornoDiNascita);
			return giornoDiNascita;
		}
	
	}
	
}

//metodi getter per le costanti statiche
@Override
public byte getMinAnni() {
	return EssereUmano.MIN_ANNI;
}
@Override
public byte getMaxAnni() {
	return EssereUmano.MAX_ANNI;
}
@Override
public byte getDefaultAnni() {
	return EssereUmano.DEFAULT_ANNI;
}
@Override
public float getMinAltezza() {
	return EssereUmano.MIN_ALTEZZA;
}
@Override
public float getMaxAltezza() {
	return EssereUmano.MAX_ALTEZZA;
}
@Override
public float getDefaultAltezza() {
	return EssereUmano.DEFAULT_ALTEZZA;
}
@Override
public float getMinPeso() {
	return EssereUmano.MIN_PESO;
}
@Override
public float getMaxPeso() {
	return EssereUmano.MAX_PESO;
}
@Override
public float getDefaultPeso() {
	return EssereUmano.DEFAULT_PESO;
}

// sovrascrittura dei metodi equals() e hashCode();
@Override
public boolean equals(Object obj)
{
	if(this == obj) // se l'oggetto attuale è uguale all'oggetto obj (ovvero se sono lo stesso oggetto in memoria), allora restituiamo true, altrimenti restituiamo false.
	{
		System.out.println("equals 1");
		return true;}
	
	if(!(obj instanceof EssereUmano)) // se l'oggetto obj non è un'istanza della classe EssereUmano, allora restituiamo false, altrimenti continuiamo con il controllo.
	{
		System.out.println("equals 2");
		return false;}
	
	EssereUmano essereUmano = (EssereUmano) obj; // facciamo un cast dell'oggetto obj alla classe EssereUmano, in modo da poter accedere alle sue variabili d'istanza e ai suoi metodi.
	
	if(essereUmano.codiceFiscale.length() != this.codiceFiscale.length()) // se la lunghezza del codice fiscale dell'oggetto essereUmano è diversa dalla lunghezza del codice fiscale dell'oggetto attuale, allora restituiamo false, altrimenti continuiamo con il controllo.
	{
		System.out.println("equals 3");
	
		return false;}
	
	boolean sonoUguali = essereUmano.codiceFiscale.equals(this.codiceFiscale); // se il codice fiscale dell'oggetto essereUmano è uguale al codice fiscale dell'oggetto attuale, allora restituiamo true, altrimenti restituiamo false.
	
	System.out.println("equals 4");
	return sonoUguali;
}

@Override
public int hashCode() 
{
	int result = 17; // inizializziamo una variabile result con un valore qualsiasi, in questo caso 17.
	result = 31 * result * this.codiceFiscale.hashCode(); // moltiplichiamo result per 31 (un numero primo) e per il valore hash del codice fiscale dell'oggetto attuale, in modo da ottenere un valore hash unico per ogni oggetto della classe EssereUmano.

	return result; // restituiamo il valore hash calcolato.
}
/*
 * se due istanze Essereumano hanno lo stesso codice fiscale, allora sono considerate uguali, e quindi il metodo equals() restituisce true, altrimenti restituisce false.
 */



//metodi di verifica.

//sono metodi che servono a verificare i dati di input inseriti nei metodi setter, e a restituire un messaggio di errore se i dati non sono validi.
//saranno privati poichè solo i metodi setter all'interno della classe possono accedere a questi metodi di verifica, e non devono essere accessibili dall'esterno della classe.

//private boolean verificaCratteri(String caratteri, String s) {
//	// caratteri = 1234567890!?@
//	//vogliamo controllare se la stringa s contiene solo caratteri validi, ovvero lettere e spazi, e non contiene numeri o caratteri speciali.
//	//se restituisce true, significa che all'interno della stringa ci sono caratteri non validi, mentre se restituisce false, significa che la stringa è valida.
//	
//	boolean presente = false;
//	for (int i = 0; i < caratteri.length(); i++) 
//	{
//		char carattereCorrente = caratteri.charAt(i);
//		System.out.println("carattereCorrente" +  carattereCorrente);
//		
//		if (s.indexOf(caratteri.charAt(i)) != -1) // se il carattere presente nella stringa caratteri è presente anche nella stringa s, allora restituisco true.
//			//se non ci restituisce -1 allora significa che il carattere è presente nella stringa caratteri 
//			                                      //mentre se il carattere controllato da indexOf non è presente nella stringa s, restituisce -1, e quindi non entra nell'if.
//			                                       //quindi se troviamo un carattere non valido, impostiamo la variabile presente a true
//		{
//			presente = true;
//			break; // se troviamo un carattere non valido, usciamo dal ciclo for per evitare di continuare a controllare gli altri caratteri.
//			
//			/*
//			 * con questo if stiamo controllando se la stringa s contiene un carattere non valido, ovvero un carattere presente nella stringa caratteri.
//			 * s.indexOf(caratteri.charAt(i)) restituisce l'indice del primo carattere presente nella stringa s, se il carattere è presente, altrimenti restituisce -1.
//			 * quindi se s.indexOf(caratteri.charAt(i)) != -1, significa che il carattere è presente nella stringa s, e quindi la stringa s non è valida.
//			 * mentre con caratteri.chaAt(i) stiamo prendendo il carattere presente nella stringa caratteri alla posizione i, e lo stiamo confrontando con la stringa s.
//			 * se troviamo un carattere non valido, impostiamo la variabile presente a true
//			 */
//		}
//	}
//	return presente;
//}
//
//
//private boolean verificaLunghezza(String s, int  limit)
//{
//	boolean troppoLunga = false;
//	
//	if (s.length() > limit) 
//	    troppoLunga = true;
//	return troppoLunga;
//}
/*
 * con questo metodo stiamo controllando se la stringa s è troppo lunga, ovvero se la sua lunghezza è maggiore di un limite specificato.
 * se s.length() > limit, significa che la stringa s è troppo lunga, e quindi restituiamo true, altrimenti restituiamo false.
 * questo metodo può essere usato ad esempio per controllare la lunghezza di una stringa inserita nei metodi setter, come ad esempio il nome o il cognome, per evitare di inserire stringhe troppo lunghe che potrebbero non essere realistiche per un essere umano.
 */


// Metodi

@Override
public void nasce() 
{
	super.nasce(); // stiamo chiamando il metodo nasce() della superclasse Animale, che stampa a video "L'animale nasce".
	EssereUmano.totaleEssereUmani++; // ogni volta che viene creato un nuovo oggetto della classe EssereUmano,
	                                 //incrementiamo la variabile totaleEssereUmani di 1.
	System.out.println("totale EssereUmani " + EssereUmano.totaleEssereUmani);
}

@Override

/*
 * con @Override stiamo facendo una sorta di controllo
 * serve a indicare che il metodo che stiamo scrivendo sta sovrascrivendo un metodo della superclasse Animale
 * cioè nel momento in cui sbagliamo a scrivere il nome del metodo, o la firma del metodo,
 * lui ci darà un'errore di compilazione, 
 * facendoci ricordare che stiamo cercando di sovrascrivere un metodo della superclasse, ma non lo stiamo facendo correttamente.
 * 
 * a differenza di quando non usiamo @Override, se sbagliamo a scrivere il nome del metodo o la firma del metodo, 
 * non ci darà un errore di compilazione, e quindi creeremo un nuovo metodo invece di sovrascrivere il metodo della superclasse,
 *  e questo potrebbe portare a comportamenti imprevisti nel nostro programma.
 */

public void beve() 
{
	System.out.println(super.getNome() + " " + cognome + " beve");
}
@Override
public void mangia() 
{
	System.out.println(super.getNome() + " " + cognome + " mangia con le posate");
}
@Override
public void respira() 
{
	System.out.println(super.getNome() + " " + cognome + " respira");
}

@Override
public void muore() 
{
	super.muore(); 
	EssereUmano.totaleEssereUmani--; // ogni volta che viene chiamato il metodo muore() di un oggetto della classe EssereUmano,
	                                 //decrementiamo la variabile totaleEssereUmani di 1.
	System.out.println("totale EssereUmani " + EssereUmano.totaleEssereUmani);
}
@Override
public void dorme()
{
	super.dorme(); 
	System.out.println(super.getNome() + " " + cognome + " dorme nel suo letto, tra cuscini e lenzuola");
//	System.out.println(nome + " " + cognome + " dorme");
}
/*
 * con super.dorme() stiamo chiamando il metodo dorme() della classe padre Animale, che stampa "L'animale dorme".
 * stiamo sia usando il dorme della superclasse Animale che il dorme della classe EssereUmano
 * questo ci consente di dare sia una definizione generale di dormire
 * che una più specifica per l'essere umano
 * 
 * in parole povere stiamo richiamando il metodo dorme() della superclasse Animale implementandolo anche alla classe essere umano
 * 
 * in questo caso specifico viene prima chiamato il metodo della superclasse animale
 * e poi successivamente il metodo nella classe essere umano
 * 
 */
public void canta()
{
	System.out.println(super.getNome() + " " + cognome + " canta");
}

public void studia()
{
	System.out.println(super.getNome() + " " + cognome + " studia");
}

public void lavora()
{
	System.out.println(super.getNome() + " " + cognome + " lavora");
}

//1
//public int somma (final int a , final int b) 
//{
//	//a = 25;
//	// se proviamo a modificare il valore di a o b, ci darà un errore di compilazione, perchè sono dichiarati come final.
//	int somma = a + b;
//	return somma;
//}

//2
public double somma (double...ns )
{
System.out.println("somma varargs");
	
	return Calcolo.somma(ns);
}

/*
 * con questo metodo stiamo dando all'esserre umano la capacità di sommare due numeri interi,
 * con la dicitura di final stiamo escludendo la possibilità di modificare il loro valore in futuro all'interno del metodo,
 */

//1
public int moltiplica (final int a , final int b) 
{
	System.out.println("moltiplica 1");
	//b = 100;
	int prodotto = a * b;
	return prodotto;
}

//2
//public float moltiplica (final float a , final int b) 
//{
//	System.out.println("moltiplica 2");
//	//b = 100;
//	float prodotto = a * b;
//	return prodotto;
//}
//
//public float moltiplica (final int a , final float b) 
//{
//	System.out.println("moltiplica 3");
//	//b = 100;
//	float prodotto = a * b;
//	return prodotto;
//}
//
//public double moltiplica (final int a , final float b , final int c , final double d) 
//{
//	System.out.println("moltiplica 4");
//	//b = 100;
//	double prodotto = a * b;
//	return prodotto;
//}
//3

//public double moltiplica(double... ns)
//{
//	System.out.println("moltiplica varargs");
//	
//	double prodotto = 1;
//	
//	for (int i = 0; i < ns.length; i++) 
//	
//		prodotto *= ns[i];
//	
//	return prodotto;
//}

//4

public double moltiplica(double... ns)
{
	System.out.println("moltiplica varargs");
	
	return Calcolo.moltiplica(ns);
}
/*
 * con il punto 4 stiamo usando un metodo statico della classe calcolo.
 * a differenza del punto 3 che era implementato nella classe Essere umano,
 * con questo metodo stiamo delelgando la responsabilità del calcolo del prodotto dei numeri al metodo moltiplica della classe Calcolo,
 * e quindi stiamo ottimizzando il codice, rendendolo più leggibile, e manutenibile.
 * 
 * in questo modo abbiamo la possibilità anche di riusarlo in altri contesti , non necessariamente solo nella classe EssereUmano,
 * 
 */



/*
 * per usare questo mmetodo di moltiplica con varargs, bisogna trattarlo come se stessimo usando un'array.
 * quindi come prima cosa inizializziamo il prodotto a 1.
 * poi usiamo il ciclo for per scorrere tutti gli elementi dell'array ns.
 * ad ogni iterazione del ciclo moltiplichiamo il prodotto per l'elemento corrente dell'array ns, che è ns[i].
 * quindi che gli arrivi un double , anzichè un int , o un float, o un numero indefinito di numeri,
 * lui sarà sempre in grado di moltiplicarli, grazie al metodo varargs che abbiamo creato.
 * 
 */

/*
 * con il metodo varargs stiamo dando la possibilità di moltiplicare un numero indefinito di numeri
 * con i tre metodi moltiplica con parametri diversi, stiamo dando la possibilità di moltiplicare numeri di tipi diversi, e con un numero diverso di parametri
 * senza specificare un numero preciso di parametri per ogni metodo
 */

//4

/*
 * con la funzione abbraccia stiamo dando la possibilità a un essere umano di abbracciare un altro essere umano,
 * ma non stiamo specificando come avviene l'abbraccio, quindi stiamo lasciando la possibilità di interpretare l'abbraccio in diversi modi,
 */

//1.

//public void abbraccia(EssereUmano altro)
//{
//	//System.out.println(super.getNome() + " " + cognome + " abbraccia " + altro.getNome());
//	System.out.println(this.getNome() + " " + cognome + " abbraccia " + altro.getNome());
//}
///*
// *  nel primo caso abbiamo usato super poichè nome viene ereditato dalla superclasse Animale,
// *  e quindi per accedere al nome dell'oggetto corrente, dobbiamo usare super.getNome() 
// *  per chiamare il metodo getter getNome() della superclasse Animale.
// *  
// *  mentre nel secondo caso abbiamo usato this, poichè getNome() è un metodo che abbiamo sovrascritto nella classe EssereUmano,
// *   e quindi per accedere al nome dell'oggetto corrente, possiamo usare this.getNome()  
// */
//public void abbraccia(Gatto altro)
//{
//	//System.out.println(super.getNome() + " " + cognome + " abbraccia " + altro.getNome());
//	System.out.println(this.getNome() + " " + cognome + " abbraccia " + altro.getNome());
//}

//2.
public void abbraccia(Animale altro)
{
	//System.out.println(super.getNome() + " " + cognome + " abbraccia " + altro.getNome());
	System.out.println(this.getNome() + " " + cognome + " abbraccia " + altro.getNome());
}
/* con la seconda versione del metodo abbraccia, stiamo dando la possibilità a un essere umano di abbracciare qualsiasi animale, 
 * non solo un altro essere umano o un gatto, ma anche un cane, un uccello, o qualsiasi altro animale che estende la classe Animale.
 * in questo modo stiamo rendendo il metodo abbraccia più flessibile e riusabile in diversi contesti.
 * questo ci consente di evitare di scrivere più versioni del metodo abbraccia per ogni tipo di animale, e quindi stiamo ottimizzando il codice
 * 
 * con il referernce altro che e di tipo animale è un supertipo sia di essere umano che di gatto, 
 * e quindi possiamo passare come parametro sia un oggetto della classe EssereUmano che un oggetto della classe Gatto, 
 * o qualsiasi altro animale che estende la classe Animale.
 * 
 * quindi se volessimo aggiungere altri metodi interni ad abbraccia ,
 * bisogna tenere conto che altro può usare i metodi della classe Animale, ma non i metodi specifici di EssereUmano o Gatto,
 * 
 * per usare i metodi delle sottoclassi di animale bisogna usare l'operatore instanceof per verificare se l'oggetto passato come parametro
 *  è un'istanza di una sottoclasse specifica, e poi fare un cast per accedere ai metodi specifici di quella sottoclasse.
 */


@Override
public void vola() 
{
	//System.out.println(super.getNome() + " " + cognome + " vola con l'aereo");
	System.out.println(this.getNome() + " " + cognome + " vola con l'aereo");	
}

public void faIlCaffe()
{
	System.out.println(this.getNome() + " " + cognome + " fa il caffè");
}
public void stampaDocumento()
{
	System.out.println(this.getNome() + " " + cognome + " stampa un documento");
}

@Override
public void stampa() 
{
	super.stampa(); // stiamo chiamando il metodo stampa() della superclasse Animale, 
	System.out.println("----------");
//	System.out.println("Nome: " + nome);
	System.out.println("Cognome: " + cognome);
//	System.out.println("Sesso: " + sesso);
//	System.out.println("Anni: " + anni);
//	System.out.println("Altezza: " + altezza);
//	System.out.println("Peso: " + peso);
//	System.out.println("Colore Occhi: " + coloreOcchi);
	System.out.println("Colore Capelli: " + coloreCapelli);
	System.out.println("Nazione di Nascita: " + nazioneDiNascita);
	System.out.println("----------");
    
	super.stampa();
}
	// stiamo richiamando il metodo stampa() della superclasse Animale, in modo da stampare anche le informazioni generali dell'animale,
	//come ad esempio il nome, il sesso, l'età, l'altezza, il peso, e il colore degli occhi.
	
	
	
	/*
	 * con il metodo overload  stiamo dicendo che il metodo stampa() della classe EssereUmano è un'estensione del metodo stampa() della superclasse Animale,
	 * quindi stiamo aggiungendo ulteriori informazioni da stampare oltre a quelle già presenti nel metodo stampa() della superclasse Animale.
	 * 
	 * in questo modo, quando chiamiamo il metodo stampa() su un oggetto della classe EssereUmano,
	 *  verranno stampate tutte le informazioni presenti nel metodo stampa() della superclasse Animale,
	 *  
	 *  in parole semplici stiamo estendendo il metodo stampa() della superclasse Animale,
	 *   aggiungendo ulteriori informazioni specifiche per la classe EssereUmano.
	 */
	
	//tipi interni.
	
	enum Comune
	{
		ROMA,
		MILANO,
		NAPOLI,
		GENOVA,
		BARI,
		SCONOSCIUTO
	}
 




}