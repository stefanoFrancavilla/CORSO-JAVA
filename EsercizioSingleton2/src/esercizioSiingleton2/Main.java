package esercizioSiingleton2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente mario = new Cliente("Mario");
		Cliente luigi = new Cliente("Luigi");
		Cliente peach = new Cliente("Peach");
		Cliente toad = new Cliente("Toad");
		Cliente bowser = new Cliente("Bowser");
		
		mario.start();
		System.out.println();
		luigi.start();
		System.out.println();
		peach.start();
		System.out.println();
		toad.start();
		System.out.println();
		bowser.start();
		System.out.println();
		
		
	}

}
