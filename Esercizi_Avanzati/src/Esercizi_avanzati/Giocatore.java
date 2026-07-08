package Esercizi_avanzati;

public class Giocatore implements Comparable<Giocatore> {

	private String nome;
	private int punti;
	
 public Giocatore(String nome, int punti)
 {
	 this.nome = nome;
	 this.punti = punti;
 }
 
 public String getNome()
 {
	 return nome;
 }
 
 public void setNome(String nome) {
	 this.nome = nome;
 }
 
 public int getPunti()
 {
	 return punti;
 }
 public void setPunti(int punti)
 {
	 this.punti = punti;
 }
 
 //metodo compareTo crescente
// public int compareTo(Giocatore g)
// {
//	 if(this.punti < g.punti)
//	 return -1;
//	 
//	 if(this.punti > g.punti)
//		 return 1;
//	 
//	 return 0;
// }
 
 
 
 //metodo compareTo decrescente
 public int compareTo(Giocatore g)
 {
	 if(this.punti < g.punti)
	 return 1;
	 
	 if(this.punti > g.punti)
		 return -1;
	 
	 return 0;
 }
 
 
}
