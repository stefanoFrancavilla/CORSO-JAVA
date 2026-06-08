package Esercizio_SistemaDiGestioneDeiMezziDiTrasporto;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Esercizio: Sistema di gestione dei mezzi di trasporto

Un'azienda gestisce diversi mezzi di trasporto.

Parte 1 - Interfaccia

Crea un'interfaccia:

Utilizzabile

con il metodo:

void utilizza();
Parte 2 - Sealed interface

Crea una sealed interface:

MezzoTrasporto

che:

estende Utilizzabile;
permette soltanto:
Auto
Moto
Bicicletta
Parte 3 - Classe astratta

Crea una classe astratta:

Veicolo

che contenga:

private final String modello;
private final int anno;

Costruttore.

Getter.

Override di toString().

Parte 4 - Auto

Deve essere:

final

Estende Veicolo.

Implementa MezzoTrasporto.

Aggiungi:

private int porte;

Metodo:

utilizza();

Stampa:

Auto Fiat Panda utilizzata.
Parte 5 - Moto

Deve essere:

non-sealed

Estende Veicolo.

Implementa MezzoTrasporto.

Aggiungi:

private int cilindrata;

Metodo:

Moto Yamaha utilizzata.
Parte 6 - MotoSportiva

Estende:

Moto

Override di:

utilizza();

Puoi fare:

super.utilizza();

e aggiungere:

Modalità sportiva attivata.
Parte 7 - Bicicletta

Deve essere:

final

Estende Veicolo.

Implementa MezzoTrasporto.

Attributo:

private boolean elettrica;

Metodo:

Bicicletta Trek utilizzata.
Parte 8 - Classe non permessa

Prova a creare:

Monopattino implements MezzoTrasporto

e verifica che il compilatore lo blocchi.

Parte 9 - GestoreFlotta

Crea:

GestoreFlotta

con:

private ArrayList<MezzoTrasporto> mezzi;

Nel costruttore inizializza la lista.

Metodo:

aggiungiMezzo(MezzoTrasporto mezzo)

Metodo:

utilizzaTutti()

che esegue:

for(MezzoTrasporto m : mezzi)
    m.utilizza();
Parte 10 - Metodo di analisi

Nel gestore crea:

stampaStatistiche()

Usando instanceof, conta:

quante Auto;
quante Moto;
quante MotoSportive;
quante Biciclette.

Stampa ad esempio:

Auto: 2
Moto: 1
Moto sportive: 1
Biciclette: 2
Parte 11 - Main

Crea:

2 Auto
1 Moto
1 MotoSportiva
2 Biciclette

Aggiungile al gestore.

Esegui:

utilizzaTutti();

poi:

stampaStatistiche();
Bonus 1

Aggiungi nella classe astratta Veicolo:

public abstract double costoUtilizzo();

Ogni classe deve implementarlo.

Ad esempio:

Auto -> 25€
Moto -> 15€
MotoSportiva -> 30€
Bicicletta -> 5€

Nel gestore crea:

calcolaCostoTotale();
Bonus 2

Nel gestore crea:

stampaDettagli();

e sfrutta toString() di ogni veicolo.

Bonus 3

Nel main prova il polimorfismo:

MezzoTrasporto mezzo = new MotoSportiva(...);
gestore.aggiungiMezzo(mezzo);

                            +------------------+
                            | <<interface>>    |
                            |   Utilizzabile   |
                            +------------------+
                            | + utilizza()     |
                            +------------------+
                                     ▲
                                     |
                                     |
                     +------------------------------+
                     | <<sealed interface>>         |
                     |      MezzoTrasporto          |
                     +------------------------------+
                     | permits:                     |
                     | Auto, Moto, Bicicletta       |
                     +------------------------------+
                                     ▲
                _____________________|_____________________
               |                     |                     |
               |                     |                     |
               |                     |                     |
        implements           implements           implements
               |                     |                     |
               |                     |                     |
               ▼                     ▼                     ▼

+---------------------------------------------------------------+
|                   <<abstract>> Veicolo                        |
+---------------------------------------------------------------+
| - modello : String                                            |
| - anno : int                                                  |
+---------------------------------------------------------------+
| + getModello() : String                                       |
| + getAnno() : int                                             |
| + toString() : String                                         |
| + costoUtilizzo() : double (abstract)                         |
+---------------------------------------------------------------+
            ▲                    ▲                    ▲
            |                    |                    |
            |                    |                    |
            |                    |                    |
    +---------------+    +---------------+    +---------------+
    |     Auto      |    |     Moto      |    |  Bicicletta   |
    |    final      |    |  non-sealed   |    |    final      |
    +---------------+    +---------------+    +---------------+
    | - porte:int   |    | - cilindrata  |    | - elettrica   |
    +---------------+    +---------------+    +---------------+
    | + utilizza()  |    | + utilizza()  |    | + utilizza()  |
    | + costo...()  |    | + costo...()  |    | + costo...()  |
    +---------------+    +---------------+    +---------------+
                                 ▲
                                 |
                                 |
                       +--------------------+
                       |   MotoSportiva    |
                       +--------------------+
                       | + utilizza()       |
                       | + costoUtilizzo()  |
                       +--------------------+


+------------------------------------------------+
|               GestoreFlotta                    |
+------------------------------------------------+
| - mezzi : ArrayList<MezzoTrasporto>            |
+------------------------------------------------+
| + aggiungiMezzo()                              |
| + utilizzaTutti()                              |
| + stampaStatistiche()                          |
| + calcolaCostoTotale()                         |
| + stampaDettagli()                             |
+------------------------------------------------+


 */
	}

}
