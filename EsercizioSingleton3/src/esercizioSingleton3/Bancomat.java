//package esercizioSingleton3;
//
//public class Bancomat {
//
//	
//	//variabili di istanza
//	private static double saldo = 1000.0;
//	private static String banca = "UBS";
//	private static double importo;
//	//costruttore
//	private Bancomat()
//	{
//		
//	}
//	public static Bancomat getIstance()
//	{
//		return BancomatBuilder.INSTANCE;
//	}
//	
//	private static class BancomatBuilder
//	{
//		private static final Bancomat INSTANCE = new Bancomat();
//	}
//	
//	//metodi getter e setter
//	
//	public static double getSaldo() {
//		return saldo;
//	}
//
//	public static void setSaldo(double saldo) {
//		Bancomat.saldo = saldo;
//	}
//	
//	//metodi
//	
//	private boolean deposita(double importo)
//	{
//		if(importo >= 0)
//		{
//			saldo += importo;
//			return true;
//		}
//		else
//		{
//			System.out.println("Importo non valido");
//			return false;
//		}
//	}
//	
//	private boolean preleva(double importo)
//	{
//		if(importo <= saldo)
//		{
//			saldo -= importo;
//			return true;
//		}
//		else
//		{
//			System.out.println("Saldo insufficiente , prego depositare prima di prelevare");
//		}
//		return false;
//	}
//	
//	private static void visualizzaSaldo()
//	{
//		System.out.println("Il saldo attuale è: " + saldo);
//	}
//	
//	private static void Tessera()
//	{
//		System.out.println("Tessera inserita, benvenuto in " + banca);
//	}
//	private static void operazioneInCorso()
//	{
//		System.out.println("Operazione in corso, attendere prego...");
//	}
//	private static void operazioneCompletata()
//	{
//		System.out.println("Operazione completata, prego ritirare la tessera , grazie per aver usato " + banca);
//	}
//	
//	public synchronized void operazionePreleva()
//	{
//	
//		visualizzaSaldo();
//		preleva(importo);
//		Tessera();
//		operazioneInCorso();
//		operazioneCompletata();
//    }
//	
//	public synchronized void operazioneDeposita()
//	{
//		visualizzaSaldo();
//		deposita(importo);
//		Tessera();
//		operazioneInCorso();
//		operazioneCompletata();
//		
//	}
//	
//		
//	}
//	

	package esercizioSingleton3;

public class Bancomat {

	//variabili di istanza
    private double saldo = 1000.0;
    private final String banca = "UBS";

    
    //costruttore
    private Bancomat() {
    }

    public static Bancomat getInstance() {
        return BancomatBuilder.INSTANCE;
    }

    private static class BancomatBuilder {
        private static final Bancomat INSTANCE = new Bancomat();
    }

    public synchronized double getSaldo() {
        return saldo;
    }

    public synchronized void deposita(String nomeCliente, double importo) {
        if (importo <= 0) {
            System.out.println(nomeCliente + ": importo deposito non valido");
            return;
        }

        System.out.println(nomeCliente + " inserisce la tessera in " + banca);
        System.out.println(nomeCliente + " sta depositando " + importo);

        saldo += importo;

        System.out.println(nomeCliente + " ha depositato " + importo);
        System.out.println("Saldo attuale: " + saldo);

        notifyAll();
    }

    public synchronized void preleva(String nomeCliente, double importo) {
        if (importo <= 0) {
            System.out.println(nomeCliente + ": importo prelievo non valido");
            return;
        }

        System.out.println(nomeCliente + " inserisce la tessera in " + banca);
        System.out.println(nomeCliente + " vuole prelevare " + importo);

        while (saldo < importo) {
            System.out.println(nomeCliente + " in attesa: saldo insufficiente. Saldo attuale = " + saldo);
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println(nomeCliente + " interrotto durante l'attesa");
                return;
            }
        }

        saldo -= importo;

        System.out.println(nomeCliente + " ha prelevato " + importo);
        System.out.println("Saldo attuale: " + saldo);
    }
}	
	

