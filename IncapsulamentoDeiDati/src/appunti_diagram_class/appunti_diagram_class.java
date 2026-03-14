package appunti_diagram_class;

public class appunti_diagram_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 *  con il diagram class stiamo rappresentando le varie clasi e le varie interfacce che dobbiamo creare
 *  il diagramma sta alla base del progetto, ed è importante per capire la struttura del progetto
 *  
 *  nel diagramma troviamo vaire caselle che rappresentano classi e interfacce,
 *  nel loro interno troviamo i nomi delle classi e delle interfacce, e le loro variabili di istanza e i loro metodi,
 *  
 *  se il nome della classe è scritto in corsivo, significa che è una classe astratta, se invece è scritto in grassetto, significa che è una classe normale,
 *  se invece è scritto in grassetto e corsivo, significa che è una interfaccia.
 *  
 *  le frecce che collegano le classi rappresentano  le loro relazioni di ereditarietà, di implementazione, di associazione, di composizione,
 *   di aggregazione, di dipendenza, di realizzazione, di utilizzo, di invocazione, di chiamata, di riferimento, di accesso, di modifica,
 *    di lettura, di scrittura, di esecuzione, di chiamata a metodo, di chiamata a costruttore, di chiamata a funzione, di chiamata a procedura, 
 *    di chiamata a subroutine, di chiamata a lambda expression, di chiamata a anonymous class, di chiamata a local class, di chiamata a nested class,
 *     di chiamata a inner class, di chiamata a static nested class, di chiamata a member class, di chiamata a top level class.
 *     
 *     esempio concon le frecce non tratteggiate stiamo rappresentando l'ereditarietà di una classe astratta
 *     *     esempio con le frecce tratteggiate stiamo rappresentando l'implementazione di una interfaccia
 *     
 *     per esempio nel nostro progetto abbiamo la classe EssereUmano che estende la classe Animale, che a sua volta estende la classe astratta EssereVivente,
 *     
 *     mentre la classe EssereUmano implementa l'interfaccia IVolatile
 *     
 *     nelle varie caselle troviamo anche i simboli +, -, #, ~, che rappresentano rispettivamente la visibilità pubblica, privata, protetta, package private,
 *     
 *     con il simbolo + stiamo rappresentando le variabili di istanza e i metodi pubblici,
 *      con il simbolo - stiamo rappresentando le variabili di istanza e i metodi privati,
 *      
 *      con il simbolo # stiamo rappresentando le variabili di istanza e i metodi protetti,
 *      
 *      con il simbolo ~ stiamo rappresentando le variabili di istanza e i metodi package private,
 *      
 *      con il simbolo {abstract} stiamo rappresentando i metodi astratti,
 *      che devono essere implementati dalle classi che estendono la classe astratta,
 *      
 *      
 *      
 *      nella casella di EssereVivente troviamo la dicitura -anni:byte
 *      quetsa dicitura rappresenta una variabile di istanza privata di tipo byte, che si chiama anni,
 *      
 *      
 *      nella casella di EssereUmano troviamo la dicitura -MIN_ANNI:byte=0
 *      quetsa dicitura rappresentata in maiuscolo e sottolineata sta a rappresentare una costante di tipo byte, che si chiama MIN_ANNI, e che ha un valore di 0,
 *      quindi e una costante statica, che non può essere modificata, e che rappresenta il valore minimo di anni per un essere umano,
 *     
 *     
 *     con la dicitura -coloreCapelli:ColoreCapelli stiamo rappresentando una variabile di istanza privata di tipo ColoreCapelli, che si chiama coloreCapelli,
 *     quindi un'enum che rappresenta i vari colori di capelli che un essere umano può avere,
 *     il simbolo - alla dicitura coloreCapelli sta a rappresentare la visibilità privata,
 *     quindi questa variabile di istanza non può essere modificata direttamente dall'esterno della classe,
 *     ma solo attraverso i metodi getter e setter,
 *     
 *     con la dicitura +setAnni(byte anni):byte stiamo rappresentando un metodo pubblico che si chiama setAnni, 
 *     che prende in input un parametro di tipo byte che si chiama anni, e che restituisce un valore di tipo byte,
 *     
 *     nell'ultima parte della casella troviamo i metodi che rappresentano le funzioni che un essere umano può fare, come mangiare, lavorare, volare, ecc,
 *     ***IMPORTANTE***: se un metodo è scritto in corsivo, significa che è un metodo astratto,
 *      quindi deve essere implementato dalle classi che estendono la classe astratta,
 *      
 *      mentre se il metodo è scritto in grassetto, significa che è un metodo normale, 
 *      che può essere utilizzato dalle classi che estendono la classe astratta, ma non è obbligatorio implementarlo,
 */
	}

}
