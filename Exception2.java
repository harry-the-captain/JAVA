class Exception2
{
    public static void main(String[] args)
    {
        try{
            System.out.println(args[0]);
        }

        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("inside catch");
        }

        finally
        {
            System.out.println("inside finnally");
        }
}
}