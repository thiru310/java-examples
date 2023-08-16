package com.example.methodoverridingwithaccess;

class A{  
protected void msg(){System.out.println("Hello java");}  
}  
  
public class Simple extends A{  
	private static int number = 0;
void msg1(){System.out.println("Hello java");}//C.T.Error  
 public static void main(String args[]){  
   Simple obj=new Simple();  
   obj.msg();  
   number=+5;
   System.out.println(number);
   }  
}  