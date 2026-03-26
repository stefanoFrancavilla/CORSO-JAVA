package interfacce;

public abstract class Computer implements ElectronicDevice, IO {

	/*
	 * con l'implementazione di electronicDevice e IO, stiamo definendo che un computer è un dispositivo elettronico 
	 * che ha la possibilità di accendersi e spegnersi, ed avrebbe la possibilità di ricevere input e fornire output.
	 * 
	 * questa classe è astratta, perchè non ha un'implementazione concreta,
	 * ha una definizione ancora troppo generica
	 * 
	 * anche se  astratta è una classe a tutti gli effetti, solo troppo gnerica da istanziare,
	 *  ma che può essere estesa da altre classi più specializzate, come DesktopComputer e LaptopComputer,
	 *  
	 *  
	 *  in questo caso l'idea è, che sia un laptop un comuter o uno smatphone, avere la possibilità di gestire una cpu  avere una ram
	 */

	//variabili d'istanza
	private Cpu cpu; // questa è un'altra classe che permettrà di generare degli oggetti che rappresentano le cpu
	
	private Ram ram; // questa è un'altra classe che permetterà di modellare il concetto di memoria dinamica
	
	
	//	costruttore
	public Computer() {
		this.setCpu();
	}
	
	//metodi getter/setter
	
	public Cpu getCpu()
	{
		return cpu;
	}
	
	private void setCpu() 
	{
		this.cpu = new Cpu(); // il suo scopo è che una volta chiamato genera un nuovo oggetto cpu
	}
	
	
	//metodi
	public void performCalculation()
	{
		System.out.println("Eseguo una computazione");
		
		int numeroDiIstruzioni = 10;
		
		for(int i = 0; i < numeroDiIstruzioni; i++)
		{
			this.cpu.process();
			/*
			 * in questo caso, stiamo chiamando il metodo process della classe Cpu,
			 *  che rappresenta il processo di esecuzione di un'istruzione da parte della cpu,
			 *  
			 *  cioè in parole semplici, stiamo simulando il processo di esecuzione di un'istruzione da parte della cpu,
			 */
			
		}
	}
}	
