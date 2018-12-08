import java.io.FileOutputStream;
class FileOutputStreamExample
{
  public static void main(String[] args)
  {
    try{
    FileOutputStream fs=new FileOutputStream("/home/kls101/Desktop/LearningJava/Assignment/FileOutputStreamExample.txt");
    String s="Learning IO Package of String...";
    byte b[]=s.getBytes();//converting String into byte array
    fs.write(b);
    fs.close();
    System.out.println("Success");
    }
    catch(Exception e)
    {
      System.out.println(e);
    }
  }
}