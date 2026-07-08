package Esercizi_avanzati;

public class Auto implements Comparable<Auto>{

	private String marca;
	private int velocitaMassima;
	

	public Auto(String marca, int velocitaMassima)
	{
		this.marca = marca;
		this.velocitaMassima = velocitaMassima;
	}
	
	public String getMarca ()
	{
		return marca;
	}
	
	public void setMarca(String marca)
	{
		this.marca = marca;
	}

	public int getVelocitaMassima() {
		return velocitaMassima;
	}

	public void setVelocitaMassima(int velocitaMassima) {
		this.velocitaMassima = velocitaMassima;
	}
	
	
	public int compareTo(Auto a)
	{
		if(this.velocitaMassima < a.getVelocitaMassima())
			return -1;
		
		if(this.velocitaMassima > a.getVelocitaMassima())
			return 1;
		
		return 0;
		
	}
}
