package esercizio_testControlli;

public class esercizio_testControlli_switch9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 9) FOREACH su Enum.values()

📌 Esercizio:
Stampa tutti i valori di Ruolo, ma in questo formato:

1) ADMIN
2) UTENTE
3) OSPITE


✅ Suggerimento: contatore int i = 1;
 */
		
		int i = 0;
		for (Ruolo ruolo : Ruolo.values())
		{
			System.out.println(i + ") " + ruolo);
			i++;
		}
	}

}
