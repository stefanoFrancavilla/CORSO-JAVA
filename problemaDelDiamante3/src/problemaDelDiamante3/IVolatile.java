package problemaDelDiamante3;

public interface IVolatile {

	default void vola() {
		System.out.println("Sto volando (interfaccia).");
	}
	
}
