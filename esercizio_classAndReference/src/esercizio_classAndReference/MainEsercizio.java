package esercizio_classAndReference;

public class MainEsercizio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendario primo = new Calendario();
		
		primo.giorno = 10;
		primo.mese = 3;
		primo.anno = 2024;
		primo.ora = 15;
		primo.minuti = 30;

	System.out.println(primo.giorno + "/" + primo.mese + "/" + primo.anno + " alle " + primo.ora + ":" + primo.minuti);
	
	
	
	System.out.println();
	System.out.println("--------------------------");
	System.out.println();
	
	Calendario sec = new Calendario();
	
	sec.giorno = 12;
	sec.mese = 3;
	sec.anno = 2026;
	sec.ora = 17;
	sec.minuti = 21;
	
	System.out.println(sec.giorno + "/" + sec.mese + "/" + sec.anno + " alle " + sec.ora + ":" + sec.minuti);
	
	
	System.out.println();
	System.out.println("1-------------------------");
	System.out.println();
	
	Calendario terzo = primo;
	
	terzo.anno = 2030;
	 
	System.out.println("terzo anno " + terzo.anno);
	System.out.println("primo anno " + primo.anno);
	
	System.out.println();
	System.out.println("2-------------------------");
	System.out.println();
	
	test test = new test();
	
	int int1 = 520;
	test.modificaNumero(int1);
	System.out.println("valore dopo modifica " + int1);
	
	System.out.println();
	System.out.println("3-------------------------");
	System.out.println();
	
	test test2 = new test();
	
	int int2 = 360;
	
	test.modificaNumero(int2);
	
	System.out.println("valore modificato " + int2);
	
	
	System.out.println();
	System.out.println("4-------------------------");
	System.out.println();
	
	Calendario quarto = new Calendario();
	
	System.out.println("--------------------------");
	quarto.anno = 2021;
	quarto.giorno = 16;
	quarto.mese = 12;
	quarto.ora = 7;
	quarto.minuti = 10;
	
	System.out.println(quarto.giorno + "/" + quarto.mese + "/" + quarto.anno + " alle " + quarto.ora + ":" + quarto.minuti);
	System.out.println();
	System.out.println();
	
	System.out.println(" quarto " + quarto);
	System.out.println();
	System.out.println();
	
	System.out.println("--------------------------");
	
	test.modificaCalendario(quarto);
	System.out.println();
	System.out.println();
	
	System.out.println("quarto dopo " + quarto );
	System.out.println();
	System.out.println();
	
	System.out.println(quarto.giorno + "/" + quarto.mese + "/" + quarto.anno + " alle " + quarto.ora + ":" + quarto.minuti);
	
	
}
}