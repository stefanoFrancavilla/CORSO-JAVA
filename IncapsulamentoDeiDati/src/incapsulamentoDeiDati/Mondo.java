package incapsulamentoDeiDati;
import java.time.LocalDate;
import java.time.Month;

import incapsulamentoDeiDati.customthread.MacchinettaDelCaffeThread;
import incapsulamentoDeiDati.test.*;
public class Mondo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println();
		System.out.println("1--------------------------");
		System.out.println();
		
EssereUmano marcoRossi = new EssereUmano();
/*
 * alla destra dell'operatore di assegnamento troviamo la parola chiave "new"
 * che serve per creare un nuovo oggetto della classe EssereUmano
 * seguita dalla chiamata al costruttore della classe EssereUmano
 * alla sinistra dell'operatore di assegnamento troviamo la variabile di riferimento
 * marcoRossi che punta all'oggetto appena creato in memoria.
 * si capisce che è una funzione poiché ha le parentesi tonde alla fine del nome.
 */

marcoRossi.stampa();

//marcoRossi.nome = "Marco";
//marcoRossi.cognome = "Rossi";
//marcoRossi.sesso = Sesso.MASCHIO; // si accede all'enum Sesso con la notazione punto.
//marcoRossi.anni = 18;
//marcoRossi.altezza = 1.73f;
//marcoRossi.peso = 70f;
//marcoRossi.coloreOccihi = ColoreOcchi.AZZURRI; // si accede all'enum ColoreOcchi con la notazione punto.
//marcoRossi.coloreCapelli = ColoreCapelli.CASTANI; 
//marcoRossi.nazioneDiNascita = "Italia";

marcoRossi.setNome ("Marco");
marcoRossi.setCognome ("Rossi");
marcoRossi.setSesso (Sesso.MASCHIO);
marcoRossi.setAnni ((byte)18);
marcoRossi.setAltezza (173f);
marcoRossi.setPeso (70f);
marcoRossi.setColoreOcchi (ColoreOcchi.AZZURRI);
marcoRossi.setColoreCapelli (ColoreCapelli.CASTANI);
marcoRossi.setNazioneDiNascita ("Italia");

marcoRossi.stampa();
marcoRossi.mangia();
marcoRossi.lavora();
marcoRossi.vola();

System.out.println();
System.out.println("2--------------------------");
System.out.println();

EssereUmano saraVerdi = new EssereUmano("Sara",
		"Verdi",
		Sesso.FEMMINA,
		(byte) 48, // si fa il cast da int a byte, per evitare l'errore di compilazione.
		1.71f,
		-500_055f,
		ColoreOcchi.CASTANI,
		ColoreCapelli.BIONDI,
		"Italia",
		LocalDate.of(1978, Month.AUGUST, 10),
		"AAABBB111111111111");

saraVerdi.stampa();

saraVerdi.mangia();
	
saraVerdi.lavora();

System.out.println();
System.out.println("3--------------------------");
System.out.println();
EssereUmano GiuliaNeri = new EssereUmano("Giulia",
		"Neri",
		Sesso.FEMMINA);

GiuliaNeri.stampa();

System.out.println();
System.out.println("3.1--------------------------");
System.out.println();

EssereUmano lucaBianchi = new EssereUmano("Luca", "Bianchi", Sesso.MASCHIO);
lucaBianchi.stampa();

//lucaBianchi.anni = 34;
//lucaBianchi.altezza = 180.5f;
//lucaBianchi.peso = 70.8f;
//lucaBianchi.coloreOcchi = ColoreOcchi.VERDI;
//lucaBianchi.coloreCapelli = ColoreCapelli.ROSSI;
//lucaBianchi.nazioneDiNascita = "Svizzera";

lucaBianchi.setAnni((byte)34);
lucaBianchi.setAltezza(180.5f);
lucaBianchi.setPeso(70.8f);
lucaBianchi.setColoreOcchi(ColoreOcchi.VERDI);
lucaBianchi.setColoreCapelli(ColoreCapelli.ROSSI);
lucaBianchi.setNazioneDiNascita("Svizzera");
lucaBianchi.stampa();

