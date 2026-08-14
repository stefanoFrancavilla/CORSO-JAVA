package Argomento_4;

public class Moto extends Veicolo {
	private boolean haIlBauletto;
	
	public Moto(String marca, int velocitaMassima, boolean haIlBauletto) {
		super(marca, velocitaMassima);
		this.haIlBauletto = haIlBauletto;
	}

	@Override
	public void mostraInfo() {
		// TODO Auto-generated method stub
		super.mostraInfo();
		System.out.println("Ha il Bauletto: " + haIlBauletto);
	}
	


}
