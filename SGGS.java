
    class SGGS
    {
        static int a=122;

        SGGS()
        {
            System.out.println("SGGS");
        }

        static
        {
            a=234;
            System.out.println("SGGS static");
        }

        public static void main(String[] args)
        {
            A sggs = new A();
            SGGS sggs1= new SGGS();
        }
    }
    class A
{
    static
    {
        System.out.println("A");
    }
}
