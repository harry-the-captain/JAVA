class Father 
{
    int balance;
    static String name;
    static boolean status;
    public static void main(String[] args)
    {
        Father son = new Father();
        System.out.println(son.balance);
        System.out.println(Father.name);
        System.out.println(Father.status);
    }
}
