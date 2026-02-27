package esercizio_incapsulamento_dati;

import java.util.Scanner;

public class mondo_Esercizio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Scanner scanner = new Scanner(System.in);
//		
//		//EssereUmano2 umano1 = new EssereUmano2 ("Giovanna", "D'agnano", (byte) 36 , 165f, 65 );
//		//umano1.stampa();
//		
//	
//		System.out.println("Inserisci il tuo nome");
//		
//		String nome = scanner.nextLine();
//		
//		System.out.println("Inserisci il tuo cognome");
//		
//		String cognome = scanner.nextLine();
//		
//		System.out.println("Inserisci la tua età");
//		
//		byte eta = scanner.nextByte();
//		scanner.nextLine();
//		
//		System.out.println("Inserisci la tua altezza");
//		
//		float altezza = scanner.nextFloat();
//		scanner.nextLine();
//		
//		System.out.println("Inserisci il tuo peso");
//		float peso = scanner.nextFloat();
//		scanner.nextLine();
//		
//		EssereUmano3 umano2 = new EssereUmano3(nome, cognome, eta, altezza, peso);
//		umano2.stampa();
		
//		gatti micio = new gatti();
//		
//		micio.setNome("micio");
//		micio.setAltezza(32);
//		micio.setPeso(10);
//		micio.setEta((byte)4);
//		micio.setSesso(Esercizio_Sesso.MASCHIO);
//		micio.setColoreOcchi(Esercizio_ColoreOcchi.GRIGI);
//		
//		micio.stampa();
		
		Esercizio_EssereUmano giovanna = new Esercizio_EssereUmano("Giovanna", "D'Agnano", Esercizio_Sesso.FEMMINA, (byte) 37, 165f, 65f, Esercizio_ColoreCapelli.CASTANI, Esercizio_ColoreOcchi.CASTANI );
		
		giovanna.stampa();
	}

}
