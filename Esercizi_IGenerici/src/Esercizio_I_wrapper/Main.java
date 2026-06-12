package Esercizio_I_wrapper;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//  Esercizio 1: Base - Conversioni e Metodi Fondamentali ⭐
//Obiettivo: Learnare boxing, unboxing, autoboxing e i metodi base dei wrapper.


        // PARTE A: Boxing manuale e automatico
        // 1. Creare un Integer con boxing MANUALE (new Integer())
		Integer a = Integer.valueOf(50);
        // 2. Creare un Integer con boxing AUTOMATICO (autoboxing)
		Integer b = 50;
        // 3. Creare un Double con boxing manuale
		Double c = Double.valueOf(1.12);
        // 4. Creare un Double con boxing automatico
		Double d = 1.12;
        
        // PARTE B: Unboxing manuale e automatico
        // 5. Convertire un Integer in int (unboxing manuale)
		Integer a1 = Integer.valueOf(25);
		int a2 = a1.intValue();
        // 6. Convertire un Double in double (unboxing automatico)
		Double b1 = Double.valueOf(2.33);
		double b2 = b1;
        
        // PARTE C: Metodi utili della classe Integer
        // 7. Convertire String "123" in int usando parseInt()
		Integer s1 = Integer.parseInt("41");
        // 8. Convertire int 456 in String usando toString()
		int s2 = 456;
		String s3 = Integer.toString(s2);
        // 9. Trovare il massimo tra 10 e 20 usando Integer.max()
		Integer min = Integer.valueOf(10);
		Integer max = 20;
		Integer massimo = Integer.max(min, max);
        // 10. Trovare il minimo tra 5 e 15 usando Integer.min()
		Integer minimo = Integer.min(5, 15);
        // 11. Comparare 100 e 100 usando Integer.compare() (cosa retorna?)
        
        // PARTE D: Metodi utili della classe Double
        // 12. Convertire String "3.14" in double usando Double.parseDouble()
		double d2 = Double.parseDouble("3.14");
        // 13. Usare Double.isNaN() per verificare un valore NaN
        Double nan = Double.NaN;
        // PARTE E: vOf() e valued()
        // 14. Usare Integer.valueOf("789") e confrontare con parseInt()
        Integer v1 = Integer.valueOf("789");
        int v2 = Integer.parseInt("789");
        
        // 15. Usare String.valueOf(123) per convertire int in String
       
        
        // Stampa tutti i risultati per verificare
        System.out.println("=== Esercizio 1 Risultati ===");
        // Aggiungi le tue print per ogni parte
    
        System.out.println("1. " + a);
        System.out.println("2. " + b);
        System.out.println("3. " + c);
        System.out.println("4. " + d);
        System.out.println("-------------------------------------");
        System.out.println("5. " + a1);
        System.out.println("5. " + a2);
        System.out.println("6. " + b1);
        System.out.println("6. " + b2);
        System.out.println("-------------------------------------");
        System.out.println("7. " + s1);
        System.out.println("8. " + s3);
        System.out.println("9. " + massimo);
        System.out.println("10. " + minimo);
        System.out.println("11. " + Integer.compare(100, 100));
        System.out.println("-------------------------------------");
        System.out.println("12. " + d2);
        System.out.println("13. " + Double.isNaN(nan));
        System.out.println("-------------------------------------");
        System.out.println("14. " + v1.equals(v2));
        System.out.println("15. " + String.valueOf(123));
        System.out.println("-------------------------------------");
        Integer x = 10;
        Integer y = 10;
        System.out.println(x == y);
        System.out.println(x.equals(y));
        System.out.println(Integer.compare(x, y));
        System.out.println("-------------------------------------");
        System.out.println("-------------------------------------");
        Integer x1 = 200;
        Integer y2 = 200;
        System.out.println(x1 == y2);
        System.out.println(x1.equals(y2));
        System.out.println(Integer.compare(x1, y2));
        System.out.println("-------------------------------------");
	}

}
