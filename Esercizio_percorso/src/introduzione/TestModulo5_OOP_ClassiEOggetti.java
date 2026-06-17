package introduzione;

public class TestModulo5_OOP_ClassiEOggetti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 📝 TEST MODULO 5 - INIZIA QUI
DOMANDE TEORIA (1-8)
1. Cosa è una classe in Java? Spiega la sua funzione principale.

una classe in java è un progetto di uno o più oggetti
in parole semplici la classe serve a dare forma agli oggetti

2. Cosa è un oggetto? Differenza tra classe e oggetto.
un'oggetto è un'istanza della classe, che è definito con parametri e metodi.
una classe è un progetto di uno o più oggetti , usa parametri per specificarli e metodi per compiere azioni
in parole semplici la classe serve a dare forma gli oggetti che sono un'istanza della classe

3. Cosa è un costruttore? Differenza tra costruttore default e custom.
il costruttore è quella parte di codice fondamentale per chiamare un'oggetto nel main

il costruttore di default è quello fornito da java in assenza di un costruttore da parte del programmatore
se la classe non è fornita di alcun costruttore java ne fornisce uno con i parametri di default

il costruttore custom è quello che è creato dal programmatore e può avere 0 o più parametri

4. Cosa significa public, private, protected? Spiega ogni modificatore.
questi sono i livelli di sicurezza che java usa
con public abbiamo la nostra classe è accessibile da qualsiasi parte del progetto
con protected possono accedere solo dal package stesso dove si trova la classe
con protected solo dalla classe stessa

5. Cosa è l'incapsulamento (encapsulation)? Perché è importante?
con l'incapsulamento dei dati stiamo creando una barriera sicura dei nostri parametri
li stiamo proteggendo da una manomissione dall'esteno della classe, e per questo ci entrano in aiuto
i metodi getter/setter.
rendendo private le nostre variabili e usando solo i metodi getter e setter per accedervi ,
 si ha la possibilità di accedervi una volta che si sono passati i controlli dove ce ne fossero

6. Cosa è il metodo this? Quando lo usi?
il metodo this è fondamentale per la programmazione java.
serve per specificare che l'attribbuto che stiamo usando sia quello delle classe specifica.
mettiamo il caso che abbiamo due classi definite gatto, cane, tutti e due hanno un nome, quindi quando andiamo 
a chiamare il nome della classe grazie al this chiamera il nome specifico di gatto o di cane

7. Differenza tra variabile di istanza e variabile static.

la differenza principale e che la variabile di istanza appartiene al singolo oggetto, 
metre la variabile di istanza appartiene a tutta la classe

8. Cosa è un getter e un setter? Quando usi ciascuno?
i getter e setter sono fondamentali per l'icapsulamento dei dati.
la loro funzione è di lettura con il getter 
e di scrittura con il setter
una volta che abbiamo reso private le nostre variabili, l'unico modo per accedervi è grazie ai metodi getter e setter
inoltre abbiamo la possibilità di effettuare dei controlli.

DOMANDE CODICE (9-16)
9. Scrivi una classe Persona con attributo nome (String) e eta (int).

public  class Persona
	{
		String nome;
		int eta;
	
		Persona(String nome, int eta){
		    this.nome = nome;
			this.eta = eta;
		}
		
	}
10. Qual è l'output?

java
class Persona {
    String nome;
    int eta;
}

public class Main {
    public static void main(String[] args) {
        Persona p = new Persona();
        p.nome = "Ana";
        p.eta = 25;
        System.out.println(p.nome + " è " + p.eta + " anni");
    }
}

l'output sarà : Ana è 25 anni
questo perchè una volta che abbiamo creato l'oggetto persona p abbiamo inserito i parametri.
i parametri iniziali prima che li definessimo erano quelli di default , poichè la classe persona non ha il costruttore, e quindi java ne da uno di default
poi abbiamo definito i parametri nome e eta e mandato a stampa

