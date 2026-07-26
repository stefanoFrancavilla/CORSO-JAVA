package Sistema_di_gestione_ordini;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cliente {

	//variabili di istanza
	
	private String id;
	private String nome;
	private String email;
	private List<Ordine> ordini = new ArrayList<>();
	
	//-------------------------------------------------------------------------------------------
	//costruttore
	public Cliente(String id, String nome, String email) {
		
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.ordini = new ArrayList<>();
	}

	//-------------------------------------------------------------------------------------------
	//metodi getter setter
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Ordine> getOrdini() {
		return ordini;
	}

	public void setOrdini(List<Ordine> ordini) {
		this.ordini = ordini;
	}
	//-------------------------------------------------------------------------------------------
	//metodi

	
	
	//-------------------------------------------------------------------------------------------
	public void aggiungiOrdine (Ordine ordine)
	{
		ordini.add(ordine);
		

	}
	//-------------------------------------------------------------------------------------------
//	public void stampaOrdini ()
//	{
//		if (ordini.isEmpty())
//		{
//			System.out.println("Lista degli ordini vuota");
//		}
//		else
//		{
//			System.out.println("-------------- Lista degli ordini -------------------");
//			for (Ordine ordine : ordini)
//			{
//				System.out.println(ordine.toString());
//			}
//		}
//	}
	//-------------------------------------------------------------------------------------------

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(id, other.id);
	}
	
	@Override
	public String toString() {
		return "Cliente  \n"
				+ "id =" + id + ", \n"
				+ " nome =" + nome + ", \n"
				+ " email =" + email + ", \n"
				+ " ordini =" + ordini + ".";
	}
	
	

	
	
}
