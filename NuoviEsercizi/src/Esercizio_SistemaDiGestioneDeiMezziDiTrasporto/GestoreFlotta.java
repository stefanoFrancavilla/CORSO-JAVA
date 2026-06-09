package Esercizio_SistemaDiGestioneDeiMezziDiTrasporto;

import java.util.ArrayList;
import java.util.List;

public class GestoreFlotta {

	
	//variabili
	
	private int auto = 0;
	private int moto = 0;
	private int motoSportive = 0;
	private int biciclette = 0;
	
	
	
	
	
	
	private List<MezzoTrasporto> mezzi = new ArrayList<MezzoTrasporto>();
	
	//costruttore
	
	public GestoreFlotta(List<MezzoTrasporto> mezzi) {
		super();
		this.mezzi = mezzi;
	}
	
	
	//metodo
	
	
	
	public void aggiungiMezzo ( MezzoTrasporto mezzo, List<MezzoTrasporto> mezzi)
	{
		if (mezzo instanceof Auto)
		{
			auto++;
		}
		
		if (mezzo instanceof Moto)
		{
			moto++;
		}
		
		if (mezzo instanceof MotoSportiva)
		{
			motoSportive++;
		}
		
		if (mezzo instanceof Bicicletta)
		{
			biciclette++;
		}
		
		mezzi.add(mezzo);
	}
	
	public void stampaStatistiche()
	{
		System.out.println("Auto: " + auto);
		System.out.println("Moto: " + moto);
		System.out.println("Moto Sportive: " + motoSportive);
		System.out.println("Biciclette: " + biciclette);
		
	}
	
	public void utilizzaTutti(List<MezzoTrasporto> mezzi)
	{
		for(MezzoTrasporto tuttiMezzi : mezzi)
		{
			tuttiMezzi.utilizza();
		}
		
		stampaStatistiche();
	}

	public double calcoloCostoTotale(List<MezzoTrasporto> mezzi)
	{
		double costoAuto = 0;
		double costoMoto = 0;
		double costoMotoSportiva = 0;
		double costobicicletta = 0;
		double costoTotale = 0;
		if (auto != 0)
		{
			costoAuto = auto * 25 ;
		}
		
		if (moto != 0)
		{
			costoMoto = moto * 15;
		}
		
		if (motoSportive != 0)
		{
			costoMotoSportiva = motoSportive * 30;
		}
		
		if (biciclette != 0)
		{
			costobicicletta = biciclette * 5;
		}
		costoTotale = costoAuto + costoMoto + costoMotoSportiva + costobicicletta;
		
		return costoTotale;
	}
}
