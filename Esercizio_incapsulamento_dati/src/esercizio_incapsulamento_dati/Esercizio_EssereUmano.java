package esercizio_incapsulamento_dati;

public class Esercizio_EssereUmano {
	
	//inizializzo gli attributi
	public String nome;
	public String cognome;
	public Esercizio_Sesso sesso;
	public byte anni;
	public float altezza;
	public float peso;
	public Esercizio_ColoreOcchi coloreOcchi;
	public Esercizio_ColoreCapelli coloreCapelli;
	public String nazioneDiNascita;
	
	//costruttore
	Esercizio_EssereUmano() {
		this.nome = "Sconosciuto";
		this.cognome = "Sconosciuto";
		this.sesso = Esercizio_Sesso.ALTRO;
		this.anni = 0;
		this.altezza = 0.0f;
		this.peso = 0.0f;
		this.coloreOcchi = Esercizio_ColoreOcchi.SCONOSCIUTO;
		this.coloreCapelli = Esercizio_ColoreCapelli.SCONOSCIUTO;
		this.nazioneDiNascita = "Sconosciuto";
		
	}
	//metodi
	
public void mangia() {
	System.out.println(nome + " " + cognome + " mangia");
	}
	
public void beve() {
	System.out.println(nome + " " + cognome + " beve");
    }
public void respira() {
	System.out.println(nome + " " + cognome + " respira");
	}
public void dorme() {
	System.out.println(nome + " " + cognome + " dorme");
	}
public void studia() {
	System.out.println(nome + " " + cognome + " studia");
	}
public void lavora() {
	System.out.println(nome + " " + cognome + " lavora");
    }
//stampa
public void stampa() {
	System.out.println("----------");
	System.out.println("Nome: " + nome);
	System.out.println("Cognome: " + cognome);
	System.out.println("Sesso: " + sesso);
	System.out.println("Anni: " + anni);
	System.out.println("Altezza: " + altezza);
	System.out.println("Peso: " + peso);
	System.out.println("Colore Occhi: " + coloreOcchi);
	System.out.println("Colore Capelli: " + coloreCapelli);
	System.out.println("Nazione di Nascita: " + nazioneDiNascita);
	System.out.println("----------");
	}
	


}
