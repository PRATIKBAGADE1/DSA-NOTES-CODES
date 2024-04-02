public class Top_Down_knapsack {

    static int KnapSack(int wt,int val,int w,int n)
    {

        int t = new int[w][n];
        for(int i=1;i<=(n+1);i++)
        {
            for(int j=1;j<=(w+1);j++)
            {
                if(wt[i-1]<=j)
                {
                     t[j][i]=max(val[i-1]+ t[j-wt[i-1]] [i-1] , t[j][i-1]);
                }
                else
                {
                   t[j][i]=t[j][i-1];
                }
            }
        }
        return t[j][i];
    }
    public static void main(String[] args) 
    {
        int profit[] = {60,100,120};
        int weight[] = {10,20,30};
        int w = 30;
        int n = profit.length;
        System.out.println("The Maximun Profit is :"+KnapSack(weight, profit, w, n));
    }
    
}
