class Parent
{
  public void show()
  {
    System.out.println("Hello..");
  }
}
public class Child extends Parent
{
 public void show()
  {
    System.out.println("Hi...");
  }
  public static void main(String[] args)
  {
    Parent p1=new Child();
    p1.show();
  }
}

/*Output : Here in this compiler finds the 
show method in run-time and get the output as Hi....(Dynamic Binding) */

