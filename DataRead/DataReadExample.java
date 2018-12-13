import java.util.*;
import java.util.Collections;
import java.util.HashMap;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.*;
import java.util.TreeMap;

class DataReadExample
{
  public static void main(String[] args)throws IOException
  {
      
   try{

     Scanner sc=new Scanner(System.in);

     System.out.println("Enter Your Searching word from files:");
     String wordSearch=sc.nextLine();
     System.out.println("You Searched for :"+wordSearch);
     String[] userinput=wordSearch.split(" ");
    
    //This is for folder or directroy
     String srcDir = "Database/";
     File folder = new File(srcDir);
     File[] listOfFiles = folder.listFiles();
     
     Map<String,Integer> map=new TreeMap<String,Integer>();
    



     int percent;
     int multiply;
     int wordcount=0;
     int totalWordInFile=0;
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
         totalWordInFile=totalWordInFile+words.length;
               
        }       
          System.out.println("Total word in file-"+totalWordInFile); 
          totalWordInFile=0;         
        percent=((wordcount*100)/userinput.length);
        map.put(listOfFiles[i].getName(),percent);      

        System.out.println("Total % :"+percent);        
        //System.out.println(userinput.length);       

        wordcount=0;
        percent=0;
        multiply=0;

        System.out.println("---"); 
        System.out.println("Total Search Word in String :"+userinput.length);         
      }
       
    }
  }  
         Set set = map.entrySet();
      Iterator iterator = set.iterator();
      while(iterator.hasNext()) {
         Map.Entry mentry = (Map.Entry)iterator.next();
          
         System.out.println("Files :"+mentry.getKey());

      }
  
}
catch(Exception e)
{
  System.out.println(e);
}
}
}