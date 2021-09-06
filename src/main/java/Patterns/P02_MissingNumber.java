package Patterns;

import java.util.Arrays;

public class P02_MissingNumber {

    public int missingNumber(int[] nums) {

        int n = nums.length;
        // Сумма арифметической прогрессии
        int sumArProgression = (0 + n + 1) * n / 2;

        // Сумма элементов массива
        int sum = Arrays.stream(nums).sum();

        int element = sumArProgression - sum;

        return element;
    }

}
