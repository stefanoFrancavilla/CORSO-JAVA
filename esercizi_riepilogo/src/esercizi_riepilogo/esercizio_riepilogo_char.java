package esercizi_riepilogo;

import java.util.Scanner;

public class esercizio_riepilogo_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Ecco un esercizio composto e completo sul tipo char in Java che integra dichiarazione, operazioni, Unicode, String, array e logica di controllo. Perfetto per una pratica approfondita!
//
//		Esercizio: Analizzatore di Password Sicura
//		Scenario: Crea un programma che analizza una password inserita dall'utente e verifica i suoi requisiti di sicurezza usando il tipo char.
//
//		Requisiti da implementare:
//		Input: Leggi una password dall'utente (usa Scanner)
//
//		Analisi caratteri: Per ogni char della password:
//
//		Conta lettere maiuscole, minuscole, cifre e simboli speciali
//
//		Verifica lunghezza minima (min. 8 caratteri)
//
//		Validazione sicurezza:
//
//		Almeno 1 maiuscola, 1 minuscola, 1 cifra, 1 simbolo speciale
//
//		Nessun carattere di spazio
//
//		Output dettagliato con statistiche e suggerimenti
		
		/*
		 * Compito dettagliato:
1. Completa analizzaPassword():

java
// Esempi di controlli da implementare:
if (Character.isUpperCase(c)) analisi.maiuscole++;
else if (Character.isLowerCase(c)) analisi.minuscole++;
else if (Character.isDigit(c)) analisi.cifre++;
else if (Character.isWhitespace(c)) analisi.spazi++;
else analisi.simboli++;
analisi.lunghezza = password.length();
2. In stampaRisultati() implementa:

Statistiche: "Maiuscole: X, Minuscole: Y, Cifre: Z, Simboli: W"

Barra di sicurezza visiva usando char ripetuti (★☆▰▱)

Verifica requisiti e suggerimenti:

text
Password "abc123": ❌ INSICURA
- Mancano maiuscole
- Mancano simboli
- Troppo corta
3. Bonus (opzionale):

Calcola "forza" della password (1-5 stelle ★)

Rileva caratteri accentati italiani (à, è, ì...)

Genera suggerimenti personalizzati

Output atteso (esempio):
text
=== ANALISI PASSWORD ===
Password: "Passw0rd!"
Lunghezza: 9 caratteri

📊 STATISTICHE:
Maiuscole: 1 (P) | Minuscole: 6 | Cifre: 1 | Simboli: 1 | Spazi: 0

🔒 SICUREZZA: ✅ VALIDA
▰▰▰▰▱ Forza: 4/5

Perfetta! Ha tutti i requisiti di sicurezza.
Test cases da provare:
text
"abc" → INSICURA (troppo corta, no maiuscole/cifre/simboli)
"ABC123" → INSICURA (no minuscole/simboli)  
"P@ssw0rd" → VALIDA
"    " → INSICURA (solo spazi)
"àèìòù123A!" → VALIDA (include accentati)
Prova a implementarlo! È un esercizio pratico che usa char in molti contesti reali. Condividi il tuo codice per feedback dettagliato! 
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Inserisci la password da analizzare: ");
		scanner.nextLine(); 
		String password = scanner.nextLine();
		
		
		boolean verifica_password = true;
		
		int maiuscole = 0;
		int minuscole = 0;
		int cifre = 0;
		int simboli = 0;
		int spazi = 0;
		
		for (int i = 0; i < password.length(); i++) {
			char c = password.charAt(i);
			
			if (Character.isUpperCase(c)) maiuscole++; 
			else if (Character.isLowerCase(c)) minuscole++;
			else if (Character.isDigit(c)) cifre++;
			else if (Character.isWhitespace(c)) spazi++;
			else simboli++;
		}
		
		if (password.length() < 8) {
			verifica_password = false;
			System.out.println("La password è troppo corta. Deve essere di almeno 8 caratteri.");
		}
		if (maiuscole == 0) {
			verifica_password = false;
			System.out.println("La password deve contenere almeno una lettera maiuscola.");
		}
		if (minuscole == 0) {
			verifica_password = false;
			System.out.println("La password deve contenere almeno una lettera minuscola.");
		}
		if (cifre == 0) {
			verifica_password = false;
			System.out.println("La password deve contenere almeno una cifra.");
		}
		if (simboli == 0) {
			verifica_password = false;
			System.out.println("La password deve contenere almeno un simbolo speciale.");
		}
		if (spazi > 0) {
			verifica_password = false;
			System.out.println("La password non deve contenere spazi.");
		}
		
		System.out.println("\n=== ANALISI PASSWORD ===");
		System.out.println("Password: \"" + password + "\"");
		System.out.println("Lunghezza: " + password.length() + " caratteri");
		System.out.println("\n📊 STATISTICHE:");
		System.out.println("Maiuscole: " + maiuscole + " | Minuscole: " + minuscole + " | Cifre: " + cifre + " | Simboli: " + simboli + " | Spazi: " + spazi);
		
		
		
		
	}

}
