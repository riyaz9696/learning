class Vehicle extends Thread
{
  public void run()
  {
System.out.println("Vehicle Car is running...");
  }
  public static void main(String[] args){
    Vehicle v1=new Vehicle();
    v1.start();
  }
}