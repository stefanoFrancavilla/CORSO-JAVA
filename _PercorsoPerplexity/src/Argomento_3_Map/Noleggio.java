package Argomento_3_Map;

import Argomento2_Set.Attrezzatura;

public class Noleggio {

	private int codiceNoleggio;
	private Attrezzatura attrezzatura;
	private String cliente;
	private int giorni;
	private boolean completato;
	
	// costruttore
	public Noleggio(int codiceNoleggio, Attrezzatura attrezzatura, String cliente, int giorni) {
		setCodiceNoleggio(codiceNoleggio);
		setAttrezzatura(attrezzatura);
		setCliente(cliente);
		setGiorni(giorni);
		this.completato = false;
	}

	// getter e setter
	
	public int getCodiceNoleggio() {
		return codiceNoleggio;
	}

	public void setCodiceNoleggio(int codiceNoleggio) {
		
		if (codiceNoleggio <= 0)
		{
			return;
		}
		this.codiceNoleggio = codiceNoleggio;
	}

	public Attrezzatura getAttrezzatura() {
		return attrezzatura;
	}

	public void setAttrezzatura(Attrezzatura attrezzatura) {
		if(attrezzatura == null)
		{
			return;
		}
		this.attrezzatura = attrezzatura;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		if (cliente == null || cliente.isBlank())
		{
			return;
		}
		this.cliente = cliente;
	}

	public int getGiorni() {
		return giorni;
	}

	public void setGiorni(int giorni) {
		if (giorni <= 0)
		{
			return;
		}
		this.giorni = giorni;
	}

	public boolean isCompletato() {
		return completato;
	}

	public void setCompletato(boolean completato) {
		this.completato = completato;
	}
	
//metodo to string
	
	public String toString() {
	    return "Noleggio [codiceNoleggio=" + codiceNoleggio
	         + ", attrezzatura=" + attrezzatura
	         + ", cliente=" + cliente
	         + ", giorni=" + giorni
	         + ", completato=" + completato
	         + "]";
	}
}
