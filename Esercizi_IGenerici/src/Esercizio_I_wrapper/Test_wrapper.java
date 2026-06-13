package Esercizio_I_wrapper;

import java.util.ArrayList;
import java.util.HashMap;

public class Test_wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	     // QUESTO 1: Boxing/Unboxing - Cosa stampa?
        Integer a = 10; //AutoBoxing
        Integer b = 10; //AutoBoxing
        Integer c = new Integer(10); //Oggetto già creato (manuale)
        Integer d = new Integer(10); //Oggetto già creato (manuale)
        
        System.out.println("=== QUESTO 1: Boxing/Unboxing ===");
        System.out.println("a == b: " + (a == b));  // true o false? Scrivi la risposta PRIMA di eseguire
        // true perchè ancora nel range -128/127
        System.out.println("c == d: " + (c == d));  // true o false? Scrivi la risposta PRIMA di eseguire
        // false poichè sono 2 oggetti differenti
        System.out.println("a.equals(c): " + a.equals(c)); // true o false?
        // true poichè confronta il suo valore
        
        // QUESTO 2: ArrayList con wrapper
        System.out.println("\n=== QUESTO 2: ArrayList ===");
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(50);
        lista.add(100);
        lista.add(200);
        
        // 2.1: Accedere al primo elemento e convertirlo in int
        int primo = lista.get(0);  //intValue() necessario? Perché?
        System.out.println("primo: " + primo);
        // non abbiamo bisogno di intValue , per via dell'AutoUnboxing.
        //essendo un'ArrayList di Integer e il valore di primo è un primitivo
        
        // 2.2: Cosa succede se provo ArrayList<int>? (Non eseguibile, scrivi l'errore)
        // ArrayList<int> listaNo = new ArrayList<>();  // ERRORE! Perché?
        // non funzionerebbe poichè l' ArrayList lavora con oggetti , e un int è un primitivo, quindi si avremmo un'errore
        
        // QUESTO 3: Parsing sicuro
        System.out.println("\n=== QUESTO 3: Parsing ===");
        String[] input = {"123", "abc", "", "45.6", "-99"};
        
        for (String testo : input) {
            int risultato = safeParseInt(testo);
            System.out.println("'" + testo + "' -> " + risultato);
        }
        // qui abbiamo creato un ciclo forEach dove stiamo passando alla funzione safeParseInt(testo)
        //ad ogni iterazione del ciclo proviamo a passare ad int risultato il valore ottenuto.
        // nel caso di "123", e "-99" avremo lo stesso valore
        // nel caso di "abc", "", "45.6", entrerà in azione la nostra funzione che gestisce l'errore restituendo -1
        
        // QUESTO 4: Conversione tipi
        System.out.println("\n=== QUESTO 4: Conversione ===");
        
        // 4.1: Convertire "300" in byte (cosa succede?)
        try {
            byte bValue = Byte.parseByte("300");
            System.out.println("byte da 300: " + bValue);
        } catch (Exception e) {
            System.out.println("ERRORE byte: " + e.getMessage());
        }
        
        // qui gestiremo l'errore , poichè il byte ha un range di -128/127,
        //quindi anche se stiamo passando il valore wrapper di Byte a bValue, essendo fuori range ci sarà un'errore.
        //l'errore è gestito con Exception e , che comprende più tipi di errore
        
        // 4.2: Convertire double 7.9 in int (cosa succede?)
        double dValue = 7.9;
        int iValue = (int) dValue;
        System.out.println("double 7.9 -> int: " + iValue);
        //qui avremo un'approssimazione per difetto , quindi un troncamento cioè 7
        
        // QUESTO 5: Metodi Integer/Double
        System.out.println("\n=== QUESTO 5: Metodi ===");
        
        System.out.println("Integer.MAX_VALUE: " + Integer.MAX_VALUE); // massimo di un'Integer
        System.out.println("Integer.MIN_VALUE: " + Integer.MIN_VALUE); // minimo di un'Itneger
        System.out.println("Integer.sum(15, 25): " + Integer.sum(15, 25)); // somma dei due valori
        System.out.println("Integer.max(10, 20): " + Integer.max(10, 20)); // massimo dei due valori
        System.out.println("Integer.min(10, 20): " + Integer.min(10, 20)); // minimo dei due valori
        System.out.println("Integer.compare(10, 10): " + Integer.compare(10, 10)); // confronto dei due valori con risultato 0
        System.out.println("Integer.compare(10, 20): " + Integer.compare(10, 20)); // confronto dei due valori con risultato negativo
        System.out.println("Integer.compare(20, 10): " + Integer.compare(20, 10)); // confronto dei due numeri con risultato positivo
        
        // QUESTO 6: Hex, Binary, Octal
        System.out.println("\n=== QUESTO 6: Basi diverse ===");
        
        System.out.println("Integer.toBinaryString(10): " + Integer.toBinaryString(10)); // converte il valore 10 in binario
        System.out.println("Integer.toHexString(255): " + Integer.toHexString(255)); // converte il valore  255 in esadecimale
        System.out.println("Integer.toOctalString(64): " + Integer.toOctalString(64)); // converte il valore 64 in ottale
        System.out.println("Integer.parseInt(\"FF\", 16): " + Integer.parseInt("FF", 16)); // prende il primo parametro String "FF" e lo converte in esadecimale
        System.out.println("Integer.parseInt(\"1010\", 2): " + Integer.parseInt("1010", 2)); //converte il parametro String "1010" in binario
        
        // QUESTO 7: HashMap con wrapper
        System.out.println("\n=== QUESTO 7: HashMap ===");
        
        HashMap<String, Integer> quantita = new HashMap<>();
        quantita.put("Laptop", 5);  // autoboxing
        quantita.put("Mouse", 20);
        quantita.put("Keyboard", 15);
        
        Integer qty = quantita.get("Laptop");
        int qtyInt = qty;  // autounboxing necessario?
        // non è necessario poichè l'hashMap lavora con key/value che sono associati
        // quindi nel momento in cui scriviamo nella variabile "Laptop" il sistema richiamerà automaticamente il suo valore associato
        
        System.out.println("Laptop quantity: " + qtyInt);
        
        // QUESTO 8: Immutabilità
        System.out.println("\n=== QUESTO 8: Immutabilità ===");
        
        Integer x = 10;
        System.out.println("x prima: " + x);
        x = x + 1;  // Cosa succede?
        System.out.println("x dopo: " + x);
        
        //gli oggetti sono immutabili , quindi nel momento in cui andiamo ad aggiungere a x il valore 1 , viene creato un nuovo oggetto.
        
        
        // QUESTO 9: Double infinito e NaN
        System.out.println("\n=== QUESTO 9: Double ===");
        
        Double infinito = Double.POSITIVE_INFINITY; // assegnamo all'oggetto infinito il valore di infinito positivo. in output troveremo infinity
        Double nan = Double.NaN; // con NaN, cioè not a number , stiamo rappresentando i valori numerici non validi
        // di solito lo troviamo quando il risultato di un'operazione non è un numero valido
        
        System.out.println("isInfinite(infinito): " + Double.isInfinite(infinito));// stiamo verificando se il valore dell'oggetto infinito è realmente infinito
        // in questo caso sarà true poichè a infinito abbiamo assegnato il valore Double.POSITIVE_INFINITY
        System.out.println("isNaN(nan): " + Double.isNaN(nan)); //stiamo verificando se nan è un valore non valido
        System.out.println("Double.MAX_VALUE: " + Double.MAX_VALUE); // mostra il valore massimo di un Double
        System.out.println("Double.MIN_VALUE: " + Double.MIN_VALUE); // mostra il valore minimo di un Double
        
        // QUESTO 10: Challenge finale
        System.out.println("\n=== QUESTO 10: Challenge ===");
        
        // 10.1: Moltiplicazione (NON esiste Integer.multiply())
        int risultatoMoltip = 5 * 6;  // Come si fa?
        System.out.println("5 * 6 = " + risultatoMoltip);
        
        // anche se non esiste  Integer.multiply(), possiamo svolgerlo come una semplice operazione matematica quindi assegnado il risultato di 5 * 6;
        
        // 10.2: Convertire int in String (3 metodi diversi)
        int numero = 123;
        String s1 = Integer.toString(numero); // con il to String , mostra come una String il valore di numero
        String s2 = String.valueOf(numero); // stiamo assegnando a String il valore di numero
        String s3 = "" + numero; // abbiamo concatenato alla Stringa vuota il valore di numero
        
        System.out.println("toString: " + s1);
        System.out.println("valueOf: " + s2);
        System.out.println("concatenazione: " + s3);
        
        // 10.3: Verifica se un valore è fuori range
        System.out.println("isOutsideRange(42, 10, 50): " + isOutsideRange(42, 10, 50));// è dentro al range quindi false
        System.out.println("isOutsideRange(5, 10, 50): " + isOutsideRange(5, 10, 50)); // è dentro al range, quindi true
        System.out.println("isOutsideRange(60, 10, 50): " + isOutsideRange(60, 10, 50)); // è fuori al range, quindi false
    } 
    
    // QUESTO 3: Parsing sicuro
    public static int safeParseInt(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("    ERRORE: '" + input + "' non è valido");
            return -1;
        }
    }
    
    // QUESTO 10.3: Verifica range
    public static boolean isOutsideRange(int valore, int min, int max) {
        // COMPLETA: deve retornare true se valore è FUORI [min, max]
        // Scrivila CORRETTA qui!
    	if (valore < min || valore > max)
    	{
    		System.out.println("Il valore è fuori dal range");
    		return true;
    	}
    	else
    	{
    		System.out.println("Il valore è compreso nel range");
    		return false;
    	}
          
    }
}

