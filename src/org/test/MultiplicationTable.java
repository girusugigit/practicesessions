package org.test;

public class MultiplicationTable {

	public static void main(String[] args) {
		 try
         {       //step 1
               System.out.printf("1\n");
             int sum = 9 / 0;//step 2
               System.out.printf("2");
         }
         catch(ArithmeticException e)
         {
               System.out.printf("3\n");
         }
          catch(Exception e)
         {
               System.out.printf("4");
         }
         finally
         {
            System.out.printf("5");
         }
		}
	}


