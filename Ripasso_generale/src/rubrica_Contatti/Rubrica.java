package rubrica_Contatti;

import java.util.List;

public class Rubrica  {

	//variabili di istanza
	private List<Contatto> lista;
	
	//costruttore
	 public Rubrica(List<Contatto> lista) {
		this.lista = lista;

	}
	 
	//metodi getter e setter
	 public List<Contatto> getLista() {
		 return lista;
	 }

	 public void setLista(List<Contatto> lista) {
		 this.lista = lista;
	 }
	 
	 //metodi
	 
	 public void aggiungiContatto(Contatto c)
	 {
		 lista.add(c);
	 }
	 
	 public void  rimuoviContatto(String telefono)
	 {
		for (int i = 0; i < lista.size(); i++)
		{
			if (lista.get(i).getTelefono().equals(telefono))
			{
				lista.remove(i);
				break;
			}
		}
	 }
	 
	 public void cercaPerNome(String nome)
	 {
		 for (int i = 0;i < lista.size(); i++)
			 
		 {
			 if (lista.get(i).getNome().equalsIgnoreCase(nome))
				 
				 System.out.println("Contatto trovato");
			     System.out.println(lista.get(i).toString());
			  
		 }
	 }
	 
	 
}
