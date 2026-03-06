package esercizio_classArray;

public class esercizio_di_riepilogo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Array da ordinare
java
int[] numeriEsercizio = {61, 24, 81, 70, 30, 92, 96, 84};
Copia questo codice e ordinalo dal più grande al più piccolo (96, 84, 92, ...? Prova tu!).

Istruzioni
Crea int[] classifica = numeriEsercizio.clone();

Usa esattamente lo stesso bubble sort con i due cicli for

Stampa il risultato con System.out.println(Arrays.toString(classifica));

Esegui e verifica!

Risultato atteso: [96, 92, 84, 81, 70, 61, 30, 24]
​
 * 
 */
		
		int[] numeriEsercizio = {61, 24, 81, 70, 30, 92, 96, 84};
		
		int[] classifica = numeriEsercizio.clone();
		
		int n = numeriEsercizio.length;
		
		for (int i = 0; i < n -1; i++ )
		{
			for(int j = 0; j < n -i -1; j++)
			{
				if (classifica[j] < classifica[j+1])
				{
					int temp = classifica[j];
					classifica[j] = classifica[j+1];
					classifica[j+1] = temp;
				}
			}
		}
		for( int num : classifica)
		{
			System.out.println(num);
		}
            
	}

}
