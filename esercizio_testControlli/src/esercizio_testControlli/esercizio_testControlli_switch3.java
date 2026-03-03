package esercizio_testControlli;

public class esercizio_testControlli_switch3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 3) SWITCH classico (int + default)

📌 Esercizio:
Scrivi una funzione:

public static String giornoSettimana(int giorno)


Che ritorna:

1 → "Lunedì"

2 → "Martedì"

...

7 → "Domenica"

default → "Numero non valido"

✅ Extra: nel main stampa il risultato.
 */
		 int giorno = 5;

	        // chiamata “semplice”
	        giornoSettimana(giorno);

	        // salvataggio in variabile e stampa
	        String messaggio;
	        messaggio = giornoSettimana(giorno);
	        System.out.println("messaggio: " + messaggio);
	    }

	    public static String giornoSettimana(int s) {
	        String messaggio;

	        switch (s) {
	            case 1:
	                messaggio = "Lunedì";
	                break;
	            case 2:
	                messaggio = "Martedì";
	                break;
	            case 3:
	                messaggio = "Mercoledì";
	                break;
	            case 4:
	                messaggio = "Giovedì";
	                break;
	            case 5:
	                messaggio = "Venerdì";
	                break;
	            case 6:
	                messaggio = "Sabato";
	                break;
	            case 7:
	                messaggio = "Domenica";
	                break;
	            default:
	                messaggio = "Numero non valido";
	                break;
	        }

	        return messaggio;
	    }
	}