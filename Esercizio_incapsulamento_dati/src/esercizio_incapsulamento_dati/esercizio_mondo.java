package esercizio_incapsulamento_dati;

public class esercizio_mondo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Esercizio_EssereUmano essere1 = new Esercizio_EssereUmano();
essere1.stampa();


Esercizio_EssereUmano Marco = new Esercizio_EssereUmano();

Marco.nome = "Marco";
Marco.cognome = "Rossi";
Marco.sesso = Esercizio_Sesso.MASCHIO;
Marco.anni = 30;
Marco.altezza = 1.75f;
Marco.peso = 70.5f;
Marco.coloreOcchi = Esercizio_ColoreOcchi.AZZURRI;
Marco.coloreCapelli = Esercizio_ColoreCapelli.NERI;
Marco.nazioneDiNascita = "Italia";

Marco.stampa();


Esercizio_EssereUmano Giovanna = new Esercizio_EssereUmano();

Giovanna.nome = "Giovanna";
Giovanna.cognome = "D'Agnano";
Giovanna.sesso = Esercizio_Sesso.FEMMINA;
Giovanna.anni = 36;
Giovanna.altezza = 1.65f;
Giovanna.peso = 65.0f;
Giovanna.coloreOcchi = Esercizio_ColoreOcchi.CASTANI;
Giovanna.coloreCapelli = Esercizio_ColoreCapelli.NERI;
Giovanna.nazioneDiNascita = "Italia";

Giovanna.stampa();

Giovanna.mangia();
Giovanna.lavora();
Giovanna.respira();

Cani lucky = new Cani();

lucky.nome = "Lucky";
lucky.razza = Razza.INCROCIO;
lucky.eta = 3;
lucky.peso = 10.5f;
lucky.altezza = 0.3f;
lucky.colore = Colore_cani.MARRONE;

lucky.abbaia();
lucky.dorme();

lucky.stampa();


Cani fido = new Cani();
fido.stampa();


Esercizio_EssereUmano Alessio = new Esercizio_EssereUmano();

Alessio.nome = "Alessio";
Alessio.cognome = "Francavilla";
Alessio.sesso = Esercizio_Sesso.MASCHIO;
Alessio.anni = 9;
Alessio.altezza = 1.4f;
Alessio.peso = 40.0f;
Alessio.coloreOcchi = Esercizio_ColoreOcchi.CASTANI;
Alessio.coloreCapelli = Esercizio_ColoreCapelli.CASTANI;
Alessio.nazioneDiNascita = "Italia";

Alessio.beve();
Alessio.mangia();

Alessio.stampa();

Alberi albero = new Alberi();

albero.altezza = (double) 5.0;
albero.eta = 10;
albero.foglie = Colore_Foglie.VERDE;
albero.stagione = Stagione.PRIMAVERA;
albero.cresce();
albero.stampa();

}

}
