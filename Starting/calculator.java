
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int a,b;
       a =sc.nextInt();
       b = sc.nextInt();
       System.out.println("enter operator");
       char c = sc.next().charAt(0);
       switch(c){
        case '+':
        System.out.println(a+b); break;
        case '-':
        System.out.println(a-b); break;
        case '*':
        System.out.println(a*b); break;
        case '/':
        System.out.println(a/b); break;
        case '%':
        System.out.println(a%b); break;
        default:
        System.out.println("wrong operator"); break;

       }

sc.close();
    }
    
}
