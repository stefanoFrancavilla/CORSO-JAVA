package Argomento1_List;

public class EsercizioTemperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GestoreTemperature temperature = new GestoreTemperature();
		temperature.aggiungiTemperatura(18.5);
		temperature.aggiungiTemperatura(22.0);
		temperature.aggiungiTemperatura(0.0);
		temperature.aggiungiTemperatura(-3.5);
		temperature.aggiungiTemperatura(22.0);
		temperature.aggiungiTemperatura(27.8);
		temperature.aggiungiTemperatura(14.0);
		temperature.aggiungiTemperatura(31.2);
		
		temperature.stampaTemperature();
		System.out.println("La media delle temperature è: " + temperature.calcolaMedia());
		System.out.println("La temperatura massima è: " + temperature.trovaTemperaturaMassima());
		System.out.println("La temperatura minima è: " + temperature.trovaTemperaturaMinima());
		temperature.cercaTemperatura(22.0);
		temperature.cercaTemperatura(100.0);
		System.out.println("Il numero delle temperature sopra alla soglia è: " + temperature.contaTemperatureSopra(20.0));
		temperature.stampaTemperatureSopra(20.0);
		temperature.rimuoviTemperatura(100.0);
		
		temperature.stampaTemperature();
		temperature.rimuoviTemperatura(22.0);
		temperature.stampaTemperature();
		
		GestoreTemperature gestoreVuoto = new GestoreTemperature();
		
		gestoreVuoto.stampaTemperature();
		gestoreVuoto.calcolaMedia();
		gestoreVuoto.trovaTemperaturaMassima();
		gestoreVuoto.trovaTemperaturaMinima();
		gestoreVuoto.rimuoviTemperatura(10.0);
		gestoreVuoto.cercaTemperatura(10.0);
	}

}
