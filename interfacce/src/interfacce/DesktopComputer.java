package interfacce;

public class DesktopComputer extends Computer {

	@Override
	public void getInput() {
		// TODO Auto-generated method stub
		System.out.println("ottengo i caratteri da tastiera fisica.");
	}

	@Override
	public void provideOutput() {
		// TODO Auto-generated method stub
		System.out.println("Stampo i caratteri a video.");
	}

/*
 * in questo caso DesktopComputer è una classe concreta, che estende la classe astratta Computer,
 * quindi deve implementare tutti i metodi astratti dichiarati in Computer, che sono quelli dichiarati in IO,
 * 
 * l'idea è avere l'interfaccia IO che obblighi una classe specializzata come DesktopComputer 
 * ad implementare i metodi getInput e provideOutput,
 */

	}


