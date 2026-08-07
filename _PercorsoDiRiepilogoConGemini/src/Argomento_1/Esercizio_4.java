package Argomento_1;

public class Esercizio_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero = -4;
		
		if (numero < 0) 
		{
			System.out.println("Il numero " + numero +  " è negativo");
		}
		else if (numero > 0)
		{
			System.out.println("Il numero " + numero +  " è positivo");
		}
		else
		{
			System.out.println("Il numero è uguale a 0");
		}
		
		if (numero != 0)
		{
		
			boolean isPari = numero % 2 == 0; 
			if (isPari == true)
			{
				System.out.println("Il numero " + numero +  " è pari");
			}
			else 
			{
				System.out.println("Il numero " + numero +  " è dispari");
			}
		}
	}

}
