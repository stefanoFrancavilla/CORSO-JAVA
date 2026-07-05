package incapsulamentoDeiDati;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.regex.Pattern;

import incapsulamentoDeiDati.Azienda.BonusSupplier;

//Author: Luca Bonacorsi.
public class Azienda {
	
	//Variabili d'istanza.
	private String nome;
	private List<Dipendente> dipendenti;

	
	
	//Costruttori.
	public Azienda(String nome)
	{
		this.setNome(nome);
		dipendenti = new ArrayList<Dipendente>();
	}
	
	
	
	//Metodi getter/setter.
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public List<Dipendente> getDipendenti() {
		return dipendenti;
	}

	public void setDipendenti(List<Dipendente> dipendenti) {
		this.dipendenti = dipendenti;
	}
	
	
	
	//Meotdi.
	public void assume(Dipendente dipendente)
	{
		dipendenti.add(dipendente);
	}
	
	public List<Dipendente> selezionaDipendenti(SelezioneDipendente selezioneDipendente)
	{
		List<Dipendente> dipendentiSelezionati = new ArrayList<Dipendente>();
		
		for(Dipendente dipendente : dipendenti)
		{
			if(selezioneDipendente.seleziona(dipendente))
			{
				dipendentiSelezionati.add(dipendente);
			}
		}
		
		return dipendentiSelezionati;
	}
	
	/*public List<Dipendente> selezionaDipendenti2()
	{
		List<Dipendente> dipendentiSelezionati = new ArrayList<Dipendente>();
		
		for(Dipendente dipendente : dipendenti)
		{
			if(dipendente.getDataDiNascita().isAfter(LocalDate.of(2000, Month.DECEMBER, 31)))
			{
				dipendentiSelezionati.add(dipendente);
			}
		}
		
		return dipendentiSelezionati;
	}
	
	public List<Dipendente> selezionaDipendentiPerIniziale()
	{
		List<Dipendente> dipendentiSelezionati = new ArrayList<Dipendente>();
		
		for(Dipendente dipendente : dipendenti)
		{
			INITIAL_PATTERN = Pattern.compile("[mnop]", Pattern.CASE_INSENSITIVE);
			
			if(INITIAL_PATTERN.matcher(String.valueOf(dipendente.getNome().charAt(0))).matches());
			//if(dipendente.getDataDiNascita().isAfter(LocalDate.of(2000, Month.DECEMBER, 31)))
			{
				dipendentiSelezionati.add(dipendente);
			}
		}
		
		return dipendentiSelezionati;
	}*/
	
	public List<Dipendente> getDipendentiPerNome(String nome)
	{
		//1.
		List<Dipendente> lista = this.selezionaDipendenti(new SelezioneDipendente() {
			
			//String nome = "Sara";
			
			@Override
			public boolean seleziona(Dipendente dipendente) {
				// TODO Auto-generated method stub
				//System.out.println("	this.nome: " + this.nome); //"This" si riferisce all'oggetto della classe anonima.
				System.out.println("	nome: " + nome);
				System.out.println("	Azienda.this.nome: " + Azienda.this.nome);
				
				return dipendente.getNome().toLowerCase().equals(nome.toLowerCase());
			}
		});

//		//2.
//		List<Dipendente> lista = this.selezionaDipendenti(
//				dipendente -> {
//					System.out.println("	this.nome: " + this.nome);
//					System.out.println("	nome: " + nome);
//					
//					//String nome = "Luca"; //No (prova a sovrascrivere il parametrro della funzione).
//					//nome = "Gianni"; //No (le lambda possono usare variabili locali esterne solo se final o usate come tali).
//					
//					return dipendente.getNome().toLowerCase().equals(nome.toLowerCase());
//				}
//		);
		
		return lista;
	}
	
	public List<Dipendente> getDipendentiPerColoreCapelli(ColoreCapelli coloreCapelli)
	{
		List<Dipendente> lista = this.selezionaDipendenti(new SelezioneDipendente() {
			
			@Override
			public boolean seleziona(Dipendente dipendente) {
				
				System.out.println("	coloreCapelli: " + coloreCapelli);
				
				return dipendente.getColoreCapelli() == coloreCapelli;
			}
		});
		
//		List<Dipendente> lista = this.selezionaDipendenti(
//				dipendente -> {
//					System.out.println("	coloreCapelli: " + coloreCapelli);
//					
//					return dipendente.getColoreCapelli() == coloreCapelli;
//				}
//		);
		
		return lista;
	}
	
	
	public boolean getDipendentiMaschi(Dipendente dipendente)
	{
		return dipendente.getSesso() == Sesso.MASCHIO;
	}
	
	public static boolean getDipendentiFemmine(Dipendente dipendente)
	{
		return dipendente.getSesso() == Sesso.FEMMINA;
	}
	
	public boolean getDipendentiConCapelliCastani(Dipendente dipendente)
	{
		return dipendente.getColoreCapelli() == ColoreCapelli.CASTANI;
	}
	
	public static boolean getDipendentiOver50(Dipendente dipendente)
	{
		return dipendente.getAnni() > 50;
	}
	
	

	//INTREFACCIA FUNZIONALE PREDICATE.
	//public interface Predicate<t> {
	//	boolean test<T>
	//}
	public List<Dipendente> selezionaDipendentiPredicate(Predicate<Dipendente> selezioneDipendente)
	{
		List<Dipendente> dipendentiSelezionati = new ArrayList<Dipendente>();
		
		for(Dipendente dipendente : dipendenti)
		{
			if(selezioneDipendente.test(dipendente))
			{
				dipendentiSelezionati.add(dipendente);
			}
		}
		
		return dipendentiSelezionati;
	}
	
	public List<Dipendente> getDipendentiMaschiOver50()
	{
		Predicate<Dipendente> maschi = (dipendente) -> getDipendentiMaschi(dipendente);
		Predicate<Dipendente> over50 = (dipendente) -> getDipendentiOver50(dipendente);
		
		List<Dipendente> lista = this.selezionaDipendentiPredicate(((Predicate<Dipendente>)(this::getDipendentiMaschi)).and(Azienda::getDipendentiOver50));
		
		return lista;
	}
	
	
	
	//INTREFACCIA FUNZIONALE CONSUMER.
	//public interface Consumer<T> {
	//	void accept<T>
	//}	
	public void eseguiDipendentiConsumer(Consumer<Dipendente> selezioneDipendente)
	{
		for(Dipendente dipendente : dipendenti)
			selezioneDipendente.accept(dipendente);
	}
	
	public void raddoppiaStipendio(Dipendente dipendente)
	{
		dipendente.setStipendio(dipendente.getStipendio() * 2);
	}
	
	public void ottieniPromozione(Dipendente dipendente)
	{
		dipendente.setLivello(dipendente.getLivello()+1);
	}
	
	public void ottieniBonus(Dipendente dipendente)
	{
		BonusSupplier bs = new BonusSupplier();
		int bonus = bs.get();
		
		dipendente.setStipendio(dipendente.getStipendio() + bonus);
	}
	
	
	//Tipi annidati.
	public static interface SelezioneDipendente
	{
		abstract boolean seleziona(Dipendente dipendente);
	}
	/*
	 * la sintassi è la seguente :Selezione dipendente ha un'unico metodo astratto che:
	 * l'inteficatore è seleziona , che prende un parametro di tipo dipendente e restituisce un booleano.
	 */
	
	//public interface Supplier<T> {
	//	T get()
	//}	
	public class BonusSupplier implements Supplier<Integer> {
		
		@Override
		public Integer get() {
			Integer bonus = new Random().nextInt(1000);
			
			return bonus;
		}
	}
}