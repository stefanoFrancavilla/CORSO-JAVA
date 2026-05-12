package incapsulamentoDeiDati;

import java.time.LocalDate;

import incapsulamentoDeiDati.EssereUmano.Nazione;

public class Cittadino extends EssereUmano {
	private Nazione nazioneDiNascita;
	private Comune comuneDiNascita;
	private String codiceFiscale; 
	
	
	 //metodi getter/setter
     public Nazione getNazioneDiNascita() {
     return nazioneDiNascita;
     }

    public void setNazioneDiNascita(Nazione nazioneDiNascita) {
	this.nazioneDiNascita = nazioneDiNascita;
    }
    
    public Comune getComuneDiNascita() {
    	return comuneDiNascita;
    }

    public void setComuneDiNascita(Comune comuneDiNascita) {
    	this.comuneDiNascita = comuneDiNascita;
    }
    
    public void setCodiceFiscale() {
    	System.out.println("--------------------------");
    	System.out.println("EssereUmano -> setCodiceFiscale()"); 
    	
    	if(this.getNazioneDiNascita() != Nazione.ITALIA) 
    	{
    		System.out.println("	Il codice fiscale vale per l'italia");
    	    return;	
    	}
    	if(getNome().equalsIgnoreCase("ND")) 
    	{
    		System.out.println("	Manca il nome e non è possibile definire il codice fiscale.");
    	    return;	
    	}
    	
    	if(getCognome().equalsIgnoreCase("ND"))
    	{
    		System.out.println("	Manca il cognome e non è possibile definire il codice fiscale.");
    	    return;	
    	}
    	
    	if(getSesso() == Sesso.SCONOSCIUTO)
    	{
    		System.out.println("	Manca il sesso e non è possibile definire il codice fiscale.");
    	    return;	
    	}
    	
    	int limiteAnno = LocalDate.now().getYear() - getDataDiNascita().getYear(); 
    	System.out.println("	limiteAnno: " + limiteAnno);
    	
    	if(limiteAnno > getMaxAnni())
    	{
    		System.out.println("	Data di nascita non corretta e non è possibile definire il codice fiscale.");
    	    return;	
    	}
    	
    	if(getComuneDiNascita() == Comune.SCONOSCIUTO)
    	{
    		System.out.println("	Manca il comune di nascita non definito e non è possibile definire il codice fiscale.");
    	    return;	
    	}
    
    	this.codiceFiscale = buildCodiceFiscale();
    }

    private String buildCodiceFiscale() 

