import java.io.FileInputStream;
class FileInputStreamExample
{
  public static void main(String[] args)
  {
    try{
    FileInputStream fin;
    int i;
    fin=new FileInputStream("/home/kls101/Desktop/LearningJava/Assignment/FileOutputStreamExample.txt");
   while((i=fin.read())!=-1){    
             System.out.print((char)i);    
            }    
 fin.close();
}
catch(Exception e)
{
  System.out.println(e);
}

  }
}

