import java.util.Scanner;

class astro
{
    public static void main(String[] args)
    {                                                  /*we can not change the object by creatingnew object*/ 
        //String name = "harry";
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the name:");
        String name = s.nextLine();
        CName(name);
        System.out.println(name);
    }

    static void CName(String naam)
    {
        naam = "jack";
    }
}
