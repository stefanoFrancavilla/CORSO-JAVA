package Es_10;

public class es_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Esercizio 10: Array Oggetti Auto
           Classe Auto (marca String, km int). Array 4 Auto. Metodo stampa tutte + conta km totali.
		 */
		
		Auto alfa = new Auto("Alfa", 25000);
		Auto bmw = new Auto("BMW", 42000);
		Auto cupra = new Auto("Cupra", 12000);
		Auto dr = new Auto("dr", 7000);
		
		alfa.stampaSingola();
		bmw.stampaSingola();
		cupra.stampaSingola();
	    dr.stampaSingola();
	    System.out.println();
	    
		Auto[] garage = new Auto[4];
		garage[0] = alfa;
		garage[1] = bmw;
		garage[2] = cupra;
		garage[3] = dr;
		
		Auto.stampaTotale(garage);
		
	}
//voto 9.5/10
}
