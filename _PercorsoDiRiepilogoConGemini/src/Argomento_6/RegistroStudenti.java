package Argomento_6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RegistroStudenti {

	private Map<String, List<Double>> registro = new HashMap<>();
	
	public void aggiungiVoto(String studente, double voto)
	{
		registro.putIfAbsent(studente, new ArrayList<>());
		registro.get(studente).add(voto);
	}
	
	public double calcolaMedia(String studente)
	{
		List<Double> voti = registro.get(studente);
		
		if (voti == null || voti.isEmpty())
		{
			return 0.0;
		}
		
		double somma = 0.0;
		for(Double voto : voti)
		{
			somma += voto;
		}
		
		return somma/ voti.size();
	}
	
	  public void stampaTuttiGliStudenti() {
	        for (String studente : registro.keySet()) {
	            List<Double> voti = registro.get(studente);
	            double media = calcolaMedia(studente);

	            System.out.println("Studente: " + studente);
	            System.out.println("Voti: " + voti);
	            System.out.println("Media: " + media);
	            System.out.println("-------------------------");
	        }
	    }
}
