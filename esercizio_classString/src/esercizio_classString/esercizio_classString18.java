package esercizio_classString;

import java.util.Scanner;

public class esercizio_classString18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ESERCIZIO: Confronto tra String, StringBuffer e StringBuilder in un’operazione reale
🎯 Obiettivo

Scrivere un programma che:

Chieda all’utente una parola o frase.

Ripeta questa parola per un numero N di volte usando:

String

StringBuffer

StringBuilder

Misuri e confronti i tempi di esecuzione.

Mostri quale dei tre è risultato più veloce.

📝 SPECIFICHE

💡 Hint: concatenare con String dentro un ciclo è molto lento perché String è immutabile.

🔧 Requisiti dell’esercizio

Implementa un programma che:

1️⃣ Chieda all’utente:

Una frase da ripetere

Quante volte ripeterla (es. 50 000)

2️⃣ Esegua 3 cicli separati:
🔹 Con String
String s = "";
for(int i = 0; i < n; i++){
    s += frase;
}

🔹 Con StringBuffer
StringBuffer sbf = new StringBuffer();
for(int i = 0; i < n; i++){
    sbf.append(frase);
}

🔹 Con StringBuilder
StringBuilder sbd = new StringBuilder();
for(int i = 0; i < n; i++){
    sbd.append(frase);
}

3️⃣ Registra il tempo di ogni operazione

Con:

long start = System.currentTimeMillis();
// codice...
long end = System.currentTimeMillis();

4️⃣ Stampa i risultati in questo formato:
String ha impiegato:  ---- ms
StringBuffer ha impiegato: ---- ms
StringBuilder ha impiegato: ---- ms

il più veloce è: ...
		 */
		
	    Scanner scanner = new Scanner(System.in);
	    
	    System.out.println("Inserisci una parola, o una frase");
	    
	    String  parola = scanner.nextLine();
	    
	    System.out.println("Inserisci il numero di volte che dovrà ripetersi");
	    
	    int limit = scanner.nextInt();
		
		String s = "";
		
		long timeStart = System.currentTimeMillis();
		
		for(int i = 0; i < limit; i++) {
			s = s + parola;
		}
		long timeEnd = System.currentTimeMillis();
		
		long timeString = timeEnd - timeStart;
		
		System.out.println("String ha impiegato: " + timeString + " ms");
		System.out.println("-----------------------------------------------");
		
		StringBuffer sbf = new StringBuffer();
		
		long timeStart2 = System.currentTimeMillis();
		
		for(int i = 0; i < limit; i++) {
			sbf.append(parola);
		}
		long timeEnd2 = System.currentTimeMillis();
		
		long timeSbf = timeEnd2 - timeStart2;
		
		System.out.println("StringBuffer ha impiegato: " + timeSbf + " ms");
		System.out.println("-----------------------------------------------");
		
		StringBuilder sbd = new StringBuilder();
		long timeStart3 = System.currentTimeMillis();
		
		for(int i = 0; i < limit; i++) {
			sbd.append(parola);
		}
		long timeEnd3 = System.currentTimeMillis();
		
		long timeSbd = timeEnd3 - timeStart3;
		
		System.out.println("StringBuilder ha impiegato: " + timeSbd + " ms");
		System.out.println("-----------------------------------------------");
		
		String vincitore = "String";
		
		long time = timeString;
		
		if (timeSbf < time)
		{
			vincitore = "StringBuffer";
			time = timeSbf;
		}
		
		if (timeSbd < time) 
		{
			vincitore = "StringBuilder";
			time = timeSbd;
		}
		
		System.out.println("Il più veloce è: " + vincitore);
		
		scanner.close();
		
		
		
		
		
		
		
		
		
		
	/*	
		Voto (1–10)

		8/10.

		Perché:

		✅ logica corretta, 3 cicli separati, tempi e vincitore ok

		✅ input gestito bene

		⚠️ benchmark migliorabile (nanoTime + preallocazione + consumo risultato)*/

 
		
	}

}
