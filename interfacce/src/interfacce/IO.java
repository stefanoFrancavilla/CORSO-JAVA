package interfacce;

public interface IO {

	 abstract void getInput();
	 abstract void provideOutput();
	/*
	 * anche se non mettiamo il modificatore , il fatto che sia definito in un'interfaccia
	 *  lo rende automaticamente astratto e pubblico,
	 *   quindi non è necessario specificare il modificatore abstract e public,
	 */
}
