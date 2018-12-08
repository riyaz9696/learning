class Parent
{
  public void show()
  {
    System.out.println("Hello..");
  }
}
public class Child1 extends Parent
{
 /*public void show()
  {
    System.out.println("Hi...");
  }*/
  public static void main(String[] args)
  {
    Parent p1=new Child1();
    p1.show();
  }
}



/*Output: This prints Hello of Parent class b/c this find show
 method in child class first but not availabale in child but 
 then goes to parent class then find out the method and 
 print hello (here compiler finds which method to run-->Dynamic Binding */