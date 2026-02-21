package incapsulamentoDeiDati;

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
marcoRossi.setAltezza (1.73f);
marcoRossi.setPeso (70f);
marcoRossi.setColoreOcchi (ColoreOcchi.AZZURRI);
marcoRossi.setColoreCapelli (ColoreCapelli.CASTANI);
marcoRossi.setNazioneDiNascita ("Italia");

marcoRossi.stampa();
marcoRossi.mangia();
marcoRossi.lavora();

System.out.println();
System.out.println("2--------------------------");
System.out.println();

EssereUmano saraVerdi = new EssereUmano("Sara",
		"Verdi",
		Sesso.FEMMINA,
		(byte) 48, // si fa il cast da int a byte, per evitare l'errore di compilazione.
		1.71f,
		55f,
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

lucaBianchi.setAnni((byte)-45);
lucaBianchi.setAltezza(-1.80f);
lucaBianchi.setPeso(-70.8f);
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
	}

}
