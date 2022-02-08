package org.test;

public class ExceptionTask {
public static void main(String[] args) {
	
	//Day 10 : Q1
	try
    {    //step 1
          System.out.printf("1\n");
          //step 2
        int sum = 9 / 0;
          System.out.printf("2");
    }//step 3
    catch(ArithmeticException e)
    {//step 4
          System.out.printf("3\n");
    }
     catch(Exception e)
    {
          System.out.printf("4");
    }
    finally
    {//step 4
       System.out.printf("5\n");
    }
       }

   

}

