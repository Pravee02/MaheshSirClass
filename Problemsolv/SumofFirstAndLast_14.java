public class SumofFirstAndLast_14 
{ 
    static  int sumOfFirstAndLast(int[] arr)
    {
        int sum = arr[0] + arr[arr.length-1];
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = { 20};
        System.out.println(sumOfFirstAndLast(arr));
    }
}
