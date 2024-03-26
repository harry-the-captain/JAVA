class College
{
    String collegeName;
    College( String collegeName)
    {
        this.collegeName=collegeName;
    }

    class Dept
    {
        String deptName;
        Dept(String deptName)
        {
            this.deptName=deptName;
        }
    }
    
    public static void main(String[] args)
    {
        College C = new College("SGGS");
        Dept D = C.new Dept("IT");
        System.out.println(C.collegeName);
        System.out.println("deptName" +C);
        

        
    }
}