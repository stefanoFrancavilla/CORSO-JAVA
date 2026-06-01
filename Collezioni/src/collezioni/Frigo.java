package collezioni;

import java.time.LocalDate;
import java.time.Month;
import java.util.PriorityQueue;
import java.util.Queue;

public class Frigo {
	
	Queue<Yogurt> yogurts = null;
	
	public Frigo()
	{
		manageYogurts();
	}

	private void manageYogurts()
	{
		Yogurt yogurt1 = new Yogurt(1, LocalDate.of(2023, Month.MAY, 1));
		Yogurt yogurt2 = new Yogurt(2, LocalDate.of(2023, Month.MARCH, 1));
		Yogurt yogurt3 = new Yogurt(3, LocalDate.of(2023, Month.APRIL, 1));
		Yogurt yogurt4 = new Yogurt(4, LocalDate.of(2023, Month.JANUARY, 1));
		Yogurt yogurt5 = new Yogurt(5, LocalDate.of(2023, Month.DECEMBER, 1));
		
		yogurts = new PriorityQueue<>();
		yogurts.offer(yogurt1);
		yogurts.offer(yogurt2);
		yogurts.offer(yogurt3);
		yogurts.offer(yogurt4);
		yogurts.offer(yogurt5);
	}
	
	public Yogurt getExpiringYogurt()
	{
		return yogurts.poll();
	}
}
