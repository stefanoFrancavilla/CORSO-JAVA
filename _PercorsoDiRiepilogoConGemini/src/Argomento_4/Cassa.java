package Argomento_4;

public class Cassa {
	
	public void processaTransazione(MetodoPagamento metodo, double importo) {
		metodo.eseguiPagamento(importo);
	}	

}