System.out.println();
System.out.println("3.2--------------------------");
System.out.println();

lucaBianchi.setNome("123");
lucaBianchi.setAnni((byte)-100);
lucaBianchi.setAltezza(-10_000f);
lucaBianchi.setPeso(-2_000f);
lucaBianchi.setNazioneDiNascita("ciccio");
lucaBianchi.stampa();
/*
 * notare come non ci siano controlli sui dati inseriti
 * nell'oggetto lucaBianchi.
 * infatti si possono inserire valori non realistici
 * come età negative, altezze e pesi irrealistici.
 * 
 * ecco perchè con l'incapsulamento dei dati si usano i metodi setter e getter
 * per controllare i dati inseriti negli oggetti.
 * e per evitare di accedere direttamente alle variabili d'istanza dall'esterno della classe.
 * 
 * vedi la classe EssereUmanoIncapsulato.java
 * 
 * 	con staato dell'oggetto intendiamo l'insieme delle variabili d'istanza
 * * 	che definiscono le caratteristiche dell'oggetto in un dato momento.
 * * 	lo stato di un oggetto può cambiare
 * * 	nel corso della sua esistenza
 * * 	manipolando le sue variabili d'istanza
 * * 	tramite i metodi della sua classe.
 * 		
 * 
 */

System.out.println(lucaBianchi.getNome());


System.out.println();
System.out.println("3.3--------------------------");
System.out.println();

EssereUmano caterinaAzzurri = new EssereUmano();
caterinaAzzurri.stampa();

caterinaAzzurri.setAltezza(1_000);
caterinaAzzurri.setPeso(-200);

System.out.println();
System.out.println("3.4--------------------------");
System.out.println();

EssereUmano fabioArancioni = new EssereUmano("Fa3bio", "Ararncioni", Sesso.MASCHIO);

fabioArancioni.stampa();

fabioArancioni.setNome("Fabio"); // correggo il nome inserito in modo errato.

fabioArancioni.stampa();

fabioArancioni.setNome("Fabio9");

fabioArancioni.stampa();

System.out.println();
System.out.println("3.5--------------------------");
System.out.println();

EssereUmano linaVioli = new EssereUmano();

//linaVioli.getCognome("Rossi");
/*
 * nel caso volessimo cambiare il cognome a lina violi, non è possiblie farlo ,
 * poichè nella classe Essere Umano abbiamo dichiarato il cognome con private,
 * quindi non è accessibile dall'esterno della classe,
 *  e non è possibile modificarlo direttamente,
 */

//linaVioli.nome = "Paola";
/*
 * mentre nel caso volessimo cambiare il nome a lina violi, è possibile farlo ,
 * poichè la classe che estende essere umano(animale in questo caso)
 * dove essere umano prende l'istanza di nome 
 *  ha dichiarato il nome con protected,	
 */

linaVioli.stampa();


linaVioli.setNome("Lina");
linaVioli.setCognome("Violi");
System.out.println(linaVioli.somma(10, 38));
System.out.println(linaVioli.somma(new double[] {10, 38, 2.0, 10F}));
//1
//System.out.println(linaVioli.moltiplica(10, 38));

//2
//System.out.println(linaVioli.moltiplica(10, 38));
//System.out.println(linaVioli.moltiplica(10.3F, 38));
//System.out.println(linaVioli.moltiplica(10, 38.5F));
//System.out.println(linaVioli.moltiplica(10, 38.5F, 5, 3.7));

//3 e 4

//System.out.println(linaVioli.moltiplica(10, 38));
//System.out.println(linaVioli.moltiplica(10, 38, 2.0F));
//System.out.println(linaVioli.moltiplica(10, 38, 2.0, 10F));
//System.out.println(linaVioli.moltiplica(new double[] {10, 38, 2.0, 10F}));

//linaVioli.setNome("Lin?a");

//linaVioli.stampa();

//linaVioli.setNome("Linaabcdefghilmno_linaabcdefghilmno");

