public class Pairs {
    public static void printPairs(int num[]){
        int n=num.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                System.out.print(num[i]+","+num[j] +" ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args){
        int num[]={ 2,4,5,7,8,9,1};
        printPairs(num);

    }
    
}
