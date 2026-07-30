package HotelManagementSystem;

public enum TipoCamera {

    SINGOLA(50.0),
    DOPPIA(80.0),
    TRIPLA(100.0),
    SUITE(150.0);

    private final double prezzoBase;

    TipoCamera(double prezzoBase) {
        this.prezzoBase = prezzoBase;
    }

    public double getPrezzoBase() {
        return prezzoBase;
    }
}