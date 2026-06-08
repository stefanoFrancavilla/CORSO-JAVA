package Esercizio_SistemaDiGestioneDeiMezziDiTrasporto;

public final class Auto extends Veicolo implements MezzoTrasporto {



		
		//variabili di istanza
		
		private final int porte;
		
		//costruttore
		
		public Auto(String modello, int anno, int porte) {
			super(modello, anno);
			this.porte = porte;
		}
		
		//metodi
		@Override
		public void utilizza() {
			// TODO Auto-generated method stub
		
	}

		

}
