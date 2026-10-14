package Esercizi_1;

interface FiltroEmail {
	public boolean accetta(String email);
}

public class Esercizio_2_2 {
	
	 public static void main(String[] args) {
		 
		 FiltroEmail filtro = new FiltroEmail()
				 {
			 @Override
			 public boolean accetta (String email)
			 {
				 if (email.contains("@") && (!email.startsWith("@")) && (!email.endsWith("@")))
				 {
					 return true;
				 }
				 return false;
			 }
				 };
		 
				 System.out.println(filtro.accetta("paolo@gmail.com"));   // true
			        System.out.println(filtro.accetta("paologmail.com"));    // false
			        System.out.println(filtro.accetta("@gmail.com"));        // false
			        System.out.println(filtro.accetta("paolo@"));            // false	 
	 }

}
