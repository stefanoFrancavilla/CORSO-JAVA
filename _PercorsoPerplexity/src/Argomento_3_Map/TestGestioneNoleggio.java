package Argomento_3_Map;

import Argomento2_Set.Attrezzatura;

public class TestGestioneNoleggio {

	public static void main(String[] args) {
	
		
		GestioneNoleggio gestioneNoleggio = new GestioneNoleggio();
		
		Attrezzatura tenda = new Attrezzatura(1, "Tenda", "Campeggio", 10.0, true);
		Attrezzatura saccoAPelo = new Attrezzatura(2, "Sacco a pelo", "Campeggio", 5.0, true);
		Attrezzatura trapano = new Attrezzatura(3, "Trapano", "Edilizia", 20.0, true);
		
		gestioneNoleggio.aggiungiAttrezzatura(tenda);
		gestioneNoleggio.aggiungiAttrezzatura(saccoAPelo);
		gestioneNoleggio.aggiungiAttrezzatura(trapano);
		
		Noleggio noleggio1 = gestioneNoleggio.creaNoleggio(101, 1, "Mario Rossi", 3);
		Noleggio noleggio2 = gestioneNoleggio.creaNoleggio(102, 2, "Luca Bianchi", 5);
		
		Noleggio noleggio3 = gestioneNoleggio.creaNoleggio(103, 1, "Giulia Verdi", 2);
		
		System.out.println("Noleggio 3 (attrezzatura 1) creato: " + (noleggio3 != null));
		
		System.out.println("Tutti i noleggi:");
		gestioneNoleggio.stampaTuttiINoleggi();
		
		System.out.println("Noleggi attivi: " + gestioneNoleggio.contaNoleggiAttivi());
		System.out.println("Noleggi completati: " + gestioneNoleggio.contaNoleggiCompletati());
		
		System.out.println("Noleggio 101 completato: " + gestioneNoleggio.completaNoleggio(101));
		
		System.out.println("Noleggi attivi: " + gestioneNoleggio.contaNoleggiAttivi());
		System.out.println("Noleggi completati: " + gestioneNoleggio.contaNoleggiCompletati());
		
		Noleggio noleggio4 = gestioneNoleggio.creaNoleggio(104, 1, "Giulia Verdi", 2);
		System.out.println("Noleggio 4 (attrezzatura 1) creato: " + (noleggio4 != null));
		System.out.println("Tutti i noleggi:");
		gestioneNoleggio.stampaTuttiINoleggi();
		
		
	}

}
