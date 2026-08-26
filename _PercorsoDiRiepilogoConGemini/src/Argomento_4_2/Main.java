package Argomento_4_2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Veicolo auto = new Auto("Stefano", 10);

		Veicolo moto = new Moto("Marco", 50.0, 12.5);

		AgenziaNoleggio agenzia = new AgenziaNoleggio();
		
		agenzia.gestisciNoleggio(auto, 4);
		agenzia.gestisciNoleggio(auto, 8);

		agenzia.gestisciNoleggio(moto, 2);
		agenzia.gestisciNoleggio(moto, 3);
	}

}
