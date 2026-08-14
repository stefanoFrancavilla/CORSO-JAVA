package Argomento_4;

public class Esercizio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Esercizio 3 (Difficile) — Sistema Pagamenti con Polimorfismo Avanzato
Crea una classe astratta MetodoPagamento con attributo protetto titolare 
e un metodo astratto public abstract boolean eseguiPagamento(double importo);.

Crea due sottoclassi:

CartaDiCredito (con limiteMassimo double e saldoSpeso double).
 Il pagamento va a buon fine solo se (saldoSpeso + importo) <= limiteMassimo. Se riesce, incrementa saldoSpeso.

ContoPaypal (con saldoDisponibile double). Il pagamento va a buon fine solo se importo <= saldoDisponibile. Se riesce, scala il saldo.

Crea una classe Cassa con un metodo public void processaTransazione(MetodoPagamento metodo, double importo) 
che invoca il pagamento e stampa se la transazione è riuscita o fallita.

Nel main, testa la cassa passando sia una carta sia un conto Paypal.
		 */
		
		
	}

}
