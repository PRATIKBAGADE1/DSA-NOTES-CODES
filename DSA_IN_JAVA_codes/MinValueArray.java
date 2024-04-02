///Program to find the minimum value of an array.


public class MinValueArray {
    public static void printArr(int[] arr)
    {
        int n = arr.length;
        for( int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static int MinValue(int[] arr)
    {
        int min = arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String args[])
    {
        int[] arr = {84,86,30,4,94,67,29};
        System.out.print("The array is given By:- ");
        printArr(arr);
        int p=MinValue(arr);
        System.out.print("The Minimum value of the array is:-"+p);

        

    }
    
}
