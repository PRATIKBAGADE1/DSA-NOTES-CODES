public class FindMissingNo {
    public static int MissingNo(int[] arr)
    {
        int n = arr.length+1;
        int sum = n*(n+1)/2;
        for (int num : arr) 
        {
            sum = sum-num;
        }
        return sum;
    }
    public static void main(String args[])
    {
        int[] arr = {2,7,9,8,5,3,1,4};
        int p =  MissingNo(arr);
        System.out.println("The missing no is :-"+p);

    }
}
