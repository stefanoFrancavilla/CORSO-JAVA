package interfacce;

public class Transistor extends Computer {

	//variabili di istanza
	private int totalTransistor;
	
	//proprietà statiche
	public static String transistorMaterial;
	
	public Transistor()
	{
		System.out.println("Transistor -> instance-constructor");
		this.setTotalTransistor(1000000000);
	}
	
	static 
	{
		System.out.println("Transistor -> stastic-constructor");
		transistorMaterial = "silicio";
	}
	
	
	
	public int getTotalTransistor() {
		return totalTransistor;
	}

	public void setTotalTransistor(int totalTransistor) {
		this.totalTransistor = totalTransistor;
	}

	public static String getTransistorMaterial() {
		return transistorMaterial;
	}

	public static void setTransistorMaterial(String transistorMaterial) {
		Transistor.transistorMaterial = transistorMaterial;
	}

	@Override
	public void getInput() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void provideOutput() {
		// TODO Auto-generated method stub
		
	}

	
}
