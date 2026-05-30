package appunti;

public class Appunti_LocalDate_ChronoLocalDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Certo. Ti spiego LocalDate e ChronoLocalDate in modo semplice ma completo, con esempi pratici e con le funzioni che userai più spesso. LocalDate è la classe concreta più comune per lavorare con una data senza ora e senza fuso orario, mentre ChronoLocalDate è un’interfaccia più generica usata nelle API di calendario di Java.

Idea semplice
LocalDate rappresenta una data pura: giorno, mese e anno.
Quindi è perfetta per cose come compleanni, scadenze, date di nascita, prenotazioni o eventi che non hanno bisogno dell’orario.

ChronoLocalDate invece è una specie di “contratto” che dice: “questa cosa si comporta come una data locale”, ma può appartenere anche a cronologie diverse da quella ISO standard usata da LocalDate.

Differenza principale
LocalDate = classe concreta, semplice, usatissima nella vita reale.

ChronoLocalDate = tipo più generale, utile se vuoi scrivere codice che lavori con date di cronologie diverse.

Per iniziare, nella pratica quotidiana userai quasi sempre LocalDate.

Come creare una LocalDate
I modi più comuni sono questi:

LocalDate.now() per la data di oggi;

LocalDate.of(anno, mese, giorno) per una data precisa;

LocalDate.parse("2026-05-30") per leggere una data da una stringa.

java
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate oggi = LocalDate.now();
        LocalDate compleanno = LocalDate.of(2000, 10, 15);
        LocalDate dataDaTesto = LocalDate.parse("2026-05-30");

        System.out.println(oggi);
        System.out.println(compleanno);
        System.out.println(dataDaTesto);
    }
}
Funzioni principali di LocalDate
getDayOfMonth()
Restituisce il giorno del mese.
Si usa quando ti serve solo il numero del giorno.

java
LocalDate data = LocalDate.of(2026, 5, 30);
System.out.println(data.getDayOfMonth()); // 30
getMonthValue()
Restituisce il mese come numero.
Si usa quando vuoi lavorare con il mese in forma numerica.

java
System.out.println(data.getMonthValue()); // 5
getYear()
Restituisce l’anno.
Si usa quando ti serve sapere l’anno della data.

java
System.out.println(data.getYear()); // 2026
plusDays(), plusWeeks(), plusMonths(), plusYears()
Servono per aggiungere giorni, settimane, mesi o anni.
Si usano quando devi calcolare una data futura.

java
LocalDate data = LocalDate.of(2026, 5, 30);
System.out.println(data.plusDays(1));   // 2026-05-31
System.out.println(data.plusMonths(2)); // 2026-07-30
System.out.println(data.plusYears(1));  // 2027-05-30
minusDays(), minusWeeks(), minusMonths(), minusYears()
Servono per sottrarre tempo.
Si usano quando devi trovare una data passata.

java
System.out.println(data.minusDays(10)); // 2026-05-20
isBefore(), isAfter(), isEqual()
Servono per confrontare date.
Si usano quando devi capire quale data viene prima o dopo.

java
LocalDate a = LocalDate.of(2026, 5, 10);
LocalDate b = LocalDate.of(2026, 5, 20);

System.out.println(a.isBefore(b)); // true
System.out.println(b.isAfter(a));  // true
System.out.println(a.isEqual(b));  // false
compareTo()
Confronta due date e restituisce un numero.
Si usa quando devi ordinare o confrontare date in modo più tecnico.

java
System.out.println(a.compareTo(b)); // numero negativo
until()
Calcola la distanza tra due date e restituisce un Period.
Si usa quando vuoi sapere quanti anni, mesi e giorni ci sono tra due date.

java
import java.time.Period;

Period p = a.until(b);
System.out.println(p.getDays());
lengthOfMonth() e lengthOfYear()
Restituiscono quanti giorni ha quel mese o quell’anno.
Si usano quando fai controlli sul calendario.

java
System.out.println(data.lengthOfMonth());
System.out.println(data.lengthOfYear());
withDayOfMonth(), withMonth(), withYear()
Servono per cambiare una parte della data.
Si usano quando vuoi modificare solo giorno, mese o anno.

java
System.out.println(data.withDayOfMonth(1)); // primo giorno del mese
Formattazione di LocalDate
Una data può essere mostrata in formato personalizzato usando DateTimeFormatter.
Si usa quando vuoi far vedere la data all’utente in un formato più leggibile.

java
import java.time.format.DateTimeFormatter;

LocalDate data = LocalDate.of(2026, 5, 30);
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

System.out.println(data.format(formatter)); // 30/05/2026
Quando usare LocalDate
Usalo quando ti serve solo la data, senza ora:

compleanni;

scadenze;

date di nascita;

appuntamenti;

eventi giornalieri.

Se ti serve anche l’orario, allora conviene usare LocalDateTime.

Cos’è ChronoLocalDate
ChronoLocalDate è un’interfaccia della parte “chrono” di Java.
Serve per rappresentare una data locale in modo più generale, non legato solo alla cronologia ISO standard.

In pratica:

LocalDate è quello che usi quasi sempre;

ChronoLocalDate è utile soprattutto quando scrivi metodi generici o lavori con cronologie particolari.

Quando usarlo
Di solito non lo userai direttamente nei programmi semplici.
Lo incontri:

in metodi più generici;

nelle API del package java.time.chrono;

quando vuoi scrivere codice che accetti più tipi di date cronologiche.

Esempio concettuale
LocalDate può essere passato dove si aspetta un ChronoLocalDate, perché LocalDate soddisfa quel contratto.

java
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        ChronoLocalDate d1 = LocalDate.of(2026, 5, 30);
        ChronoLocalDate d2 = LocalDate.of(2026, 6, 10);

        Period p = d1.until(d2);
        System.out.println(p);
    }
}
Differenza pratica tra i due
LocalDate è la scelta normale e semplice.

ChronoLocalDate è la scelta più astratta e tecnica.

Se stai imparando Java, parti da LocalDate.
ChronoLocalDate serve più per capire come sono costruite le API data/ora e per codice più avanzato.

Esempio completo
java
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class EsempioDate {
    public static void main(String[] args) {
        LocalDate oggi = LocalDate.now();
        LocalDate scadenza = LocalDate.of(2026, 12, 31);

        System.out.println("Oggi: " + oggi);
        System.out.println("Scadenza: " + scadenza);

        System.out.println("Oggi è prima della scadenza? " + oggi.isBefore(scadenza));

        Period differenza = oggi.until(scadenza);
        System.out.println("Anni: " + differenza.getYears());
        System.out.println("Mesi: " + differenza.getMonths());
        System.out.println("Giorni: " + differenza.getDays());

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Oggi formattata: " + oggi.format(formatter));
    }
}
Regola facile
Usa LocalDate per la maggior parte dei casi reali.

Usa ChronoLocalDate solo quando ti serve un tipo più generale o più tecnico.

Se non ti serve l’ora, LocalDate basta e avanza.
		 */
	}

}
