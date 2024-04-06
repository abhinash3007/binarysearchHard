package BINARYSEARCH_PART2;

import java.util.Arrays;

//import java.util.Arrays;

public class AggressiveCows {
    public static int totalCows(int[] arr, int dis) {
        Arrays.sort(arr);
        int lastPos = arr[0];
        int cows = 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] - lastPos >= dis) {
                cows++;
                lastPos = arr[i];
            }
        }
        return cows;
    }

    public static void distance(int[] arr, int start, int end, int k) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (totalCows(arr, mid) >= k) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println(start);
    }

    public static void main(String[] args) {
        int[] arr = {0,3,4,7,10,9};
        distance(arr, 0, Integer.MAX_VALUE, 4);
    }
}
