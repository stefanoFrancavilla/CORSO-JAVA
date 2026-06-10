package Esercizio_Sistema_di_gestione_di_uno_zoo;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Esercizio: Sistema di gestione di uno zoo
Obiettivi

Dovrai usare:

✅ interface
✅ sealed interface
✅ abstract class
✅ final
✅ non-sealed
✅ ereditarietà
✅ polimorfismo
✅ ArrayList
✅ override
✅ composizione
✅ evitare il più possibile gli instanceof
Diagramma UML
                   +----------------+
                   | <<interface>>  |
                   |   Azione       |
                   +----------------+
                   | + agisci()     |
                   +----------------+
                           ▲
                           |
                   +----------------------+
                   | <<sealed interface>> |
                   |      Animale         |
                   +----------------------+
                   | permits:             |
                   | Leone                |
                   | Scimmia              |
                   | Aquila               |
                   +----------------------+
                           ▲
          _________________|__________________
         |                 |                  |
         |                 |                  |
         ▼                 ▼                  ▼

+--------------------------------------------------+
|             <<abstract>> Mammifero              |
+--------------------------------------------------+
| - nome : String                                 |
| - eta : int                                     |
+--------------------------------------------------+
| + getNome()                                     |
| + getEta()                                      |
| + toString()                                    |
| + costoGiornaliero() : double (abstract)        |
+--------------------------------------------------+
         ▲                    ▲
         |                    |
         |                    |
+----------------+   +-------------------+
| Leone (final) |   | Scimmia(nonsealed)|
+----------------+   +-------------------+
| + agisci()    |   | + agisci()        |
| + costo()     |   | + costo()         |
+----------------+   +-------------------+
                             ▲
                             |
                             |
                     +----------------+
                     | ScimmiaGeniale |
                     +----------------+
                     | + agisci()     |
                     | + costo()      |
                     +----------------+

+----------------------+
| Aquila (final)       |
+----------------------+
| - nome               |
| - eta                |
+----------------------+
| + agisci()           |
| + costo()            |
+----------------------+


+------------------------------------+
|          GestoreZoo                |
+------------------------------------+
| - animali:ArrayList<Animale>       |
+------------------------------------+
| + aggiungi()                       |
| + faiAgireTutti()                  |
| + costoTotale()                    |
| + stampaAnimali()                  |
+------------------------------------+
Parte 1

Interfaccia:

Azione

con

void agisci();
Parte 2

Sealed interface:

Animale

che estende Azione.

Permette solo:

Leone
Scimmia
Aquila
Parte 3

Classe astratta:

Mammifero

con:

nome

eta

getter

costruttore

toString

abstract double costoGiornaliero();
Parte 4

Leone

final

Stampa:

Il leone Simba ruggisce.

Costo:

50€
Parte 5

Scimmia

non-sealed

Stampa:

La scimmia George si arrampica.

Costo:

30€
Parte 6

ScimmiaGeniale

Estende Scimmia.

Override:

super.agisci();

La scimmia risolve un puzzle.

Costo:

45€
Parte 7

Aquila

final.

Non estende Mammifero.

Implementa direttamente Animale.

Ha:

nome

eta

Stampa:

L'aquila vola.

Costo:

40€
Parte 8

Classe non permessa

Prova:

Serpente implements Animale

e verifica l'errore.

Parte 9

GestoreZoo

Contiene:

ArrayList<Animale>

Metodo:

aggiungi(Animale a)
ATTENZIONE

NON fare:

aggiungi(Animale,List)

Il gestore possiede già la lista.

Parte 10

Metodo:

faiAgireTutti()

Deve essere semplicemente:

for(Animale a:animali)
{
    a.agisci();
}

Senza instanceof.

Parte 11

Metodo:

stampaAnimali()

Non fare:

if(instanceof Leone)

if(instanceof Scimmia)

Ma semplicemente:

System.out.println(animale);

Grazie al polimorfismo.

Parte 12

Metodo:

costoTotale()

NON fare:

numeroLeoni*50

numeroScimmie*30

Ma:

for(...)
{
    totale+=...
}

Usando il metodo astratto.

Questa è la parte importante.

Main

Crea:

2 Leoni

1 Scimmia

1 ScimmiaGeniale

2 Aquile

Aggiungili al gestore.

Esegui:

faiAgireTutti();

stampaAnimali();

costoTotale();
Super Bonus

Nel gestore crea:

nutriTutti();

Aggiungi all'interfaccia:

void mangia();

Ogni animale mangia qualcosa di diverso.
		 */
		
		List<Animale> animali = new ArrayList<Animale>();
		
		Animale simba = new Leone("Simba", 10);
		Animale leo = new Leone ("Leo", 5);
		Animale george = new Scimmia("George", 3);
		Animale Einstein = new ScimmiaGeniale("Einstein", 7);
		Animale riki = new Aquila("Riki", 1);
		Animale becco = new Aquila("Becco", 2);
		
		
		GestoreZoo tuttiGliAnimali = new GestoreZoo(animali);
		tuttiGliAnimali.aggiungi(leo);
		tuttiGliAnimali.aggiungi(becco);
		tuttiGliAnimali.aggiungi(riki);
		tuttiGliAnimali.aggiungi(Einstein);
		tuttiGliAnimali.aggiungi(george);
		tuttiGliAnimali.aggiungi(simba);
		
		System.out.println("--------------------------------");
		
		tuttiGliAnimali.costoTotale();
        System.out.println("--------------------------------");
		
		tuttiGliAnimali.faiAgireTutti();
		
        System.out.println("--------------------------------");
		
		tuttiGliAnimali.nutriTutti();
		
        System.out.println("--------------------------------");
		
		tuttiGliAnimali.stampaAnimali();;
	}	

}
