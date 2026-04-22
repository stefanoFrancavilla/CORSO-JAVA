package esercizioSiingleton2;

public class CentraleTaxi {

    private static int taxiDisponibili = 4;
    private static int corseTotali = 0;
    private static boolean sistemaOccupato = false;
    private static String nomeCentrale = "Centrale Taxi";
    private static String citta = "Bellinzona";

    private CentraleTaxi() {
        nomeCentrale = "Centrale Taxi";
        citta = "Bellinzona";
    }

    public static CentraleTaxi getInstance() {
        return CentraleTaxiBuilder.INSTANCE;
    }

    private static class CentraleTaxiBuilder {
        private static final CentraleTaxi INSTANCE = new CentraleTaxi();
    }

    public static int getTaxiDisponibili() {
        return taxiDisponibili;
    }

    public static void setTaxiDisponibili(int taxiDisponibili) {
        CentraleTaxi.taxiDisponibili = taxiDisponibili;
    }

    public static int getCorseTotali() {
        return corseTotali;
    }

    public static void setCorseTotali(int corseTotali) {
        CentraleTaxi.corseTotali = corseTotali;
    }

    public static boolean isSistemaOccupato() {
        return sistemaOccupato;
    }

    public static void setSistemaOccupato(boolean sistemaOccupato) {
        CentraleTaxi.sistemaOccupato = sistemaOccupato;
    }

    public static String getNomeCentrale() {
        return nomeCentrale;
    }

    public static void setNomeCentrale(String nomeCentrale) {
        CentraleTaxi.nomeCentrale = nomeCentrale;
    }

    public static String getCitta() {
        return citta;
    }

    public static void setCitta(String citta) {
        CentraleTaxi.citta = citta;
    }

    private void prenotaTaxi() {
        System.out.println("Prenotazione in corso...");
    }

    private boolean controllaDisponibilita() {
        if (taxiDisponibili > 0) {
            System.out.println("Taxi disponibile!");
            taxiDisponibili--;
            sistemaOccupato = (taxiDisponibili == 0);
            return true;
        } else {
            sistemaOccupato = true;
            System.out.println("Nessun taxi disponibile al momento.");
            return false;
        }
    }

    private void inizioCorsa() {
        System.out.println("Corsa iniziata!");
    }

    private void fineCorsa() {
        System.out.println("Corsa terminata!");
    }

    private void rientroInCentrale() {
        System.out.println("Rientro in centrale...");
        corseTotali++;
        taxiDisponibili++;
        sistemaOccupato = false;
    }

    public synchronized void corsaTaxi() {
        CentraleTaxi centrale = CentraleTaxi.getInstance();

        if (!centrale.controllaDisponibilita()) {
            System.out.println("Prenotazione non possibile: sistema occupato.");
            return;
        }

        centrale.prenotaTaxi();
        centrale.inizioCorsa();
        centrale.fineCorsa();
        centrale.rientroInCentrale();
    }
}
