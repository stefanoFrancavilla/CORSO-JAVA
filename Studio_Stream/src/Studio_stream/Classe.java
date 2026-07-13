package Studio_stream;

import java.util.List;

public class Classe {
    private String nomeClasse;
    private List<Studente> studenti;
    
    
	public Classe(String nomeClasse, List<Studente> studenti) {
		
		this.nomeClasse = nomeClasse;
		this.studenti = studenti;
	}
	
	
	public String getNomeClasse() {
		return nomeClasse;
	}
	public void setNomeClasse(String nomeClasse) {
		this.nomeClasse = nomeClasse;
	}
	public List<Studente> getStudenti() {
		return studenti;
	}
	public void setStudenti(List<Studente> studenti) {
		this.studenti = studenti;
	}
    
    
}
