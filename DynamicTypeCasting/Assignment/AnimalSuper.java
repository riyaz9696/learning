class AnimalSuper
{
  private String name;
  public AnimalSuper(String name)
  {
    this.name=name;
    System.out.println("I will execute first");
  }
}
public class Mammal extends Animal {
  public Mammal(String name)
  {
    super(name);
    System.out.println("I'm executed second");
  }
}
public class Carnivore extends Mammal{
  public Carnivore(String name)
  {
    super(name);
    System.out.println("I'm executed last");
  }
  /*public static void main(String[] args) {
    
  }*/
}