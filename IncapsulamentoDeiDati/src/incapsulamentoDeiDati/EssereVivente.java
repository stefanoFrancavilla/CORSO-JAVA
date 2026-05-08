package incapsulamentoDeiDati;

import java.time.LocalDate;
import java.time.Period;

public abstract class EssereVivente {
	//variabili di istanza
	private int anni;
	private float altezza;
	private float peso;
	private LocalDate dataDiNascita;
	


	//Costruttori
	public EssereVivente() 
	{
		System.out.println("--------------------------");
		System.out.println("EssereVivente (0)");
	}
	
//	public EssereVivente(byte anni, float altezza, float peso)
	public EssereVivente(float altezza, float peso, LocalDate dataDiNascita) 
	{
		System.out.println("--------------------------");
		System.out.println("EssereVivente (3)");
		//this.setAnni (anni);

		this.setAltezza (altezza);
	    this.setPeso (peso);
		this.setDataDiNascita (dataDiNascita);
		 
			
	}
	
	
	//metodi getter/setter
	
	
	/*
	 * se importiamo il metodo da una classe astratta , ad un'altra super classe astratta , non abbiamo l'obbligo di implementarlo
	 * a differenza di una classe astratta che passa il suo metodo alla classe normale,
	 * che invece è obbligata ad implementarlo, altrimenti non potrebbe essere istanziata.
	 * 
	 * nel nostro caso le classi essere umano e gatto sono classi specifiche,
	 * che vengono estese da una classe più generica, Animale,
	 * che a sua volta viene estesa da un'altra classe astratta ancora più generica EssereVivente,
	 * 
	 * bisogna vederla come una ereditaria con le varie ramificazioni, in cui la classe più generica è EssereVivente,
	 *  che viene estesa da Animale, che a sua volta viene estesa da Gatto e EssereUmano,
	 * 
	 */
	
	public float getAltezza() {
		return altezza;
	}
	//public abstract void setAltezza(float altezza);
//	public  void setAltezza(float altezza) {
//		this.altezza = altezza;
//	}
	
		public void setAltezza(float altezza) {
			
			System.out.println("--------------------------");
			System.out.println("EssereVivente -> setAltezza()"); 
		 
		 final float minAltezza = this.getMinAltezza();
		 final float maxAltezza = this.getMaxAltezza();
		 final float defaultAltezza = this.getDefaultAltezza();
		 
		 System.out.println("	minAltezza: " + minAltezza);
		 System.out.println("	maxAltezza: " + maxAltezza);
		 System.out.println("	defaultAltezza: " + defaultAltezza);
		 
		 
			if(altezza > minAltezza && altezza < maxAltezza) {
//				super.setAltezza(altezza);
				this.altezza = altezza;
				System.out.println("	" + this.altezza + " altezza inizializzata");
			}
			
			else
			{
				float altezzaCorrente = this.altezza;
				//this.altezza = altezza;
				if (altezzaCorrente > minAltezza && altezzaCorrente < maxAltezza)
				{
					System.out.println("	" + altezzaCorrente + " altezza valida da prima");
				}
			
				else
				{
					this.altezza = defaultAltezza;
					System.out.println("	" + this.altezza + " altezza assegnata di default");
				}	
			}
		}
	
	public float getPeso() {
		return peso;
	}

	//public abstract void setPeso(float peso);
//	public void setPeso(float peso) {
//		this.peso = peso;
//	}
	
	public void setPeso(float peso) {
		
		System.out.println("--------------------------");
		System.out.println("EssereVivente -> setPeso()"); 
		
		final float minPeso = this.getMinPeso();
		final float maxPeso = this.getMaxPeso();
		final float defaultPeso = this.getDefaultPeso();
		
		System.out.println("	minPeso: " + minPeso);
		System.out.println("	maxPeso: " + maxPeso);
		System.out.println("	defaultPeso: " + defaultPeso);
		
		if(peso > minPeso && peso < maxPeso)
		{
			//super.setPeso(peso);
			this.peso = peso;
			System.out.println("	" + this.peso + " peso inizializzato");
		}
		else
		{
			float pesoCorrente = this.peso;
			if (pesoCorrente > minPeso && pesoCorrente < maxPeso)
			{
				System.out.println("	" + pesoCorrente + " peso valido da prima.");
			}
			else
			{
//				super.setPeso(Gatto.DEFAULT_PESO); 
				this.peso = defaultPeso;
				System.out.println("	" + this.peso + " peso assegnato di default.");
			}
		}
	}
	
	
	public LocalDate getDataDiNascita() {
		return dataDiNascita;
	}

