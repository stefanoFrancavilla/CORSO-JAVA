package Argomento1_List;

import java.util.ArrayList;
import java.util.List;

public class GestoreTemperature {

	private List<Double> temperature = new ArrayList<>();

	public List<Double> getTemperature() {
		return temperature;
	}
	
	public void aggiungiTemperatura(double temperatura)
	{
		if (temperatura > -100 && temperatura < 60)
		{
		temperature.add(temperatura);
		System.out.println("Temperatura aggiunta con successo");
		}
		else
		{
			
		System.out.println("La temperatura non rispetta il range di min -100 , max +60");
		}
	}
	
	public void rimuoviTemperatura(double temperatura)
	{
		if(temperature.isEmpty())
		{
			System.out.println("Lista vuota");
			return;
		}
		else
		{
			if (!temperature.contains(temperatura))
			{
				System.out.println("Temperatura non presente nella lista");
				return;
			}
			else
			{
				
				for (int i = 0; i < temperature.size(); i++)
				{
					if (temperature.get(i) == temperatura)
					{
						temperature.remove(i);
						break;
					}
				}
					
			}
		}
	}
	
	public boolean cercaTemperatura(double temperatura)
	{
		if(temperature.isEmpty())
		{
			System.out.println("Lista vuota");
			return false;
		}
		else
		{
			if(temperature.contains(temperatura))
			{
				return true;
			}
			else
			{
				return false;
			}
			
			
		}
	}
	
	
	public double calcolaMedia()
	{
		if(temperature.isEmpty())
		{
			System.out.println("Lista vuota");
			return 0;
		}
		else
		{
		double somma = 0.0;
		
		for(double temperatura : temperature)
		{
			somma += temperatura;
		}
		
		double media = somma / temperature.size();
		return media;
	  }
	}
	
	public double trovaTemperaturaMassima ()
	{
		if(temperature.isEmpty())
		{
			System.out.println("Lista vuota");
			return 0.0;
		}
		else
		{	
		double temperaturaMax = temperature.get(0);
		
		for (int i = 1; i < temperature.size(); i++)
		{
			if (temperaturaMax < temperature.get(i))
			{
				temperaturaMax = temperature.get(i);
			}
		}
		return temperaturaMax;
	   }
	}
	
	public double trovaTemperaturaMinima()
	{
		if(temperature.isEmpty())
		{
			System.out.println("Lista vuota");
			return 0.0;
		}
		else
		{
		double temperaturaMin = temperature.get(0);
		for (int i = 1; i < temperature.size(); i++)
		{
			if (temperaturaMin > temperature.get(i))
			{
				temperaturaMin = temperature.get(i);
			}
		}
		
		return temperaturaMin;
	  }
	}
	
	public int contaTemperatureSopra (double soglia)
	{
		if(temperature.isEmpty())
		{
			System.out.println("Lista vuota");
			return 0;
		}
		else
		{
		int counter = 0;
		for (double temperatura : temperature)
		{
			if(temperatura > soglia)
			{
				counter ++;
			}
		}
		return counter;
	  }
	}
	
	public void stampaTemperatureSopra(double soglia)
	{
		if(temperature.isEmpty())
		{
			System.out.println("Lista vuota");
			return;
		}
		else
		{
		ArrayList<Double> temperatureSopra = new ArrayList<>();
		
		for(Double temperatura : temperature)
		{
			if (temperatura > soglia)
			{
				temperatureSopra.add(temperatura);
			}
		}
		if(!temperatureSopra.isEmpty())
		{
		System.out.println("Le temperature sopra la soglia sono:");
		for(int i = 0; i < temperatureSopra.size(); i++ )
		{
			System.out.println("Indice: " + i + " Temperatura: " + temperatureSopra.get(i));
		}
		System.out.println("-------------------------");
		}
		else
		{
			System.out.println("Non ci sono temperature sopra alla soglia");
		}
	  }
	}
	
	
	public void stampaTemperature()
	{
		if(temperature.isEmpty())
		{
			System.out.println("Lista vuota");
			return ;
		}
		else
		{
		System.out.println("Le temperature sono:");
		for(int i = 0; i < temperature.size(); i++ )
		{
			System.out.println("Indice: " + i + " Temperatura: " + temperature.get(i));
		}
		System.out.println("-------------------------");
	  }
	}
	
}
