package Es_8;

public class es_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Esercizio 8: Classe Rettangolo
           Classe con lati double. Metodi: area(), perimetro(), isQuadrato(). Main: 3 rettangoli, statistiche.
		 */
		
		Rettangolo figura1 = new Rettangolo(15, 30, 15, 30);
		Rettangolo figura2 = new Rettangolo(30, 30, 30, 30);
		Rettangolo figura3 = new Rettangolo(15, 25, 15, 25);
		
	System.out.println("Il calcolo dell'area della figura1 è: " + figura1.calcoloArea());
	System.out.println("Il calcolo del perimetro della figura1 è: " + figura1.calcoloPerimetro());
	System.out.println("La figura1 è " + figura1.isQuadrato() + " che è un quadrato");
		
	System.out.println();
	
	System.out.println("Il calcolo dell'area della figura2 è: " + figura2.calcoloArea());
	System.out.println("Il calcolo del perimetro della figura2 è: " + figura2.calcoloPerimetro());
	System.out.println("La figura2 è " + figura2.isQuadrato() + " che è un quadrato");
	
	System.out.println();
	
	System.out.println("Il calcolo dell'area della figura3 è: " + figura3.calcoloArea());
	System.out.println("Il calcolo del perimetro della figura3 è: " + figura3.calcoloPerimetro());
	System.out.println("La figura3 è " + figura3.isQuadrato() + " che è un quadrato");
	}

}
