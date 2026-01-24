package esercizio_testControlli;

public class esercizio_testControlli_switch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * IF / ELSE IF (scelta multipla)

📌 Esercizio:
Hai una variabile voto (0–10).
Stampa:

Insufficiente se voto < 6

Sufficiente se voto == 6

Buono se voto == 7 o 8

Ottimo se voto == 9

Eccellente se voto == 10

✅ Extra: se voto è fuori 0–10 stampa "Valore non valido"
 */
		int voto = 8;
		
		if ( voto < 6 && voto >= 0 )
		{
			System.out.println("Insufficiente");
		}
		else if ( voto == 6 )
		{
			System.out.println("Sufficiente");
		}
		else if ( voto == 7 || voto == 8)
		{
			System.out.println("Buono");
		}
		else if ( voto == 9 )
		{
			System.out.println("Ottimo");
		}
		else if ( voto == 10 )
		{
			System.out.println("Eccellente");
		}
		else 
		{
			System.out.println("Valore non valido");
		}
		/*
		 * 🧾 Il tuo voto: 9/10
Motivo:

✅ Hai usato bene:

if / else if / else

operatori logici && e ||

condizioni precise (7 o 8, ecc.)

🔧 Ti tolgo 1 punto solo perché:

l’extra ("valore non valido") è gestito, ma non in modo ottimale come struttura (meglio controllarlo subito all’inizio)

💪 Per il resto, ottimo lavoro!
		 */
	}

}