	public void setDataDiNascita(LocalDate dataDiNascita) {
		System.out.println("--------------------------");
		System.out.println("EssereVivente -> setDataDiNascita()"); 
		
	 final byte minAnni = this.getMinAnni();
	 final byte maxAnni = this.getMaxAnni();
	 final byte defaultAnni = this.getDefaultAnni();
	
		System.out.println("	minAnni: " + minAnni);
		System.out.println("	maxAnni: " + maxAnni);
		System.out.println("	defaultAnni: " + defaultAnni);
		
	 int anni = calcolaAnni(dataDiNascita);
	 
		if(anni >= minAnni && anni <= maxAnni) 
		{
			this.dataDiNascita = dataDiNascita;
			this.anni = anni;
			System.out.println("	" + this.dataDiNascita + "  inizializzata");
			System.out.println("	" + this.anni + "  inizializzati");
		}
		else
			/*
			 * con l'if stiamo dicendo che se la data di nascita è tra i limiti minimi e massimi, allora viene inizializzata,
			 * con l'else invece stiamo dicendo che: se la data di nascita non è tra i limiti minimi e massimi,
			 * ed è la prima volta che viene assegnata , allora viene assegnata di default
			 * passa all'else anche se la data di nascita è fuori dai limiti imposti dall'if 
			 * quindi la data di nascita sarà adesso e gli anni di default di conseguenza saranno = 0.
			 */
		{
			if(this.dataDiNascita == null)
			{
				this.dataDiNascita = LocalDate.now();
                this.anni = defaultAnni;
			}   
                else
                {
                	System.out.println("	" + this.dataDiNascita + "  valida da prima.");
        			System.out.println("	" + this.anni + "  validi da prima.");
                }
                
         System.out.println("	" + this.dataDiNascita + "  assegnata di default.");
         
		}
	}
	
	public int getAnni()
	{
		return anni;
	}
//	//public abstract void setAnni(byte anni);
////	public void setAnni(byte anni) {
////		
////		this.anni = anni;
//	//}
//	 
//	public void setAnni(byte anni) {

//		
//		
//		System.out.println("minAnni: " + minAnni);
//		System.out.println("maxAnni: " + maxAnni);
//		System.out.println("default_anni: " + defaultAnni);
//		
//		
//		

//		else
//		{
//			byte anniCorrenti = this.anni = anni;
//			
//			if (anniCorrenti >= minAnni && anniCorrenti <= maxAnni) 
//			{
//				System.out.println(anniCorrenti + " anni validi da prima.");
//			}
//			else
//			{
//				this.anni = defaultAnni;
//				System.out.println(this.anni + " anni assegnati di default.");
//			}
//		}
//	}
//	
	//metodi getter per le costanti statiche
	
	public abstract byte getMinAnni();
	public abstract byte getMaxAnni();
	public abstract byte getDefaultAnni();
	
	public abstract float getMinAltezza();
	public abstract float getMaxAltezza();
	public abstract float getDefaultAltezza();
	
	public abstract float getMinPeso();
	public abstract float getMaxPeso();
	public abstract float getDefaultPeso();
	
	
	
	//metodi 
	public abstract void nasce();
	
	public abstract void siNutre();
	
	public abstract void respira();
	
	public abstract void muore();
	
	private int calcolaAnni(LocalDate dataDiNascita) 
	{
		System.out.println("--------------------------");
		System.out.println("EssereVivente -> calcolaAnni()"); 
		
		
		/* con LocalDate.now() otteniamo la data attuale.
		 * con Period.between() otteniamo la differenza tra due date, in questo caso tra la data di nascita e la data attuale,
		 * con periodo.getYears() otteniamo solo gli anni della differenza tra le due date, escludendo mesi e giorni.
		*/
		LocalDate adesso = LocalDate.now(); 
		Period periodo = Period.between(dataDiNascita, adesso);
		
		int anni = periodo.getYears();
		System.out.println("    anni: " + anni);
		
		return anni;
	}

	
	public void stampa() {
		
		System.out.println("--------------------------");
		System.out.println("EssereVivente -> stampa()"); 
		
		System.out.println("	Anni: " + anni);
		System.out.println("	Altezza: " + altezza);
		System.out.println("	Peso: " + peso);
		System.out.println("	Data di nascita: " + dataDiNascita);
	}
}
