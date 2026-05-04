package Es_2problemaDelDiamante;

public class problemaDelDiamante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Esercizio 2 — Diamante con interfacce
Obiettivo
Capire il conflitto tra due metodi default con lo stesso nome.

Diagramma a diamante
text
           +----------------+
           |   Volante      |
           +----------------+
           | + azione()     |
           +--------+-------+
                    \
                     \
                      \
                       v
                    +----------------+
                      ^
                     /
                    /
           +--------+-------+
           |   Nuotante     |
           +----------------+
           | + azione()     |
           +----------------+
Versione più leggibile:

text
      Volante        Nuotante
          \            /
           \          /
            \        /
             \      /
              Anatra
Dove nasce il problema
text
Volante.azione()   -> "Sto volando"
Nuotante.azione()  -> "Sto nuotando"
Anatra implementa entrambe
Domanda: quale azione() deve usare?
Soluzione Java
La classe Anatra deve fare override del metodo e scegliere cosa fare.

Problema del diamante con interfacce
Obiettivo
Simulare un caso simile al problema del diamante usando interfacce con metodi default.

Richieste
Crea due interfacce, ad esempio Volante e Nuotante.

Entrambe devono avere un metodo azione() con implementazione default.

Crea una classe Anatra che implementa entrambe le interfacce.

Nella classe Anatra, risolvi il conflitto con un override.

Cosa devi fare
Far stampare un messaggio diverso a seconda della scelta fatta dentro Anatra.

Provare anche a commentare l’override per vedere il conflitto.

Difficoltà
Media: impari dove nasce l’ambiguità e come si risolve in Java.

		 */
		
		
	}

}
