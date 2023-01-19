public class trappedRainWater {
    public static int trapped(int ht[]){
        int trappedwater=0;
        int n=ht.length;
        //auxilary array for LEFT MAX BOUNDARY
        int lmax[]=new int[n];
        lmax[0]=ht[0];
        for (int i = 1; i < n; i++) {
            lmax[i]=Math.max(ht[i],lmax[i-1]);
        }
        //auxilary array for RIGHT MAX BOUANDARY
        int rmax[]=new int[n];
        rmax[n-1]=ht[n-1];
        for (int i = n-2; i >=0 ; i--) {
            rmax[i]=Math.max(ht[i],rmax[i+1]);
        }
        //calc trapped water using WATERLEVEL=MIN(LEFTMAX,RIGHTMAX)
        //TRAPPEDWATER+=WL-HT[I]
        int wl;
        for (int i = 0; i < n; i++) {
            wl=Math.min(lmax[i],rmax[i]);
            trappedwater+=wl-ht[i];
        }
        return trappedwater;
    }
    public static void main(String[] args) {
        int ht[]={4,2,0,6,3,2,5};
        int x=trapped(ht);
        System.out.println(x);
    }
}
