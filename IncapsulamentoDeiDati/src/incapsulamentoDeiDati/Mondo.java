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

marcoRossi.nome = "Marco";
marcoRossi.cognome = "Rossi";
marcoRossi.sesso = Sesso.MASCHIO; // si accede all'enum Sesso con la notazione punto.
marcoRossi.anni = 18;
marcoRossi.altezza = 1.73f;
marcoRossi.peso = 70f;
marcoRossi.coloreOccihi = ColoreOcchi.AZZURRI; // si accede all'enum ColoreOcchi con la notazione punto.
marcoRossi.coloreCapelli = ColoreCapelli.CASTANI; 
marcoRossi.nazioneDiNascita = "Italia";

marcoRossi.stampa();
marcoRossi.mangia();
marcoRossi.lavora();

System.out.println();
System.out.println("2--------------------------");
System.out.println();
	}

}
