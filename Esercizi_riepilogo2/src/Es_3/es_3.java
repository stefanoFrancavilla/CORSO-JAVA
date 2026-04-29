package Es_3;

public class es_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Esercizio 3: Media Voti con Approvazione
           Array 7 double (voti). Calcola media con metodo. Conta promossi (>=6) e stampa "Classe promossa" se media>6.
		 */
		double contaPromossi = 0;
		
		double [] voti = new double[7];
		
		for (int i=0; i<voti.length; i++)
		{
			voti[i] = Math.random() * 10; 
			if (voti[i] >= 6)
			{
				contaPromossi++;
			}
		}
		
		if (media(voti) >= 6)
		{
			System.out.println("Numero di promossi: " + contaPromossi);
			System.out.println("Media: " + media(voti));
			System.out.println("Classe promossa");
		}
		 else
		 {
			 System.out.println("Numero di promossi: " + contaPromossi);
		     System.out.println("Media: " + media(voti));
			 System.out.println("Classe bocciata");
		 }
		 
		
		
	}
	
	public static double media(double [] voti)
	{
		double mediaVoti = 0;
		for(int i=0; i<voti.length; i++)
		{
			mediaVoti += voti[i];
		}
		mediaVoti = mediaVoti / voti.length;
		return mediaVoti;
	}
//voto 9/10
}
