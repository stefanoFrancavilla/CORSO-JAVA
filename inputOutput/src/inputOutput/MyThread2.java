package inputOutput;

public class MyThread2 implements Runnable {
	
	private int n;
	
	public MyThread2(int n)
	{
		this.n = n;
	}
	
	@Override
	public void run()
	{
		for(int i = 0; i< 6; i++)
		{
			System.out.println(i + " dal thread: " + n);
			
			//if(n == 4)
			//	throw new RuntimeException();
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
