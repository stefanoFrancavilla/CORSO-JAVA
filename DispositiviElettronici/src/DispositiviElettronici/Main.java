package DispositiviElettronici;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartWatch smart = new SmartWatch("Samsung", "serie X", 5, true);
		
		smart.accendi();
		smart.isMonitoraggioBattitoCardiaco();
		smart.spegni();
		//smart.mostraStato();
		
		

	}

}
