package Esercizi_1;

interface FiltroNumero {
    boolean accetta(int numero);
}

public class Esercizio_2_1 {

    public static void main(String[] args) {
    

        FiltroNumero filtro = new FiltroNumero()
        		{
        	@Override
        	public boolean accetta (int n)
        	{
        		if ((n % 2 == 0) && (n > 10))
        				{
        			return true;
        				}
        		return false;
        	}
        		};

        System.out.println(filtro.accetta(12));  // true
        System.out.println(filtro.accetta(7));   // false
        System.out.println(filtro.accetta(30));  // true
        System.out.println(filtro.accetta(25));  // false
    }
}
