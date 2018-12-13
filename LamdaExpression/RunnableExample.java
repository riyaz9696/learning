public class RunnableExample
{
	public static void main(String[] args)
	{
		Thread myThread=new Thread(new Runnable()
			{
				public void run()
				{
					System.out.println("Run Inside Runnable");
				}
			});
		myThread.run();
		Thread myLambdaThread =new Thread(()->System.out.println("Run Inside Lambda Runnable"));
		myLambdaThread.run();
	}
}