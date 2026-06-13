package Esercizio_I_wrapper;

import java.util.Random;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	Esercizio 3: Avanzato - Parsing, Validazione e Conversioni Complesse ⭐⭐⭐
	//	Obiettivo: Usare wrapper per validazione input, parsing sicuri, e conversioni tra tipi.

		        // PARTE A: Parsing sicuro con try-catch
		        // 1. Creare una funzione che accetta String e retorna int
		        // 2. Usare Integer.parseInt() dentro try-catch per gestire eccezioni
		        // 3. Testare con: "123", "abc", "", "45.6", "789"
		        // 4. Stampare messaggio di errore per input non validi
		        
		        // PARTE B: Conversione tra diversi tipi numerici
		        // 5. Convertire String "255" in: int, long, byte, short
		        // 6. Convertire int 1000 in: long, float, double
		        // 7. Convertire double 3.9 in int (cosa succede? truncamento?)
		        // 8. Usare Integer.byteValue(), shortValue(), longValue(), floatValue(), doubleValue()
		
		        String numero ="255";
		        
		        Integer intero = Integer.parseInt(numero);
		        int intPrimitivo = intero;
		        
		        Long wrapperLong = Long.parseLong(numero);
		        long longPrimitivo = wrapperLong;
		        
		      //  Byte wrapperByte = Byte.parseByte(numero);
		      //  byte bytePrimitivo = wrapperByte;
		        
		        Short wrapperShort = Short.parseShort(numero);
		        short shortPrimitivo = wrapperShort;
		        
		       
		      
		        int mille = 1000;
		        Integer wrapperMille = mille;
		        long longMille= wrapperMille.longValue();
		        float floatMille = wrapperMille.floatValue();
		        short shortMille = wrapperMille.shortValue();
		        
		
		        double conversione = 3.9;
		        Double conversioneDouble = conversione;
		        int conversioneInt = conversioneDouble.intValue();
		        
		        
		        // PARTE C: Validazione di valori
		        // 9. Usare Integer.MAX_VALUE e Integer.MIN_VALUE
		        // 10. Usare Double.MAX_VALUE, Double.MIN_VALUE, Double.POSITIVE_INFINITY
		        // 11. Usare Double.isInfinite() per verificare infinito
		        // 12. Creare funzione isOutsideRange(int valore, int min, int max)
		        
		        Double infinito = 1.0/0.0;
		        
		        // PARTE D: Parsing di diversi formati
		        // 13. Usare Integer.parseInt("FF", 16) per parsing hex
		        // 14. Usare Integer.parseInt("1010", 2) per parsing binary
		        // 15. Usare Long.parseLong per numeri grandi
		        
		        String grande = "9876543210";
		        long valoreLong = Long.parseLong(grande);
		        
		        
		        // PARTE E: Formato e rappresentazione
		        // 16. Usare Integer.toBinaryString(10)
		        // 17. Usare Integer.toHexString(255)
		        // 18. Usare Integer.toOctalString(64)
		        // 19. Usare Integer.toString(123, 16) per hex
		        
		        // PARTE F: Random e operazioni
		        // 20. Usare Random.nextInt(100) e convertirlo in Integer
		        // 21. Usare Integer.sum(10, 20) (metodo novo in Java 8+)
		        // 22. Usare Integer.multiply(5, 6) se disponibile
		        
		      
		        Random random = new Random();
		        Integer numeroRandom = Integer.valueOf(random.nextInt(100));
		        
		        
		        
		        System.out.println("=== Esercizio 3 Risultati ===");
		        
		        System.out.println("--------------Parte a-----------------------");
		        String[] test = {"123", "abc", "", "45.6", "789"};
		        for(int i = 0; i < test.length; i++)
		        {
		        	System.out.println(safeParseInt(test[i]));
		            System.out.println("-------------------------------------");
		        }
		        
		        System.out.println("--------------Parte b-----------------------");
		        
		        System.out.println("Risultato della conversione della String " + numero + " in un'int è: " + intPrimitivo);
		        System.out.println("Risultato della conversione della String " + numero + " in un long è: " + longPrimitivo);
		       // System.out.println("Risultato della conversione della String " + numero + " in un byte è: " + bytePrimitivo);
		        //il suo risultato sarà un'errore poichè il numero 255 è superiore al range del byte
		        System.out.println("Risultato della conversione della String " + numero + " in uno short è: " + shortPrimitivo);
		        System.out.println("-------------------------------------");
		        
		        System.out.println("da int a long: " + longMille);
		        System.out.println("da int a float: " + floatMille);
		        System.out.println("da int a short: " + shortMille);
		        
		        System.out.println("-------------------------------------");
		        
		        System.out.println("da double a int: " + conversioneInt);
		        //arrotonda per difetto la cifra double.
		        
		        System.out.println("--------------Parte c-----------------------");
		        System.out.println("il valore di Integer.MAX_VALUE è: " + Integer.MAX_VALUE );
		        System.out.println("il valore di Integer.MIN_VALUE è: " + Integer.MIN_VALUE );
		        System.out.println("-------------------------------------");
		        
		        System.out.println("Double massimo: " + Double.MAX_VALUE);
		        System.out.println("Double minimo positivo: " + Double.MIN_VALUE);
		        System.out.println("Infinito positivo: " + Double.POSITIVE_INFINITY);
		        System.out.println("-------------------------------------");
		        
		        System.out.println("Double.isInfinite(): " + Double.isInfinite(infinito));
		        System.out.println("-------------------------------------");
		        System.out.println("funzione isOutsideRange: " + isOutsideRange(42, 10, 50)); // true
		        System.out.println("-------------------------------------");
		        
		        System.out.println("--------------Parte d-----------------------");
		        System.out.println(" Integer.parseInt(\"FF\", 16)  " +  Integer.parseInt("FF", 16));
		        System.out.println(" Integer.parseInt(\"1010\", 2)  " +  Integer.parseInt("1010", 2));
		        System.out.println("-------------------------------------");
		        
		        System.out.println("Long.parseLong: " + valoreLong);
		        
		        System.out.println("--------------Parte e-----------------------");
		        System.out.println(" Integer.toBinaryString(10): " + Integer.toBinaryString(10));
		        System.out.println(" Integer.toHexString(255): " + Integer.toHexString(255));
		        System.out.println(" Integer.toOctalString(64): " + Integer.toOctalString(64));
		        System.out.println(" Integer.toString(123, 16): " + Integer.toString(123, 16));

		        System.out.println("--------------Parte f-----------------------");
		        System.out.println(" numero random : " + numeroRandom);
		        System.out.println("-------------------------------------");
		        
		        System.out.println(Integer.sum(5, 6)); 
		        System.out.println("-------------------------------------");
		        System.out.println("Integer.multiply(5, 6) , purtroppo non disponibile");
		        
		        

		    }
		    
		    // Aggiungi le tue funzioni di helper qui
		    public static int safeParseInt(String input) {
		        // Implementa qui
		    	try {
		    			return Integer.parseInt(input);
		    	}
		        catch(NumberFormatException e)
		    	{
		        	System.out.println("	ERRORE: Il testo della Stringa: " + input + " non contiene un numero intero");
		        	return -1;
		    	}
		    }
		    
		    public static boolean isOutsideRange(int valore, int min, int max) {
		        // Implementa qui
		    	if (valore >= min && valore <= max)
		    	{
		    		return true;
		    	}
		    	
		        return false;
	}

}
