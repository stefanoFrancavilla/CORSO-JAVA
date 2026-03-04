package esercizio_testControlli;

public class esercizio_testControlli_switch11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 11) SWITCH come espressione (assegni direttamente il risultato)

📌 Esercizio:
Scrivi:

public static int prezzoDevice(Devices d)


E usa:

int prezzo = switch(d) { ... };


Esempio:

PC → 800

SMART_PHONE → 600

TABLET → 450

default → 0

✅ Stampa il prezzo nel main.
 */
		
		Device device = Device.PC;
		int prezzo = prezzoDevice(device);
		System.out.println("Il prezzo del device " + device + " è: " + prezzo);
		
	}
	
	public static int prezzoDevice(Device d)
	{
		int prezzo = switch(d) {
			case PC -> 800;
			case SMART_PHONE -> 600;
			case TABLET -> 450;
			default -> 0;
		};
		
		return prezzo;
	}
}
