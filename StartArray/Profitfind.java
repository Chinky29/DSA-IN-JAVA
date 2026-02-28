public class Profitfind {
    public static void profit(int n[]){
        int buyprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<6;i++){
            
            if(buyprice<n[i]){
               
                int profit=n[i]-buyprice;
                maxprofit=Math.max(profit,maxprofit);}
                else
                buyprice=n[i];

            
        }
        if(maxprofit<0)
            System.out.println(0);
        else
            System.out.println(maxprofit);


    }
    public static void main(String args[]){
        int n[]={7,1,5,3,6,4};
        profit(n);
    }
    
}
