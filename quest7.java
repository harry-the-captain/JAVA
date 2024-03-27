// method overriding program

class vehicle
{
    void run()
    {
        System.out.println("vehicle is running");
    
    }

}

class quest7 extends vehicle
{

    void run()
    {
        System.out.println("vehicle is running safely");
    }
    public static void main(String[] args)
    {
        quest7 Q = new quest7();
        Q.run();
    }
}