package _RiepilogoStream;

import java.util.List;

public class Esercizi_lm_1_6 {

	enum Categoria {
		GIOVANILE,
		SENIOR,
		MASTER;
	}
	
	static class Premio {
		Categoria categoria;
		String nome;
		
		public Premio (Categoria categoria, String nome)
		{
			this.categoria = categoria;
			this.nome = nome;
		}

		public Categoria getCategoria() {
			return categoria;
		}

		public void setCategoria(Categoria categoria) {
			this.categoria = categoria;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}
		
		
	}
	public static void main(String[] args) {
	
		
		List<Premio> premi = List.of(
				new Premio(Categoria.GIOVANILE, "Mario Rossi"),
				new Premio(Categoria.SENIOR, "Anna Bianchi"),
				new Premio(Categoria.MASTER, "Marco Gialli"),
				new Premio(Categoria.GIOVANILE, "Luca Neri"),
				new Premio(Categoria.SENIOR, "Laura Verdi")
				);

		long premioGiovanili =  premi.stream()
		.filter(n -> Categoria.GIOVANILE.equals(n.getCategoria()))
		.count();
		System.out.println(Categoria.GIOVANILE + " Numero vincitori: " + premioGiovanili);
		
		long premioSenior = premi.stream()
				.filter(n -> Categoria.SENIOR.equals(n.getCategoria()))
				.count();
		System.out.println(Categoria.SENIOR + " Numero vincitori: " + premioSenior);
		
		long premioMaster = premi.stream()
				.filter(n -> Categoria.MASTER.equals(n.getCategoria()))
				.count();
		System.out.println(Categoria.MASTER + " Numero vincitori: " + premioMaster);
	}

}
