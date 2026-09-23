package Argomento1_List;

public class EsercizioOfficina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Bicicletta bicicletta1 = new Bicicletta(101, "Mario Rossi", "Cambio freni", 2, 85.50);
		Bicicletta bicicletta2 = new Bicicletta(102, "Luca Bianchi", "Revisione completa", 1, 50.00);
		Bicicletta bicicletta3 = new Bicicletta(103, "Giulia Verdi", "Riparazione ruota", 3, 30.00);
		Bicicletta bicicletta4 = new Bicicletta(104, "Anna Neri", "Sostituzione catena", 2, 40.00);
		Bicicletta bicicletta5 = new Bicicletta(105, "Paolo Gialli", "Cambio freni", 1, 20.00);
		Bicicletta bicicletta6 = new Bicicletta(106, "Sara Blu", "Cambio freni", 2, 25.00);
		
		GestioneOfficina gestioneOfficina = new GestioneOfficina();
		
		System.out.println("Test lista vuota");
		gestioneOfficina.stampaTutteBiciclette();
		System.out.println("--------------------------------");
		//aggiungi biciclette
		
		gestioneOfficina.aggiungiBicicletta(bicicletta1);
		gestioneOfficina.aggiungiBicicletta(bicicletta2);
		gestioneOfficina.aggiungiBicicletta(bicicletta3);
		gestioneOfficina.aggiungiBicicletta(bicicletta4);
		gestioneOfficina.aggiungiBicicletta(bicicletta5);
		gestioneOfficina.aggiungiBicicletta(bicicletta6);
		
		System.out.println();
		System.out.println("Test lista con biciclette");
		gestioneOfficina.stampaTutteBiciclette();
		System.out.println("--------------------------------");
		
		//test bicicletta null
		System.out.println();
		System.out.println("Test bicicletta null");
		gestioneOfficina.aggiungiBicicletta(null);
		System.out.println("--------------------------------");
		
		//test bicicletta con codice duplicato
		System.out.println();
		System.out.println("Test bicicletta con codice duplicato");
		Bicicletta biciclettaDuplicata = new Bicicletta(101, "Mario Rossi", "Cambio freni", 2, 85.50);
		gestioneOfficina.aggiungiBicicletta(biciclettaDuplicata);	
		System.out.println("--------------------------------");
		
		//test cerca bicicletta per codice
		System.out.println();
		System.out.println("Test cerca bicicletta per codice");
		System.out.println(gestioneOfficina.cercaBiciclettePerCodice(103));
		System.out.println("--------------------------------");
		
		//test cerca bicicletta per codice non presente o errato
		System.out.println();
		System.out.println("Test cerca bicicletta per codice non presente o errato");
		System.out.println(gestioneOfficina.cercaBiciclettePerCodice(999));
		System.out.println(gestioneOfficina.cercaBiciclettePerCodice(0));
		System.out.println("--------------------------------");
		
		//test cerca bicicletta per intervento
		System.out.println();
		System.out.println("Test cerca bicicletta per intervento");
		System.out.println(gestioneOfficina.cercaBiciclettePerIntervento("Cambio freni"));
		System.out.println("--------------------------------");
		
		//test cerca bicicletta per intervento non presente o errato
		System.out.println();
		System.out.println("Test cerca bicicletta per intervento non presente o errato");
		System.out.println(gestioneOfficina.cercaBiciclettePerIntervento("Intervento assente"));
		System.out.println(gestioneOfficina.cercaBiciclettePerIntervento(" "));
		System.out.println("--------------------------------");
		
		//test primo e ultimo indice per intervento
		System.out.println();
		System.out.println("Test primo e ultimo indice per intervento");

		System.out.println(
		        gestioneOfficina.cercaIndicePrimaBiciclettaPerIntervento("Cambio freni"));

		System.out.println(
		        gestioneOfficina.cercaIndiceUltimaBiciclettaPerIntervento("Cambio freni"));

		System.out.println("--------------------------------");
		
		System.out.println(
		        gestioneOfficina.cercaIndicePrimaBiciclettaPerIntervento("Intervento assente"));

		System.out.println(
		        gestioneOfficina.cercaIndiceUltimaBiciclettaPerIntervento("Intervento assente"));

		System.out.println(
		        gestioneOfficina.cercaIndicePrimaBiciclettaPerIntervento(" "));

		System.out.println(
		        gestioneOfficina.cercaIndiceUltimaBiciclettaPerIntervento(" "));
		
		//aggiorna costo stimato
		
		System.out.println();
		System.out.println("Test aggiorna costo stimato");
		gestioneOfficina.aggiornaCostoStimato(103, 65.00);
		gestioneOfficina.stampaTutteBiciclette();
		System.out.println("--------------------------------");
		
		gestioneOfficina.aggiornaCostoStimato(999, 50.00);
		gestioneOfficina.aggiornaCostoStimato(0, 50.00);
		gestioneOfficina.aggiornaCostoStimato(101, -10.00);
		System.out.println("--------------------------------");
		
		System.out.println();
		//test rimozione bicicletta per codice
		System.out.println("Test filtro giorni minimi");
		gestioneOfficina.stampaBicicletteConGiorniMinimi(2);
		gestioneOfficina.stampaBicicletteConGiorniMinimi(10);
		gestioneOfficina.stampaBicicletteConGiorniMinimi(0);
		System.out.println("--------------------------------");
		
		System.out.println();
		//test intervento più lungo e costo totale
		System.out.println("Test intervento più lungo e costo totale");
		gestioneOfficina.stampaBiciclettaConInterventoPiuLungo();
		gestioneOfficina.stampaCostoTotaleStimato();
		System.out.println("--------------------------------");
		
		System.out.println();
		System.out.println("Test ordinamento per costo crescente");
		gestioneOfficina.ordinaBiciclettePerCostoCrescente();
		gestioneOfficina.stampaTutteBiciclette();
		System.out.println("--------------------------------");
		
		System.out.println();

		//test rimozione bicicletta per codice
		gestioneOfficina.rimuoviBiciclettaPerCodice(104);
		gestioneOfficina.stampaTutteBiciclette();
		
		//test rimozione bicicletta per codice non presente o errato
		gestioneOfficina.rimuoviBiciclettaPerCodice(999);
		gestioneOfficina.rimuoviBiciclettaPerCodice(0);
		//test rimozione bicicletta per indice
		gestioneOfficina.rimuoviBiciclettaPerIndice(0);
		gestioneOfficina.stampaTutteBiciclette();
		//test rimozione bicicletta per indice non presente o errato
		gestioneOfficina.rimuoviBiciclettaPerIndice(-1);
		gestioneOfficina.rimuoviBiciclettaPerIndice(50);
		
	}

}
