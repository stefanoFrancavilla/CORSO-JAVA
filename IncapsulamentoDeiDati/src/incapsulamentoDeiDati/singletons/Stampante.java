package incapsulamentoDeiDati.singletons;

//1
//public class Stampante {
//private static Stampante instance = null;
//private Stampante()
//{
//System.out.println("Nuova stampante");
//
//marchio = "PrintTop";
//azienda = "TOP INFORMATICA";
//}
//
//public static Stampante getInstance() {
//	
//	if (instance == null) 
//	{
//		instance = new Stampante();
//	}
//	return instance;
//}
//
//private String marchio;
//private String azienda;
//
//
//private void riceveFileDaStampare()
//{
//	System.out.println("La stampante elabora il file da stampare.");
//}
//private void Foglio()
//{
//	System.out.println("La stampante prende un'altro foglio.");
//}
//
//private void ImpostaInchiostro()
//{
//	System.out.println("La stampante imposta gli inchiostri per stampare.");
//}
//
//private void Stampa()
//{
//	System.out.println("La stampante stampa");
//}
//
//private void restituisceFoglio()
//{
//	System.out.println("La stampante restituisce il foglio stampato.");
//}
//
//public void StampaDocumento()
//{
//	System.out.println(this.marchio + " dell'azienda " + this.azienda + " sta per stampare un documento.");
//	
//	this.riceveFileDaStampare();
//	this.Foglio();
//	this.ImpostaInchiostro();
//	this.Stampa();
//	this.restituisceFoglio();
//	
//	
//	System.out.println(this.marchio + " dell'azienda " + this.azienda + " ha stampato un documento.");
//}
//}

//5
public class Stampante {
	private static int contatoreDocumenti = 0;
	
private Stampante()
{
System.out.println("Nuova stampante");

marchio = "PrintTop";
azienda = "TOP INFORMATICA";
}

public static Stampante getInstance() {
	
	return StampanteBuilder.INSTANCE;
}

private static class StampanteBuilder
{
	private static final Stampante INSTANCE = new Stampante();
}

private String marchio;
private String azienda;


private void riceveFileDaStampare()
{
	System.out.println("La stampante elabora il file da stampare.");
}
private void Foglio()
{
	System.out.println("La stampante prende un'altro foglio.");
}

private void ImpostaInchiostro()
{
	System.out.println("La stampante imposta gli inchiostri per stampare.");
}

private void Stampa()
{
	System.out.println("La stampante stampa");
}

private void restituisceFoglio()
{
	System.out.println("La stampante restituisce il foglio stampato.");
}
public static int getContatoreDocumenti()
{
	return contatoreDocumenti;
}
private static void setContetoreDocumenti()
{
	contatoreDocumenti++;
}
public synchronized void StampaDocumento()
{
	System.out.println(this.marchio + " dell'azienda " + this.azienda + " sta per stampare un documento.");
	
	this.riceveFileDaStampare();
	this.Foglio();
	this.ImpostaInchiostro();
	this.Stampa();
	this.restituisceFoglio();
	Stampante.setContetoreDocumenti();
	
	System.out.println(this.marchio + " dell'azienda " + this.azienda + " ha stampato il documento numero: " + contatoreDocumenti );
}


}

//4

