package BINARYSEARCH_PART2;

public class KthMissingNumber {
    public static void missing(int[] arr, int start, int end, int n) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int missing = arr[mid] - mid + 1;
            if (missing <= n) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }System.out.println(start+n);
    }
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 7, 11 };
        missing(arr,0,arr.length-1,5);
    }
}
