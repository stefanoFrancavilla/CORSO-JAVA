package esercizio_classString;

public class esercizio_calssString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nome = new String("Stefano Francavilla");
		
		System.out.println(nome); 
		System.out.println();
		
		int lunghezza = nome.length();
		char carattere = nome.charAt(0);
		int valore = nome.codePointAt(0);
		
		System.out.println("la lunghezza della stringa è: " + lunghezza);
		System.out.println();
		
		for (int i = 0; i < lunghezza; i++)  {
			
			carattere = nome.charAt(i);
			
			valore = nome.codePointAt(i);
			
			System.out.println(carattere);
			
			System.out.println(valore);
			System.out.println();
			
		}
			
			System.out.println("--------------------------------------------------------");
			
			String nome2 ="Giovanna";
			int lunghezza2 = nome2.length();
			char carattere2 = nome2.charAt(0);
			int valore2 = nome2.codePointAt(0);
			
			System.out.println("la lunghezza della stringa è: " + lunghezza2);
			System.out.println();
			
			for (int i2 = 0; i2 < lunghezza ; i2 ++) {
				
				carattere2 = nome2.charAt(i2);
				valore2 = nome2.codePointAt(i2);
				
				System.out.println(carattere2);
				
				System.out.println(valore2);
				System.out.println();
			}
		}
	}


