package esercizio_riepilogo_classString;

public class metodi_base_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Metodi Base String
           Scrivi un metodo che prende una String, usa charAt(0), 
           codePointAt(0), length() e un ciclo for per stampare ogni carattere
           e il suo codice. Testa su "Java".
		 */
		
		
		String s1 = "Arrivederci";
		
		for (int i = 0; i < s1.length(); i++) 
		{
			System.out.println("[Carattere:] " + s1.charAt(i) + " [codice carattere:]  " + s1.codePointAt(i));
		}
		
		System.out.println("La lunghezza della stringa è: " + s1.length());
	}

}
