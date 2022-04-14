package calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class calculator {
  public static void  main(String args[])
  {
     calculator c= new calculator();

      do{
          System.out.println("enter 1 to find square root of a number");
          System.out.println("enter 2 to find factorial of a number");
          System.out.println("enter 3 to find natural logarithm of a number");
          System.out.println("enter 4 to power of x to a");
          Scanner sc=new Scanner(System.in);
          int choice;
          int num1, num2=0;
          try
          {
              choice=sc.nextInt();
          }
          catch (InputMismatchException e)
          {
              System.out.println(e);
              return ;
          }
          if(choice==1 || choice==2 || choice==3)
          {
              System.out.println("enter a number");

              try
              {
                  num1=sc.nextInt();
              }
              catch(InputMismatchException e)
              {
                  System.out.println(e);
                  return;
              }
          }
          else {
              try {

                  System.out.println("enter x");
                  num1 = sc.nextInt();
                  System.out.println("enter b");
                  num2 = sc.nextInt();
              } catch (InputMismatchException e) {
                  System.out.println(e);
                  return;
              }
          }
          switch (choice)
          {
              case 1:
                  System.out.println("square root is :" + c.square_root(num1));
                  break;
              case 2:
                      System.out.println("factorial is :" + c.factorial(num1));
                      break;
              case 3:
                  System.out.println("natural logarithm is :" + c.natural_logarithm(num1));
                  break;
              case 4:
                  System.out.println("exponential is :" + c.exponential(num1, num2));
                  break;
              default:
                  System.out.println("exited");
                  break;

          }
      }while(true);
  }

 public double square_root(int num)
 {
     return Math.sqrt(num);
 }
  public int factorial(int num)
  {
      int i;
      int result=1;
      for(i=1;i<=num;i++)
      {
          result=result*i;
      }
      return result;
  }

  public double natural_logarithm(int num)
  {
      return Math.log(num);
  }
  public double exponential(int num1,int num2)
  {
      return Math.pow(num1, num2);
  }
}