linaVioli.stampa();

System.out.println(linaVioli.somma(10, 38));
linaVioli.siNutre();
linaVioli.dorme();
linaVioli.muore();
System.out.println();
System.out.println("4--------------------------");
System.out.println();

Gatto miagolino = new Gatto();

miagolino.stampa();

miagolino.setNome("Miagolino");
miagolino.setSesso(Sesso.MASCHIO);
miagolino.setAnni((byte) 2);
miagolino.setAltezza(30f);
miagolino.setPeso(3f);
miagolino.setColoreOcchi(ColoreOcchi.GRIGI);
miagolino.setColorePeloGatto(ColorePeloGatto.ROSSO);
miagolino.setRazzaGatto(RazzaGatto.BRITHISH_SHORTHAIR);

miagolino.stampa();

miagolino.setNome("1Miago?lino");
miagolino.setAnni((byte)127);
miagolino.setAltezza(2_000_000.5f);
miagolino.setPeso(5_000_000_000.5f);
miagolino.stampa();

miagolino.stampa();

System.out.println();
System.out.println("4.1--------------------------");
System.out.println();

Gatto gattino = new Gatto("Gattino", Sesso.MASCHIO, (byte) 4);
//Gatto gattino = new Gatto("Ga@ttino", Sesso.MASCHIO, (byte) -14);
//gattino.stampa();
gattino.dorme();
gattino.stampa();
gattino.siNutre();
gattino.muore();
//Animale bestia = new Animale();


System.out.println();	
System.out.println("4.2--------------------------");
System.out.println();

ClasseProtettiStessoPackage testProtected1 = new ClasseProtettiStessoPackage();
testProtected1.nome = "Luca";
testProtected1.stampa();

//ClasseProtettiDiversoPackage testProtected2 = new ClasseProtettiDiversoPackage();
//testProtected2.nome = "Luca";
//testProtected2.stampa();

/*
 * con protected no riusciamo ad accedere alla classe che si trova in un package diverso
 * 
 */

System.out.println();	
System.out.println("5--------------------------");
System.out.println();

Cantautore vascoRossi = new Cantautore("Vasco", "Rossi", Sesso.MASCHIO);

vascoRossi.stampa();
vascoRossi.setTotaleConcerti(30);

vascoRossi.aggiungiTitoloCanzoneScritta("Alba chiara");
vascoRossi.aggiungiTitoloCanzoneScritta("C'è chi dice no");
vascoRossi.aggiungiTitoloCanzoneScritta("Liberi liberi");
vascoRossi.aggiungiTitoloCanzoneScritta("Brava Giulia");
vascoRossi.aggiungiTitoloCanzoneScritta("Domeniica lunatica");
vascoRossi.aggiungiTitoloCanzoneScritta("Vivere una favola");
vascoRossi.aggiungiTitoloCanzoneScritta("Gli spari sopra");
vascoRossi.stampaTitoliCanzoniScritte();

System.out.println();	
System.out.println("6--------------------------");
System.out.println();
/*
 * in questo caso abbiamo creato una variabile di riferimento di tipo Animale che punta ad un oggetto di tipo EssereUmano.
 * cioè abbiamo creato un oggetto di tipo EssereUmano e lo abbiamo assegnato ad una variabile di riferimento di tipo Animale.
 */
//Animale animale1 = new EssereUmano();
//
//System.out.println("animale1: " + animale1);
//
//animale1.mangia();
//animale1.dorme();
//animale1.lavora();
/*
 * se proviamo a chiamare il metodo lavora() sulla variabile di riferimento animale1, otteniamo un errore di compilazione,
 * perchè il metodo lavora() è definito nella classe EssereUmano e non nella classe Animale.
 * quindi con animale possiamo chimare solo i metodi che sono definiti nella classe Animale, anche se l'oggetto a cui punta è di tipo EssereUmano.
 */

Animale animale2 = new Gatto();
System.out.println("animale2: " + animale2);

animale2.mangia();
animale2.dorme();
//animale2.faLeFusa();

