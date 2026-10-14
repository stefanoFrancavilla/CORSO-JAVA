package Esercizi_1;

import java.util.ArrayList;
import java.util.List;

public class Esercizio_3_2 {

	public static void main(String[] args) {
		
      List<Integer> numeri = new ArrayList<>(
          List.of(12, 5, 30, 7, 18, 25, 3, 40));


      // Esercizio 1 
      
      numeri.forEach(n -> System.out.println(n));
		
      System.out.println("----------------------------------");
      // Esercizio 2
		
      numeri.removeIf(n -> n % 2 != 0);
      System.out.println(numeri);
      
      System.out.println("----------------------------------");
      
      // Esercizio 3
      
      numeri.replaceAll(n -> n * 2);
      
      System.out.println(numeri);
      
      System.out.println("----------------------------------");
      
      // Esercizio 4
      
      numeri.sort((a, b) -> a.compareTo(b));
      System.out.println(numeri);
      
      System.out.println("----------------------------------");
      
      // Esercizio 5
      
      numeri.removeIf(n -> n > 50);
       
      System.out.println(numeri);
      
      System.out.println("----------------------------------");
      
	}

}
