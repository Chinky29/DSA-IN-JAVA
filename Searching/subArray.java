public class subArray {
    
    public static void PrintArray(int num[]){
        int n=num.length,sum=0,max=0;
        for(int i=0;i<n;i++){
            
            for(int j=i+1;j<n;j++){
                sum=0;
                for(int k=i;k<j;k++){
                    System.out.print(num[k]+ " ");//printing subarrays
                    sum=sum+num[k];//subarray sum
                }
                if(max<sum){ //finding maximum sum
                    max=sum;
                }
                System.out.print(" ");
                System.out.println("sum "+sum);

            }
             System.out.println(" ");
        }
System.out.println("maxsum "+ max);

    }
    public static void main(String args[]){
        int num[]={ 1,3,4,5,65,64,52,23};
        PrintArray(num);
    }
}
