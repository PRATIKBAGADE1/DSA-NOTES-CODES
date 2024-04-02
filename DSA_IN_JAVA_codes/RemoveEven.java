public class RemoveEven {
     public static int[] RemovEvenNo(int[] arr)
    {
        int oddCount = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2 != 0)
            {                                        //counting odd array
                 oddCount++;
            }
        }

        int[] oddarr = new int[oddCount];             //creating new array for odd integers
        int idx = 0;
        for(int i=0;i<arr.length;i++)
        {
           if(arr[i]%2 != 0)
           {                                         
            oddarr[idx] = arr[i];
            idx++;
           }
        }
        return oddarr;

    }
    public static void printa(int[] arr)                     //printing array
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }    
    public static void main(String args[])               //main method
    {
       int[] arr = {3,2,4,7,10,6,5}; 
       System.out.print("\nThe Origional array is given by :- ");
       printa(arr);
       int[] oddarr = RemovEvenNo(arr);
       System.out.print("\nThe array having only Odd element is given by :- ");
       printa(oddarr);
       
    }
}
