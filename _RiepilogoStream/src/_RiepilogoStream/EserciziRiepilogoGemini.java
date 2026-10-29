package _RiepilogoStream;
import java.util.Random;
import java.util.stream.Stream;

public class EserciziRiepilogoGemini {

	public static void main(String[] args) {
	
		System.out.println();
		System.out.println("1.1--------------------------");
		System.out.println();
		
		Stream<String> citta = Stream.of("Roma", "Parigi", "Berlino", "Madrid", "Oslo", "Vienna");
		
		citta.filter(n -> n.length() > 4)
		.filter(n -> !n.contains("a"))
		.forEach(n -> System.out.println("Capitali con più di 4 caratteri e che non hanno la a: " + n));
		
		System.out.println();
		System.out.println("1.2--------------------------");
		System.out.println();
		
		Stream<Integer> potenze = Stream.iterate(1, n -> n * 2)
				.skip(3)
				.limit(8);
				potenze.forEach(n -> System.out.println("Potenza X:" + n));
		
		System.out.println();
		System.out.println("1.3--------------------------");
		System.out.println();
		
		Random random = new Random();
		Stream<Integer> generator = Stream.generate(() -> random.nextInt(90) +1);
		generator
		.distinct()
		.limit(5)
		.forEach(n -> System.out.println(n));
		
		
	}

}
