package Studio_stream;

public class Persona {
	  private String nome;
	    private int eta;
        private String reparto;
        private Integer stipendio;
        
        
	    public Persona(String nome, int eta, String reparto, Integer stipendio) {
	        this.nome = nome;
	        this.eta = eta;
	        this.reparto = reparto;
	        this.stipendio = stipendio;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public int getEta() {
	        return eta;
	    }

	    @Override
	    public String toString() {
	        return nome + " (" + eta + ")";
	    }

		public String getReparto() {
			return reparto;
		}

		public void setReparto(String reparto) {
			this.reparto = reparto;
		}

		public Integer getStipendio() {
			return stipendio;
		}

		public void setStipendio(Integer stipendio) {
			this.stipendio = stipendio;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public void setEta(int eta) {
			this.eta = eta;
		}

}
