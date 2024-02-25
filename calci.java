import java.util.Scanner;

class calci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter first num");
        int num1 = s.nextInt();
        System.out.println("enter second num");
        int num2 = s.nextInt();
        System.out.println("Select Symbol(+,-,*,/,%,log)");
        String sym = s.next();
        int res;
        switch(sym){

              case "+": res = num1+num2;
                        System.out.println("Addition is:"+res);
                        break;
        }


    }
}
