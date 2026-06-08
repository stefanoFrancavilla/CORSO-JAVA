package Esercizi_sealed_NonSealed_Final_2;

public sealed interface MetodoDiPagamento extends Processabile permits CartaDiCredito, Bonifico, Criptovaluta {

}
