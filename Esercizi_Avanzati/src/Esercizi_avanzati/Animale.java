package Esercizi_avanzati;

public class Animale implements Comparable<Animale> {
private String nome;
private int peso;

public Animale(String nome, int peso) {
	this.nome = nome;
	this.peso = peso;
}

public String getNome() {
	return nome; }

public int getPeso() {
	return peso;
}
	
public void setNome(String nome) {
	this.nome = nome;}

public void setPeso(int peso) {
	this.peso = peso;
}

@Override
public int compareTo(Animale p){

    if(this.peso < p.peso)
        return -1;

    if(this.peso > p.peso)
        return 1;

    return 0;
}
	
	
	
	
	
}
