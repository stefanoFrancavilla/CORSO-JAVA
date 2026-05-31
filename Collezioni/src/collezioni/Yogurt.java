package collezioni;

import java.time.LocalDate;

public class Yogurt implements Comparable<Yogurt>{
	
	//variabili di istanza
	
	private LocalDate expireDate;
	private int id;
	
	//costruttori
	
	public Yogurt(int id, LocalDate expireDate)
	{
		this.id = id;
		this.expireDate = expireDate;
		
	}
	//metodi getter/setter

	public LocalDate getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(LocalDate expireDate) {
		this.expireDate = expireDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	//metodi
	@Override
	public int compareTo(Yogurt o) {
		return this.expireDate.compareTo(o.expireDate);
	}
	
	@Override
	public String toString() {
		return id + " " + expireDate;
	}
	
	
	
	
	

}
