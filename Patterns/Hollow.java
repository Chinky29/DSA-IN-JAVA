public class Hollow {
    public static void main(String args[]){
        for(int i=1;i<=4;i++){
         
              for(int j=1;j<=4;j++){
                if(i==1 || i==4 |j==1|| j==4){
                System.out.print("*");}
                else{
              System.out.print(" ");
                    }
           
        
              }System.out.println();
          }
          
    }
}


// * * * * *
// *       *  
// *       *
// * * * * *

// import java.util.*;
// class Main {
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         int n= sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int k=1;k<=n;k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }



//     *****
//    *****
//   *****
//  *****
// *****