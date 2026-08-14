package Argomento_4;

public class Cerchio extends Figura {
	private double raggio;
	
	public Cerchio(double raggio) {
		this.raggio = raggio;
	}
	

	public double getRaggio() {
		return raggio;
	}


	public void setRaggio(double raggio) {
		this.raggio = raggio;
	}


	@Override
	public double calcolaArea() {
		// TODO Auto-generated method stub
		double area = Math.PI * raggio * raggio;
		return area;
	}

}
