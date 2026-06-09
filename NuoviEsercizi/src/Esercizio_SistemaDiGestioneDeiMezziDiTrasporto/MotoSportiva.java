package Esercizio_SistemaDiGestioneDeiMezziDiTrasporto;

public class MotoSportiva extends Moto {

	//variabili
	private static Integer contatoreMotoSportiva = 0;
	
	
	//costruttore
	public MotoSportiva(String modello, int anno, String cilindata) {
		super(modello, anno, cilindata);
		contatoreMotoSportiva++;
	}
    //metodi getter
	public static Integer getContatoreMotoSportiva()
	{
		return contatoreMotoSportiva;
	}
	
	//metodi
	@Override
	public void utilizza() {
		super.utilizza();
		
		System.out.println("Modalità portiva attivata");
	}
	@Override
	public double costoUtilizzo() {
		// TODO Auto-generated method stub
		return 30;
	}

	
	
}
