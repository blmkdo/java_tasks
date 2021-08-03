//boltaev lazizbek: task: select sort
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {50, 1, 101, 65, 10};
        int N = nums.length;

        for (int i = 0; i < N - 1; i++) {
            int min = i;

            for (int j = i + 1; j < N ; j++) {
                if (nums[j] < nums[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int swap = nums[min];
                nums[min] = nums[i];
                nums[i] = swap;
            }
        }
        System.out.print(Arrays.toString(nums));
    }
}

