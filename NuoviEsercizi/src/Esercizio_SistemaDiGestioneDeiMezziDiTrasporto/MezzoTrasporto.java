package Esercizio_SistemaDiGestioneDeiMezziDiTrasporto;

public sealed interface MezzoTrasporto extends Utilizzabile permits Auto, Moto, Bicicletta {

}
