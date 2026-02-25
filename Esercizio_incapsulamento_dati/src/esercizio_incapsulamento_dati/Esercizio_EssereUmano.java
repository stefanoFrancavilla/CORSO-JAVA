package esercizio_incapsulamento_dati;

public class Esercizio_EssereUmano {
	
	//inizializzo gli attributi
//	public String nome;
//	public String cognome;
//	public Esercizio_Sesso sesso;
//	public byte anni;
//	public float altezza;
//	public float peso;
//	public Esercizio_ColoreOcchi coloreOcchi;
//	public Esercizio_ColoreCapelli coloreCapelli;
//	public String nazioneDiNascita;
	
	//public class Esercizio_EssereUmano {

	    private static final String DEFAULT_STRING = "ND";
	    private static final byte DEFAULT_ANNI = 0;
	    private static final float DEFAULT_FLOAT = 0f;

	    private String nome;
	    private String cognome;
	    private Esercizio_Sesso sesso;
	    private byte anni;
	    private float altezza;
	    private float peso;
	    private Esercizio_ColoreOcchi coloreOcchi;
	    private Esercizio_ColoreCapelli coloreCapelli;
	    private String nazioneDiNascita;

	    // COSTRUTTORE PRINCIPALE
	    public Esercizio_EssereUmano(
	            String nome,
	            String cognome,
	            Esercizio_Sesso sesso,
	            byte anni,
	            float altezza,
	            float peso,
	            Esercizio_ColoreOcchi coloreOcchi,
	            Esercizio_ColoreCapelli coloreCapelli,
	            String nazioneDiNascita) {

	        System.out.println("Costruttore a 9 parametri");

	        this.nome = (nome != null) ? nome : DEFAULT_STRING;
	        this.cognome = (cognome != null) ? cognome : DEFAULT_STRING;
	        this.sesso = (sesso != null) ? sesso : Esercizio_Sesso.SCONOSCIUTO;
	        setAnni(anni);               // usa i setter per la validazione
	        setAltezza(altezza);
	        setPeso(peso);
	        this.coloreOcchi = (coloreOcchi != null) ? coloreOcchi : Esercizio_ColoreOcchi.SCONOSCIUTO;
	        this.coloreCapelli = (coloreCapelli != null) ? coloreCapelli : Esercizio_ColoreCapelli.SCONOSCIUTO;
	        this.nazioneDiNascita = (nazioneDiNascita != null) ? nazioneDiNascita : DEFAULT_STRING;
	    }

	    // COSTRUTTORE 0 PARAMETRI
	    public Esercizio_EssereUmano() {
	        this(DEFAULT_STRING, DEFAULT_STRING, Esercizio_Sesso.SCONOSCIUTO,
	                DEFAULT_ANNI, DEFAULT_FLOAT, DEFAULT_FLOAT,
	                Esercizio_ColoreOcchi.SCONOSCIUTO,
	                Esercizio_ColoreCapelli.SCONOSCIUTO,
	                DEFAULT_STRING);

	        System.out.println("Costruttore senza parametri");
	    }

	    // COSTRUTTORE 3 PARAMETRI
	    public Esercizio_EssereUmano(String nome, String cognome, Esercizio_Sesso sesso) {
	        this(nome, cognome, sesso, DEFAULT_ANNI, DEFAULT_FLOAT, DEFAULT_FLOAT,
	                Esercizio_ColoreOcchi.SCONOSCIUTO,
	                Esercizio_ColoreCapelli.SCONOSCIUTO,
	                DEFAULT_STRING);

	        System.out.println("Costruttore con 3 parametri");
	    }

	    // ---------- metodi di comportamento ----------
	    public void mangia()   { System.out.println(getNomeCompleto() + " mangia"); }
	    public void beve()    { System.out.println(getNomeCompleto() + " beve"); }
	    public void respira() { System.out.println(getNomeCompleto() + " respira"); }
	    public void dorme()   { System.out.println(getNomeCompleto() + " dorme"); }
	    public void studia()  { System.out.println(getNomeCompleto() + " studia"); }
	    public void lavora()  { System.out.println(getNomeCompleto() + " lavora"); }

