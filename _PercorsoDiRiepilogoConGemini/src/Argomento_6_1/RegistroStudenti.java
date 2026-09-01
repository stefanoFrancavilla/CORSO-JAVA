package Argomento_6_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RegistroStudenti {

	private Map<String, List<Double>> registro = new HashMap<>();

	public Map<String, List<Double>> getRegistro() {
		return registro;
	}


	public void aggiungiVoto(String studente, double voto)
	{
		registro.putIfAbsent(studente, new ArrayList<>());
		registro.get(studente).add(voto);
	}
	
	public double calcolaMedia (String studente)
	{
	  List<Double> voti = registro.get(studente);
	  
	  if (voti == null || voti.isEmpty())
	  {
		  return 0.0;
	  }
	  
	  double somma = 0;
	
	  for(double voto : voti)
	  {
		  somma += voto;
	  }
	  
	  return somma / voti.size();
	  
	}


	public void stampaStudenti()
	{
		for(String studente : registro.keySet())
		{
			List<Double> voti = registro.get(studente);
			double media = calcolaMedia(studente);
			
			System.out.println("Studente: " + studente);
			System.out.println("Voti studente: " + voti);
			System.out.println("Media voti studente: " + media);
			System.out.println("-------------------------------------" );
		}
		
			
		
	}
	
	public void stampaStudentiSopraMedia(double soglia)
	{
		for (String studente : registro.keySet())
		{
			double media = calcolaMedia(studente);
			if (media >= soglia)
			{
				List<Double> voti = registro.get(studente);
				System.out.println("Studente: " + studente);
				System.out.println("Voti studente: " + voti);
				System.out.println("Media voti studente: " + media);
				System.out.println("-------------------------------------");
			}
		}
	}

}