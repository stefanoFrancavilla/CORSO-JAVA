package Argomento_4_3;

public class Rifugio {

	public void mostraCosto (Animale animale, int giorni)
	{
		if (giorni > 0)
		{
			double costoTotale = animale.calcoloCostoGiornaliero() * giorni;
			System.out.println("Nome : " + animale.nome + " Giorni : " + giorni + " CostoGionaliero : " + animale.calcoloCostoGiornaliero() + 
					" Costo totale : " + costoTotale);
		}
		else
		{
			System.out.println("I giorni non possono essere inferiori o uguale a 0");
		}
	}
	
	
}
