package esercizio_incapsulamento_dati;

import java.util.Scanner;

public class mondo_Esercizio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		//EssereUmano2 umano1 = new EssereUmano2 ("Giovanna", "D'agnano", (byte) 36 , 165f, 65 );
		//umano1.stampa();
		
	
		System.out.println("Inserisci il tuo nome");
		
		String nome = scanner.nextLine();
		
		System.out.println("Inserisci il tuo cognome");
		
		String cognome = scanner.nextLine();
		
		System.out.println("Inserisci la tua età");
		
		byte eta = scanner.nextByte();
		scanner.nextLine();
		
		System.out.println("Inserisci la tua altezza");
		
		float altezza = scanner.nextFloat();
		scanner.nextLine();
		
		System.out.println("Inserisci il tuo peso");
		float peso = scanner.nextFloat();
		scanner.nextLine();
		
		EssereUmano3 umano2 = new EssereUmano3(nome, cognome, eta, altezza, peso);
		umano2.stampa();
	}

}
