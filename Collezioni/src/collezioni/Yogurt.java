package collezioni;

import java.time.LocalDate;

/*
 * in questa classe yogurt abbiamo implementato la classe Comparable, in modo da poter ordinare gli yogurt in base alla data di scadenza
 * abbiamo implementato il metodo compareTo, che confronta la data di scadenza di due yogurt 
 * e restituisce un intero che indica se la data di scadenza del primo yogurt è precedente, uguale o successiva a quella del secondo yogurt
 */
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
