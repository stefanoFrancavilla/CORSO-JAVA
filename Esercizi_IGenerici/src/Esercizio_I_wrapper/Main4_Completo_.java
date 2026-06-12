package Esercizio_I_wrapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main4_Completo_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		        Scanner scanner = new Scanner(System.in);
		        
		        System.out.println("=== SISTEMA DI GESTIONE PREZZI ===");
		        
		        // PARTE 1: Arraylist di prezzi (Double wrapper)
		        ArrayList<Double> prezzi = new ArrayList<>();
		        // Aggiungi 5 prezzi usando autoboxing: 19.99, 29.50, 15.00, 49.99, 9.99
		        
		        // PARTE 2: HashMap per prodotti (String → Integer wrapper per quantità)
		        HashMap<String, Integer> quantita = new HashMap<>();
		        quantita.put("Laptop", 5);  // autoboxing
		        quantita.put("Mouse", 20);
		        quantita.put("Keyboard", 15);
		        
		        // PARTE 3: Calcolo totale con unboxing
		        double totale = 0;
		        for (Double prezzo : prezzi) {
		            // unboxing automatico: prezzo → double
		            totale += prezzo;
		        }
		        
		        // PARTE 4: Validazione input utente
		        System.out.print("Inserisci un nuovo prezzo: ");
		        String inputPrezzo = scanner.nextLine();
		        
		        Double nuovoPrezzo = safeParseDouble(inputPrezzo);
		        if (nuovoPrezzo != null) {
		            prezzi.add(nuovoPrezzo);  // autoboxing
		            System.out.println("Prezzo aggiunto!");
		        } else {
		            System.out.println("Prezzo non valido!");
		        }
		        
		        // PARTE 5: Confronto quantità con Integer
		        String prodotto = "Laptop";
		        Integer qty = quantita.get(prodotto);
		        Integer qty2 = new Integer(5);
		        
		        System.out.println("Quantità == nuovo Integer(5): " + (qty == qty2));
		        System.out.println("Quantità.equals(nuovo Integer(5)): " + qty.equals(qty2));
		        
		        // PARTE 6: Statistiche con metodi wrapper
		        double maxPrezzo = prezzi.stream()
		            .mapToDouble(p -> p)
		            .max()
		            .orElse(0);
		        
		        int sommaQuantita = 0;
		        for (Integer q : quantita.values()) {
		            sommaQuantita += q;  // autounboxing
		        }
		        
		        // PARTE 7: Conversione tipo
		        int totaleIntero = (int) totale;  // double → int
		        Integer totaleWrapper = totaleIntero;  // autoboxing
		        
		        // PARTE 8: String conversion
		        String report = "Totale: " + String.valueOf(totale) + 
		                       "\nMax prezzo: " + Double.toString(maxPrezzo) +
		                       "\nSomma quantità: " + Integer.valueOf(sommaQuantita);
		        
		        System.out.println(report);
		        
		        // PARTE 9: Challenge - Funzione generica
		        testWrapperConversions("123", "45.67", "true", "A");
		        
		        scanner.close();
		    }
		    
		    // Funzione di parsing sicuro
		    public static Double safeParseDouble(String input) {
		        try {
		            return Double.parseDouble(input);  // retorna Double wrapper
		        } catch (NumberFormatException e) {
		            return null;
		        }
		    }
		    
		    // Challenge: conversions
		    public static void testWrapperConversions(String intStr, String doubleStr, 
		                                            String boolStr, String charStr) {
		        System.out.println("\n=== Test Conversioni ===");
		        
		        // intStr → Integer → int
		        Integer intWrapper = Integer.parseInt(intStr);
		        int intPrimitivo = intWrapper;  // unboxing
		        
		        // doubleStr → Double → double
		        Double doubleWrapper = Double.parseDouble(doubleStr);
		        double doublePrimitivo = doubleWrapper;
		        
		        // boolStr → Boolean → boolean
		        Boolean boolWrapper = Boolean.parseBoolean(boolStr);
		        boolean boolPrimitivo = boolWrapper;
		        
		        // charStr → Character
		        Character charWrapper = charStr.charAt(0);
		        char charPrimitivo = charWrapper;
		        
		        System.out.println("Int: " + intPrimitivo + " (wrapper: " + intWrapper + ")");
		        System.out.println("Double: " + doublePrimitivo + " (wrapper: " + doubleWrapper + ")");
		        System.out.println("Boolean: " + boolPrimitivo + " (wrapper: " + boolWrapper + ")");
		        System.out.println("Char: " + charPrimitivo + " (wrapper: " + charWrapper + ")");
	}

}
