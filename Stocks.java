public class Stocks {
    public static int buySell(int a[]){
        int bp=Integer.MAX_VALUE;
        int maxp=0;
        for(int i=0;i<a.length;i++){
            if(bp<a[i]){
                int p=a[i]-bp;
                maxp=Math.max(maxp,p);
            }
            else{
                bp=a[i];
            }
        }
        return maxp;
    }
    public static void main(String[] args){
        int prices[]={7,1,5,3,6,4};
        System.out.println(buySell(prices));
    }
}
