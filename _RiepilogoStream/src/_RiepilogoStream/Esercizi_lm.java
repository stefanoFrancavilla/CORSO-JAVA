package _RiepilogoStream;

import java.util.List;
import java.util.stream.Stream;

 class Studente {
	String nome;
	int eta;
	String materia; 
	
	public Studente()
	{
		
	}
	public Studente(String nome, int eta, String materia)
	{
		this.nome = nome;
		this.eta = eta;
		this.materia = materia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	@Override
	public String toString() {
		return "Studente [nome=" + nome + ", eta=" + eta + ", materia=" + materia + "]";
	}
	
	
	
}
public class Esercizi_lm {
	
	public static void main(String[] args) {
	
	List<Studente> studenti = List.of(
		new	Studente("Mario Rossi", 20, "Informatica"),
		new	Studente("Laura Bianchi", 22, "Economia"),
		new	Studente("Giovanni Verdi", 24, "Matematica"),
		new	Studente("Anna Neri", 23, "Lettere"),
		new	Studente("Marco Gialli", 21, "Informatica")	
			);

	studenti.stream()
	.filter(n -> n.getEta() > 20)
	.map(s -> "Nome: " + s.nome + ", Età: " + s.eta)
	.map(String::toUpperCase)
	.forEach(s -> System.out.println(s));
	}
}


