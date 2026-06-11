package Esercizio_1_SistemaDiUtenti;

import java.util.ArrayList;
import java.util.List;

public class Segreteria {

	//variabili di istanza
	
	private List<Utente> ComponentiDellaClasse = new ArrayList<>();

	
	//costruttore
	public Segreteria(List<Utente> componentiDellaClasse) {
		super();
		ComponentiDellaClasse = componentiDellaClasse;
	}
	
	//metodi 
	
	public void aggiungiComponente(Utente utenti)
	{
		ComponentiDellaClasse.add(utenti);
	}
	
	
	
	
	
	
}
