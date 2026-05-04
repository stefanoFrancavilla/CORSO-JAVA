package Es_3singleton_problemaDelDiamante;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 *  Progetto completo
Obiettivo
Unire Singleton + conflitto tipo diamante nello stesso mini-progetto.

Scenario
Sistema per gestire lezioni in una scuola.

Classi e interfacce
RegistroLezioni → Singleton

Insegnante → interfaccia con default ruolo()

Allievo → interfaccia con default ruolo()

Assistente → implementa entrambe le interfacce

Main → usa tutto

Diagramma completo
text
                      +----------------------+
                      |   RegistroLezioni    |
                      +----------------------+
                      | - instance           |
                      | - lezioni : List     |
                      +----------------------+
                      | - RegistroLezioni()  |
                      | + getInstance()      |
                      | + aggiungiLezione()  |
                      | + mostraLezioni()    |
                      +----------+-----------+
                                 ^
                                 |
                                 | usato da
                                 |
+----------------+      +--------+--------+      +----------------+
|  Insegnante    |      |      Main       |      |    Allievo     |
+----------------+      +-----------------+      +----------------+
| + ruolo()      |      | crea Assistente |      | + ruolo()      |
+--------+-------+      | usa Singleton   |      +--------+-------+
         \              +--------+--------+               /
          \                      |                       /
           \                     |                      /
            \                    v                     /
             \           +------------------+         /
              +--------> |    Assistente    | <------+
                         +------------------+
                         | + ruolo()        |
                         +------------------+
Flusso del progetto
textProgetto completo con entrambi
Obiettivo
Creare una piccola applicazione in cui usi sia il Singleton sia una struttura che richiama il problema del diamante.

Scenario
Stai creando un sistema per una scuola di danza.

Richieste
Crea un Singleton RegistroLezioni che tenga traccia delle lezioni prenotate.

Crea due interfacce Insegnante e Allievo, entrambe con un metodo ruolo() di default.

Crea una classe Assistente che implementa entrambe le interfacce.

Risolvi il conflitto di ruolo() dentro Assistente.

Usa RegistroLezioni per aggiungere e mostrare le lezioni.

Nel main, dimostra che:

RegistroLezioni è unico.

Assistente risolve l’ambiguità tra le due interfacce.

Difficoltà
Più complessa: qui devi combinare due concetti e ragionare sia sulla struttura degli oggetti sia sui conflitti di ereditarietà/comportamento.
Main
 ├─ prende RegistroLezioni con getInstance()
 ├─ aggiunge una o più lezioni
 ├─ crea un Assistente
 ├─ chiama ruolo()
 └─ mostra che il registro è unico e che il conflitto è risolto
 
 
 
		 */
		
		
	}

}
