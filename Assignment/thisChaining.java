public class thisChaining
{
  public thisChaining()
  {
    System.out.println("In default Constructor");
  }
  public thisChaining(int i)
  {
    this();
    System.out.println("Single Parameter Constructor");
  }
  public thisChaining(int i,int j)
  {
    this(i);
    System.out.println("Double Parameter Constructor");
  }
  public static void main(String[] args)
  {
    thisChaining t1=new thisChaining(3,4);
  }
}
