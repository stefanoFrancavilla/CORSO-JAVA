package Argomento1_List;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class GestioneFestival {

	 private List<Artista> artisti = new ArrayList<>();
	 
	 
	 //metodo aggiungi artista
	 public void aggiungiArtista(Artista artista)
	 {
		if (artista == null)
		{
			System.out.println("L'artista inserito non è valido");
			return;
		}
		else 
		{
			boolean presente = false;
			for(Artista artistaCorrente : artisti)
			{
				if (artistaCorrente.getCodiceArtista() == artista.getCodiceArtista())
				{
					presente = true;
					System.out.println("Nella lista è già presente l'artista");
					return;
				}
			}
			if (presente == false)
			{
				artisti.add(artista);
				System.out.println("L'artista è stato aggiunto correttamente");
			}
		}
	 }
	 
	 //metodo cerca artista per codice
	 
	 public Artista cercaArtistaPerCodice(int codiceArtista)
	 {
		 if (artisti == null || artisti.isEmpty())
		 {
			 System.out.println("La lista principale è null o vuota");
			 return null;
		 }
		 else if (codiceArtista <= 0 )
		 {
			 System.out.println("Il codiceArtista inserito non è valido");
			 return null;
		 }
		 else
		 {
			 Artista artistaDaCercare = null;
			 
			 for (Artista artistaCorrente : artisti)
			 {
				 if (artistaCorrente.getCodiceArtista() == codiceArtista)
				 {
					 artistaDaCercare = artistaCorrente;
					 break;
				 }
			 }
			 
			 if (artistaDaCercare == null)
			 {
				 System.out.println("Non è stato trovato nessun artista con questo codice");
			 }
			 return artistaDaCercare;
		 }
	 }
	 
	 //metodo cerca artista per genere
	 
	 public List<Artista> cercaArtistiPerGenere(String genere)
	 {
		 if (artisti == null || artisti.isEmpty())
		 {
			 System.out.println("La lista principale è null o vuota");
			 return new ArrayList<>();
		 }
		 else if (genere == null || genere.isBlank())
		 {
			 System.out.println("Il genere inserito non è valido");
			 return new ArrayList<>();
		 }
		 else
		 {
			 List<Artista> artistiPerGenere = new ArrayList<>();
			 
			 for (Artista artistaCorrente : artisti)
			 {
				 if (artistaCorrente.getGenere().equalsIgnoreCase(genere))
				 {
					 artistiPerGenere.add(artistaCorrente);
				 }
			 }
			 
			 if (artistiPerGenere.isEmpty() )
			 {
				 System.out.println("Non sono stati trovati artisti per questo genere");
				 return artistiPerGenere;
			 }
			 return artistiPerGenere;
		 } 
	 }
	 
	 //metodo cerca indice primo artista
	 
	 public int cercaIndicePrimoArtistaPerGenere (String genere)
	 {
		 if (artisti == null || artisti.isEmpty())
		 {
			 System.out.println("La lista principale è null o vuota");
			 return -1;
		 }
		 else if (genere == null || genere.isBlank())
		 {
			 System.out.println("Il genere inserito non è valido");
			 return -1;
		 }
		 else
		 {
			 int indice = -1;
			 
			 for (int i = 0; i < artisti.size(); i++)
			 {
				 if (artisti.get(i).getGenere().equalsIgnoreCase(genere))
				 {
					 indice = i;
					 break;
				 }
			 }
			 if (indice == -1)
			 {
				 System.out.println("Non ci sono artisti per questo genere");
			 }
			 return indice;
		 }
	 }
	 
	 //metodo cerca indice ultimo artista per genere
	 
	 public int cercaIndiceUltimoArtistaPerGenere (String genere)
	 {
		 if (artisti == null || artisti.isEmpty())
		 {
			 System.out.println("La lista principale è null o vuota");
			 return -1;
		 }
		 else if (genere == null || genere.isBlank())
		 {
			 System.out.println("Il genere inserito non è valido");
			 return -1;
		 }
		 else
		 {
			 int indice = -1;
			 
			 for ( int i = artisti.size()-1; i >= 0; i--)
			 {
				 if (artisti.get(i).getGenere().equalsIgnoreCase(genere))
				 {
					 indice = i;
					 break;
				 }
			 }
			 if (indice == -1)
			 {
				 System.out.println("Non ci sono artisti per questo genere");
			 }
			 return indice;
		 }
	 }
	 
	 //metodo rimuovi artista per codice
	 
	 public void rimuoviArtistaPerCodice ( int codiceArtista)
	 {
		 if (artisti == null || artisti.isEmpty())
		 {
			 System.out.println("La lista principale è null o vuota");
			 return;
		 }
		 else if (codiceArtista <= 0 )
		 {
			 System.out.println("Il codiceArtista inserito non è valido");
			 return;
		 } 
		 else
		 {
			 Artista artistaDaRimuovere = cercaArtistaPerCodice(codiceArtista);
			 
			 if (artistaDaRimuovere == null)
			 {
				 System.out.println("Non ci sono artisti con questo codice");
			 }
			 else
			 {
				 artisti.remove(artistaDaRimuovere);
				 System.out.println("Artista rimosso con successo");
			 }
		 }
	 }
	 
	 //metodo rimuovi artista per indice
	 
	 public void rimuoviArtistaPerIndice(int indice)
	 {
		 if (artisti == null || artisti.isEmpty())
		 {
			 System.out.println("La lista principale è null o vuota");
			 return;
		 }
		 else if (indice < 0 || indice > artisti.size()-1)
		 {
			 System.out.println("L'indice inserito non è valido");
			 return;
		 }
		 else
		 {
			artisti.remove(indice);
			System.out.println("L' artista con indice " + indice + " è stato rimosso con successo");
		 }
	 }
	 
	 //metodo aggiorna pubblico previsto
	 
	 public void aggiornaPubblicoPrevisto(int codiceArtista , int pubblicoAggiornato)
	 {
		 if(pubblicoAggiornato < 0)
		 {
			 System.out.println("Il pubblico che si vuole aggiungere non è valido");
			 return;
		 }
		 else if (codiceArtista <= 0)
		 {
			 System.out.println("Il codice artista inserito non è valido");
			 return;
		 }
		 else
		 {
			 Artista artistaDaModificare = cercaArtistaPerCodice(codiceArtista);
			 
			 if (artistaDaModificare == null)
			 {
				 System.out.println("Non è stato trovato nessun artista con questo codice");
				 return;
			 }
			 
			 else
			 {
				 artistaDaModificare.setPubblicoPrevisto(pubblicoAggiornato);
				 System.out.println("Il pubblico previsto è stato aggiornato con successo");
				 System.out.println("Pubblico previsto attuale: " + pubblicoAggiornato);
			 }
		 }
	 }
	 
	 //metodo stampa tutti artisti
	 
	 public void stampaTuttiArtisti()
	 {
		 if (artisti == null || artisti.isEmpty() )
		 {
			 System.out.println("La lista è vuota o null");
			 return;
		 }
		 else
		 {
			 System.out.println("---------------Lista di tutti gli artisti---------------");
			 for(Artista artistaCorrente : artisti)
			 {
				 System.out.println(artistaCorrente.toString());
			 }
			 
			 System.out.println("--------------------------------------------------------");
		     System.out.println();
	     }
	 }
 
	 //metodo stampa artisti per genere
	 
	 public void stampaArtistiPerGenere ( String genere)
	 {
		 if(artisti.isEmpty())
		 {
			 System.out.println("La lista principale è vuota");
			 return;
		 }
		 else if ( genere == null || genere.isBlank())
		 {
			 System.out.println("Il genere inserito non è valido");
			 return;
		 }
		 else
		 {
			 List<Artista> artistiPerGenere = cercaArtistiPerGenere(genere);
			 
			 if (artistiPerGenere.isEmpty())
			 {
				 System.out.println("Non ci sono artisti per questo genere");
				 return;
			 }
			 else
			 {
				 System.out.println("---------------Lista di tutti gli artisti per genere---------------");
				 for (Artista artistaCorrente : artistiPerGenere)
				 {
					 System.out.println(artistaCorrente.toString());
				 }
				 System.out.println("--------------------------------------------------------");
			     System.out.println();
			 }
		 }
	 }
	 
	 //metodo stampa artisti con durata minima
	 
	 public void stampaArtistiConDurataMinima ( int durata)
	 {
		 if ( artisti.isEmpty())
		 {
			 System.out.println("La lista principale è vuota");
			 return;
		 }
		 else if ( durata <= 0)
		 {
			 System.out.println("La durata inserita non è valida");
			 return;
		 }
		 else
		 {
			 List<Artista> artistiConDurataMinima = new ArrayList<>();
			 
			 for (Artista artistaCorrente : artisti)
			 {
				 if (artistaCorrente.getDurataEsibizioneMinuti() >= durata)
				 {
					 artistiConDurataMinima.add(artistaCorrente);
				 }
			 }
			 
			 System.out.println("---------------Lista di tutti gli artisti con durata minima---------------");
			 if (artistiConDurataMinima.isEmpty())
			 {
				 System.out.println("Non ci sono artisti con queste condizioni di durata");
				 return;
			 }
			 else
			 {
				 for ( Artista artistaDaStampare : artistiConDurataMinima)
				 {
					 System.out.println(artistaDaStampare.toString());
				 }
			 }
			 System.out.println("--------------------------------------------------------");
		     System.out.println();
		 }
	 }
		 
		 // metodo ordina artista per pubblico decresciente
		 
		 public void ordinaArtistiPerPubblicoDecrescente ()
		 {
			 if (artisti.isEmpty())
			 {
				 System.out.println("La lista principale è vuota");
				 return;
			 }
			 else
			 {
				artisti.sort(Comparator.comparingInt(Artista::getPubblicoPrevisto).reversed());
			 }
		 }
		 
		 //metodo stampa artista con esibizione più lunga
		 
		 public void stampaArtistaConEsibizionePiuLunga ()
		 {
			 if (artisti.isEmpty())
			 {
				 System.out.println("La lista principale è vuota");
				 return;
			 }
			 else
			 {
				 Artista artistaConEsibizionePiuLunga = artisti.get(0);
				 int durata = artisti.get(0).getDurataEsibizioneMinuti();
				 
				 for (int i = 0; i < artisti.size(); i ++)
				 {
					 if(artisti.get(i).getDurataEsibizioneMinuti() > durata)
					 {
						 durata = artisti.get(i).getDurataEsibizioneMinuti();
						 artistaConEsibizionePiuLunga = artisti.get(i);
					 }
				 }
				 
				 System.out.println(artistaConEsibizionePiuLunga.toString());
			 }
			 
		 }
		 
		 //metodo stampa durata totale festival
		 
		 public void stampaDurataTotaleFestival ()
		 {
			 if (artisti.isEmpty())
			 {
				 System.out.println("La lista principale è vuota");
				 return;
			 }
			 else
			 {
				 int durataTotale = 0;
				 
				 for ( Artista artistaCorrente : artisti)
				 {
					 durataTotale += artistaCorrente.getDurataEsibizioneMinuti();
				 }
				 
				 System.out.println("La durata totale del festival è: " + durataTotale);
			 }
		 }	 
}
