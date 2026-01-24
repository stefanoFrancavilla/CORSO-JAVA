package esercizio_classString;
import java.util.Scanner;
public class esercizio_classString4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scrivere un programma che:

Chiede all’utente di inserire una frase.

Conta quante vocali (a, e, i, o, u) ci sono nella frase, ignorando maiuscole e minuscole.

Stampa:

Il numero totale di vocali trovate.

Quante volte compare ogni vocale.

(Facoltativo 💪) Mostra anche quante consonanti ci sono.*/
		
	       Scanner sc = new Scanner(System.in);

	        System.out.print("Inserisci una frase: ");
	        String frase = sc.nextLine();

	        // Convertiamo la stringa in minuscolo per semplificare il confronto
	        String lower = frase.toLowerCase();

	        int totVocali   = 0;
	        int aCnt = 0, eCnt = 0, iCnt = 0, oCnt = 0, uCnt = 0;
	        int consonanti = 0;

	        for (int i = 0; i < lower.length(); i++) {
	            char c = lower.charAt(i);
	            switch (c) {
	                case 'a':
	                    aCnt++; totVocali++; break;
	                case 'e':
	                    eCnt++; totVocali++; break;
	                case 'i':
	                    iCnt++; totVocali++; break;
	                case 'o':
	                    oCnt++; totVocali++; break;
	                case 'u':
	                    uCnt++; totVocali++; break;
	                default:
	                    // Consideriamo una consonante solo se è una lettera
	                    if (c >= 'a' && c <= 'z') {
	                        consonanti++;
	                    }
	            }
	        }

	        System.out.println("\n--- Risultati ---");
	        System.out.println("Il numero totale di vocali trovate: " + totVocali);
	        System.out.println("   a : " + aCnt);
	        System.out.println("   e : " + eCnt);
	        System.out.println("   i : " + iCnt);
	        System.out.println("   o : " + oCnt);
	        System.out.println("   u : " + uCnt);
	        System.out.println("Il numero di consonanti: " + consonanti);
	    }
	}
