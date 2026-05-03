package Es_10;

public class Auto {
// variabili
	private String marca;
	private int km;
	
	public Auto()
	{
		
	}
	
	public Auto(String marca, int km)
	{
		setMarca(marca);
		setKm(km);
		
	}

	
	//metodi getter / setter
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getKm() {
		
		return km;
	}

	public void setKm(int km) {
		if (km < 0)
		{
			System.out.println("Non è possibile avere i km in negativo");
			return;
		}
		this.km = km;
	}
	
	//metodi
	
	public void stampaSingola()
	{
		System.out.print("La marca dell'auto è: " + getMarca() + " è i suoi km sono: " + getKm());
		System.out.println();
	}
	
	public static int stampaTotale(Auto[] array)
	{
		int kmTotali = 0;
		for(int i = 0; i < array.length; i++ )
		{
			kmTotali += array[i].getKm();
			System.out.print("La marca dell'auto è: " + array[i].getMarca() + " è i suoi km sono: " + array[i].getKm());
			System.out.println();
		}
		System.out.println("I km totali di tutte le auto sono: " + kmTotali);
		
		return kmTotali;
	}
	
	
}
