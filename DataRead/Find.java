import java.io.*;
import java.util.Scanner;

public class Find {

  public static void main(String[] args) throws IOException {
    int count =0;
    String srcDir = "Database/";
    File folder = new File(srcDir);
    File[] listOfFiles = folder.listFiles();
    if (listOfFiles.length > 0) {
      for (int i = 0; i < listOfFiles.length; i++) {
        if (listOfFiles[i].isFile()) {
          Scanner a = null;
          a = new Scanner(new BufferedReader(new FileReader(srcDir + listOfFiles[i].getName())));
          while (a.hasNext()){
            String words = a.next();
            if (words.equals("good")){
             count++;
           }

         }
         System.out.println(listOfFiles[i].getName()+"the total is:" + count);
         count=0;
/*System.out.println();*/
       }
     }
   }
 }
}
