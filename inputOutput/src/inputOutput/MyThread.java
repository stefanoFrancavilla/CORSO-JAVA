package inputOutput;

/*//da 1 a 3.
public class MyThread extends Thread {
	@Override
	public void run()
	{
		for(int i = 0; i< 6; i++)
		{
			System.out.println(i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}*/

/*//4.
public class MyThread extends Thread {
	
	private int n;
	
	public MyThread(int n)
	{
		this.n = n;
	}
	
	@Override
	public void run()
	{
		for(int i = 0; i< 6; i++)
		{
			System.out.println(i + " dal thread: " + n);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}*/

/*//5.
public class MyThread extends Thread {
	
	private int n;
	
	public MyThread(int n)
	{
		this.n = n;
	}
	
	@Override
	public void run()
	{
		for(int i = 0; i< 6; i++)
		{
			System.out.println(i + " dal thread: " + n);
			
			if(n == 4)
				throw new RuntimeException();
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}*/

//6.
public class MyThread extends Thread {
	
	private int n;
	
	public MyThread(int n)
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