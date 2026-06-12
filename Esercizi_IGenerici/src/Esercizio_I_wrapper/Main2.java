package Esercizio_I_wrapper;

import java.util.ArrayList;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		 * Esercizio 2: Intermedio - ArrayList e Confronti ⭐⭐
//Obiettivo: Capire PERCHÉ i wrapper sono necessari con Collections e come confrontarli correttamente.


        // PARTE A: ArrayList richiede oggetti (non primitivi)
        // 1. Creare un ArrayList di int (QUESTO NON FUNZIONA -Why?)
		
	//	ArrayList<int> ArrayNo = new ArrayList<>();
		//Questa sintassi non funziona perchè l'arrayList è basato su oggetti e non su primitivi.
		
        // 2. Creare un ArrayList di Integer (QUESTO FUNZIONA)
		ArrayList<Integer> integer = new ArrayList<>();
        // 3. Aggiungere 5 numeri interi all'ArrayList usando autoboxing
		integer.add(50);
		integer.add(45);
		integer.add(55);
		integer.add(40);
		integer.add(35);
        // 4. Accedere al primo elemento e fare unboxing per ottenere l'int
		int primo = integer.getFirst().intValue();
        
        // PARTE B: Confronto == vs .equals() con wrapper
        // 5. Creare Integer a = new Integer(100)
        // 6. Creare Integer b = new Integer(100)
        // 7. Confrontare a == b (cosa retorna? Perché?)
        // 8. Confrontare a.equals(b) (cosa retorna? Perché?)
		
		Integer a = new Integer(100); 
		Integer b = new Integer(100);
		
		
        // PARTE C: Cache degli Integer (importantissimo!)
        // 9. Creare Integer c = 10 (autoboxing, valore nella cache)
        // 10. Creare Integer d = 10 (autoboxing, stesso valore nella cache)
        // 11. Confrontare c == d (cosa retorna? Perché è diverso dal punto 7?)
        // 12. Creare Integer e = 200 (autoboxing, FUORI dalla cache)
        // 13. Creare Integer f = 200 (autoboxing)
        // 14. Confrontare e == f (cosa retorna? Perché?)
		
		Integer c = 10;
		Integer d = 10;
		Integer e = 200;
		Integer f = 200;
		
        
        // PARTE D: Modifica di wrapper (sono IMMUTABILI!)
        // 15. Creare Integer x = 10
        // 16. Tentare di modificare x (x = x + 1) - cosa succede realmente?
        // 17.Stampare x prima e dopo per vedere che è creato un NUOVO oggetto
        
		Integer x = 10;
		
        // PARTE E: Wrapper con altri tipi
        // 18. Creare ArrayList di Double e aggiungere 3.14, 2.71, 1.41
        // 19. Creare ArrayList di Boolean e aggiungere true, false, true
        // 20. Creare ArrayList di Character e aggiungere 'A', 'B', 'C'
        
		ArrayList<Double> valoriDouble = new ArrayList<>();
		valoriDouble.add(3.14);
		valoriDouble.add(2.71);
		valoriDouble.add(1.41);
		
		ArrayList<Boolean> valoreBoolean = new ArrayList<>();
		valoreBoolean.add(true);
		valoreBoolean.add(false);
		valoreBoolean.add(true);
		
		ArrayList<Character> valoriChar = new ArrayList<>();
		valoriChar.add('A');
		valoriChar.add('B');
		valoriChar.add('C');
        System.out.println("=== Esercizio 2 Risultati ===");
        // Stampa tutti i risultati
        System.out.println("-------------------------------------");
        System.out.println(primo);
        System.out.println("-------------------------------------");
        System.out.println(a == b); // nel primo caso sarà false perchè sono due oggetti divesi
        System.out.println(a.equals(b)); // nel secondo caso sarà true perchè stiamo confrontando i loro valori.
        System.out.println("-------------------------------------");
        System.out.println(c == d); //in questo caso sarà true , poichè ancora nel range della cache -128/127
        System.out.println(e == f); //sarà false poichè fuori dal range -128/127 e quindi sono due oggetti diversi
        System.out.println("-------------------------------------");
        System.out.println(x);
        System.out.println(x = x + 1); // siccome i wrapper sono immutabili è stato creato un nuovo oggetto
        
	}

}
