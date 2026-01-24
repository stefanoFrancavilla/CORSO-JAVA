package esercizio_classArray;
import java.util.Scanner;
public class esercizio_classArray6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ESERCIZIO: Tabella voti studenti

Scrivi un programma che:

Crei un array bidimensionale di interi con 4 studenti (righe) e 3 voti ciascuno (colonne).
Esempio: int[][] voti = new int[4][3];

Chieda all’utente, tramite Scanner, di inserire i 3 voti per ogni studente.

Dopo aver riempito tutto l’array, il programma deve:

stampare tutti i voti in formato tabellare (riga per riga)

calcolare e stampare la media dei voti di ogni studente

calcolare e stampare la media totale di tutti i voti

💡 Esempio di output desiderato
Inserisci i voti dello studente 0:
Voto 0: 7
Voto 1: 8
Voto 2: 6

Inserisci i voti dello studente 1:
Voto 0: 9
Voto 1: 7
Voto 2: 8
...

--- TABELLone VOTI ---
Studente 0: 7 8 6 
Studente 1: 9 7 8 
Studente 2: ...
Studente 3: ...

Media studente 0: 7.0
Media studente 1: 8.0
...

Media totale della classe: 7.5

🔥 Obiettivi didattici

Con questo esercizio allenerai:

✔ creazione di array bidimensionali
✔ uso del doppio ciclo for
✔ accesso ai singoli elementi con voti[i][j]
✔ interazione con l’utente tramite Scanner
✔ calcolo di medie
✔ stampa tabellare dei valori
		 */
	
		Scanner scanner = new Scanner(System.in);
		
		int [][] voti = new int [4][3];
		
		System.out.println("inserisci i voti dello studente 0");
		voti[0][0] = scanner.nextInt();
		voti[0][1] = scanner.nextInt();
		voti[0][2] = scanner.nextInt();
		System.out.println("inserisci i voti dello studente 1");
		
		voti[1][0] = scanner.nextInt();
		voti[1][1] = scanner.nextInt();
		voti[1][2] = scanner.nextInt();
		System.out.println("inserisci i voti dello studente 2");
		voti[2][0] = scanner.nextInt();
		voti[2][1] = scanner.nextInt();
		voti[2][2] = scanner.nextInt();
		System.out.println("inserisci i voti dello studente 3");
		voti[3][0] = scanner.nextInt();
		voti[3][1] = scanner.nextInt();
		voti[3][2] = scanner.nextInt();
		
		System.out.println("----------TABELLONE VOTI-----------");
		
		String studente0 ="";
		String studente1 ="";
		String studente2 ="";
		String studente3 ="";
		
		String spazio = " ";
		
		double media0 = 0;
	    double media1 = 0;
		double media2 = 0;
		double media3 = 0;
		
		double mediaTotale;

		
		
		for(int i = 0; i < voti.length; i++)
		{
			if (i == 0)
			{
				for(int s = 0; s < voti[i].length; s++)
				{
					studente0 = studente0 + voti[i][s] + spazio; 
					media0 = media0 + voti[i][s];
 				}	
			}
			else if (i == 1)
			{
				for(int s = 0; s < voti[i].length; s++)
				{
					studente1 = studente1 + voti[i][s] + spazio; 
					media1 = media1 + voti[i][s];
				}	
			}
			else if (i == 2)
			{
				for(int s = 0; s < voti[i].length; s++)
				{
					studente2 = studente2 + voti[i][s] + spazio; 
					media2 = media2 + voti[i][s];
				}	
			}
			else if (i == 3)
			{
				for(int s = 0; s < voti[i].length; s++)
				{
					studente3 = studente3+ voti[i][s] + spazio; 
					media3 = media3 + voti[i][s];
				}	
			}
			
		}
		
		mediaTotale = media0 + media1 + media2 + media3;
		
		
		System.out.println("Studente 0: " + studente0);
		System.out.println("Studente 1: " + studente1);
		System.out.println("Studente 2: " + studente2);
		System.out.println("Studente 3: " + studente3);
		
		System.out.println("---------------------------");
		
		System.out.println("Media studente 0: " + (media0 / 3));
		System.out.println("Media studente 1: " + (media1 / 3));
		System.out.println("Media studente 2: " + (media2 / 3));
		System.out.println("Media studente 3: " + (media3 / 3));
		
		System.out.println("---------------------------");
		
		System.out.println("Media totale della classe: " + (mediaTotale / 12));
		
		scanner.close();
		
		/*
		 * import java.util.Scanner;

public class TabellaVoti {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int studenti = 4;
        int votiPerStudente = 3;

        int[][] voti = new int[studenti][votiPerStudente];

        // --- INPUT VOTI ---
        for (int i = 0; i < studenti; i++) {
            System.out.println("Inserisci i voti dello studente " + i + ":");
            for (int j = 0; j < votiPerStudente; j++) {
                System.out.print("Voto " + j + ": ");
                voti[i][j] = scanner.nextInt();
            }
            System.out.println(); // Riga vuota per estetica
        }

        System.out.println("\n--- TABELLONE VOTI ---");

        double sommaTotale = 0;
        int numeroTotaleVoti = studenti * votiPerStudente;

        // --- STAMPA TABELLA + CALCOLO MEDIE PER STUDENTE ---
        for (int i = 0; i < studenti; i++) {
            double sommaStudente = 0;

            System.out.print("Studente " + i + ": ");
            for (int j = 0; j < votiPerStudente; j++) {
                System.out.print(voti[i][j] + " ");
                sommaStudente += voti[i][j];
                sommaTotale += voti[i][j];
            }

            double mediaStudente = sommaStudente / votiPerStudente;
            System.out.println(" -> Media: " + mediaStudente);
        }

        // --- MEDIA TOTALE ---
        double mediaTotaleClasse = sommaTotale / numeroTotaleVoti;

        System.out.println("\nMedia totale della classe: " + mediaTotaleClasse);

        scanner.close();
    }
}
		 */
		
	}

}
