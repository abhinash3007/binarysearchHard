package BINARYSEARCH_PART2;

public class NthRoot {
    public static int pow(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

    public static void root(int start, int end, int n, int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int midPow = pow(mid, n);

            if (midPow == target) {
                System.out.println("Cube root found: " + mid);
                return; // Exit the loop and method if the root is found
            } else if (midPow < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println("No cube root found.");
    }

    public static void main(String[] args) {
        root(1, 90, 5, 32);
    }
}
