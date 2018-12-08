package FileReaderpractice;

import java.io.*;
class BufferedOutputStreamExample
{
  public static void main(String[] args)throws Exception
  {
  try{  

  FileOutputStream fout=new FileOutputStream("BufferedFile.txt");

  BufferedOutputStream bout=new BufferedOutputStream(fout); 
  String s="Learning Buffered Input Output";
  byte b[]=s.getBytes();

  bout.write(b);
  bout.flush();
  bout.close();
  fout.close();
  }
  catch(Exception e)
  {
  System.out.println(e);
  }

  }

}