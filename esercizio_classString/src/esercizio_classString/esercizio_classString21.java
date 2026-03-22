package esercizio_classString;

public class esercizio_classString21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

String[] mezzi = new String[]{"Bici", "Moto", "Auto", "Camion"};

    for(String parola : mezzi) 
    {
	   System.out.println(parola);
    }

    String unita = String.join(" ", mezzi);
    
    System.out.println(unita);
    
    



	}

}
