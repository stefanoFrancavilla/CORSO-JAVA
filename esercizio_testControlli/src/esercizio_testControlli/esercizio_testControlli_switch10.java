package esercizio_testControlli;

public class esercizio_testControlli_switch10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 10) SWITCH con freccia (->)

📌 Esercizio:
Scrivi:

public static String tipoDevice(Devices d)


PC -> "Fisso"

SMART_PHONE, TABLET -> "Mobile"

MOUSE, KEYBOARD -> "Accessori"

default -> "Altro"

✅ Fallo con switch -> senza break.
 */
		
		System.out.println(tipoDevice(Device.PC));
		System.out.println(tipoDevice(Device.SMART_PHONE));
		System.out.println(tipoDevice(Device.TABLET));
		System.out.println(tipoDevice(Device.MOUSE));
		System.out.println(tipoDevice(Device.KEYBOARD));
	}
	
	public static String tipoDevice(Device d)
	{
		String result = "";
		
		switch(d)
		{
			case PC -> result = "Fisso";
			case SMART_PHONE, TABLET -> result = "Mobile";
			case MOUSE, KEYBOARD -> result = "Accessori";
			default -> result = "Altro";
		}
		
		return result;
	}
}