System.out.println();	
System.out.println("6.1--------------------------");
System.out.println();

Animale[] animali = new Animale[4];
/*
 * in questo caso abbiamo un'array di animali in generale ma di tipo animale
 * all'interno dell'array abbiamo inserito sia i gattini creati nelle righe precedenti, sia l'essere umano fabio arancioni e lina violi.
 * quindi quando siamo andati ad inserire gli elementi nell'array, abbiamo inserito sia oggetti di tipo Gatto che oggetti di tipo EssereUmano,
 * 
 * con il ciclo for, iteriamo su tutti gli elementi dell'array animali e chiamiamo i metodi mangia() e dorme() su ogni animale.
 */
animali[0] = gattino;
animali[1] = miagolino;
animali[2] = linaVioli;
animali[3] = fabioArancioni;

/*
 * con questo ciclo for, iteriamo su tutti gli elementi dell'array animali e chiamiamo i metodi mangia() e dorme() su ogni animale.
 * notare che anche se l'array è di tipo Animale, possiamo chiamare i metodi mangia() e dorme() su ogni elemento dell'array,
 * perchè questi metodi sono definiti nella classe Animale e sono ereditati da tutte le classi che estendono Animale, come EssereUmano e Gatto.
 * ecco perchè con l'ereditarietà e il polimorfismo, possiamo trattare tutti gli animali in modo uniforme, anche se sono di tipi diversi.
 * 
 */
for(int i = 0; i < animali.length; i++) {
	Animale animaleCorrente = animali[i];
	animaleCorrente.mangia();
	animaleCorrente.dorme();
	
	/*
	 * con l'if stiamo dicendo che se l'animale corrente è un'istanza di EssereUmano, allora possiamo chiamare il metodo lavora() su di esso,
	 * perchè il metodo lavora() è definito nella classe EssereUmano e non nella classe Animale,
	 *  quindi dobbiamo prima verificare che l'animale corrente sia effettivamente un'istanza di EssereUmano prima di poter chiamare il metodo lavora() su di esso.
	 *  
	 *  il codice che ci serve in questione è il seguente: instanceof è un operatore che ci permette di verificare se un oggetto è un'istanza di una determinata classe 
	 *  o di una sua sottoclasse.
	 */
	if(animaleCorrente instanceof EssereUmano) 
	{
		//animaleCorrente.lavora(); chiamandolo in questo modo non funziona perchè il metodo lavora() è definito nella classe EssereUmano e non nella classe Animale,
		//quindi dobbiamo fare un cast esplicito da Animale a EssereUmano per poter chiamare il metodo lavora() su di esso.
		
		//1
		//((EssereUmano) animaleCorrente).lavora();
		
		/*
		 * per far si che il codice funzioni, dobbiamo fare un cast esplicito da Animale a EssereUmano, 
		 * in questo modo stiamo dicendo al compilatore che l'oggetto animaleCorrente è effettivamente un'istanza di EssereUmano 
		 * e quindi possiamo chiamare il metodo lavora() su di esso.
		 */
		
		//2
		EssereUmano essereUmano = (EssereUmano) animaleCorrente;
		essereUmano.lavora();
		/*
		 * in sotanza stiamo referendo l'oggetto animaleCorrente come un oggetto di tipo EssereUmano,
		 * quindi stiamo dicendo al compilatore che l'oggetto animaleCorrente è effettivamente un'istanza di EssereUmano
		 * in pratica questi sono due modi diversi per fare la stessa cosa
		 */
		
	}
	else if(animaleCorrente instanceof Gatto) 
	{
		
		((Gatto) animaleCorrente).faLeFusa();
		
	}
}
 /*
  * con questo sistema possiamo trattare tutti gli animali in modo uniforme, anche se sono di tipi diversi,
  *  senza doverci preoccupare del tipo specifico di animale che stiamo trattando.
  *  
  *  possiamo inoltre aggiungere nuovi tipi di animali, come ad esempio un cane, senza dover modificare il codice che tratta gli animali in generale,
  *  basta che il nuovo tipo di animale estenda la classe Animale e implementi i metodi mangia() e dorme(),
  *   e il codice che tratta gli animali in generale funzionerà senza problemi.
  */


