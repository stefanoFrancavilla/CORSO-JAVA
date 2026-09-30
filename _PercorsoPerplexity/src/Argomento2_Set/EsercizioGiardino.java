package Argomento2_Set;

public class EsercizioGiardino {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GestioneGiardino gg = new GestioneGiardino();
		
		Pianta p1 = new Pianta(1, "Rosa", "Rosaceae", false);
		Pianta p2 = new Pianta(2, "Tulipano", "Liliaceae", false);
		Pianta p3 = new Pianta(3, "Pino", "Pinaceae", true);
		Pianta p4 = new Pianta(4, "Abete", "Pinaceae", true);
		
		gg.aggiungiPianta(p1);
		gg.aggiungiPianta(p2);
		gg.aggiungiPianta(p3);
		gg.aggiungiPianta(p4);
		
		gg.stampaTutteLePiante();
	}

}
