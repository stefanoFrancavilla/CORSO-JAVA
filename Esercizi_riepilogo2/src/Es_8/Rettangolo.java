package Es_8;

public class Rettangolo {

	//variabili
	double latoA;  // lato sinistro (altezza)
	double latoB;  // lato inferiore (base)
	double latoC;  // lato destro (altezza)
	double latoD;  // lato di sopra (base)
	
	//costruttore
	public Rettangolo()
	{
		
	}
	
	public Rettangolo(double latoA, double latoB, double latoC, double latoD)
	{
		this.latoA = latoA;
		this.latoB = latoB;
		this.latoC = latoC;
		this.latoD = latoD;
	}
	
	
	//metodi getter / setter
	public double getLatoA() {
		return latoA;
	}

	public void setLatoA(double latoA) {
		this.latoA = latoA;
	}

	public double getLatoB() {
		return latoB;
	}

	public void setLatoB(double latoB) {
		this.latoB = latoB;
	}

	public double getLatoC() {
		return latoC;
	}

	public void setLatoC(double latoC) {
		this.latoC = latoC;
	}

	public double getLatoD() {
		return latoD;
	}

	public void setLatoD(double latoD) {
		this.latoD = latoD;
	}
	
	//metodi
	
	public double calcoloArea()
	{
		double area = this.latoB * this.latoA;
		
		return area;
	}
	
	public double calcoloPerimetro()
	{
		double perimetro = this.latoA + this.latoB + this.latoC + this.latoD;
		
		return perimetro;
	}
	
	public boolean isQuadrato ()
	{
		boolean isQuadrato = false;
		if ((this.latoA == this.latoB) && ( this.latoC == this.latoD) && (this.latoD == this.latoA))
		{
			isQuadrato = true;
		}
		
		return isQuadrato;
	}
	//voto 9/10
}
