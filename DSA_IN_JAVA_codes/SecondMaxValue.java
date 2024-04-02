// Program to find second maximum value of an array

public class SecondMaxValue {
    public static void PrintArr(int[] arr)
    {
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
           System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static int secondMax(int[] arr)
    { 
        int max = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                secondmax = max;
                max = arr[i];
            }
            else if(arr[i]>secondmax && arr[i] != max)
            {
                secondmax = arr[i];
            }

            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return secondmax;
        
    
    } 
    public static void main(String args[])
    {
        int[] arr={3,545,643,657,3657,3678,4534,653};
        System.out.print("The Array is Given As Follows :- ");
        PrintArr(arr);
        int p=secondMax(arr);
        System.out.print("The second maximum value of an array is :- "+p);


    }
}
