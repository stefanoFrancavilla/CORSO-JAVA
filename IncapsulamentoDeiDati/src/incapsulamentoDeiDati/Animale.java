package incapsulamentoDeiDati;

public abstract class Animale {

	/* con la parola chiave "abstract" stiamo dichiarando una classe astratta,
	*  che non può essere istanziata direttamente, 
	*  ma può essere estesa da altre classi concrete.
	*/
	
	//variabili di istanza
	protected String nome; 
	protected Sesso sesso; 
	protected byte anni;
	protected float altezza;
	protected float peso;
	protected ColoreOcchi coloreOcchi;
	
	/*
	 * le variabili d'istanza sono dichiarate con il modificatore di accesso "protected",
	 * quindi con protected possono essere accedute direttamente dalle classi che estendono la classe Animale,
	 * mentre con private non potrebbero essere accedute direttamente dalle classi che estendono la classe Animale,
	 */
}
