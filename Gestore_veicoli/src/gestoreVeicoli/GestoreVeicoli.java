package gestoreVeicoli;

public class GestoreVeicoli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * 
                +----------------------+
                |      Veicolo         |
                +----------------------+
                | - marca  : String    |
                | - modello: String    |
                +----------------------+
                | + avvia()            |
                | + ferma()            |
                +----------------------+
                   ^              ^
                   |              |
        +----------+----+   +----+-----------+
        |               |   |                |
+-------------------+   |   |   +-------------------+
|       Auto        |   |   |   |       Moto        |
+-------------------+   |   |   +-------------------+
| - numeroPorte:int |   |   |   | - haSidecar:bool  |
+-------------------+   |   |   +-------------------+
| + apriBagagliaio()|   |   |
+-------------------+   |
                          |
                          |
                +---------------------+
                |   GestoreVeicoli    |
                +---------------------+
                | + main(args:String[])|
                +---------------------+
		 */
		
		Auto auto1 = new Auto("alfa", "159", 3);
		auto1.avvia();
		auto1.ferma();
		auto1.apriBagagliaio();
		
		System.out.println("------------------------------");
		Moto moto1 = new Moto("Piaggio", "Vespa", false );
		moto1.avvia();
		moto1.ferma();
	}

}
