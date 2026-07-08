package Esercizi_avanzati;

import java.util.ArrayList;
import java.util.Collections;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Esercizio 1
		
		ArrayList<Animale> animali = new ArrayList<Animale>();
		
		animali.add(new Animale("Cane", 15));
		animali.add(new Animale("Gatto", 5));
		animali.add(new Animale("Elefante", 5000));
		
		ArrayList<Animale> animaliOrdinati = new ArrayList<Animale>(animali);
		
		Collections.sort(animaliOrdinati);
		
		for(Animale animale : animaliOrdinati) {
			System.out.println(animale.getNome());
		}
		
		System.out.println("----------------------------------");
		
		//Esercizio 2
		
		ArrayList<Libro> libri = new ArrayList<>();
		libri.add(new Libro("Java", 500));
		libri.add(new Libro("C", 300));
		libri.add(new Libro("Python", 700 ));
		
		Collections.sort(libri);
		
		for(Libro libro : libri)
		{
			System.out.println(libro.getNumeroPagine());
		}
	System.out.println("----------------------------------");
		
		//Esercizio 3
	
	ArrayList<Studente> studenti = new ArrayList<>();
	
	studenti.add(new Studente("Anna", 30));
	studenti.add(new Studente("Marco", 22 ));
	studenti.add(new Studente("Luca", 28));
	
	
	Collections.sort(studenti);
		
	for(Studente s : studenti)
	{
		System.out.println(s.getNome() + " " + s.getMedia());
	}
		
	
	
	System.out.println("----------------------------------");
	
	//Esercizio 4
	
	
	ArrayList<Film> filmCrescente = new ArrayList<>();
	
	
	filmCrescente.add(new Film("tolo tolo", 2020));
	filmCrescente.add(new Film("pari e dispari", 1984));
	filmCrescente.add(new Film("titanic", 1998));
	
	Collections.sort(filmCrescente);
	for (Film f : filmCrescente)
	{
		System.out.println(f.getTitolo() + " " + f.getAnno());
	}
	
System.out.println("----------------------------------");
	
	//Esercizio 5

ArrayList<Auto> auto = new ArrayList<>();

auto.add(new Auto("BMW", 320 ));
auto.add(new Auto("Cupra", 300));
auto.add(new Auto("fiat", 200));

Collections.sort(auto);

for(Auto a : auto)
{
	System.out.println(a.getMarca() + " " + a.getVelocitaMassima());
}
	

System.out.println("----------------------------------");

//Esercizio 6
	ArrayList<Giocatore> giocatoriCrescente = new ArrayList<>();
	
	giocatoriCrescente.add(new Giocatore("Marco", 20));
	giocatoriCrescente.add(new Giocatore("Luca", 50));
	giocatoriCrescente.add(new Giocatore("Anna", 10));
	giocatoriCrescente.add(new Giocatore("Mario", 70));
	
	Collections.sort(giocatoriCrescente);
	
	for(Giocatore g : giocatoriCrescente)
	{
		System.out.println(g.getNome() + " " + g.getPunti());
	}
	
	ArrayList<Giocatore> giocatoriDecrescente = new ArrayList<>(giocatoriCrescente);
	
	Collections.sort(giocatoriDecrescente);
	
	System.out.println("----------------------------------");

	//Esercizio 8
	/*
	 * 
	 * @Override
public int compareTo(Casa c){

if(this.metriQuadri < c.metriQuadri)
return -1;

if(this.metriQuadri > c.metriQuadri)
return 1;

return 0;
}
	 */
	System.out.println("----------------------------------");
	//Esercizio 9
	
	ArrayList<Telefono> telefoni = new ArrayList<>();
	
	telefoni.add(new Telefono("iphone", 700));
	telefoni.add(new Telefono("samsung", 600));
	telefoni.add(new Telefono("oppo", 300));
	telefoni.add(new Telefono("xiami", 550));
	telefoni.add(new Telefono("nokia", 400));
	
	Collections.sort(telefoni);

	for(Telefono t : telefoni)
	{
		System.out.println(t.getMarca() + " " + t.getPrezzo());
	}
	
	//Esrecizio 10
	
	/*
	 * libro -> numero pagine
	 * da profano di libri se vedo che il libro è un classico mattone lo scarto a priori
	 * 
	 * Studente -> nome
	 *normalmente la lista degli studenti viene fatta in ordine alfabetico e la media voti passa in secondo piano;
	 *
	 * Prodotto -> prezzo
	 * una lista di prodotti viene generalmente fatta per prezzo dal più alto al più basso o viceversa
	 * 
	 * Persona -> per nome
	 * un alista di Pesrone generalmente è in ordine alfabetico
	 * 
	 * Film -> per titolo
	 * un film generalmente in una lista è impostato per titolo
	 * 
	 * Computer -> per prezzo
	 * in una lista di computer sia più importante getirli per prazzo magari dal più costoso al meno costoso o viceveresa
	 * 
	 * Canzone -> per titolo
	 * in una lista di canzoni è più naturale vederli per nome in ordine alfabetico
	 * 
	 *Videogiochi -> per prezzo
	 *in una lista di videogiochi è preferibile sistemarli per prezzo in base alle possibilità del cliente
	 *
	 *Aereo -> per orario
	 *in una lista di aerei la sistemerei per orario
	 *
	 *
	 *Treno -> per orario
	 *in una lista di treni la sistemerei per orario
	 *
	 */
	
	Libro libro = new Libro("123", 123);

	libro.equals("Ciao");
	
	libro.equals(new ArrayList<>());
	
	System.out.println(libro.);
	
	
	}

}