System.out.println();	
System.out.println("6.2--------------------------");
System.out.println();

/*
 * con questo metodo for-each, iteriamo su tutti gli elementi dell'array animali e chiamiamo i metodi mangia() e dorme() su ogni animale.
 * con l'if invece verifichiamo se l'animale corrente è un'istanza di EssereUmano,
 * con questo codice stiamo usando il metodo pattern matching per il cast,
 *  che ci permette di fare il cast in modo più semplice e leggibile, 
 *  senza dover creare una variabile di riferimento temporanea come nel caso precedente.
 *  
 *  in parole semplici con il pattern matching per il cast, possiamo fare il cast direttamente all'interno dell'if,
 *  e se l'animale corrente è effettivamente un'istanza di EssereUmano,
 *   allora la variabile persona sarà automaticamente referenziata all'oggetto animaleCorrente come un oggetto di tipo EssereUmano,
 *   
 *   questo ci consente di chiamare il metodo lavora() su di esso senza dover fare un cast esplicito come nel caso precedente.
 *   
 *   quindi il metodo pattern matching ci permette di scrivere codice più semplice e leggibile, 
 *   evitando la necessità di creare variabili di riferimento temporanee per fare il cast,
 */

//1


//for(Animale animaleCorrente : animali) {
//	
//	animaleCorrente.mangia();
//	animaleCorrente.dorme();
//	
//	if(animaleCorrente instanceof EssereUmano persona)
//	{
//	    persona.lavora();
//	}
//	
//	else 
//	{
//		//persona.lavora(); non può funzionare poichè non è stato creato nessun oggetto di tipo essereUmano.
//		//quindi l'else in questo caso serve per gestire il caso in cui l'animale corrente non sia un'istanza di EssereUmano,
//	}
//	/*
//	 * questo if si potrebbe leggere cosi: animale corrente contiene un riferimento ad un'oggetto di tipo EssereUmano
//	 * allora viene creata una variabile persona in riferimento a quell'oggetto di tipo EssereUmano e possiamo chiamare il metodo lavora() su di esso.
//	 * 	 
//	 */
//	if(animaleCorrente instanceof Gatto gatto)
//	{
//		gatto.faLeFusa();
//	}
//
//	}


//2


for(Animale animaleCorrente : animali) {
	
	animaleCorrente.mangia();
	animaleCorrente.dorme();
	
	if(!(animaleCorrente instanceof EssereUmano persona))
	{
	 //   persona.lavora(); 
		//con il not logico stiamo dicendo che :
		//se animaleCorrente non è un'istanza di EssereUmano, allora non viene creata la variabile persona e quindi non possiamo chiamare il metodo lavora() su di esso,
	}
	
	else
	{
		persona.lavora();  
		 
	}
}

System.out.println();	
System.out.println("6.3--------------------------");
System.out.println();

fabioArancioni.abbraccia(linaVioli);
linaVioli.abbraccia(miagolino);


System.out.println();	
System.out.println("7--------------------------");
System.out.println();

EssereUmano persona1 = new EssereUmano("Carlo", "Neri", Sesso.MASCHIO);
persona1.setCodiceFiscale("CCCNNN80B22A662Z");

EssereUmano persona2 = new EssereUmano("Carlo", "Neri", Sesso.MASCHIO);
persona2.setCodiceFiscale("CCCNNN80B22A662Z");

EssereUmano persona3 = new EssereUmano("Carlo", "Neri", Sesso.MASCHIO);
persona3.setCodiceFiscale("CCCNNN80B22A662Z");

//System.out.println(persona1.equals(persona1)); // proprietà riflessiva dell'equals, un oggetto è sempre uguale a se stesso.
//
//System.out.println(persona1.equals(persona2)); // prorietà simmetrica dell'equals, se persona1 è uguale a persona2, allora persona2 è uguale a persona1.
//System.out.println(persona2.equals(persona1)); // prorietà simmetrica dell'equals, se persona2 è uguale a persona1, allora persona1 è uguale a persona2.

