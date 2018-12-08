import java.util.*;
class InvalidAgeException extends Exception{  
 InvalidAgeException(String s)
 {  
  super(s);  
 }  
}
class TestCustomException1{  
   static void validate()
   {  
     System.out.println("Plz enter your value -> ");
     Scanner ts=new Scanner(System.in);
     int value=ts.nextInt();
      try{
     if(value<18){  
      throw new InvalidAgeException("not valid");
      }  
     else{
      System.out.println("welcome to vote");  
      TestCustomException1.validate();
     }  
      }catch(Exception e){
        System.out.println(e);
        TestCustomException1.validate();
       }
   }  
   void show(){
    System.out.println("hello");
   }
     
   public static void main(String args[])
   {  
 
      validate();  
    
  
      System.out.println("rest of the code...");  
  }  
}    
