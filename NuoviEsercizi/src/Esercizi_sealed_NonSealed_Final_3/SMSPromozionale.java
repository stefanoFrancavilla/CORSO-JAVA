package Esercizi_sealed_NonSealed_Final_3;

public class SMSPromozionale extends SMS {

	public SMSPromozionale(String numeroDiTelefono) {
		super(numeroDiTelefono);
	}

	//essendo SMS una classe non sealed , può essere estesa da SMSPromozionale
}
