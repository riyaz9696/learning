import java.util.ArrayList;
import java.util.List;

public class ForEachCollectionExample
{
	public static void main(String[] args)
	{
		List<Person> person=new Arrays.aslist(
			new Person("David",10),
			new Person("John",15),
			new Person("Clark",17),
			new Person("Charls",19)
			);
		for(int i=0;i<person.size;i++)
		{
			System.out.println(person.get(i));
		}
	}
}