package Pacchetto;
import Pacchetto2.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Modificatori di accesso
		 * 
		 * i modificatori di accesso servono per aggiungere un livello di sicurezza aggiuntivo
		 * 
		 *               classi     |  pacchetto  |  sottoclasse  |  mondo
		 *     public     si        |     si      |     si        |    si
		 *     protected  si        |     si      |     si        |    no
		 *     default    si        |     si      |     no        |    no
		 *     private    si        |     no      |     no        |    no
		 *     
		 *     i modificatori di accesso ci permettono di mostrare o meno i vari medoti e attribbuti in giro per l'applicazione,
		 *      in questo modo possiamo nascondere i dettagli di implementazione
		 *       e mostrare solo ciò che è necessario agli altri sviluppatori che utilizzano la nostra classe.
		 *       
		 *  con classi intendiamo che il codice si trova all'interno della stessa classe, 
		 *  
		 *  con pacchetto intendiamo che il codice si trova all'interno dello stesso pacchetto,
		 *  
		 *  con sotto classe intendiamo che il codice si trova all'interno di una classe che estende un'altra classe,
		 *  
		 *  con mondo intendiamo che il codice si trova all'interno di una classe
		 *   che non ha nessuna relazione con la classe che stiamo analizzando.
		 *   cioè una classe che si trova in un pacchetto diverso e che non estende la classe che stiamo analizzando.
		 *   in poche parole possiamo unsare metodi e funzioni al di furoi dei pacchetti e delle altre classi
		 *   
		 *   
		 *     con public possiamo accedere a tutto,
		 *     
		 *     con protected possiamo accedere a tutto tranne che al mondo,
		 *     ATTENZIONE: non può andare al di fuori di un'altro pacchetto, 
		 *     a meno che non sia una sottoclasse, in questo caso può accedere anche al di fuori del pacchetto,
		 *       
		 *     con default possiamo accedere solo alla classe e al pacchetto, 
		 *     
		 *     con private possiamo accedere solo alla classe.
		 */
		
		
		A prova = new A();
		System.out.println(prova.nome);
	}

}