System.out.println(persona1.equals(persona2));// proprietà transitiva dell'equals, se persona1 è uguale a persona2 e persona2 è uguale a persona3, allora persona1 è uguale a persona3.
System.out.println(persona2.equals(persona3));
System.out.println(persona1.equals(persona3));

System.out.println(persona1.hashCode());
System.out.println(persona2.hashCode());
System.out.println(persona2.hashCode());

//System.out.println();	
//System.out.println("8--------------------------");
//System.out.println();
//
//Dipendente dipendente1 = new Dipendente();
//dipendente1.faIlCaffe();
//
//Dipendente dipendente2 = new Dipendente();
//dipendente2.faIlCaffe();

System.out.println();	
System.out.println("9--------------------------");
System.out.println();

for (int i = 0; i < 15; i++) {
	MacchinettaDelCaffeThread macchinettaDelCaffeThread = new MacchinettaDelCaffeThread();
	macchinettaDelCaffeThread.start();
}
/*
 * con questo ciclo for stiamo creando 15 thread che chiamano il metodo getInstance() della classe MacchinettaDelCaffe,
 * e con questo stiamo verificando che anche in un contesto multithread,
 *  il pattern singleton funzioni correttamente e che venga creata una sola istanza della classe MacchinettaDelCaffe,
 *  
 *  con la dicitura start() stiamo avviando i thread, e ogni thread eseguirà il metodo run() della classe MacchinettaDelCaffeThread,
 *  
 *  in questo caso, ogni thread chiamerà il metodo getInstance() della classe MacchinettaDelCaffe, e se il pattern singleton è implementato correttamente,
 *  allora verrà creata una sola istanza della classe MacchinettaDelCaffe, e ogni thread otterrà la stessa istanza quando chiamerà il metodo getInstance().
 *  
 *  nel primo caso thread è riuscito ad entrare ben 6 volte nel blocco di codice che crea l'istanza della macchinetta del caffè,
 *   creando così 6 istanze diverse della macchinetta del caffè,
 *   
 *   questo perchè il pattern singleton non è stato implementato in modo thread-safe,
 *    e quindi quando più thread cercano di accedere al metodo getInstance() contemporaneamente,
 *    
 *    
 *    dopo la modifica con il costruttore static e l'eliminazione del controllo con l'if, il pattern singleton è diventato thread-safe, 
 *    e quindi anche in un contesto multithread,
 *    
 *    mentre con il primo test è riuscito ad entrare più volte, con il secondo test non è riuscito ad entrare più volte,
 *     e quindi è stata creata una sola istanza della macchinetta del caffè,
 *     
 *     nel terzo test abbiamo eliminato il costruttore static e abbiamo lasciato il controllo con l'if
 *     questa volta però abbiamo aggiunto il synchronized al metodo getInstance(), in modo da rendere il metodo thread-safe,
 *      e quindi anche in questo caso è stata creata una sola istanza della macchinetta del caffè,
 *      
 *      nel quarto test abbiamo spostato il synchronized nella parte del codice che crea l'istanza della macchinetta del caffè,
 *       in modo da rendere il blocco di codice che crea l'istanza thread-safe,
 *       quindi il syncronized verrà applicato solo quando viene creato l'oggetto, 
 *       e non ogni volta che viene chiamato il metodo getInstance(), ottimizzando le prestazioni del metodo getInstance() in un contesto multithread.
 *     
 *     nel quinto test abbiamo eliminato l'if e abbiamo creato una classe statica interna che contiene l'istanza della macchinetta del caffè,
 *      in questo modo il pattern singleton è diventato thread-safe senza dover usare il synchronized,
 *      e ci migliora le postazioni del metodo getInstance() in un contesto multithread,
 *       poichè non c'è più bisogno di sincronizzare l'accesso al metodo getInstance(),
 *     */





	}
}
