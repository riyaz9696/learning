class Parent
{
  /*public void show()
  {
    System.out.println("Hello..");
  }*/
}
public class Child2 extends Parent
{
 public void show()
  {
    System.out.println("Hi...");
  }
  public static void main(String[] args)
  {
    Parent p1=new Child2();
    p1.show();
  }
}



/*Output: This prints Error on cmd b/c show method 
can not get show in parent class.(This is called-->>Dynamic Binding)*/