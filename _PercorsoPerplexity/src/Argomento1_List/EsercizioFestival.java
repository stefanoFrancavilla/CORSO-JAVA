package Argomento1_List;

public class EsercizioFestival {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		 
		GestioneFestival gf = new GestioneFestival();
		System.out.println("\n--- LISTA VUOTA ---");
		gf.stampaTuttiArtisti();
		gf.rimuoviArtistaPerCodice(101);
		gf.cercaArtistiPerGenere("rock");
		gf.stampaArtistiConDurataMinima(30);
		gf.stampaArtistaConEsibizionePiuLunga();
		gf.stampaDurataTotaleFestival();
		gf.cercaIndicePrimoArtistaPerGenere("pop");
		gf.cercaIndiceUltimoArtistaPerGenere("pop");
		System.out.println("-----------------------------------------------");
		// Creazione degli artisti
		Artista a1 = new Artista(101, "Artista 1", "rock", 45, 100);
		Artista a2 = new Artista(102, "Artista 2", "pop", 30, 200);
		Artista a3 = new Artista(103, "Artista 3", "jazz", 60, 150);
		Artista a4 = new Artista(104, "Artista 4", "rock", 50, 0);
		Artista a5 = new Artista(105, "Artista 5", "pop", 40, 300);
		Artista a6 = new Artista(106, "Artista 6", "rock", 35, 250);
		
		// Inserimenti validi
		System.out.println("\n--- INSERIMENTI VALIDI ---");
		gf.aggiungiArtista(a1);
		gf.aggiungiArtista(a2);
		gf.aggiungiArtista(a3);
		gf.aggiungiArtista(a4);
		gf.aggiungiArtista(a5);
		gf.aggiungiArtista(a6);
		System.out.println("-----------------------------------------------");
		
		// Stampa della lista completa
		gf.stampaTuttiArtisti();
		
		// Inserimento di null
		System.out.println("\n--- INSERIMENTO DI NULL ---");
		gf.aggiungiArtista(null);
		System.out.println("-----------------------------------------------");
		
		// Inserimento di un duplicato
		System.out.println("\n--- INSERIMENTO DI UN DUPLICATO ---");
		gf.aggiungiArtista(new Artista(101, "Artista Duplicato", "rock", 45, 100));
		System.out.println("-----------------------------------------------");
		
		// Ricerca per codice
		System.out.println("\n--- RICERCA PER CODICE ---");
		System.out.println(gf.cercaArtistaPerCodice(101));
		System.out.println(gf.cercaArtistaPerCodice(999));
		System.out.println(gf.cercaArtistaPerCodice(-1));
		System.out.println("-----------------------------------------------");
		
		// Ricerca per genere
		System.out.println("\n--- RICERCA PER GENERE ---");
		System.out.println(gf.cercaArtistiPerGenere("rock"));
		System.out.println(gf.cercaArtistiPerGenere("classica"));
		System.out.println(gf.cercaArtistiPerGenere("   "));
		System.out.println(gf.cercaArtistiPerGenere("RoCk"));
		System.out.println("-----------------------------------------------");
		
		// Primo e ultimo indice
		System.out.println("\n--- PRIMO E ULTIMO INDICE ---");
		System.out.println(gf.cercaIndicePrimoArtistaPerGenere("rock"));
		System.out.println(gf.cercaIndiceUltimoArtistaPerGenere("rock"));
		System.out.println(gf.cercaIndicePrimoArtistaPerGenere("classica"));
		System.out.println(gf.cercaIndiceUltimoArtistaPerGenere("classica"));
		System.out.println(gf.cercaIndicePrimoArtistaPerGenere("   "));
		System.out.println(gf.cercaIndiceUltimoArtistaPerGenere("   "));
		System.out.println("-----------------------------------------------");
		
		// Aggiornamento del pubblico
		System.out.println("\n--- AGGIORNAMENTO DEL PUBBLICO ---");
		gf.aggiornaPubblicoPrevisto(101, 150);
		gf.aggiornaPubblicoPrevisto(999, 150);
		gf.aggiornaPubblicoPrevisto(-1, 150);
		gf.aggiornaPubblicoPrevisto(101, -50);
		gf.stampaTuttiArtisti();
		System.out.println("-----------------------------------------------");
		
		// Filtro per genere
		System.out.println("\n--- FILTRO PER GENERE ---");
		gf.stampaArtistiPerGenere("rock");
		gf.stampaArtistiPerGenere("classica");
		gf.stampaArtistiPerGenere("   ");
		System.out.println("-----------------------------------------------");
		
		// Filtro per durata minima
		System.out.println("\n--- FILTRO PER DURATA MINIMA ---");
		gf.stampaArtistiConDurataMinima(40);
		gf.stampaArtistiConDurataMinima(50);
		gf.stampaArtistiConDurataMinima(100);
		gf.stampaArtistiConDurataMinima(-10);
		System.out.println("-----------------------------------------------");
		
		// Ordinamento
		System.out.println("\n--- ORDINAMENTO ---");
		gf.stampaTuttiArtisti();
		gf.ordinaArtistiPerPubblicoDecrescente();
		gf.stampaTuttiArtisti();
		System.out.println("-----------------------------------------------");
		
		// Esibizione più lunga
		System.out.println("\n--- ESIBIZIONE PIÙ LUNGA ---");
		gf.stampaArtistaConEsibizionePiuLunga();
		gf.stampaDurataTotaleFestival();
		System.out.println("-----------------------------------------------");
		
		// Rimozione per codice
		System.out.println("\n--- RIMOZIONE PER CODICE ---");
		gf.rimuoviArtistaPerCodice(101);
		gf.rimuoviArtistaPerCodice(999);
		gf.rimuoviArtistaPerCodice(-1);
		gf.stampaTuttiArtisti();
		System.out.println("-----------------------------------------------");
		
		// Rimozione per indice
		System.out.println("\n--- RIMOZIONE PER INDICE ---");
		gf.rimuoviArtistaPerIndice(0);
		gf.rimuoviArtistaPerIndice(-1);
		gf.rimuoviArtistaPerIndice(50);
		gf.stampaTuttiArtisti();
		System.out.println("-----------------------------------------------");
		
		
		
		
	}

}
