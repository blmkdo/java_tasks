//boltaev lazizbek: task: select sort with classes
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    private static void swap(int [] nums, int i, int min) {
      int swap = nums[min];
      nums[min] = nums[i];
      nums[i] = swap;
    }

    private static boolean less(Comparable nj, Comparable nm) {
        return nj.compareTo(nm) < 0;
    }

    public static void main(String[] args) {
        int[] nums = {50, 1, 101, 65, 10};
        int N = nums.length;

        for (int i = 0; i < N - 1; i++) {
            int min = i;

            for (int j = i + 1; j < N ; j++) {
                if (less(nums[j], nums[min])) {
                    min = j;
                }
            }
            if (min != i) {
                swap(nums, i, min);
            }
        }
        System.out.print(Arrays.toString(nums));
    }
}
