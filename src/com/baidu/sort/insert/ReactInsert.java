package com.baidu.sort.insert;

import com.baidu.sort.common.BetaUtil;

/**
 * Created by langshiquan on 17/4/16.
 */
public class ReactInsert {
    public static int[] sort(int[] numbers) {
        int temp;
        for (int i = 0; i < numbers.length; i++) {
            temp = numbers[i]; // 保留值,移动的时候会被覆盖
            for (int j = 0; j < i; j++) {
                // 寻找适合numbers[i]的位置
                if (numbers[i] > numbers[j]) {
                    // 向后移动一位
                    for (int k = i; k > j; k--) {
                        numbers[k] = numbers[k - 1];
                    }
                    // 将numbers[i]插入已经排好序的数组里
                    numbers[j] = temp;
                    BetaUtil.printArray(numbers);
                }
            }
            System.out.println("i=" + i);
            BetaUtil.printArray(numbers);
        }
        return numbers;
    }

    public static void main(String[] args) {
        int[] numbers = BetaUtil.mockIntArraySrc();
        BetaUtil.printArray(sort(numbers));
    }
}
