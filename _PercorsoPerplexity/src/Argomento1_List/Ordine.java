package Argomento1_List;

public class Ordine {

    private int numeroOrdine;
    private String cliente;
    private double totale;
    private StatoOrdine stato;

    public Ordine(int numeroOrdine, String cliente, double totale, StatoOrdine stato) {

        if (numeroOrdine <= 0) {
            System.out.println("Il numero ordine deve essere maggiore di zero");
            this.numeroOrdine = 0;
        } else {
            this.numeroOrdine = numeroOrdine;
        }

        setCliente(cliente);
        setTotale(totale);
        setStato(stato);
    }

    public int getNumeroOrdine() {
        return numeroOrdine;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        if (cliente == null || cliente.isBlank()) {
            System.out.println("Il cliente non può essere null, vuoto o composto solo da spazi");
            this.cliente = "Sconosciuto";
        } else {
            this.cliente = cliente;
        }
    }

    public double getTotale() {
        return totale;
    }

    public void setTotale(double totale) {
        if (totale < 0) {
            System.out.println("Il totale non può essere negativo");
            this.totale = 0;
        } else {
            this.totale = totale;
        }
    }

    public StatoOrdine getStato() {
        return stato;
    }

    public void setStato(StatoOrdine stato) {
        if (stato == null) {
            System.out.println("Lo stato dell'ordine non può essere null");
            this.stato = StatoOrdine.IN_PREPARAZIONE;
        } else {
            this.stato = stato;
        }
    }

    @Override
    public String toString() {
        return "Ordine n. " + numeroOrdine
                + " - Cliente: " + cliente
                + " - Totale: " + totale + " CHF"
                + " - Stato: " + stato;
    }
}