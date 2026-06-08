package Esercizi_sealed_NonSealed_Final_3;

public sealed interface Notifica extends Inviabile permits Email, SMS, PushNotification {

}
