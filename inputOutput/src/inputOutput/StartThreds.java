package inputOutput;

public class StartThreds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*//1.
		System.out.println();
		System.out.println("1. -------------------------------------------------------------");
		System.out.println();
		
		MyThread mt1 = new MyThread();
		mt1.start();*/
		
		
		/*//2.
		System.out.println();
		System.out.println("2. -------------------------------------------------------------");
		System.out.println();
		
		MyThread mt1 = new MyThread();
		MyThread mt2 = new MyThread();
		
		mt1.start();
		mt2.start();*/
		
		
		/*//3.
		System.out.println();
		System.out.println("3. -------------------------------------------------------------");
		System.out.println();
		
		for(int i = 0; i< 6; i++)
		{
			MyThread mt = new MyThread();
			mt.start();
		}*/
		
		
		/*//4 e 5.
		System.out.println();
		System.out.println("4. -------------------------------------------------------------");
		System.out.println();
		
		for(int i = 0; i< 6; i++)
		{
			MyThread mt = new MyThread(i);
			mt.start();
		}*/
		
		
		/*//6.
		System.out.println();
		System.out.println("6. -------------------------------------------------------------");
		System.out.println();
		
		for(int i = 0; i< 6; i++)
		{
			MyThread mt = new MyThread(i);
			mt.start();
		}
		
		throw new RuntimeException();*/
		
		
		//7.
		System.out.println();
		System.out.println("7. -------------------------------------------------------------");
		System.out.println();
		
		for(int i = 0; i< 6; i++)
		{
			MyThread2 mt = new MyThread2(i);
			Thread m = new Thread(mt);
			m.start();
		}
	}
}
