import java.util.Scanner;



                        // *
                        // **
                        // ***
                        // ****
// 

                            // 1 
                            // 1 2
                            // 1 2 3
                            // 1 2 3 4
                            // 1 2 3 4 5

// public class RightTri {
//     public static void main(String args[]){
//         Scanner sc= new Scanner(System.in);
//         int n=sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(j+" ");

//             }
//             System.out.println("");
//         }
//     }
// }




                            // A 
                            // B C
                            // D E F
                            // G H I J

public class RightTri {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        char ch='A';
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch+" ");
                ch++;

            }
            System.out.println("");
        }
    }
}

                                // * * * * * 
                                // * * * *
                                // * * *
                                // * *
                                // *

// public class RightTri {
//     public static void main(String args[]){
//         Scanner sc= new Scanner(System.in);
//         int n=sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=n;j>=i;j--){
//                 System.out.print("* ");

//             }
//             System.out.println("");
//         }
//     }
// }
