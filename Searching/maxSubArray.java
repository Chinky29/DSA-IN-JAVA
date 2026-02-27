public class maxSubArray {
    public static void maxSum(int num[]){
     int n=num.length;
     int sum[]=new int[10];
        for(int i=0;i<n;i++){
            
            for(int j=i;j<n;j++){
              sum[i]=sum[i]+num[j];

            } 
             System.out.println(sum[i-1]);
        }


    }
    public static void main(String args[]){
        int num[]={ 1,3,4,5};
        maxSum(num);
    }
}
