package Argomento_1;

public class Esercizio_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int temperatura = 22;
		
		if(temperatura < 15)
		{
			System.out.println("Fa freddo");
		}
		else if ((temperatura > 15) && (temperatura < 25))
		{
			System.out.println("Temperatura ideale");
		}
		else
		{
			System.out.println("Fa caldo");
		}
	}

}
