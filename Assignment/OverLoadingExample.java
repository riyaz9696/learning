class OverloadingExample
{
  int add(int n1,int n2)
  {
  return n1+n2;
  }
  int add(int n1,int n2,int n3)
  {
    return n1+n2+n3;
  }
  public static void main(String[] args)
  {
    OverloadingExample o1=new OverloadingExample();
        
    System.out.println("Sum 1ST :"+o1.add(10,12));
    System.out.println("Sum 1ST :"+o1.add(12,12,12));
  }
}