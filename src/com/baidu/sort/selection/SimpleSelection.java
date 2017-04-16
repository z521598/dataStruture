package com.baidu.sort.selection;

import com.baidu.sort.common.BetaUtil;

/**
 * Created by langshiquan on 17/4/16.
 */
public class SimpleSelection {
    public static int[] sort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int max = i;    // 存储最大元素的索引
            // 寻找最大元素
            for (int j = i; j < numbers.length; j++) {
                if (numbers[j] > numbers[max]) {
                    max = j;
                }
            }
            int temp = numbers[i];
            numbers[i] = numbers[max];
            numbers[max] = temp;
            BetaUtil.printArray(numbers);
        }
        return numbers;
    }

    public static int[] sortV2(int[] numbers) {
        int temp;
        int right = numbers.length - 1;
        int left = 0;
        while (right > left) {
            int maxIndex = right;
            int minIndex = left;
            for (int i = left; i < right; i++) {
                if (numbers[i] > numbers[maxIndex]) {
                    maxIndex = i;
                }
                if (numbers[i] < numbers[minIndex]) {
                    minIndex = i;
                }
            }
            temp = numbers[right];
            numbers[right] = numbers[maxIndex];
            numbers[maxIndex] = temp;


            temp = numbers[left];
            numbers[left] = numbers[minIndex];
            numbers[minIndex] = temp;

            right--;
            left++;
            BetaUtil.printArray(numbers);
        }

        return numbers;
    }

    public static void main(String[] args) {
        int[] numbers = BetaUtil.mockIntArraySrc();
        BetaUtil.printArray(sort(numbers));
        BetaUtil.printArray(sortV2(numbers));
    }
}
