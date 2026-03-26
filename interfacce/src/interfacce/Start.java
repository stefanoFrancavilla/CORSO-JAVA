package interfacce;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DesktopComputer pc = new DesktopComputer();
		pc.switchOn();
		pc.getInput();
		pc.performCalculation();
		pc.provideOutput();
		pc.switchOff();
		
		System.out.println(Cpu.getTransistorMaterial());
	}

}
