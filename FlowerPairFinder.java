import java.util.*;

public class FlowerPairFinder {
    public static int[] findFlowerPair(int[] flowers, int t) {
        int left = 0;
        int right = flowers.length - 1;

        while (left < right) {
            int sum = flowers[left] + flowers[right];
            if (sum == t) {
                return new int[]{left, right}; // Return the indices of the pair
            } else if (sum < t) {
                left++; // Move the left pointer forward
            } else {
                right--; // Move the right pointer backward
            }
        }
        return new int[]{-1, -1}; // This case won't occur as per the problem statement
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of flower types (N): ");
        int n = sc.nextInt();

        System.out.println("Enter the flowers in non-decreasing order: ");
        int[] flowers = new int[n];
        for (int i = 0; i < n; i++) {
            flowers[i] = sc.nextInt();
        }

        System.out.println("Enter the total number of flowers required (t): ");
        int t = sc.nextInt();

        int[] result = findFlowerPair(flowers, t);
        System.out.println("Indexes of the flowers: " + result[0] + ", " + result[1]);
    }
}
