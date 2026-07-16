package gestioneEccezioni;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//0.
		System.out.println();
		System.out.println("0. -------------------------------------------------------------");
		System.out.println();
		
		//Throwable -> Exception -> RuntimeException ->... (unchecked)
		//						|
		//						|-> IOException ->... (checked)
		
		
		//1.
		System.out.println();
		System.out.println("1. -------------------------------------------------------------");
		System.out.println();
		
		int n1 = 20;
		int n2 = 4;
		int n3 = 0;
		
		//1.1.
		//int result = (n1*n2)/n3;
		
		//1.2.
		int result = 0;
		
		try
		{
			result = (n1*n2)/n3;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		
		System.out.println("result: " + result);
		
		//Throwable -> Exception -> RuntimeException -> ArithmeticException
		
		
		//2.
		System.out.println();
		System.out.println("2. -------------------------------------------------------------");
		System.out.println();
		
		int n5 = 0;
		
		try
		{
			n5 = Integer.parseInt("Ciao!");
			//n5 = Integer.parseInt("4");
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
		}
		
		System.out.println("n5: " + n5);
		
		//Throwable -> Exception -> RuntimeException -> IlligalArgumentException -> NumberFormatException
		
		
		//3.
		System.out.println();
		System.out.println("3. -------------------------------------------------------------");
		System.out.println();
		
		Integer n7 = null;
		
		//3.1.
		//int n8 = n7;
		
		//3.2.
		int n8 = 0;
		
		try
		{
			n8 = n7;
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		
		System.out.println("n8: " + n8);
		
		//Throwable -> Exception -> RuntimeException -> NullPointerException
		
		
		//4.
		System.out.println();
		System.out.println("4. -------------------------------------------------------------");
		System.out.println();
		
		int n9 = 0;
		
		try
		{
			//4.1.
			n9 = Integer.parseInt("Arrivederci!");
			
			//4.2.
			//n9 = Integer.parseInt("1");
			//n8 = n7;
		}
		catch(NumberFormatException e)
		{
			System.out.println("1. " + e);
		}
		catch(NullPointerException e)
		{
			System.out.println("2. " + e);
		}
		catch(Exception e)
		{
			System.out.println("3. " + e);
		}
		
		System.out.println("n9: " + n9);
		
		
		//5.
		System.out.println();
		System.out.println("5. -------------------------------------------------------------");
		System.out.println();
		
		int n10 = 0;
		
		try
		{
			//n10 = Integer.parseInt("Arrivederci!");
			n8 = n7;
		}
		catch(NumberFormatException | NullPointerException e)
		{
			System.out.println("4. " + e);
		}
		catch(Exception e)
		{
			System.out.println("5. " + e);
		}
		
		System.out.println("n10: " + n10);
		
		
		//6.
		System.out.println();
		System.out.println("6. -------------------------------------------------------------");
		System.out.println();
		
		int n11 = 0;
		
		try
		{
			n11 = Integer.parseInt("3");
		}
		catch(NumberFormatException | NullPointerException e)
		{
			System.out.println("6. " + e);
		}
		catch(Exception e)
		{
			System.out.println("7. " + e);
		}
		finally
		{
			System.out.println("Eseguito in tutti i casi!");
		}
		
		System.out.println("n11: " + n11);
		
		
		//7.
		System.out.println();
		System.out.println("7. -------------------------------------------------------------");
		System.out.println();
		
		/*int n12 = 0;
		
		try
		{
			n12 = Integer.parseInt("Addio!");
		}
		finally
		{
			System.out.println("Eseguito in tutti i casi 2!");
		}
		
		System.out.println("n12: " + n12);*/
		
		
		//8.
		System.out.println();
		System.out.println("8. -------------------------------------------------------------");
		System.out.println();
		
		//8.1.
		//InputStream inputStream = new FileInputStream("a.txt");
		
		//8.2.
		InputStream inputStream = null;
		
		try
		{
			inputStream = new FileInputStream("a.txt");
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			
			System.out.println(e);
		}
		
		System.out.println("inputStream: " + inputStream);
		
		//Throwable -> Exception -> IOException -> FileNotFoundException
		
		//9.
		System.out.println();
		System.out.println("9. -------------------------------------------------------------");
		System.out.println();
				
		try
		{
			getIntFromString();
		}
		catch(NumberFormatException e)
		{
			System.out.println("throws: " + e);
		}
	}
	
	private static int getIntFromString() throws NumberFormatException
	{
		int n = 0;
		
		n = Integer.parseInt("Addio!");
		
		return n;
	}
}