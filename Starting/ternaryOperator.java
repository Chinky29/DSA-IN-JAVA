import java.util.Scanner;

public class ternaryOperator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        String b = (a%2==0)?"even number":"odd number";
        System.out.println(b);
        sc.close();


    }
}