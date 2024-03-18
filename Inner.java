// Inner class in java program

class Inner
{
    int age;
    public void show()
    {
       System.out.println("in show"); 
    }

    class B
    {
        public void config()
        {
            System.out.println("in config");
        }
    }

    public static void main(String[] args)
    {
        A obj = new A();
        obj.show();
    }
}
