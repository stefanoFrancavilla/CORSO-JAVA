package Esercizio_SistemaDiGestioneDeiMezziDiTrasporto;

public final class Auto extends Veicolo implements MezzoTrasporto {



		
		//variabili di istanza
		
		private final int porte;
		private static Integer contatoreAuto = 0;
		
		
		
		//costruttore
		
		public Auto(String modello, int anno, int porte) {
			super(modello, anno);
			this.porte = porte;
			contatoreAuto++;
		}
		
		
		
		public static Integer getContatoreAuto() {
			return contatoreAuto;
		}



		public int getPorte() {
			return porte;
		}



		//metodi
		@Override
		public void utilizza() {
		
		
			System.out.println("Auto " + this.getModello() + " utilizzata");
		
	}



		@Override
		public  String toString() {
			return "Modello: " + this.getModello() + " anno: " + this.getAnno() + " porte: " + this.getPorte();
		}



		@Override
		public double costoUtilizzo() {
			// TODO Auto-generated method stub
			return 25;
		}
		
		

		
		

}
