package P01_TwoSum;

import java.util.HashMap;

public class TwoSum2 {
    public static void main(String[] args) {
        int[] a = new int[]{2, 7, 11, 15};
        int b = 9;
        int[] c = twoSum(a, b);

        for (int i : c) {
            System.out.print(i + " ");
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];

        for (int index = 0; index < nums.length; index++) {
            int element = nums[index];
            int diff = target - element;

            if (map.containsKey(diff)) {
                result = new int[]{map.get(diff), index};
            }else {
                map.put(element, index);
            }
        }
        return result;
    }
}
