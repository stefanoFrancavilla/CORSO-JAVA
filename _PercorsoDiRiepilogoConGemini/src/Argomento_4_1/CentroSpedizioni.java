package Argomento_4_1;

public class CentroSpedizioni {

	public void processaSpedizione(MetodoSpedizione metodo, double peso)
	{
		if (metodo.inviaPacco(peso)) {
			System.out.println("Spedizione riuscita per " + metodo.destinatario + " con peso " + peso);
		} else {
			System.out.println("Spedizione fallita per " + metodo.destinatario + " con peso " + peso);
		}
	}
}
