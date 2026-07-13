package Studio_stream;

public class Prodotto {

	  private String nome;
	    private String categoria;
	    private double prezzo;
		public Prodotto(String nome, String categoria, double prezzo) {
		
			this.nome = nome;
			this.categoria = categoria;
			this.prezzo = prezzo;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getCategoria() {
			return categoria;
		}
		public void setCategoria(String categoria) {
			this.categoria = categoria;
		}
		public double getPrezzo() {
			return prezzo;
		}
		public void setPrezzo(double prezzo) {
			this.prezzo = prezzo;
		}
	    
		
	    
}
