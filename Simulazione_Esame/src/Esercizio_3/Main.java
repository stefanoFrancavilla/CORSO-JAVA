package Esercizio_3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animale pippo = new Cane();
		Animale micio = new Gatto();
		Animale pluto = new Cane();
		
		Animale[] animali = {pippo, micio, pluto};
		
		for (Animale animaleCorrente : animali)
		{
			animaleCorrente.verso();
		}
	
	}

}
