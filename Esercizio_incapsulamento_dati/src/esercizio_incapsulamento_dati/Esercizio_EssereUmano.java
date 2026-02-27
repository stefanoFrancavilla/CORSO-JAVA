package esercizio_incapsulamento_dati;

public class Esercizio_EssereUmano {

	//variabili di istanza
private String nome;
private String cognome;
private Esercizio_Sesso sesso;
private byte eta;
private float altezza;
private float peso;
private Esercizio_ColoreCapelli coloreCapelli;
private Esercizio_ColoreOcchi coloreOcchi;

public final byte min_eta = 0;
public final byte max_eta = Byte.MAX_VALUE;
public final byte default_eta = 40;


public final float min_altezza = 0;
public final float max_altezza = 210;
public final float default_altezza = 175;

public final float min_peso = 0;
public final float max_peso = 250;
public final float default_peso = 75;

public final  String caratteriProibiti = "1234567890ç!£$%&/()?= ";  


//costruttore
public Esercizio_EssereUmano(String nome,
		String cognome,
		Esercizio_Sesso sesso,
		byte eta,
		float altezza,
		float peso,
		Esercizio_ColoreCapelli coloreCapelli,
		Esercizio_ColoreOcchi coloreOcchi) 
{
	this.setNome(nome);
	this.setCognome(cognome);
	this.setSesso(sesso);
	this.setEta(eta);
	this.setAltezza(altezza);
	this.setPeso(peso);
	this.setColoreCapelli(coloreCapelli);
	this.setColoreOcchi(coloreOcchi);
		
}

//metodi setter/getter
public String getNome() {
	return nome;
}
public void setNome(String nome) {
    if (verificaCaratteri(caratteriProibiti, nome)) {  
        System.out.println("Nome non consono");
        
    } else {
        System.out.println("Nome ok");
        this.nome = nome.trim();  
    }
}

public String getCognome() {
	return cognome;
}

public void setCognome(String cognome) {
   if (verificaCaratteri(caratteriProibiti, cognome)) {  
        System.out.println("Cognome non consono");   
    } 
   else 
   {
        System.out.println("Cognome ok");
        this.cognome = cognome.trim();  
    }
}

public Esercizio_Sesso getSesso() {
	return sesso;
}

public void setSesso(Esercizio_Sesso sesso) {
	this.sesso = sesso;
}

public byte getEta() {
	return eta;
}

public void setEta(byte eta) {
	
	if ( eta < min_eta || eta > max_eta)
	{
		System.out.println("Età fuori dal range");
		this.eta = default_eta;
	}
	else
	{
		System.out.println("Età valida");
		this.eta = eta;
	}
}

public float getAltezza() {
	return altezza;
}

public void setAltezza(float altezza) {
	if( altezza < min_altezza || altezza > max_altezza)
	{
		System.out.println("Altezza non consona");
		this.altezza = default_altezza;
	}
	else
	{
		System.out.println("Altezza valida");
		this.altezza = altezza;
	}
}

public float getPeso() {
	return peso;
}

public void setPeso(float peso) {
	if (peso < min_peso || peso > max_peso)
	{
		System.out.print("Peso non valido");
		this.altezza = default_altezza;
	}
	else 
	{
		System.out.println("Peso valido");
		this.peso = peso;
	}
}

public Esercizio_ColoreCapelli getColoreCapelli() {
	return coloreCapelli;
}

public void setColoreCapelli(Esercizio_ColoreCapelli coloreCapelli) {
	this.coloreCapelli = coloreCapelli;
}

public Esercizio_ColoreOcchi getColoreOcchi() {
	return coloreOcchi;
}

public void setColoreOcchi(Esercizio_ColoreOcchi coloreOcchi) {
	this.coloreOcchi = coloreOcchi;
}

//metodi

public void mangia()
{
	System.out.println("Sta mangiando con le posate");
}

public void beve()
{
	System.out.println("Sta bevendo alla bottiglia");
}

public void dorme()
{
System.out.println("Sta dormendo nel letto di casa sua");	
}

public void studia()
{
	System.out.println("Sta studiando la divina commedia");
}

public void lavora()
{
	System.out.println("Sta lavorando ");
}

public void stampa()
{
	System.out.println("---------------------");
	System.out.println("nome " + nome);
	System.out.println("cognome " + cognome);
	System.out.println("sesso" + sesso);
	System.out.println("età " + eta);
	System.out.println("altezza " + altezza);
	System.out.println("peso " + peso);
	System.out.println("Colore occhi " + coloreOcchi);
	System.out.println("Colore Capelli " + coloreCapelli);
	System.out.println("---------------------");
	
}

//metodi e funzioni
public boolean verificaCaratteri(String caratteriProibiti, String s) {
    for (int i = 0; i < caratteriProibiti.length(); i++) {  
        char c = caratteriProibiti.charAt(i);
        if (s.indexOf(c) != -1) {
            return true; 
        }
    }
    return false;
}

public boolean verificaLunghezza(String s, byte limit)
{
	boolean troppoLunga = false;
	
	if ( s.length() < limit)
	{
		System.out.println("Lunghezza ok");
		troppoLunga = false;
	}
	else
	{
		System.out.println("Parola troppo lunga");
		troppoLunga = true;
	}
	
	return troppoLunga;
}

	}