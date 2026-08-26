package Argomento_4_2;

public class Auto extends Veicolo {
	private int giorniMassimi;
	private int giorniNoleggiati;
	
	
	public Auto(String cliente, int giorniMassimi) {
		super(cliente);
		this.giorniMassimi = giorniMassimi;
		this.giorniNoleggiati = 0;
	}


	public int getGiorniMassimi() {
		return giorniMassimi;
	}


	public void setGiorniMassimi(int giorniMassimi) {
		this.giorniMassimi = giorniMassimi;
	}


	public int getGiorniNoleggiati() {
		return giorniNoleggiati;
	}


	public void setGiorniNoleggiati(int giorniNoleggiati) {
		this.giorniNoleggiati = giorniNoleggiati;
	}


	@Override
	public boolean noleggia(int giorni) {
		
		if ( giorniNoleggiati + giorni <= giorniMassimi)
		{
			giorniNoleggiati += giorni;
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	

	
	

}
