package esercizio_classString;
import java.util.Scanner;
public class esercizio_classString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nome = "Alessio";
		
		char carattere = nome.charAt(0);
		int lunghezza = nome.length();
		int valore = nome.codePointAt(0);
		
		System.out.println(nome.toUpperCase());
		System.out.println();
		System.out.println("la lunchezza totale della stringa è di: " + lunghezza + " caratteri");
	
		
		for (int i = 0; i < lunghezza; i++ ) {
			
			carattere = nome.charAt(i);
			valore = nome.codePointAt(i);
			
			System.out.println();
			System.out.println(carattere);
			
			System.out.println(valore);
			
		}
		
		System.out.println();
		System.out.println("--------------------------------------------------------");
		
		// stampare una lettera maiuscola ed una lettera minuscola di una stringa in modo alternato
		
		String parola ="successivamente";
		String parolaRisultato = "";
		char carattere1;
		
		for (int p = 0; p < parola.length(); p++) {
			
			carattere1 = parola.charAt(p);
			
			if ((p % 2) == 0) {
				
				
				
			}else {
				
				carattere1 = (char) (carattere1 - 32);
			
			}
			
			parolaRisultato = parolaRisultato + carattere1;
		}
		
		System.out.println(parolaRisultato);
		
		System.out.println();
		System.out.println("--------------------------------------------------------");
		
		
		
		String parola2 = "completamente";
		
		String parola2Risultato ="";
		char carattere2;
	
		for (int p2 = 0; p2 < parola2.length(); p2++) {
			
			carattere2 = parola2.charAt(p2);
			
			if ((p2 % 2) == 0) {
				
			}else {
				carattere2 = (char) (carattere2 - 32);
			}
			parola2Risultato = parola2Risultato + carattere2; 
		}
		System.out.println(parola2Risultato);
		
		System.out.println();
		System.out.println("--------------------------------------------------------");
		
		String frase = "Ciao Mondo";
		String ris = "";
		char carattere3;
		
		for (int s = 0; s < frase.length(); s++)  {
			
			carattere3 = frase.charAt(s);
			
			if (Character.isUpperCase(carattere3)) {
				
				carattere3 = (char) (carattere3 + 32);
				
			}else {
				
				carattere3 =(char) (carattere3 -32);
					
				}
			ris = ris +carattere3;
		}
		System.out.println(ris);
		
		System.out.println();
		System.out.println("--------------------------------------------------------");
		
		String frase2 = "Ciao mondo!";
		String ris2 ="";
		char car;
		int count = 0;
		
		for (int c = 0; c < frase2.length(); c++) {
			
			car = frase2.charAt(c);
			
			if (Character.isLetter(car))  {
				
				if ((count % 2) == 0) {
					
					car = Character.toUpperCase(car);
				}else {
					
					car = Character.toLowerCase(car);
				}
				
				count ++;
				
			}
			
			
		ris2 = ris2 + car;
		
		
		
		
		
		
	}
		System.out.println(ris2);	
		
		System.out.println();
		System.out.println("--------------------------------------------------------");
		
	
		/*Scanner scanner = new Scanner(System.in);
		String ing = scanner.nextLine();
		String ris3 ="";
		char car3;
		int count2 = 0;
		
		
		for (int s3 = 0; s3 < ing.length(); s3++) {
			
			car3 = ing.charAt(s3);
			
			if (Character.isLetter(car3)) {
				
				if(car3 == 'a' ||  car3 == 'e' || car3 == 'o' || car3 == 'i' || car3 == 'u' ) {
					
					car3 = Character.toUpperCase(car3);
					
				}else {
					
					car3 = Character.toLowerCase(car3);
				}
				
				count2 ++;
			}
			
			ris3 = ris3 + car3;
		}
		System.out.println(ris3);	*/
			

		System.out.println();
		System.out.println("--------------------------------------------------------");	
		
	/*	Scanner scanner = new Scanner(System.in);
		
		String ing = scanner.nextLine();
		String ris3 ="";
		char car3;
		int count3 = 0;
		
		for (int s3 = 0; s3 < ing.length(); s3++) {
			
			car3 = ing.charAt(s3);
			
			if (Character.isLetter(car3)) {
				
				if (car3 == 'a' || car3 == 'e' || car3 == 'i' || car3 == 'o' || car3 == 'u') {
					
					car3 = Character.toLowerCase(car3);
					
				}else {
					
					car3 = Character.toUpperCase(car3);
				}
				count3 ++;
			}
			
			ris3 = ris3 + car3;
		}
		
		System.out.println(ris3); */
		
		System.out.println();
		System.out.println("--------------------------------------------------------");	
		
		
		Scanner scanner = new Scanner(System.in);
		
		String ingresso = scanner.nextLine();
		String risultato3 ="";
		char carattere4;
		int contatore = 0;
		
		for (int g = 0; g < ingresso.length(); g++) {
			
			carattere4 = ingresso.charAt(g);
			
			if(Character.isLetter(carattere4)) {
				
				if (carattere4 == 'a' || carattere4 == 'e' || carattere4 == 'i' || carattere4 == 'o' || carattere4 == 'u') {
					
					carattere4 = Character.toLowerCase(carattere4);
				}else {
					
					carattere4 = Character.toUpperCase(carattere4);
				}
				contatore ++;
			}
			risultato3 = risultato3 + carattere4;
		}
		
		System.out.println(risultato3);
			
		
			
		}
	}

