package problems;

/**
 * two_sum
 */
public class two_sum {

    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int a[] = new int[2];
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    a[0] = i;
                    a[1] = j;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 7, 8 };
        int result[] = twoSum(a, 12);
        for (int i : result) {
            System.out.println(i);
        }
    }
}