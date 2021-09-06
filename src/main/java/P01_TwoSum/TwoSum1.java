package P01_TwoSum;

public class TwoSum1 {
    public static void main(String[] args) {
        int[] a = new int[]{2, 7, 11, 15};
        int b = 9;
        int[] c = twoSum(a, b);

        for (int i : c) {
            System.out.print(i + " ");
        }
    }

    public static int[] twoSum(int[] nums, int target) {

        int[] answer = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {

                int a = nums[i];
                int b = nums[j];

                if (i != j && (a + b == target)) {
//                    System.out.println(a + " + " + b + " = " + (a + b));
                    answer[0] = i;
                    answer[1] = j;
                    return answer;
                }

            }
        }
        return answer;
    }
}
