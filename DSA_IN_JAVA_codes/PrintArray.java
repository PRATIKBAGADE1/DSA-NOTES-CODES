class PrintArray{
    public void printarr(int[] myarr){
        int n=myarr.length;
        for(int i=0;i<n;i++)
        {
            System.out.print(myarr[i]+" ");
        }
        System.out.println();

    }
    public void arrayDemo()
    {
        int[] myarr = {5,8,9,4,3};
        System.out.print("\nThe Array is Given By:- ");
        printarr(myarr);
        System.out.println();
        
       
    }
    public static void main(String args[])
    {
        
       PrintArray p = new PrintArray();
       p.arrayDemo();
    }
}