package Argomento_4_3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animale cane =
		        new Cane("Rocky", 4, 10.0, true);

		Animale gatto =
		        new Gatto("Milo", 2, 8.0, false);

		Animale uccello =
		        new Uccello("Tweety", 1, 6.0, true);

		Rifugio rifugio = new Rifugio();
		
		rifugio.mostraCosto(cane, 3);
		rifugio.mostraCosto(gatto, 5);
		rifugio.mostraCosto(uccello, 2);
		rifugio.mostraCosto(cane, 0);
	}

}
