package esercizio_classAndReference;

public class test {
	public void modificaNumero(int n) {
		n = 999;
		System.out.println("Valore interno di n: " + n);
	}
	
	public void modificaCalendario(Calendario c) {
		c.mese = 2;
		c.giorno = 2;  
		c.ora = 10;
		c.minuti = 30;
	}

}
