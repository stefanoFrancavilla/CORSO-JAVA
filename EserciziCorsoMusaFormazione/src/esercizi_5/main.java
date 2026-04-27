package esercizi_5;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 1.
           Scrivere una semplice classe Libro con le seguenti proprietà pubbliche:
           titolo, autore, numeroDiPagine, annoDiPubblicazione e sinosssi.
           Crearne un'istanza dal metodo main e valorizzarne le proprietà con i dati di un libro scelto a piacere.
           Assegnare tale istanza ad una variabile chiamata libro1.
           Stampare a video i valori assegnati alle proprietà.
		 */

		/*
		 * 2.
 		 * 	Creare una seconda istanza della classe Libro e assegnarla alla variabile libro2.
            In seguito, assegnare questa istanza alla variabile libro1, utilizzata nell'esercizio 1.
            Provare a modificare le proprietà e verificare come le due variabili libro1 e libro2 puntino ora allo stesso oggetto.
		 */
		
		Libro libro1 = new Libro();
		
	
		libro1.setTitolo("Il rinomato catalogo Walker & Dawn");
		libro1.setAutore("Davide Morosinotto.");
		libro1.setNumeroPagine(319);
		libro1.setAnnoDiPubblicazione(2016);
		libro1.setSinossi("Louisiana, 1904. Eddie, Te Trois, Julie e Tit sono quattro amici inseparabili che vivono ai margini del bayou. \n"
					+ "Dopo aver ordinato un orologio dal famoso catalogo per corrispondenza \"Walker & Dawn\", \n"
					+ "ricevono per errore un pacco contenente una rivoltella e una cassetta di sicurezza, \n"
					+ "scatenando una rocambolesca avventura che li spinge ad attraversare l'America fino a Chicago. \n"
					+ "Attraverso il punto di vista unico di ciascun protagonista, il romanzo segue il loro viaggio segnato da pericoli, \n"
					+ "inseguimenti e misteri, diventando un profondo racconto di amicizia, crescita e scoperta di sé.");
		
		libro1.stampa();
		
		System.out.println();
		
		Libro libro2 = new Libro();
		libro2.setTitolo("1984");
		libro2.setAutore("George Orwell");
		libro2.setNumeroPagine(328);
		libro2.setAnnoDiPubblicazione(1949);
		libro2.setSinossi("""
				Il romanzo è ambientato in un futuro distopico in cui il mondo è diviso in tre superpotenze totalitarie,
				tra cui l'Oceania, governata dal regime del Partito e dal misterioso Grande Fratello. 
				Il protagonista, Winston Smith, lavora al Ministero della Verità,
				dove si occupa di manipolare documenti storici per conformarli alla propaganda del regime.
			    Cercando di preservare la propria individualità e il libero pensiero, 
			    Winston inizia una relazione clandestina con una collega di nome Julia e tenta di unirsi alla resistenza,
				ma entrambi vengono infine scoperti, arrestati e sottoposti a un brutale processo di rieducazione volto a distruggere la loro volontà e il loro spirito critico.
				""");
		

		libro2.stampa();
		
		System.out.println();
	    
		System.out.println(libro1);
		System.out.println(libro2);
		
		System.out.println();
		System.out.println();
		
		
		libro1.setTitolo("1984");
		libro1.setAutore("George Orwell");
		libro1.setNumeroPagine(328);
		libro1.setAnnoDiPubblicazione(1949);
		libro1.setSinossi("""
				Il romanzo è ambientato in un futuro distopico in cui il mondo è diviso in tre superpotenze totalitarie,
				tra cui l'Oceania, governata dal regime del Partito e dal misterioso Grande Fratello. 
				Il protagonista, Winston Smith, lavora al Ministero della Verità,
				dove si occupa di manipolare documenti storici per conformarli alla propaganda del regime.
			    Cercando di preservare la propria individualità e il libero pensiero, 
			    Winston inizia una relazione clandestina con una collega di nome Julia e tenta di unirsi alla resistenza,
				ma entrambi vengono infine scoperti, arrestati e sottoposti a un brutale processo di rieducazione volto a distruggere la loro volontà e il loro spirito critico.
				""");
		
	System.out.println();
	    libro1 = libro2;
		System.out.println(libro1);
		System.out.println(libro2);
	}
// voto 8/10
}
