package org.test;

public class ExceptionTask3 {
	
  public static void main(String[] args)
    {
      try
    {
     System.out.printf("1\n");//Step 1
      int data = 5 / 0;//Step 2
    }
   catch(ArithmeticException e)
    {
   System.out.printf("2\n");//Step 3
   System.exit(0);//Step 4(final step)
     }
   finally
      {
    System.out.printf("3");
      }
   System.out.printf("4");
     }
      }

