package Pacchetto2;
import Pacchetto.*;
public class C extends A {
	
	/*per estendere la classe A nella classe C abbiamo bisogno di importare il suo pacchetto
	 * import Pacchetto.*; scrivendolo in questo modo con l'asterisco non stiamo importando solo la classe A
	 * ma tutte le classi che si trovano all'interno del pacchetto Pacchetto, 
	 * in questo modo se in futuro dovessimo aggiungere altre classi al pacchetto Pacchetto non avremmo bisogno di importarle una ad una,
	 *  ma basterebbe scrivere una sola volta import Pacchetto.*;
	 */
	public static void main(String[] args) {
	C prova = new C();
	System.out.println(prova.nome);
	
	
	}
}
