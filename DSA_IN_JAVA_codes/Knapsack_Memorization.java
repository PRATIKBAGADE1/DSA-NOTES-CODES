

public class Knapsack_Memorization {
        
    static int max(int a, int b)
    {
        return  (a>b) ? a:b ;
    }

    static int knapSack(int wt[],int val[],int W,int n ,int t[][])
    {
        if(W==0||n==0)
        {
            return 0;
        }

        if(t[n][W] != -1)
        {                                             //if the value in the matrix is not -1 then directly return the matrix value
            return t[n][W];
        }

        if(wt[n-1]<=W)
        {
            return t[n][W]= max(val[n-1]+knapSack(wt, val, W-wt[n-1], n-1,t),knapSack(wt, val, W, n-1,t));
        }
        else
        {
           return t[n][W] = knapSack(wt, val, W, n,t);
        }
    }

    static int KnapSack(int wt[],int val[],int W,int N)
    {
        int t[][] = new int[N + 1][W + 1];                  //we made a matrix

        for (int i = 0; i < N + 1; i++)                   //In the matrix we put all the values to -1
            for (int j = 0; j < W + 1; j++)
                t[i][j] = -1;
 
        return knapSack( wt, val,W, N, t);
    }
    public static void main(String[] args) {
        int profit[]=new int[] {20,40,60};
        int Weight[]=new int[] {10,20,30};
        int W = 30;
        int N =profit.length;
        System.out.println("The Maximum value is :"+KnapSack(Weight,profit,W,N));
        
    }
    
}
