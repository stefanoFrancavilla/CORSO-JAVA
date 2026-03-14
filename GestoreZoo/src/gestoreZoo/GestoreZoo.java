package gestoreZoo;

public class GestoreZoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 *           +-------------------+
          |   <<abstract>>   |
          |     Animale      |
          +-------------------+
          | - nome: String   |
          | - peso: double   |
          | - costoGiorno: double |
          +-------------------+
          | + mangia()       |
          | + getCosto(): double |
          +-------------------+
                    ^
                    |
          +---------+----------+
          |                    |
+--------------------+  +-------------------+
|  <<abstract>>     |  |     Uccello       |
|     Mammifero     |  +-------------------+
+--------------------+  | - tipoAli: String |
| - haPelo: boolean |  +-------------------+
+--------------------+  | + vola()          |
| + allatta()       |  +-------------------+
+--------------------+
          ^              ^
          |              |
+---------------+  +-------------------+
|     Leone     |  |     Aquila        |
+---------------+  |                   |
| - ruggito: String|  +-------------------+
+---------------+             ^
         |                     |
         |                     |
+---------------+  +-------------------+
|    Elefante   |  |     Pinguino      |
+---------------+  +-------------------+
| - proboscide: boolean       |
+-----------------------------+
 */
		
		
	Animale[] zoo = {
			new Leone("Dimba", 50, true,"roar"),
			new Elefante("Dumbo", 350, false, true),
			new Aquila("Freccia", 8, "acute"),
			new Pinguino("Pingu", 42, "brevi")
			};
			
	int lunghezza = zoo.length;
	double costoTotale = 0; 
	for ( int i = 0; i < lunghezza; i++) {
		
		zoo[i].mangia();
		costoTotale = costoTotale + zoo[i].getCostoGiorno();
	}
	
	System.out.println("Costo totale zoo: " + costoTotale );
	
	}

}