	    // ---------- utilità ----------
	    public String getNomeCompleto() {
	        return nome + " " + cognome;
	    }

	    // stampa: mantieni se preferisci, ma è comodo anche toString()
	    public void stampa() {
	        System.out.println(this.toString());
	    }

	    @Override
	    public String toString() {
	        return "----------\n" +
	                "Nome: " + nome + "\n" +
	                "Cognome: " + cognome + "\n" +
	                "Sesso: " + sesso + "\n" +
	                "Anni: " + anni + "\n" +
	                "Altezza: " + altezza + "\n" +
	                "Peso: " + peso + "\n" +
	                "Colore Occhi: " + coloreOcchi + "\n" +
	                "Colore Capelli: " + coloreCapelli + "\n" +
	                "Nazione di Nascita: " + nazioneDiNascita + "\n" +
	                "----------";
	    }

	    // ---------- getter e setter (con validazioni semplici) ----------
	    public String getNome() { return nome; }
	    public void setNome(String nome) { this.nome = (nome != null) ? nome : DEFAULT_STRING; }

	    public String getCognome() { return cognome; }
	    public void setCognome(String cognome) { this.cognome = (cognome != null) ? cognome : DEFAULT_STRING; }

	    public Esercizio_Sesso getSesso() { return sesso; }
	    public void setSesso(Esercizio_Sesso sesso) { this.sesso = (sesso != null) ? sesso : Esercizio_Sesso.SCONOSCIUTO; }

	    public byte getAnni() { return anni; }
	    public void setAnni(byte anni) {
	        if (anni < 0) {
	            System.out.println("Attenzione: anni negativi non permessi, imposto a 0.");
	            this.anni = 0;
	        } else {
	            this.anni = anni;
	        }
	    }

	    public float getAltezza() { return altezza; }
	    public void setAltezza(float altezza) {
	        if (altezza < 0f) {
	            System.out.println("Attenzione: altezza negativa non permessa, imposto a 0.");
	            this.altezza = 0f;
	        } else {
	            this.altezza = altezza;
	        }
	    }

	    public float getPeso() { return peso; }
	    public void setPeso(float peso) {
	        if (peso < 0f) {
	            System.out.println("Attenzione: peso negativo non permesso, imposto a 0.");
	            this.peso = 0f;
	        } else {
	            this.peso = peso;
	        }
	    }

	    public Esercizio_ColoreOcchi getColoreOcchi() { return coloreOcchi; }
	    public void setColoreOcchi(Esercizio_ColoreOcchi coloreOcchi) {
	        this.coloreOcchi = (coloreOcchi != null) ? coloreOcchi : Esercizio_ColoreOcchi.SCONOSCIUTO;
	    }

	    public Esercizio_ColoreCapelli getColoreCapelli() { return coloreCapelli; }
	    public void setColoreCapelli(Esercizio_ColoreCapelli coloreCapelli) {
	        this.coloreCapelli = (coloreCapelli != null) ? coloreCapelli : Esercizio_ColoreCapelli.SCONOSCIUTO;
	    }

	    public String getNazioneDiNascita() { return nazioneDiNascita; }
	    public void setNazioneDiNascita(String nazioneDiNascita) {
	        this.nazioneDiNascita = (nazioneDiNascita != null) ? nazioneDiNascita : DEFAULT_STRING;
	    }

	    // ---------- main di esempio per test ----------
	    public static void main(String[] args) {
	        Esercizio_EssereUmano e1 = new Esercizio_EssereUmano("Mario", "Rossi", Esercizio_Sesso.MASCHIO,
	                (byte)30, 1.80f, 78f, Esercizio_ColoreOcchi.MARRONI, Esercizio_ColoreCapelli.NERI, "Italia");

	        e1.stampa();
	        e1.mangia();
	        e1.setPeso(-5f); // prova validazione
	        System.out.println("Dopo modifica peso: " + e1.getPeso());
	    }
	}