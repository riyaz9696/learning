import java.util.*;
import java.io.IOException;

class CustomExceptionExample{
      // CustomExceptionExample obj;

      void validate(){ 
      System.out.println("Plz Enter your value -> ");
      Scanner tt=new Scanner(System.in);
       int xyz=tt.nextInt(); 
      
     
     if(xyz<18){  
      try{ 
      throw new InvalidAgeException("Plz your are not valid use"); 
        CustomExceptionExample ts1=new CustomExceptionExample();
          ts1.validate();
    }  
   catch(Exception m)
      {
        System.out.println("Exception occured: "+m);
      }  
    }
    else  
     {
      System.out.println("welcome to vote");  
     
    }
     }
   public static void main(String args[]){
     CustomExceptionExample ts=new CustomExceptionExample();
      // this.obj=ts;
      ts.validate();  
  
      
  }  
}