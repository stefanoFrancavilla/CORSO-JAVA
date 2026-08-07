package Argomento_1;

public class Esercizio_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 10;
		
		int numeroPrecedente = 0;
		int numeroCorrente = 1;
		for(int i = 0; i < n; i++)
		{
			System.out.println(numeroPrecedente);
			int numeroSuccessivo = numeroPrecedente +numeroCorrente;
			
			numeroPrecedente = numeroCorrente;
			numeroCorrente = numeroSuccessivo;
		}
	}

}
