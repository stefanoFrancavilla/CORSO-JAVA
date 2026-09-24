package Argomento1_List;

import java.util.ArrayList;
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
			if (presente == true)
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
			 return null;
		 }
		 else if (genere == null || genere.isBlank())
		 {
			 System.out.println("Il genere inserito non è valido");
			 return null;
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
	 
	 //
 
	 
	 
}
