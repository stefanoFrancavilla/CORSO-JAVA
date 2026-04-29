package esercizi_7;

public class es_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Verificare se un intero specifico è contenuto in un array.
		 */
		
		int [] array = {10, 5, 78, 14, 16, 32, 9};
		
		int numeroDaTrovare = 15;
		
		int controllo = 0;
		
		for(int i = 0; i < array.length; i++)
		{
			if(array[i] == numeroDaTrovare)
			{
				System.out.println("Il numero " + numeroDaTrovare + " è contenuto nell'array");
				break;
			}
			else
			{
				controllo++;
			}
			
			if(controllo == array.length)
			{
				System.out.println("Il numero " + numeroDaTrovare + " non è contenuto nell'array");
			}
		}
	}
// voto 8/10
}
