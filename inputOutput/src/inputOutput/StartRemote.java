package inputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;

//Author: Luca Bonacorsi.
public class StartRemote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1.
		System.out.println();
		System.out.println("1. -------------------------------------------------------------");
		System.out.println();
		
		String jsonData = null;
		List<Persona> people;
		
		try
		{
			jsonData = loadRemoteJsonData("https://innovazionetop.com/test_data/persone_2.json");
			
			System.out.println("jsonData: " + jsonData);
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		
		if(jsonData != null)
		{
			people = getPeopleFromJsonData(jsonData);
			
			System.out.println("-------------------------------------------------------------");
			
			System.out.println(people);
			
			System.out.println("-------------------------------------------------------------");
			
			people.stream()
			.filter((persona) -> persona.getNome().toLowerCase().startsWith("s"))
			.forEach((persona) -> System.out.println(persona));
			
			System.out.println("-------------------------------------------------------------");

			people.stream()
			.filter((persona) -> persona.getCognome().toLowerCase().endsWith("o"))
			.forEach((persona) -> System.out.println(persona));
			
			System.out.println("-------------------------------------------------------------");

			people.stream()
			.filter((persona) -> persona.getAnni() < 18)
			.forEach((persona) -> System.out.println(persona));
		}
	}
	
	@SuppressWarnings("deprecation")
	private static String loadRemoteJsonData(String path) throws IOException
	{
		String jsonData = null;
		
		URL url = new URL(path);
		HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
		httpURLConnection.setRequestMethod("GET");
		
		try(BufferedReader reader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream())))
		{
			String line;
			StringBuilder stringBuilder = new StringBuilder();
			
			while((line = reader.readLine()) != null)
			{
				stringBuilder.append(line);
				
				System.out.println("line: " + line);
			}
			
			jsonData = stringBuilder.toString();
		}
		
		return jsonData;
	}
	
	/*private static void getPeopleFromJsonData(String jsonData)
	{
		Gson gson = new Gson();
		JsonObject jsonObject = gson.fromJson(jsonData, JsonObject.class);
		JsonArray jsonPeople = jsonObject.get("persone").getAsJsonArray();
		
		for(int i = 0; i < jsonPeople.size(); i++)
		{
			JsonObject jsonPerson = jsonPeople.get(i).getAsJsonObject();
			
			Persona persona = new Persona();
			persona.setId(jsonPerson.get("id").getAsInt());
			persona.setNome(jsonPerson.get("nome").getAsString());
			persona.setCognome(jsonPerson.get("cognome").getAsString());
			persona.setAnni(jsonPerson.get("anni").getAsByte());
			
			System.out.println(persona);
		}
	}*/
	
	private static List<Persona> getPeopleFromJsonData(String jsonData)
	{
		Gson gson = new Gson();
		JsonObject jsonObject = gson.fromJson(jsonData, JsonObject.class);
		JsonArray jsonPeople = jsonObject.get("persone").getAsJsonArray();
		
		//List<Persona> people = new ArrayList<>();
		List<Persona> people = new LinkedList<>();
		
		for(int i = 0; i < jsonPeople.size(); i++)
		{
			JsonObject jsonPerson = jsonPeople.get(i).getAsJsonObject();
			
			Persona persona = new Persona();
			persona.setId(jsonPerson.get("id").getAsInt());
			persona.setNome(jsonPerson.get("nome").getAsString());
			persona.setCognome(jsonPerson.get("cognome").getAsString());
			persona.setAnni(jsonPerson.get("anni").getAsByte());
			
			System.out.println(persona);
			
			people.add(persona);
		}
		
		return people;
	}
}
