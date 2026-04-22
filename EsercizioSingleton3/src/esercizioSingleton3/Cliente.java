//package esercizioSingleton3;
//
//public class Cliente extends Thread
//{
////variabili di istanza
//	private String nome;
//	private double importo;
//	private boolean prelievo;
//	
//	//costruttore
//	 public Cliente(String nome, double importo, boolean prelievo) {
//		 
//		 this.nome = nome;
//		 this.importo = importo;
//		 this.prelievo = prelievo;
//	 }
//
//	 //metodi getter e setter
//	 public String getNome() {
//		 return nome;
//	 }
//
//	 public void setNome(String nome) {
//		 this.nome = nome;
//	 }
//
//	 public double getImporto() {
//		 return importo;
//	 }
//
//	 public void setImporto(double importo) {
//		 this.importo = importo;
//	 }
//
//	 public boolean isPrelievo() {
//		 return prelievo;
//	 }
//
//	 public void setPrelievo(boolean prelievo) {
//		 this.prelievo = prelievo;
//	 }
//	
//	 @Override
//	 public void run()
//	 {
//		 
//	 }
//	 
//}
package esercizioSingleton3;

public class Cliente extends Thread {

    private String nome;
    private double importo;
    private boolean prelievo;

    public Cliente(String nome, double importo, boolean prelievo) {
        this.nome = nome;
        this.importo = importo;
        this.prelievo = prelievo;
    }

    @Override
    public void run() {
        Bancomat bancomat = Bancomat.getInstance();

        if (prelievo) {
            bancomat.preleva(nome, importo);
        } else {
            bancomat.deposita(nome, importo);
        }
    }
}