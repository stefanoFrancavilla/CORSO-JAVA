package incapsulamentoDeiDati;
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
		"Italia");

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

ClasseProtettiDiversoPackage testProtected2 = new ClasseProtettiDiversoPackage();
//testProtected2.nome = "Luca";
//testProtected2.stampa();

/*
 * con protected no riusciamo ad accedere alla classe che si trova in un package diverso
 * 
 */

	}

}
