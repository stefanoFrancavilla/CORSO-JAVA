package Argomento_1;

public class Esercizio_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int numero = 7;
		
		if (numero == 2 || numero == 3 || numero == 5 || numero == 7)
		{
			System.out.println("Il numero " + numero + " è un numero primo");
		}
		else
		{
			
		
		
		   if ((numero % 2 != 0) && (numero % 3 != 0) && (numero % 5 != 0) && (numero % 7 != 0))
		   {
			System.out.println("Il numero " + numero + " è un numero primo");
		   }
		   else
		   {
		   	System.out.println("Il numero " + numero + " non è un numero primo");
		   }
		}
		
		
	}

}
