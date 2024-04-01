// program for calculator 

import java.util.Scanner;

class Calculator
{
  public static void main(String[] args)
{
 Scanner s = new Scanner(System.in);
 System.out.println("Enter first no");
 int no1 = s.nextInt();
System.out.println("Enter second no");
int no2 = s.nextInt();
System.out.println("select Symbol(+,-,*,/");
String sym = s.next();
int res;
switch(sym)
{
  case"+": res=no1 + no2;
           System.out.println("Addition is:" +res);
           break;

   case"-": res=no1 - no2;
           System.out.println("Addition is:" +res);
           break;

    case"*": res=no1 * no2;
           System.out.println("Addition is:" +res);
           break;

     case"/": res=no1 / no2;
           System.out.println("Addition is:" +res);
           break;

    default: System.out.println("Invalid operation");
             break;
}
}
}
 