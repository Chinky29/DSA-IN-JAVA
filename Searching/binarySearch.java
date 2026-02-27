import java.util.Scanner;

public class binarySearch {
    public static int BinarySearch(int []arr, int key){
        int start =0,end=arr.length-1;
        int mid=start+end/2;
         while(start<=end){
            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]<key){
                end=mid-1;;
            }
            else{
                start=mid+1;
            }
        }
         return -1;

    }
    public static void main(String agrs[]){
        int arr[]={10,20,30,40,50,60,70,80,90,100};
        Scanner sc= new Scanner(System.in);
        int target=sc.nextInt();
       sc.close();
            System.out.print(BinarySearch(arr,target));    


    }
}
