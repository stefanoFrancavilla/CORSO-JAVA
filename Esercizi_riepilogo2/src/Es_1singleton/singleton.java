package Es_1singleton;

public class singleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Diagramma logico
		text
		+--------------------+
		|       Main         |
		+--------------------+
		| c1 = getInstance() |
		| c2 = getInstance() |
		+---------+----------+
		          |
		          | usa sempre la stessa istanza
		          v
		+-----------------------------+
		|        ConfigManager        |
		+-----------------------------+
		| - instance : ConfigManager  |
		| - tema : String             |
		+-----------------------------+
		| - ConfigManager()           |
		| + getInstance()             |
		| + setTema(String)           |
		| + getTema()                 |
		+-----------------------------+
		Flusso mentale
		text
		Main
		 ├─ chiede ConfigManager.getInstance()
		 ├─ riceve l'unica istanza
		 ├─ cambia tema in "dark"
		 └─ legge il tema dalla stessa istanza con un'altra variabile
		 
		 Esercizio 1 — Singleton base
Obiettivo
Creare una classe ConfigManager che rappresenti le impostazioni dell’applicazione e che possa esistere in una sola istanza.

Richieste
La classe deve avere un costruttore privato.

Deve avere un metodo statico getInstance().

Deve contenere almeno un campo, per esempio tema.

Deve avere un metodo per leggere e uno per modificare il valore.

Cosa devi fare
Creare due variabili che prendono l’istanza con getInstance().

Dimostrare che puntano allo stesso oggetto.

Cambiare il valore tramite una variabile e verificarlo dall’altra.

Difficoltà
Facile: ti alleni a capire la struttura base del Singleton.


		 
		 */
	}

}
