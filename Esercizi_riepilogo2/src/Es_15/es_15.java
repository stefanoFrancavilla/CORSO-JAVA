package Es_15;

public class es_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ESERCIZIO: Gestione Conto Bancario
🎯 Obiettivo

Creare un piccolo sistema con:

una classe Conto
una classe Banca che contiene più conti
🔷 Classe Conto


📦 Attributi:
String intestatario
double saldo


🔧 Costruttore:
Inizializza tutto usando i setter


🔹 Metodi:
1. deposita(double importo)
Aumenta il saldo
❌ Se importo ≤ 0 → errore


2. preleva(double importo)
Diminuisce il saldo
❌ Se importo ≤ 0 → errore
❌ Se importo > saldo → errore


3. getSaldo()
Ritorna il saldo


4. stampaInfo()
Stampa:
intestatario
saldo


🧠 Vincoli:
saldo ≥ 0
intestatario non vuoto


🔷 Classe Banca
📦 Attributi:
Conto[] conti


🔹 Metodi:
1. aggiungiConto(Conto c)
Inserisce il conto nel primo spazio libero


2. saldoTotaleBanca()
Somma tutti i saldi dei conti


3. stampaConti()
Stampa tutti i conti

🔷 Esempio main

Devi fare qualcosa del genere:



Conto c1 = new Conto("Mario", 1000);
Conto c2 = new Conto("Luigi", 500);
Conto c3 = new Conto("Anna", 2000);

Banca banca = new Banca(new Conto[5]);

banca.aggiungiConto(c1);
banca.aggiungiConto(c2);
banca.aggiungiConto(c3);

c1.preleva(200);
c2.deposita(300);



banca.stampaConti();
System.out.println("Totale banca: " + banca.saldoTotaleBanca());


⚠️ Attenzione (gli errori tipici 😉)

Ti avviso già dove potresti sbagliare:

❌ dimenticare this.conti = conti nel costruttore
❌ non controllare null
❌ usare parametri inutili nei metodi
❌ non rispettare i vincoli
🚀 BONUS (se vuoi fare il salto di livello)

Aggiungi:

metodo trovaConto(String nome)
metodo contoConSaldoMassimo()


+----------------------+
|        Conto         |
+----------------------+
| - intestatario:String|
| - saldo: double      |
+----------------------+
| + Conto(...)         |
| + deposita(double)   |
| + preleva(double)    |
| + getSaldo():double  |
| + stampaInfo():void  |
+----------------------+

            ▲
            | (contenuto in)
            |
+---------------------------+
|          Banca            |
+---------------------------+
| - conti: Conto[]          |
+---------------------------+
| + Banca(Conto[])          |
| + aggiungiConto(c)        |
| + saldoTotaleBanca():double |
| + stampaConti():void      |
+---------------------------+
		 */
		
		Conto c1 = new Conto("Mario", 1000.0);
		Conto c2 = new Conto("Luigi", 500.0);
		Conto c3 = new Conto("Anna", 2000.0);
		Conto c4 = new Conto("Marco", 800.0);

		Banca banca = new Banca(new Conto[4]);

		banca.aggiungiConto(c1);
		banca.aggiungiConto(c2);
		banca.aggiungiConto(c3);
		banca.aggiungiConto(c4);

		c1.preleva(200.0);
		c2.deposita(300.0);


		banca.trovaConto("Marco");

		banca.stampaConti();
		System.out.println("Totale banca: " + banca.saldoTotaleBanca());
		
	}

}
