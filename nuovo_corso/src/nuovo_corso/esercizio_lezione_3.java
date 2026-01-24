package nuovo_corso;
import java.util.Scanner;
public class esercizio_lezione_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Somma e sottrazione semplice
Scrivi un programma che:

legge due numeri decimali (usando double o float) inseriti dall’utente,

calcola la somma, la differenza, il prodotto e il rapporto,

stampa i risultati con 2 cifre decimali dopo la virgola.

Attenzione a gestire il caso in cui l’utente inserisca 0 per il secondo numero nel calcolo del rapporto.
		*/

		
		//Se il tuo computer è in italiano, Scanner.nextDouble() si aspetta la virgola.
		//Se vuoi usare il punto (3.14): Aggiungi questa riga dopo aver creato lo Scanner: scanner.useLocale(Locale.US); Se è in inglese, si aspetta il punto.
		
		//Se vuoi usare la virgola (3,14): Aggiungi questa riga: scanner.useLocale(Locale.ITALY); Se è italiano si aspetta la virgola.


        Scanner scanner = new Scanner(System.in);
		System.out.print("inserisci primo numero con la virgola ");
		double numero1 = scanner.nextDouble();
		
		System.out.println();
		System.out.print("inserisci secondo numero con la virgola");
		double numero2 = scanner.nextDouble();
		System.out.println();
		
		boolean run = true;
		
		while (run) 
		{
			System.out.println("-----menù-----");
			System.out.println("1. somma i due numeri");
			System.out.println("2. sottrai dal primo numero il secondo numero");
			System.out.println("3. moltiplica i due numeri");
			System.out.println("4. dividi il primo numero con il secondo numero");
			System.out.println("5. esci ");
			
			int scelta = scanner.nextInt();
			
		switch (scelta)	 
		{
		
		case 1: 
			System.out.println();
			System.out.printf(" la somma dei due numeri è : %.2f%n" , (numero1 + numero2)); // scrivendolo in questo modo non si usa la concatenazione col il + ma si usa la virgola
			System.out.println();
			break;                                                                          // bisogna passare il numero come secondo argomento
			
		case 2:
			System.out.println();
			System.out.printf(" la differenza tra i due numeri è : %.2f%n" , (numero1 - numero2));
			System.out.println();
			break;
			
		case 3:
			System.out.println();
			System.out.printf(" il prodotto dei due numeri è : %.2f%n" , (numero1 * numero2));
			System.out.println();
			break;
			
		case 4:
			System.out.println();
			if (numero2 == 0) {
				System.out.println("errore non si può divedere per 0");
			}
			else
			{	
			System.out.printf(" il rapporto tra i due numeri è : %.2f%n " , (numero1 / numero2));
			}
			System.out.println();
			break;
			
		case 5:
			run = false;
			System.out.println();
			System.out.println("esci dal programma");
			System.out.println();
			break;
			
		default : 
			System.out.println();
			System.out.println("scelta non valida");
			System.out.println();
		}
		}
		scanner.close();
		
		
		
		
	}

}
/* 🧠 Significato semplice: System.out.printf

“Stampare in modo formattato” significa controllare come i dati vengono visualizzati sullo schermo.

Quando usi System.out.println(), Java stampa il valore così com’è:
senza controllare quanti decimali, spazi, o come appaiono i numeri o le parole.

Con System.out.printf(), invece, puoi decidere tu il formato:
quante cifre mostrare, dove mettere gli spazi, se andare a capo, se scrivere numeri con o senza virgola, ecc.

🎨 Esempio pratico
👉 Senza printf:
double numero = 3.1415926535;
System.out.println("Il numero è: " + numero);


🖥️ Output:

Il numero è: 3.1415926535


→ Troppi decimali, disordinato.

👉 Con printf (formattato):
double numero = 3.1415926535;
System.out.printf("Il numero è: %.2f%n", numero);


🖥️ Output:

Il numero è: 3.14


✅ Più pulito!

%.2f = mostra il numero float (f) con 2 cifre dopo la virgola.

%n = vai a capo.

📋 Altri esempi utili:
Formato	Significato	Esempio	Output
%.2f	Numero decimale con 2 cifre dopo la virgola	3.14159	3.14
%.3f	Numero decimale con 3 cifre	2.71828	2.718
%d	Numero intero	42	42
%s	Testo (stringa)	"Ciao"	Ciao
%10.2f	Numero con spazi davanti per occupare 10 caratteri totali	3.14	" 3.14"
%-10.2f	Numero allineato a sinistra (spazi dopo)	3.14	"3.14 "
💬 Riassunto semplice
Metodo	Cosa fa
println()	Stampa “così com’è” e va a capo
print()	Stampa “così com’è” senza andare a capo
printf()	Stampa con formato controllato (tu decidi come apparirà il testo o i numeri)*/