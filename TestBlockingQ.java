import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TestBlockingQ
{
	String val = "test";
	ArrayBlockingQueue<String> q = new ArrayBlockingQueue<String>(10);

	public void produce(int i)
	{
		String x = val + i;
		q.add(x);
		System.out.println("Added" + x);
		i++;
	}

	public String consume()
	{
		String z = q.poll();
		System.out.println("Removed" + z);
		return z;
	}

	public static void main(String[] args)
	{
		TestBlockingQ obj = new TestBlockingQ();
		TestBlockingQ obj2 = new TestBlockingQ();

		ExecutorService service = Executors.newFixedThreadPool(3);
		service.execute(new Runnable()
		{
			public void run()
			{
				for (int i = 0; i < 10; i++)
				{
					obj.produce(i);
				}
			}
		});

		try
		{
			service.awaitTermination(100, TimeUnit.MILLISECONDS);
		}
		catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		service.execute(new Runnable()
		{

			@Override
			public void run()
			{
				// TODO Auto-generated method stub
				for (int i = 0; i < 10; i++)
				{
					obj.consume();
				}
			}
		});
	}
}
