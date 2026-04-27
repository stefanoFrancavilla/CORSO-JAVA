package esercizi_6;

public class es_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Utilizzando le caratteristiche del linguaggio imparate fino ad ora,
           scrivere un metodo chiamato ottieniNumeroDiOccorrenze() che, dati in input un carattere c ed una stringa s,
           restituisca il numero delle occorrenze di c in s.
		 */
		
		ottieniNumeroDiOccorrenze('a',"vacanza" );
		
	}

	public static int ottieniNumeroDiOccorrenze(char c , String s)
	{
		int contatore = 0;
		for(int i = 0; i < s.length(); i++)
		{
			char carattereCorrente = s.charAt(i);
			
			if(carattereCorrente == c)
			{
				contatore++;
			}
		}
		
		System.out.println(" Il carattere: " + c + "\n nella stringa: " + s + "\n compare: " + contatore + " volte");
		return contatore;
	}
	// voto 9/10
}
