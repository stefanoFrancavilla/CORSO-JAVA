package Argomento_4_1;

public abstract class MetodoSpedizione {

	protected String destinatario;
	
	public MetodoSpedizione(String destinatario) {
		this.destinatario = destinatario;
	}
	
	public abstract boolean inviaPacco(double peso);
}
