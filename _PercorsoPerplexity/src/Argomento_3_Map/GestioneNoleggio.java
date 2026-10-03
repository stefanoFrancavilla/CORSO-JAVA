package Argomento_3_Map;

import java.util.ArrayList;
import java.util.List;

import Argomento2_Set.Attrezzatura;

public class GestioneNoleggio {

	List<Noleggio> noleggi = new ArrayList<>();
	
	// metodo aggiunto correttamente
	public void aggiungiNoleggio(Noleggio noleggio)
	{
		if (noleggio == null)
		{
			return;
		}
		else
		{
			noleggi.add(noleggio);
			System.out.println("Noleggio aggiunto correttamente");
		}
	}
	
	//metodo stampa tutti i noleggi
	
	public void stampaTuttiINoleggi()
	{
		if (noleggi.isEmpty())
		{
			return;
		}
		else
		{
			System.out.println("--------stampa di tutti i noleggi-------");
			for(Noleggio noleggio : noleggi)
			{
				System.out.println(noleggio);
			}
			System.out.println("--------------------------");
		}
	}

	
	// metodo crea noleggio
	
	public Noleggio creaNoleggio (int codiceNoleggio, int codiceAttrezzatura,
			String cliente, int giorni)
	{
		if (codiceNoleggio <= 0)
		{
			return null;
		}
		else if (codiceAttrezzatura <= 0)
		{
			return null;
		}
		else if (cliente == null || cliente.isBlank())
		{
			return null;
		}
		else if (giorni <= 0 )
		{
			return null;
		}
		else
		{
			  Attrezzatura attrezzaturaTrovata = cercaAttrezzaturaPerCodice(codiceAttrezzatura);

			    if (attrezzaturaTrovata == null) {
			        return null;
			    }

			    if (!attrezzaturaTrovata.isDisponibile()) {
			        return null;
			    }

			    Noleggio nuovoNoleggio = new Noleggio(codiceNoleggio, attrezzaturaTrovata, cliente, giorni);
			    noleggi.add(nuovoNoleggio);

			    attrezzaturaTrovata.setDisponibile(false);
			    attrezzaturaTrovata.setNumeroGiorniNoleggio(giorni);

			    return nuovoNoleggio;
					
		}
	}
	
	
}
