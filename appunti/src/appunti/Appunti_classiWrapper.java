package appunti;

public class Appunti_classiWrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Certo. Le classi wrapper sono le versioni “oggetto” dei tipi primitivi di Java, e per ogni primitivo c’è il suo wrapper corrispondente.

Servono quando ti servono gli oggetti invece dei valori semplici, per esempio con le collezioni o con i metodi di conversione.

Tabella completa
Tipo primitivo	Wrapper	Funzione principale
byte	Byte	Lavora con valori piccoli interi e conversioni di testo/numeri 
.
short	Short	Come byte, ma con intervallo più grande 
.
int	Integer	Il wrapper più usato per numeri interi normali 
.
long	Long	Per numeri interi molto grandi 
.
float	Float	Per numeri decimali meno precisi 
.
double	Double	Per numeri decimali più usati e precisi 
.
char	Character	Per un singolo carattere 
.
boolean	Boolean	Per vero/falso 
.
A cosa servono
I wrapper permettono di usare i primitivi come oggetti, cosa utile con ArrayList, List, generics e altre strutture che lavorano con oggetti.

Ogni wrapper offre metodi per convertire stringhe, ottenere il valore primitivo e lavorare in modo più comodo con quel tipo di dato.

Metodi utili per ogni wrapper
Per quasi tutti i wrapper numerici trovi questi metodi:

valueOf(...), per creare un oggetto wrapper;

parseXxx(...), per trasformare una stringa nel primitivo;

xxxValue(), per ottenere il valore primitivo dall’oggetto;

toString(), per trasformare il valore in testo.

Esempi semplici
java
Integer a = Integer.valueOf(10);
int b = a.intValue();
java
int n = Integer.parseInt("123");
Double d = Double.valueOf("3.14");
boolean ok = Boolean.parseBoolean("true");
char c = Character.valueOf('A');
Come usare ciascuna classe
Byte
Usala quando ti serve un numero intero molto piccolo o quando devi convertire testo in byte.

java
Byte x = Byte.valueOf((byte) 12);
byte y = x.byteValue();
Short
Usala come wrapper di un intero corto, spesso per conversioni o collezioni.

java
Short s = Short.valueOf((short) 100);
short valore = s.shortValue();
Integer
È il wrapper più comune. Serve per numeri interi, parsing da stringa e uso in liste.

java
Integer n = Integer.valueOf("45");
int valore = Integer.parseInt("45");
Long
Usala per interi grandi, ad esempio contatori o id molto alti.

java
Long l = Long.valueOf(1000L);
long valore = l.longValue();
Float
Usala per numeri decimali quando ti basta una precisione minore.

java
Float f = Float.valueOf("2.5");
float valore = f.floatValue();
Double
È il wrapper più usato per numeri decimali. Ha metodi utili per conversione e lavoro con testi.

java
Double d = Double.valueOf("9.99");
double valore = d.doubleValue();
Character
Serve per un singolo carattere, ad esempio lettere, simboli o controlli su caratteri.

java
Character ch = Character.valueOf('Z');
char c = ch.charValue();
Boolean
Serve per vero/falso e conversione da testo.

java
Boolean b = Boolean.valueOf("true");
boolean valore = b.booleanValue();
Funzioni importanti da ricordare
parseInt, parseDouble, parseLong, ecc. trasformano una stringa in un numero.

valueOf crea un oggetto wrapper da un valore o da una stringa.

xxxValue() riporta il valore al tipo primitivo.

toString() trasforma il wrapper in testo.

Quando usarli
Usa i wrapper quando:

lavori con collezioni come ArrayList<Integer> perché le collezioni gestiscono oggetti, non primitivi;

devi convertire input testuali in numeri;

ti servono metodi, costanti o possibilità come null.

Usa i primitivi quando:

devi fare calcoli semplici e veloci;

non ti servono oggetti, metodi extra o collezioni.

Regola facile
int, double, boolean ecc. = valori semplici.

Integer, Double, Boolean ecc. = oggetti con funzioni extra.
		 */
	}

}
