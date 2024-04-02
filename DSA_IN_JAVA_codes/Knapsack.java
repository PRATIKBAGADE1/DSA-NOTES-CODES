//   "0/1" Knapsack problem   

class Knapsack{
    static int max(int a, int b) 
    { 
        return (a > b) ? a : b;
     }

    static int knapSack(int wt[],int val[],int W,int n)
    {
       if(n==0||W==0)
       {
        return 0;
       }

       if(wt[n-1]<=W)
       {
           return max(val[n-1]+knapSack(wt,val,W-wt[n-1],n-1),knapSack(wt,val,W,n-1));
       }
       else 
       {
        return knapSack(wt,val,W,n-1);           //wt(n-1)>w
       }
    }
    public static void main(String[] args)
     {
        int profit[] = new int[] {60,100,120};
        int weight[] = new int[] {10,20,30};
        int W =30;
        int n =profit.length;
        System.out.println(knapSack(weight,profit,W,n));
        
    }

}