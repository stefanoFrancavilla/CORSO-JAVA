package esercizio_incapsulamento_dati;

public class Cani {
	
	public String nome;
	public Razza razza;
	public byte eta;
	public float peso;
    public float altezza;
    public Colore_cani colore;

    
    Cani() {
		this.nome = "Sconosciuto";
		this.razza = Razza.SCONOSCIUTO;
		this.eta = 0;
		this.peso = 0.0f;
		this.altezza = 0.0f;
		this.colore = Colore_cani.SCONOSCIUTO;
		}
    
    public void abbaia() {
		System.out.println(nome + " abbaia");
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
		System.out.println("Razza: " + razza);
		System.out.println("Età: " + eta);
		System.out.println("Peso: " + peso);
		System.out.println("Altezza: " + altezza);
		System.out.println("Colore: " + colore);
		}
}
