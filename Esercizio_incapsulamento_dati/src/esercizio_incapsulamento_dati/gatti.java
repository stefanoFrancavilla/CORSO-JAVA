package esercizio_incapsulamento_dati;

public class gatti {

	String nome;
	Esercizio_Sesso sesso;
	Esercizio_ColoreOcchi coloreOcchi;
	Colore_cani colorePelo;
	int eta;
	
gatti() {
	this.nome = nome;
	this.sesso = sesso;
	this.coloreOcchi = coloreOcchi;
	this.colorePelo = colorePelo;
	this.eta = eta;
}

	public void miagola() {
		System.out.println(nome + " miagola");
		}
	public void mangia() {
		System.out.println(nome + " mangia");
		}
	public void dorme() {
		System.out.println(nome + " dorme");
		}
	public void gioca() {
		System.out.println(nome + " gioca");
		}
	public void stampa() {
		System.out.println("----------");
		System.out.println("Nome: " + nome);
		System.out.println("Sesso: " + sesso);
		System.out.println("Colore Occhi: " + coloreOcchi);
		System.out.println("Colore Pelo: " + colorePelo);
		System.out.println("Età: " + eta);
		}
	}
	

