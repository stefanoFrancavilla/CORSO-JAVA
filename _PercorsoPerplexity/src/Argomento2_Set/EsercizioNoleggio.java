package Argomento2_Set;

public class EsercizioNoleggio {

    public static void main(String[] args) {

        GestioneNoleggio gestioneNoleggio = new GestioneNoleggio();

        Attrezzatura attrezzatura1 = new Attrezzatura(1, "Tenda", "Campeggio", 10.0, true);
        Attrezzatura attrezzatura2 = new Attrezzatura(2, "Sacco a pelo", "Campeggio", 5.0, true);
        Attrezzatura attrezzatura3 = new Attrezzatura(3, "Fornello", "Campeggio", 15.0, true);
        Attrezzatura attrezzatura4 = new Attrezzatura(4, "Lanterna", "Campeggio", 7.0, true);

        gestioneNoleggio.aggiungiAttrezzatura(attrezzatura1);
        gestioneNoleggio.aggiungiAttrezzatura(attrezzatura2);
        gestioneNoleggio.aggiungiAttrezzatura(attrezzatura3);
        gestioneNoleggio.aggiungiAttrezzatura(attrezzatura4);

        gestioneNoleggio.stampaTutteLeAttrezzature();

        System.out.println(gestioneNoleggio.cercaAttrezzaturaPerCodice(1));
        System.out.println(gestioneNoleggio.cercaAttrezzaturaPerCodice(5));

        System.out.println(gestioneNoleggio.cercaAttrezzaturePerCategoria("Campeggio"));
        System.out.println(gestioneNoleggio.noleggiaAttrezzatura(2, 3));

        System.out.println("Numero totale di attrezzature: " + gestioneNoleggio.contaAttrezzatureTotali());

        System.out.println("Numero di attrezzature per categoria Campeggio: " 
                + gestioneNoleggio.contaAttrezzaturaPerCategoria("Campeggio"));

        System.out.println(gestioneNoleggio.calcolaCostoNoleggio(2));

        System.out.println(gestioneNoleggio.restituisciAttrezzatura(2));
    }
}