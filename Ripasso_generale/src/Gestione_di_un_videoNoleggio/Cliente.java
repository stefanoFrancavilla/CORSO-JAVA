package Gestione_di_un_videoNoleggio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	//variabili di istanza
	
	private String id;
	private String nome;
	private String email;
	private List<Ordine> ordini = new ArrayList<>();
	
	//-------------------------------------------------------------------------------------------
	//costruttore
	public Cliente(String id, String nome, String email, List<Ordine> ordini) {
		
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.ordini = ordini;
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

	@Override
	public String toString() {
		return "Cliente  \n"
				+ "id =" + id + ", \n"
				+ " nome =" + nome + ", \n"
				+ " email =" + email + ", \n"
				+ " ordini =" + ordini + ".";
	}
	
	//-------------------------------------------------------------------------------------------
	public void aggiungiOrdine (Ordine ordine)
	{
		ordini.add(ordine);
		System.out.println("Ordine aggiunto");
		System.out.println();
		System.out.println("------------------------------");
		System.out.println();
	}
	//-------------------------------------------------------------------------------------------
	public void stampaOrdini ()
	{
		if (ordini.isEmpty())
		{
			System.out.println("Non ci sono ordini");
		}
		else
		{
			System.out.println("-------------- Lista degli ordini -------------------");
			for (Ordine ordine : ordini)
			{
				System.out.println(ordine.toString());
			}
			System.out.println();
			System.out.println("------------------------------");
			System.out.println();
		}
	}
	//-------------------------------------------------------------------------------------------
	
	
	
	

	
	
}
