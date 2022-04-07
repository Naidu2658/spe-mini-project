package calculator;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class calculator {
  public static void  main(String args[])
  {
     calculator c= new calculator();
      System.out.println("enter option 1 to add and 2 to sub");
      Scanner sc=new Scanner(System.in);
      int num1, num2;
      do{
          int choice=0;
          System.out.println("enter 1 or 2");
          try {
              choice= sc.nextInt();
          }
          catch(InputMismatchException e)
          {
              System.out.println(e);
          }
          try
          {
              System.out.println("enter first num");
              num1=sc.nextInt();
              System.out.println("enter second num");
              num2=sc.nextInt();
          }
          catch(InputMismatchException e)
          {
              System.out.println(e);
              return ;
          }
          switch (choice)
          {
              case 1:
                  System.out.println("sum is :" + c.add(num1, num2));
                  break;
              case 2:
                      System.out.println("dif is :" + c.sub(num1, num2));
                      break;
              default:
                  System.out.println("exited");
                  break;

          }
      }while(true);
  }

 public  int add(int num1, int num2)
  {
      return num1+num2;
  }
  public int sub(int num1,int num2)
  {
      return num1-num2;
  }
}
