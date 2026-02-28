package IncapsulamentoDeiDatiEsercizio;

public class Mondo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	 EssereUmano umano1 = new EssereUmano();
//	 
//	 umano1.setAltezza(190);
//	 umano1.setNome("stefano");
//	 umano1.setCognome("francavilla");
//	 umano1.setSesso(Sesso.MASCHIO);
//	 umano1.setPeso(95);
//	 umano1.setEta((byte)39);
//	 umano1.setColoreOcchi(ColoreOcchi.VERDI);
//	 umano1.setColoreCarnagione(coloreCarnagione.BIANCA);
//	 umano1.setColoreCapelli(coloreCapelli.CASTANI);
//	 
//	 umano1.mangia();
//	 umano1.stampa();
	 
	EssereUmano giovanna = new EssereUmano();
	 
	giovanna.setAltezza(165);
	giovanna.setNome("giovanna");
	giovanna.setCognome("d'agnano");
	giovanna.setSesso(Sesso.FEMMINA);
	giovanna.setPeso(65);
	giovanna.setEta((byte)37);
	giovanna.setColoreOcchi(ColoreOcchi.NERI);
	giovanna.setColoreCarnagione(coloreCarnagione.BIANCA);
	giovanna.setColoreCapelli(coloreCapelli.CASTANI);
	 
	giovanna.mangia();
	giovanna.dorme();
	giovanna.lavora();
	giovanna.stampa();
	
	}

}
