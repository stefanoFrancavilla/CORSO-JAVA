package IncapsulamentoDeiDatiEsercizio;

public class EssereUmano extends Animale {

    private String cognome;
    private coloreCapelli coloreCapelli;
    // Rimuovi coloreOcchi duplicato (ereditato da Animale)

    public EssereUmano(
            String nome,
            String cognome,
            byte eta,
            Sesso sesso,
            float altezza,
            float peso,
            coloreCapelli coloreCapelli,
            coloreOcchi coloreOcchi) {  // Passa coloreOcchi a super

        super(nome, eta, sesso, altezza, peso, coloreOcchi);  // 6 parametri corretti!

        this.cognome = cognome;        // Campo privato: setta direttamente
        this.coloreCapelli = coloreCapelli;
        // nome/eta/etc. già settati da super
    }

    // Override setter astratti da Animale (ora implementali)
    @Override
    public void setNome(String nome) {
        super.nome = nome;  // O super.setNome(nome) se implementato
    }

    @Override
    public void setEta(byte eta) {
        super.eta = eta;
    }

    @Override
    public void setAltezza(float altezza) {
        super.altezza = altezza;
    }

    @Override
    public void setPeso(float peso) {
        super.peso = peso;
    }

    // Getter/setter locali
    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public coloreCapelli getColoreCapelli() {
        return coloreCapelli;
    }

    public void setColoreCapelli(coloreCapelli coloreCapelli) {
        this.coloreCapelli = coloreCapelli;
    }
}
