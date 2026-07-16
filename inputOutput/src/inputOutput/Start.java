package inputOutput;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//https://repo1.maven.org/maven2/com/google/code/gson/gson/2.10.1/
		
		//1.
		System.out.println();
		System.out.println("1. -------------------------------------------------------------");
		System.out.println();
		
		String source = "src/files/info.txt";
		String destination = "src/files/info2.txt";
		
		try
		{
			duplicateData(source, destination);
		}
		catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			//e.printStackTrace();
			
			System.out.println("e.getMessage() 1.1. : " + e.getMessage());
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			
			System.out.println("e.getMessage() 1.2. : " + e.getMessage());
		}
		
		
		//2.
		System.out.println();
		System.out.println("2. -------------------------------------------------------------");
		System.out.println();
		
		try
		{
			String data = readDataPerByte(source);
			
			System.out.println("-------------------------------------------------------------");
			
			System.out.println("data: " + data);
		}
		catch (UnsupportedEncodingException e)
		{
			// TODO Auto-generated catch block
			//e.printStackTrace();
			
			System.out.println("e.getMessage() 2.1. : " + e.getMessage());
		}
		catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			//e.printStackTrace();
			
			System.out.println("e.getMessage() 2.2. : " + e.getMessage());
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			
			System.out.println("e.getMessage() 2.3. : " + e.getMessage());
		}
		
		//3.
		System.out.println();
		System.out.println("3. -------------------------------------------------------------");
		System.out.println();
		
		try
		{
			String data = readData(source);
			
			System.out.println("-------------------------------------------------------------");
			
			System.out.println("data: " + data);
		}
		catch (UnsupportedEncodingException e)
		{
			// TODO Auto-generated catch block
			//e.printStackTrace();
			
			System.out.println("e.getMessage() 3.1. : " + e.getMessage());
		}
		catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			//e.printStackTrace();
			
			System.out.println("e.getMessage() 3.2. : " + e.getMessage());
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			
			System.out.println("e.getMessage() 3.3. : " + e.getMessage());
		}
		
		//4.
		System.out.println();
		System.out.println("4. -------------------------------------------------------------");
		System.out.println();
		
		ArrayList<Persona> people;
		
		try
		{
			people = readPeopleData("src/files/persone.txt");
			
			System.out.println("-------------------------------------------------------------");
			
			System.out.println("people: " + people);
		}
		catch (UnsupportedEncodingException e)
		{
			// TODO Auto-generated catch block
			//e.printStackTrace();
			
			System.out.println("e.getMessage() 4.1. : " + e.getMessage());
		}
		catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			//e.printStackTrace();
			
			System.out.println("e.getMessage() 4.2. : " + e.getMessage());
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			
			System.out.println("e.getMessage() 4.3. : " + e.getMessage());
		}
	}
	
	private static void duplicateData(String source, String destination) throws FileNotFoundException, IOException
	{
		//try-with-resources
		try (InputStream fileInputStream = new FileInputStream(source);
			 OutputStream fileOutputStream = new FileOutputStream(destination))
		{
			int bytes = 0;
			byte[] buffer = new byte[1];
			
			while((bytes = fileInputStream.read(buffer)) >= 0)
			{
				System.out.println("bytes: " + bytes); //19.
				
				fileOutputStream.write(buffer, 0, bytes);
			}
		}
	}
	
	private static String readDataPerByte(String source) throws UnsupportedEncodingException, FileNotFoundException, IOException
	{
		String data = null;
		
		try(InputStreamReader reader = new InputStreamReader(new FileInputStream(source), "UTF8"))
		{
			int character;
			StringBuilder stringBuilder = new StringBuilder();
			
			while((character = reader.read()) > 1)
			{
				//13 corrisponde al carriage return.
				//10 corrisponde al line feed.
				//"\r\n".
				System.out.println("character:\r\n " + character);
				System.out.println("(char)character: " + (char)character);
				
				stringBuilder.append((char)character);
			}
			
			data = stringBuilder.toString();
		}
		
		return data;
	}
	
	private static String readData(String source) throws UnsupportedEncodingException, FileNotFoundException, IOException
	{
		String data = null;
		
		try(BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(source), "UTF8")))
		{
			String line = null;
			StringBuilder stringBuilder = new StringBuilder();
			
			while((line = reader.readLine()) != null)
			{
				System.out.println("line: " + line);
				
				stringBuilder.append(line);
				stringBuilder.append("\n");
			}
			
			data = stringBuilder.toString();
		}
		
		return data;
	}
	
	private static ArrayList<Persona> readPeopleData(String source) throws UnsupportedEncodingException, FileNotFoundException, IOException
	{
		ArrayList<Persona> people = new ArrayList<>();
		
		try(BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(source), "UTF8")))
		{
			String line = null;
			
			while((line = reader.readLine()) != null)
			{
				System.out.println("line: " + line);
				
				people.add(parsePersonData(line));
			}
		}
		
		return people;
	}
	
	private static Persona parsePersonData(String line) {
		String[] personData = line.split(", ");
		
		int id = 0;
		String nome = personData[1];
		String cognome = personData[2];
		byte anni = 0;
		
		Persona persona = null;
		
		try
		{
			id = Integer.parseInt(personData[0]);
			
			System.out.println("id: " + id);
		}
		catch(NumberFormatException e)
		{
			//e.printStackTrace();
			
			System.out.println(e);
		}
		
		try
		{
			anni = Byte.parseByte(personData[3]);
			
			System.out.println("anni: " + anni);
		}
		catch(NumberFormatException e)
		{
			//e.printStackTrace();
			
			System.out.println(e);
		}
		
		persona = new Persona(id, nome, cognome, anni);
		
		return persona;
	}
}