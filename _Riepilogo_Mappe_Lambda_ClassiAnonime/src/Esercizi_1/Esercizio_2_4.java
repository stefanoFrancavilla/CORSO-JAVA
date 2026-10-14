package Esercizi_1;

interface FiltroProdotto {
	public boolean accetta (String prodotto, int quantita);
}

public class Esercizio_2_4 {

	 public static void main(String[] args) {
		 
		 FiltroProdotto filtro = new FiltroProdotto() {
			 
			 @Override
			 public boolean accetta (String prodotto, int quantita)
			 {
				 return 
						 (!(prodotto == null)) &&
						 (!prodotto.isBlank()) &&
						 prodotto.length() >= 3 &&
						 quantita > 0 &&
						 quantita < 100;
			 }
		 };
		 
		 
		 System.out.println(filtro.accetta("Mouse", 25));
		 System.out.println(filtro.accetta("", 10));
		 System.out.println(filtro.accetta("SSD", 0));
		 System.out.println(filtro.accetta("Monitor", 150));
		 System.out.println(filtro.accetta("Tastiera", 40));
	 }
}
