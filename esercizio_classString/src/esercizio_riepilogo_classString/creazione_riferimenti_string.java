package esercizio_riepilogo_classString;

public class creazione_riferimenti_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Creazione e Riferimenti String
           Crea una classe TestString con main. Definisci String s1 = "Ciao"; String s2 = "Ciao";
           String s3 = new String("Ciao");. 
           Stampa se s1 == s2, s1 == s3 e spiega lo String Pool nei commenti.
		 */
		
		String s1 = "Ciao";
		String s2 = "Ciao";
		String s3 = new String ("Ciao");
		
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		
		/*
		 * nel primo caso di stampa la risposta è stata true, poichè grazie allo string pool i loro valori sono stati immagazzinati
		 * nell'archivio. 
		 * 
		 * nel secondo caso la risposta è false, poichè con new String stiamo creando un nuovo oggetto.
		 * di conseguenza s1 e s3 saranno differenti anche se hanno lo stesso valore. 
		 */
		
		
	}

}
