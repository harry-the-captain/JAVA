 class SGGS
 {
    static int x = 786;
    int y = 2024;
    
    static void main(String[] args)
    {
        System.out.println("inside main");
        SGGS s1= new SGGS();
        System.out.println("Default toString() return:" +s1);
        System.out.println("classes toString() return():" +s1.myToString());
    }

    public String myToString()
    {
        return "myToString" +getClass().getName() + "@" + Integer.toHexString(hashcode());
    }
}
