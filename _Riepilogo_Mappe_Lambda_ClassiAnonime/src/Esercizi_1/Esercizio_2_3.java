package Esercizi_1;


interface ValidatorePassword
{
	public boolean accetta(String password);
}
public class Esercizio_2_3 {

	 public static void main(String[] args) {
		 
		 ValidatorePassword filtro = new ValidatorePassword()
				 {
			 @Override
			 public boolean accetta (String password)
			 {
				boolean maiuscola = false;
				boolean minuscola = false;
				boolean numero = false;
				boolean spazio = false;
				
				for (int i = 0; i < password.length(); i++)
				{
					Character c = password.charAt(i);
					if(Character.isUpperCase(c))
					{
						maiuscola = true;
					}
					else if (Character.isLowerCase(c)) {
						minuscola = true;
					}
					else if (Character.isDigit(c))
					{
						numero = true;
					}
					else if (Character.isSpace(c))
					{
						spazio = true;
					}
				}
				if(maiuscola && minuscola && numero && !spazio && password.length() >= 8)
				{
					return true;
				}
				return false;
			 }
				 };
				 
				 
			System.out.println(filtro.accetta("Java2026"));
			System.out.println(filtro.accetta("java2026"));
			System.out.println(filtro.accetta("JAVA2026"));
			System.out.println(filtro.accetta("Java 2026"));
			System.out.println(filtro.accetta("Java26"));
			System.out.println(filtro.accetta("Password1"));
				 
	 }
}