//public class Stampante {
//private static Stampante instance = null;
//private Stampante()
//{
//System.out.println("Nuova stampante");
//
//marchio = "PrintTop";
//azienda = "TOP INFORMATICA";
//}
//
//public static Stampante getInstance() {
//	
//	if (instance == null) 
//	{
//		synchronized (Stampante.class) {
//			
//			if (instance == null)
//			{
//		      instance = new Stampante();
//			}
//	}
//	}
//	return instance;
//}
//
//private String marchio;
//private String azienda;
//
//
//private void riceveFileDaStampare()
//{
//	System.out.println("La stampante elabora il file da stampare.");
//}
//private void Foglio()
//{
//	System.out.println("La stampante prende un'altro foglio.");
//}
//
//private void ImpostaInchiostro()
//{
//	System.out.println("La stampante imposta gli inchiostri per stampare.");
//}
//
//private void Stampa()
//{
//	System.out.println("La stampante stampa");
//}
//
//private void restituisceFoglio()
//{
//	System.out.println("La stampante restituisce il foglio stampato.");
//}
//
//public void StampaDocumento()
//{
//	System.out.println(this.marchio + " dell'azienda " + this.azienda + " sta per stampare un documento.");
//	
//	this.riceveFileDaStampare();
//	this.Foglio();
//	this.ImpostaInchiostro();
//	this.Stampa();
//	this.restituisceFoglio();
//	
//	
//	System.out.println(this.marchio + " dell'azienda " + this.azienda + " ha stampato un documento.");
//}
//}

//3
//public class Stampante {
//private static Stampante instance = null;
//private Stampante()
//{
//System.out.println("Nuova stampante");
//
//marchio = "PrintTop";
//azienda = "TOP INFORMATICA";
//}
//
//public static synchronized Stampante getInstance() {
//	
//	if (instance == null) 
//	{
//		instance = new Stampante();
//	}
//	return instance;
//}
//
//private String marchio;
//private String azienda;
//
//
//private void riceveFileDaStampare()
//{
//	System.out.println("La stampante elabora il file da stampare.");
//}
//private void Foglio()
//{
//	System.out.println("La stampante prende un'altro foglio.");
//}
//
//private void ImpostaInchiostro()
//{
//	System.out.println("La stampante imposta gli inchiostri per stampare.");
//}
//
//private void Stampa()
//{
//	System.out.println("La stampante stampa");
//}
//
//private void restituisceFoglio()
//{
//	System.out.println("La stampante restituisce il foglio stampato.");
//}
//
//public void StampaDocumento()
//{
//	System.out.println(this.marchio + " dell'azienda " + this.azienda + " sta per stampare un documento.");
//	
//	this.riceveFileDaStampare();
//	this.Foglio();
//	this.ImpostaInchiostro();
//	this.Stampa();
//	this.restituisceFoglio();
//	
//	
//	System.out.println(this.marchio + " dell'azienda " + this.azienda + " ha stampato un documento.");
//}
//}

//2
//public class Stampante {
//private static Stampante instance = null;
//
//static {
//	try
//	{
//	instance = new Stampante();
//	}
//	catch (Exception e)
//	{
//		e.printStackTrace();
//	}
//}
//private Stampante()
//{
//System.out.println("Nuova stampante");
//
//marchio = "PrintTop";
//azienda = "TOP INFORMATICA";
//}
//
//public static Stampante getInstance() {
//	
////	if (instance == null) 
////	{
////		instance = new Stampante();
////	}
//	return instance;
//}
//
//private String marchio;
//private String azienda;
//
//
//private void riceveFileDaStampare()
//{
//	System.out.println("La stampante elabora il file da stampare.");
//}
//private void Foglio()
//{
//	System.out.println("La stampante prende un'altro foglio.");
//}
//
//private void ImpostaInchiostro()
//{
//	System.out.println("La stampante imposta gli inchiostri per stampare.");
//}
//
//private void Stampa()
//{
//	System.out.println("La stampante stampa");
//}
//
//private void restituisceFoglio()
//{
//	System.out.println("La stampante restituisce il foglio stampato.");
//}
//
//public void StampaDocumento()
//{
//	System.out.println(this.marchio + " dell'azienda " + this.azienda + " sta per stampare un documento.");
//	
//	this.riceveFileDaStampare();
//	this.Foglio();
//	this.ImpostaInchiostro();
//	this.Stampa();
//	this.restituisceFoglio();
//	
//	
//	System.out.println(this.marchio + " dell'azienda " + this.azienda + " ha stampato un documento.");
//}
//}