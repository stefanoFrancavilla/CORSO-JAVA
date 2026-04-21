package esercizioSiingleton2;

public class CentraleTaxi {
	
	private static int taxiDisponibili = 4;
	private static int corseTotali = 0;
	private static boolean sistemaOccupato = false;
	private static String nomeCentrale = "Centrale Taxi";
    private static String citta = "Bellinzona";
    
    //costruttore 
    private CentraleTaxi()
	{	
    	nomeCentrale = "Centrale Taxi";
    	citta = "Bellinzona";
    		}
	
	public static CentraleTaxi getInstance() {
		return CentraleTaxiBuilder.INSTANCE;
	}
	
	private static class CentraleTaxiBuilder
	{
		private static final CentraleTaxi INSTANCE = new CentraleTaxi();
	}

    //metodi getter e setter
	
	public static int getTaxiDisponibili() {
		return taxiDisponibili;
	}

	public static void setTaxiDisponibili(int taxiDisponibili) {
		CentraleTaxi.taxiDisponibili = taxiDisponibili;
	}

	public static int getCorseTotali() {
		return corseTotali;
	}

	public static void setCorseTotali(int corseTotali) {
		CentraleTaxi.corseTotali = corseTotali;
	}

	public static boolean isSistemaOccupato() {
		return sistemaOccupato;
	}

	public static void setSistemaOccupato(boolean sistemaOccupato) {
		CentraleTaxi.sistemaOccupato = sistemaOccupato;
	}

	public static String getNomeCentrale() {
		return nomeCentrale;
	}

	public static void setNomeCentrale(String nomeCentrale) {
		CentraleTaxi.nomeCentrale = nomeCentrale;
	}

	public static String getCitta() {
		return citta;
	}

	public static void setCitta(String citta) {
		CentraleTaxi.citta = citta;
	}
    

	
	
    
    }
