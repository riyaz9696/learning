import java.util.*;
import java.util.Collections;
import java.util.HashMap;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.*;

class DataReadExample
{
  public static void main(String[] args)throws IOException
  {
      
   try{

     Scanner sc=new Scanner(System.in);

     System.out.println("Enter Your Searching word:");
     String wordSearch=sc.nextLine();
     System.out.println("You Searched :"+wordSearch);
     String[] userinput=wordSearch.split(" ");
    
    //This is for folder or directroy
     String srcDir = "Database/";
     File folder = new File(srcDir);
     File[] listOfFiles = folder.listFiles();
     HashMap<Integer,String> hmap=new HashMap<Integer,String>();
     int per;
     int factor;
     int wordcount=0;
     if (listOfFiles.length > 0) {
      
      for (int i = 0; i < listOfFiles.length; i++) {

        if (listOfFiles[i].isFile()) {

         FileReader fr=new FileReader(srcDir + listOfFiles[i].getName());
         BufferedReader br=new BufferedReader(fr);
         String firstline=br.readLine();
         int count=0;
         for(int j=0;j<userinput.length;j++)
         {
           String[] words=firstline.split(" ");

           for(int k=0;k<words.length;k++)
           {

            String ts=words[k];

            if(ts.equalsIgnoreCase(userinput[j]))
            {
              count=count+1;

            }
          }
          System.out.println("File name:"+listOfFiles[i].getName()+"---"+userinput[j]+"-->"+count);
          wordcount=wordcount+count;
          
          // hmap.put();
         // factor= wordcount*100;
         // per=factor/userinput.length;
         // System.out.println(per);
         //  count=0;
        }
        // factor= wordcount*100;

        per=((wordcount*100)/userinput.length);
        hmap.put(per,listOfFiles[i].getName());
        System.out.println(per);
        System.out.println("&&&&");
        System.out.println(userinput.length);
        

        wordcount=0;
        per=0;
        factor=0;
        // factor= wordcount*100;
        // per=factor/userinput.length;
        // System.out.println(per);
        // hmap.put(per,listOfFiles[i].getName());
        System.out.println("---");
       
      }
       // per=0;
       //  factor=0;
       //  wordcount=0;
    }
  }
  /*Map<Integer, String> map = new TreeMap<Integer, String>(hmap); 
         System.out.println("You have to fallow this document for Sorting:");
         Set set2 = map.entrySet();
         Iterator iterator2 = set2.iterator();
         while(iterator2.hasNext()) {
              Map.Entry me2 = (Map.Entry)iterator2.next();
              System.out.print(me2.getKey() + ": ");
              System.out.println(me2.getValue());
         }*/
         Set set = hmap.entrySet();
      Iterator iterator = set.iterator();
      while(iterator.hasNext()) {
         Map.Entry mentry = (Map.Entry)iterator.next();
         System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
         System.out.println(mentry.getValue());
      }



}
catch(Exception e)
{
  System.out.println(e);
}
}
}