    {
    	System.out.println("--------------------------");
    	System.out.println("EssereUmano -> buildCodiceFiscale()"); 
    	
    	class CodiceFiscale 
    	{
    		//variabile di istanza
    		private String codiceFiscale;
    		
    		//costruttore
    		CodiceFiscale()
    		{
    			codiceFiscale = getPorzioneCognome() +
    					getPorzioneNome() +
    			        getAnnoDiNascita() +
    			        getMeseDiNascita() + 
    			        getGiornoDiNascita() +
    			        getComune() +
    			        getCodiceDiControllo();
    			
    		}
    		
    		//metodi getter /setter
    		private String getCodiceFiscale()
    		{
    			return codiceFiscale;
    		}
    		
    		//metodi /funzioni
    		
    		private String getPorzioneCognome()
    		{
    			String cognome = getCognome();
    			String porzioneCognome = "";
    			String caratterePadding = "X"; 
    			String vocali = "AEIOU";
    			
    			cognome = cognome.toUpperCase();
    			
    			if(cognome.length() == 1)
    			{
    				porzioneCognome = cognome + caratterePadding + caratterePadding;
    			}
    			else if (cognome.length() == 2)
    			{
    				porzioneCognome = cognome;
    				
    				if(vocali.contains(String.valueOf(cognome.charAt(0))) &&   
    						!vocali.contains(String.valueOf(cognome.charAt(1)))) 
    				
    			     {
    					porzioneCognome  = String.valueOf(cognome.charAt(1)) +
    							           String.valueOf(cognome.charAt(0)); 
    					
    					System.out.println("	porzioneCognome 2: " + porzioneCognome);
    			     }
    				porzioneCognome = porzioneCognome + caratterePadding;
    			}
    			else
    			{
    				
    				
    				//semplificazione
    				
    				porzioneCognome = cognome.substring(0, 3); 
    				
    			}
    			System.out.println("	porzioneCognome: " + porzioneCognome);
    			
    			return porzioneCognome;
    		}
    		
    		private String getPorzioneNome()
    		{
    			String nome = getNome();
    			String porzioneNome = "";
    			String caratterePadding = "X"; 
    			String vocali = "AEIOU";
    			
    			nome = nome.toUpperCase();
    			
    			if(nome.length() == 1)
    			{
    				porzioneNome = nome + caratterePadding + caratterePadding;
    			}
    			else if (nome.length() == 2)
    			{
    				porzioneNome = nome;
    				
    				if(vocali.contains(String.valueOf(nome.charAt(0))) &&   
    						!vocali.contains(String.valueOf(nome.charAt(1)))) 
    					
    			     {
    					porzioneNome  = String.valueOf(nome.charAt(1)) +
    							           String.valueOf(nome.charAt(0)); 
    					
    					System.out.println("	porzioneCognome 2: " + porzioneNome);
    			     }
    				porzioneNome = porzioneNome + caratterePadding;
    			}
    			else
    			{
    			
    				
    				//semplificazione
    				
    				porzioneNome = nome.substring(0, 3); 
    				
    			}
    			System.out.println("	porzioneNome: " + porzioneNome);
    			
    			return porzioneNome;
    		}
    		
    		private String getAnnoDiNascita()
    		{
    			String annoDiNascita = String.valueOf(getDataDiNascita().getYear()).substring(2, 4); 
    			
    			
    			System.out.println("	annoDiNascita: " + annoDiNascita);
    			
    			return annoDiNascita;
    		}
    		private String getMeseDiNascita()
    		{
    			String meseDiNascita;
    			
    			enum CodiceMese
    			{
    				A, // Gennaio
    				B, // Febbraio
    				C, // Marzo
    				D, // Aprile
    				E, // Maggio
    				H, // Giugno
    				L, // Luglio
    				M, // Agosto
    				P, // Settembre
    				R, // Ottobre
    				S, // Novembre
    				T  // Dicembre
    			}
    			
    			CodiceMese codiceMese = switch(getDataDiNascita().getMonth())
    					{
    						case JANUARY -> CodiceMese.A;
    						case FEBRUARY -> CodiceMese.B;
    						case MARCH -> CodiceMese.C;
    						case APRIL -> CodiceMese.D;
    						case MAY -> CodiceMese.E;
    						case JUNE -> CodiceMese.H;
    						case JULY -> CodiceMese.L;
    						case AUGUST -> CodiceMese.M;
    						case SEPTEMBER -> CodiceMese.P;
    						case OCTOBER -> CodiceMese.R;
    						case NOVEMBER -> CodiceMese.S;
    						case DECEMBER -> CodiceMese.T;
    					};
    					
    					meseDiNascita = codiceMese.toString();
    					
    					System.out.println("	meseDiNascita: " + meseDiNascita);
    					
    					return meseDiNascita;
    					
    				
    		}
    		
    		private String getGiornoDiNascita()
    		{
    			String giornoDiNascita;
    			int giorno = getDataDiNascita().getDayOfMonth();
    			
    			if(getSesso() == Sesso.FEMMINA)
    			
    				giorno = giorno + 40; 
    			if(giorno < 10)
    				giornoDiNascita = "0" + giorno; 
    			else
    				giornoDiNascita = String.valueOf(giorno); 
    			System.out.println("	giornoDiNascita: " + giornoDiNascita);
    			return giornoDiNascita;
    		}
    	
    		private String getComune()
    		{
    			String comuneDiNascita;
    			
    			enum CodiceComune
    			{
    				H501, // Roma
    				F205, // Milano
    				L219, // Napoli
    				D969, // Genova
    				A662, // Bari
    				
    			}
    			CodiceComune codiceComune = switch(getComuneDiNascita())
    					{
    						case ROMA -> CodiceComune.H501;
    						case MILANO -> CodiceComune.F205;
    						case NAPOLI -> CodiceComune.L219;
    						case GENOVA -> CodiceComune.D969;
    						case BARI -> CodiceComune.A662;
    			            default -> throw new IllegalArgumentException("Unexpected value: " + getComuneDiNascita());
    						
    					};
    			           comuneDiNascita = String.valueOf(codiceComune);
    			           System.out.println("		comuneDiNascita: " + comuneDiNascita);
    			           return comuneDiNascita;
    		}
    		
    		private String getCodiceDiControllo()
    		{
    			String codiceDiControllo = String.valueOf(getNome().charAt(0)).toUpperCase();
    			System.out.println("	codiceDiControllo: " + codiceDiControllo);
    			return codiceDiControllo;
    		}
    	}
    	
    	CodiceFiscale codiceFiscale = new CodiceFiscale();  
    	
    	System.out.println("	codiceFiscale: " + codiceFiscale);
    	
    	return codiceFiscale.getCodiceFiscale(); 
    }
    
	public enum Comune
	{
		ROMA,
		MILANO,
		NAPOLI,
		GENOVA,
		BARI,
		SCONOSCIUTO
	}
	public enum Nazione 
	{
		ITALIA ("Europa", 301),
		SVIZZERA ("Europa", 100),
		BRASILE ("America del sud", 600),
		CILE ("America del sud", 150),
		INDIA ("Asia", 800),
		SCONOSCIUTO ("Sconosciuto", 0);
		
		//variablili di istanza / costanti
		private final String continente;
		private final int estensione;
		
		
		//costruttore
		private Nazione(String continente, int estensione)  
		{
			this.continente = continente;
			this.estensione = estensione;
		}

		//metodi getter
		public String getContinente() {
			return continente;
		}

		public int getEstensione() {
			return estensione;
		}
		
		//metodi /funzioni
		public static void getInformazioni()
		{
			for(Nazione nazione : Nazione.values())
			{
				System.out.println(nazione + 
						", appartiene al continente: " + 
						nazione.getContinente() +
						" ed è estesa: " +
						nazione.getEstensione() + " km2");
			}
		}
		
}
}