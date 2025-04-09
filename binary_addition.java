import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("1st input:");
        String b1 = sc.nextLine();    
        
        System.out.println("2nd input:");
        String b2 = sc.nextLine();
        
        int num1 = Integer.parseInt(b1,2);
        int num2 = Integer.parseInt(b1,2);
        int sum = num1 + num2;
        String res = Integer.toBinaryString(sum);
        System.out.println("output:"+res);
        
    }
}
