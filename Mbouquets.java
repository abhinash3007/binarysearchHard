package BINARYSEARCH_PART2;

public class Mbouquets {
    public static int bouquets(int[] arr, int k,int days) {
        int consecutiveFlower = 0;
        int totalBoquets = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= days) {
                consecutiveFlower++;
                if (consecutiveFlower == k) {
                    totalBoquets++;
                    consecutiveFlower = 0;
                }
            } else {
                consecutiveFlower = 0;
            }
        }
        return totalBoquets;
    }

    public static void search(int[] arr, int start, int end, int k, int m) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (bouquets(arr, k, mid) >= m) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        System.out.println(start);
    }

    public static void main(String[] args) {
        int[] arr = { 7, 7, 7, 7, 15, 9, 12, 7 };
        search(arr, 0, Integer.MAX_VALUE, 3, 2);
    }
}
