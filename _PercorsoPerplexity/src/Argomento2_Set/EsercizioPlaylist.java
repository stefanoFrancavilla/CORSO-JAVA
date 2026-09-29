package Argomento2_Set;

public class EsercizioPlaylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		GestionePlaylist gp = new GestionePlaylist();
		
		Brano brano1 = new Brano(1, "Titolo1", "Artista1", "Genere1", 200);
		Brano brano2 = new Brano(2, "Titolo2", "Artista2", "Genere2", 300);
		Brano brano3 = new Brano(3, "Titolo3", "Artista3", "Genere1", 400);
		Brano brano4 = new Brano(4, "Titolo4", "Artista4", "Genere2", 500);
		Brano brano5 = new Brano(5, "Titolo5", "Artista5", "Genere3", 600);
		
		gp.aggiungiBrano(brano1);
		gp.aggiungiBrano(brano2);
		gp.aggiungiBrano(brano3);
		gp.aggiungiBrano(brano4);
		gp.aggiungiBrano(brano5);
		
		gp.aggiungiBrano(brano1); // duplicato per codice
		
		gp.stampaTuttiBrani();
		
		System.out.println("Ricerca brano con codice 3:" + gp.cercaBranoPerCodice(3));
		
		gp.aggiornaGenereBrano(2, "rock");
		
		gp.rimuoviBranoPerCodice(4);
		
		gp.stampaTuttiBrani();
		
		gp.rimuoviBranoPerCodice(3);
		
		gp.stampaTuttiBrani();
		
		gp.stampaDurataTotale();
		
		
	}

}
