package EsercizioVeicoli;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Auto alfa = new Auto("alfa", "159", 1900, 5);
		Moto vespa = new Moto("piaggio", "vespa", 50, false);
		Bicicletta graziella = new Bicicletta("bianchi", "graziella", 0 );
	
		
		Veicolo[] veicoli = new Veicolo[3];
	
		veicoli[0] = alfa;
		veicoli[1] = vespa;
		veicoli[2] = graziella;
		
		for(int i = 0; i < veicoli.length; i++)
		{
		   veicoli[i].avvia();
		   veicoli[i].mostraInfo();
		   veicoli[i].ferma();
		}
		
	}

}
