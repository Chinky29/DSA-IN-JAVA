public class largest {
    public static int largestnumber(int []nums){
        int largest=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>largest)
                largest=nums[i];

        }
        return largest;



    }
    public static void main(String[] args) {
        int arr[]={10,20,30,55,85,45,544,44,11};
        System.out.println(largestnumber(arr));


        
    }
}
//