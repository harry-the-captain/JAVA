import java.util.Scanner;

class Maximum
{
  int a,b,c;
  
    public Maximum()
	{
		
  	 Scanner s = new Scanner(System.in);

  System.out.println("First number:");
     a = s.nextInt();
	
	 System.out.println("Second	 number:" );
	   b = s.nextInt();
	 
     System.out.println("Third number:" );
	   c = s.nextInt();
	}

  
  public void great()
  {
     
            
     if((a>b) && (a>c))
	 {
	   System.out.println("max number:"+a);
	 }
	 else if((b>a) && (b>c))
	 {
	   System.out.println("max number:"+b);
	 }
	 else
	 {
	   System.out.println("max number:"+c);
	 }
	 
	 
}

public static void main(String[] args)
 {
    Maximum m = new Maximum();
	m.great();
  }
	
}
