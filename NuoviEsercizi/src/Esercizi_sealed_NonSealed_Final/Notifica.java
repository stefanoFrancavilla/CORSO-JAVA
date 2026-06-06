package Esercizi_sealed_NonSealed_Final;

public sealed interface Notifica extends Notificabile permits Email, SMS, Push {

}
