import java.io.*;
import java.lang.Thread;       // without this package we won't be able to access the Thread.sleep method in program

public class Exception3 {
    public static void main(String[] args)
    {
        try
        {
            Thread.sleep(1000);
            System.out.println("inside try 1");
            Thread.sleep(3000);
            System.out.println("inside try 2");
            System.out.println(args[0]);
            Thread.sleep(1000);
            System.out.println("inside try 3");

        }

        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundsException");
        }

        catch(InterruptedException e)
        {
            System.out.println("inside InterruptedException");
        }

        finally
        {
            System.out.println("inside finally");
        }
    }
}
