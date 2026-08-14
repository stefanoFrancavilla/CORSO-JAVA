package Argomento_4;

public class Esercizio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Esercizio 1 (Facile) — Gerarchia Veicolo e Moto
Crea una classe base Veicolo con attributi protetti (protected) o privati con getter: marca (String) e velocitaMassima (int).
 Aggiungi un metodo mostraInfo().

Crea una sottoclasse Moto che estende Veicolo, aggiungendo il campo haIlBauletto (boolean).

Nel costruttore di Moto, richiama il costruttore della superclasse tramite super(...).

Fai l'override del metodo mostraInfo() per stampare anche l'informazione sul bauletto.
		 */
		
		Veicolo moto1 = new Moto("Yamaha", 180, true);
		moto1.mostraInfo();
	}

}
