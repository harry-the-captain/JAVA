// program to print the grades of student

import java.util.Scanner;

public class Student
{
    public static void main(String args[])
    {
        int marks[] = new int[6];
        int i;
        float total=0, avg;
        Scanner scanner = new Scanner(System.in);
		
        
        for(i=0; i<6; i++) 
        { 
           System.out.print("Enter Marks of Student"+(i+1)+":");
           marks[i] = scanner.nextInt();
           total = total + marks[i];
        }
        scanner.close();
        avg = total/6;
        System.out.print("The student Grade is: ");
        if(avg>=90)
        {
            System.out.print("A");
        }
        else if(avg>=70 && avg<90)
        {
           System.out.print("B");
        } 
        else if(avg>=50 && avg<70)
        {
            System.out.print("C");
        }
        else
        {
            System.out.print("D");
        }
    }
}