package Es_5;

import java.util.Random;
import java.util.Scanner;

public class es_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Esercizio 5: Menu Temperatura Settimana
           Array 7 double (temperature). Menu while: 1=media, 2=max/min, 3=giorni >20°C.
		 */
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		

		
		double[] temperature = new double[7];
		
		double min = 50;
		double max = -20;
		int giorniMaggiore20 = 0;
		double contatore = 0;
		
		for(int i = 0; i < temperature.length; i++)
			{
			temperature[i] = random.nextDouble() * 70.0 -20.0;
			contatore += temperature[i];
			max = Math.max(max, temperature[i]);
			min = Math.min(min, temperature[i]);
			
			if (temperature[i] > 20)
			{
				giorniMaggiore20 ++;
			}
			}
		
		double media = contatore / temperature.length;
		boolean run = true;
		
		while ( run)
		{
			System.out.println("Premi 1 per la media della temperatura della settimana");
			System.out.println("Premi 2 per la temperatura maggiore e mionore della settimana");
			System.out.println("Premi 3 per i giorni con temperature > 20°C");
			System.out.println("Premi 4 per chiudere il menu'");
			
			
			
			
		int scelta = scanner.nextInt();
		if ((scelta > 0) && (scelta <=4))
		{
		switch (scelta)
		{
		case 1:
		System.out.println("La media della temperatura settimanale è: " +  media);
		break;
		
		case 2:
		System.out.println("La temperatura maggiore della settimana è: " +  max);
		System.out.println("La temperatura minore della settimana è: " +  min);
		break;
		
		case 3:
		System.out.println("I giorni con tempreatura > 20°C sono: " + giorniMaggiore20);
		break;
		
		case 4:
		System.out.println("Chiusura menu'");
		run = false;
		
		}
		}
		else
		{
		System.out.println("Selezione non valida");
		}
		
		}
		
		
			scanner.close();
	}
//voto 9.5/10
}
