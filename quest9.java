//  sample program of tostring methods

class quest9
{
    static int x = 786;
    int y = 2024;
    static public void main(String[] args)
    {
       System.out.println("inside main");
       quest9 S1 = new quest9();
       System.out.println("default toString() return:"+S1);
       System.out.println("classes toString() return:" +S1.myToString());
    }

    public String myToString()
    {
        return "myTostring" + getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
}