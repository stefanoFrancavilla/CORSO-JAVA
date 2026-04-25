package esercizi_2;

public class es_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Riscrivere la seguente logica condizionale utilizzando il metodo della tolleranza visto a lezione.

if((9 - 5.4) == 3.6)
{
	System.out.println("Ok!");
}
else
{
	System.out.println("Ko!");
}

		 */
		
		double risultato = 9 - 5.4;
		double atteso = 3.6;
		double tolleranza = 0.0000001;
		
		if (Math.abs(risultato - atteso) < tolleranza)
		{
			System.out.println("Ok!");
		}
		else
		{
			System.out.println("Ko!");
		}	
		
		
	/*
	 * Scrivi un programma Java che:

calcoli 7.2 - 4.8

confronti il risultato con 2.4

usi una tolleranza di 0.000001

stampi "Valori uguali" se la differenza è dentro la tolleranza

stampi "Valori diversi" altrimenti	
	 */
		
		double risultato2 = 7.2 - 4.8;
		double atteso2 = 2.4;
		double tolleranza2 = 0.000001;
		
		if(Math.abs(risultato2 - atteso2) < tolleranza)
		{
			System.out.println("Valori uguali");
		}
		else
		{
			System.out.println("Valori diversi");
		}
		
		
		
	}
/*
 * 8.5/10
 */
}
