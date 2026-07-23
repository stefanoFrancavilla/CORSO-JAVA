package GestioneBiblioteca;

public class Gestore {

	private String nome;
	private String password;
	
	public Gestore(String nome, String password) {
		
		this.nome = nome;
		this.password = password;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean controlloPassword(String pw)
	{
		boolean passOK = false;
		if (password.equals(pw))
		{
			passOK = true;
		}
		return passOK;
	}
}
