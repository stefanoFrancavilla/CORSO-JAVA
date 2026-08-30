package Argomento_5_2;

public class Main {

	public static void main(String[] args) {
		
		ContoRepository repository = new ContoRepositoryImpl();
		
		ContoService service = new ContoService(repository);

		service.apriConto("C001", "Stefano", 1000.0);
		service.apriConto("C002", "Mario", 500.0);
		service.apriConto("C001", "Stefano Duplice", 2000.0);

		service.versa("C001", 250.0);
		service.versa("C002", 100.0);
		service.versa("C999", 50.0);
		service.versa("C001", -20.0);
	}

}