11. Scrivi un costruttore per la classe Persona che prende nome e eta come parametri.

Persona (String nome, int eta) {
this.nome = nome;
this.eta = eta;
}

12. Qual è l'errore? Correggilo:

java
class Persona {
    private String nome;
    
    public String getNome() {
        nome = "Ana";
    }
}
l'errore principale è che questo metodo si aspetta un return di tipo String, cosa che non avviene , ma viene assegnato a nome la String Ana.
per correggere l'errore  basta togliere nome = "Ana"; e sostituirlo con return nome;

13. Scrivi una classe Carro con attributo marca (private) e metodo getter/setter.
	public class Carro {
		
		private String marca;
		
		public Carro(String marca)
		{
			this.marca = marca;
		}
		
		public String getMarca() {
			return this.marca;
		}
		
		public void setMarca()
		{
			this.marca = marca;
		}
	}
	

14. Qual è l'output?

java
class Persona {
    String nome;
    
    public void cambiaNome(String nuovoNome) {
        this.nome = nuovoNome;
    }
}

public class Main {
    public static void main(String[] args) {
        Persona p = new Persona();
        p.cambiaNome("Ana");
        System.out.println(p.nome);
    }
}
qui non abbiamo un costruttore nella classe Persona, quindi viene fornito uno di default.
nella classe è stato creato un metodo che sostituisce il nome corrente con un nuovo nome

nel main una volta che abbiamo creato l'oggetto  usiamo il metodo cambiaNome
nel nostro caso sostituisce il parametro di default assegnato dal costruttore di default e va a sotituirlo con Ana
quindi il nostro output sarà Ana
15. Scrivi una classe con una variabile static count che si incrementa con ogni nuovo oggetto creato.

public class Persona {
static int count;
Persona(){
count++; }
16. Qual è l'errore? Correggilo:

java
class Persona {
    private String nome;
    
    public Persona(String nome) {
        nome = nome;
    }
}
la parte di codice sbagliata è nome = nome;
per correggerlo basta sostituire la parte con this.nome = nome;

DOMANDE RISPOSTA APERTA (17-20)
17. Spiega la differenza tra classe e oggetto con un esempio pratico (es: Persona).
public  class Persona
	{
		String nome;
	
		Persona(String nome){
			this.nome = nome;
			this.eta = eta;
		}
		
	}
	
	la classe è il progetto che serve per creare una persona
	l'oggetto è la parsona creata
	classe bisogna vederla un pò come uno stampino che serve per creare il nostro timbro.
	in pratica lo stampino è la classe, l'oggetto il timbro

18. Perché usi private per gli attributi e public per getter/setter? Spiega con il concetto di incapsulamento.

usiamo private perchè gli attributi devono essere usabili solo nella classe , 
mentre il public sui getter e setter sono essenziali poichè sono l'unico modo per accedere agli attributi della classe

19. Cosa succede se non definisci un costruttore in una classe? Java crea un costruttore default?
si java crea un costruttore di default a patto che il programmatore non abbia creato nessun costruttore
in assenza di costruttori java ne crea uno di default senza paramtri con la possibilità di chiamare l'oggetto dall'esterno
imposta tutti i valori dell'oggetto in default.
20. Scrivi e spiega una classe completa Studente con:

Attributi: nome (private), matricola (private), eta (private)

Costruttore con 3 parametri

Getter e Setter per tutti gli attributi


 */
	
}
  //20.
	
	public class Studente{
	 
		private String nome;
		private int matricola;
		private int eta;
		
		public Studente(String nome, int matricola, int eta) {
			
			this.nome = nome;
			this.matricola = matricola;
			this.eta = eta;
			}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public int getMatricola() {
			return matricola;
		}

		public void setMatricola(int matricola) {
			this.matricola = matricola;
		}

		public int getEta() {
			return eta;
		}

		public void setEta(int eta) {
			this.eta = eta;
		}
		
		
		
	}
	

	
	
}
