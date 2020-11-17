package src;

import java.util.Scanner;

public class example {
  public static void main(String args[])
  {
      int newNum = 0;

      int num = 567;

      while(num>10)
      {
          int temp = num%10;
          System.out.println(temp);
          num /=10;
          newNum = newNum *10 + temp;
          System.out.println(newNum);
      }
    System.out.print(newNum);
  }
}

