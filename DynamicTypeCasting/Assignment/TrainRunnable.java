class TrainRunnable implements Runnable
{
  public void run()
  {
    System.out.println("Train is Running...");
  }
  public static void main(String[] args)
  {
    TrainRunnable tr1=new TrainRunnable();
    Thread t1=new Thread(tr1);
    t1.start();
  }
}