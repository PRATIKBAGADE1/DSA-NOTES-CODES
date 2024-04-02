import java.util.Scanner;
public class ReverseArray {
    public static void printArr(int[] arr)
    {
      int n=arr.length;
      for(int i=0;i<n;i++)
      {
        System.out.print(arr[i]+" ");
      }
      System.out.println();
    }

    public static void ReverssArr( int[] arr,int start,int end)
    {
       while(start<end)
       {
         int temp = arr[start];
         arr[start] = arr[end];
         arr[end] = temp;
         start++;
         end--;
       }
    }
    public static void main(String args[])
    {
        // int[] arr = {2,11,5,10,7,8};
        System.out.print("Enter the size of an Array:-");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int[] arr =new int[a];
        System.out.print("Enter the Array Elements:-");
        for(int i=0;i<a;i++)
        {
            arr[i]=sc.nextInt();

        }
        System.out.print("The Array is given By:-");
        printArr(arr);
        System.out.print("The Reverse of the Array is given By:-");
        ReverssArr(arr,0,arr.length-1);
        printArr(arr);

        
    }
}
