package Argomento_4_1;

public class Esercizio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Esercizio — Sistema di spedizioni con polimorfismo

Crea una classe astratta chiamata MetodoSpedizione.

Deve avere:

Un attributo protected String destinatario

Un costruttore per inizializzare il destinatario

Un metodo astratto:

java

public abstract boolean inviaPacco(double peso);
Crea poi due sottoclassi:

java

CorriereStandard
Attributi:

double pesoMassimo

double pesoSpedito

Regola: la spedizione riesce solo se pesoSpedito + peso non supera pesoMassimo. Se riesce, aggiorna pesoSpedito.

java

CorriereEspresso
Attributi:

double budgetDisponibile

double costoPerKg

Regola: per inviare un pacco devi calcolare il costo:

java

double costo = peso * costoPerKg;
La spedizione riesce solo se il costo non supera il budgetDisponibile. Se riesce, sottrai il costo dal budget.

Infine crea una classe:

java

CentroSpedizioni
Con il metodo:

java

public void processaSpedizione(MetodoSpedizione metodo, double peso)
Questo metodo deve:

Ricevere un oggetto del tipo astratto MetodoSpedizione

Chiamare inviaPacco(peso)

Stampare se la spedizione è riuscita oppure fallita

Nel main:

Crea un oggetto CorriereStandard

Crea un oggetto CorriereEspresso

Passali entrambi a processaSpedizione(...)

Prova almeno un caso riuscito e uno fallito per ogni corriere

Esempio di utilizzo atteso:

java

MetodoSpedizione standard = new CorriereStandard("Stefano", 20.0);
MetodoSpedizione espresso = new CorriereEspresso("Marco", 30.0, 4.5);
CentroSpedizioni centro = new CentroSpedizioni();
centro.processaSpedizione(standard, 10.0); // Riuscita
centro.processaSpedizione(standard, 15.0); // Fallita: supera 20 kg totali
centro.processaSpedizione(espresso, 5.0);  // Riuscita: costa 22.5
centro.processaSpedizione(espresso, 3.0);  // Potrebbe fallire: budget rimasto 7.5
		 */
		
		MetodoSpedizione standard = new CorriereStandar("Stefano", 20.0);
		MetodoSpedizione espresso = new CorriereEspresso("Marco", 30.0, 4.5);
		CentroSpedizioni centro = new CentroSpedizioni();
		centro.processaSpedizione(standard, 10.0); 
		centro.processaSpedizione(standard, 15.0); 
		centro.processaSpedizione(espresso, 5.0);  
		centro.processaSpedizione(espresso, 3.0);  
	}

}
