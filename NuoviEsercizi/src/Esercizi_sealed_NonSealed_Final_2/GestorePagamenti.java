package Esercizi_sealed_NonSealed_Final_2;

public class GestorePagamenti {
	
	
	
	public GestorePagamenti() {
		super();
	}

	void processa (MetodoDiPagamento metodo)
	{
		metodo.elabora();
	}

}
