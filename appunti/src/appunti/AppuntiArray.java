package appunti;

public class AppuntiArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Certo. Gli array e gli array 2D servono a salvare tanti valori dello stesso tipo in una sola struttura, e in Java gli array multidimensionali sono in pratica “array di array”. Per lavorarci bene, oltre alle proprietà base come length, si usa spesso la classe Arrays, che offre metodi utili per ordinare, copiare, confrontare e riempire gli array.

Array 1D
Un array normale contiene una lista di valori dello stesso tipo, per esempio numeri o parole. Si usa quando vuoi gestire una sequenza semplice, come voti, età o nomi.

java
int[] numeri = {10, 20, 30};
System.out.println(numeri[0]); // 10
Proprietà e funzioni base dell’array
L’array ha una proprietà importante: length.
Serve per sapere quanti elementi ci sono nell’array.

java
int[] numeri = {10, 20, 30};
System.out.println(numeri.length); // 3
Classe Arrays
La classe Arrays contiene metodi utili per lavorare con gli array in modo più comodo.

Arrays.toString(array)
Converte un array in una stringa leggibile.
Si usa quando vuoi stampare bene il contenuto di un array normale.

java
int[] numeri = {3, 1, 2};
System.out.println(Arrays.toString(numeri));
Arrays.sort(array)
Ordina gli elementi dell’array in ordine crescente.
Si usa quando vuoi sistemare i dati dal più piccolo al più grande.

java
int[] numeri = {3, 1, 2};
Arrays.sort(numeri);
Arrays.fill(array, valore)
Riempie tutto l’array con lo stesso valore.
Si usa quando vuoi inizializzare velocemente tutti gli elementi.

java
int[] numeri = new int[5];
Arrays.fill(numeri, 7);
Arrays.copyOf(array, nuovaLunghezza)
Crea una copia dell’array, anche con una nuova lunghezza.
Si usa quando vuoi fare una copia o allungare/accorciare un array.

java
int[] a = {1, 2, 3};
int[] b = Arrays.copyOf(a, 5);
Arrays.equals(array1, array2)
Controlla se due array sono uguali elemento per elemento.
Si usa per confrontare array semplici.

java
int[] a = {1, 2};
int[] b = {1, 2};
System.out.println(Arrays.equals(a, b)); // true
Arrays.binarySearch(array, valore)
Cerca un valore in un array già ordinato.
Si usa quando hai bisogno di una ricerca veloce, ma l’array deve essere ordinato.

java
int[] numeri = {1, 3, 5, 7};
int pos = Arrays.binarySearch(numeri, 5);
Array 2D
Un array 2D è un array di array. Serve per rappresentare tabelle, righe e colonne, come una matrice o una griglia.

L’accesso avviene con due indici: riga e colonna.

java
int[][] matrice = {
    {1, 2, 3},
    {4, 5, 6}
};

System.out.println(matrice[1][2]); // 6
length negli array 2D
Per un array 2D, length ti dice quante righe ci sono.
Per sapere quante colonne ha una riga, usi matrice[riga].length.

java
int[][] matrice = {
    {1, 2, 3},
    {4, 5, 6}
};

System.out.println(matrice.length);      // 2 righe
System.out.println(matrice[0].length);   // 3 colonne
Come si percorre un array 2D
Di solito si usano due for uno dentro l’altro.
Il primo gira sulle righe, il secondo sulle colonne.

java
for (int i = 0; i < matrice.length; i++) {
    for (int j = 0; j < matrice[i].length; j++) {
        System.out.println(matrice[i][j]);
    }
}
Funzioni utili con array 2D
Con gli array 2D si usano spesso i metodi della classe Arrays, ma spesso bisogna usare quelli “deep” perché l’array contiene altri array.

Arrays.deepToString(array2D)
Stampa bene un array 2D.
Si usa per vedere chiaramente il contenuto di matrici o tabelle.

java
int[][] matrice = {{1, 2}, {3, 4}};
System.out.println(Arrays.deepToString(matrice));
Arrays.deepEquals(array1, array2)
Confronta due array 2D in profondità.
Si usa quando vuoi verificare se due matrici sono uguali davvero.

java
int[][] a = {{1, 2}, {3, 4}};
int[][] b = {{1, 2}, {3, 4}};
System.out.println(Arrays.deepEquals(a, b)); // true
Quando usare gli array
Usa un array quando:

i dati sono tutti dello stesso tipo;

sai più o meno quanti elementi ti servono;

vuoi accedere ai valori tramite posizione.

Quando usare gli array 2D
Usa un array 2D quando:

i dati sono organizzati in righe e colonne;

stai lavorando con tabelle, griglie, matrici, mappe, labirinti o schemi.

Regola facile
Array 1D = lista semplice.

Array 2D = tabella o griglia.

Arrays = classe con metodi utili per lavorare sugli array.


		 */
	}

}
