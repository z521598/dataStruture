package com.baidu.sort.quick;

import com.baidu.sort.common.BetaUtil;

/**
 * Created by langshiquan on 17/4/15.
 */
public class Quick {

    public static int partition(int[] array, int left, int right) {
        // 固定的切分方式
        while (left < right) {
            while (array[right] >= array[left] && right > left) { // 从前半部分向后扫描,如果比较左侧和右侧,直到左侧小于右侧。
                right--;
            }
            swap(array, left, right);
            while (array[left] <= array[right] && right > left) { // 从后半部分向前扫描,如果比较右侧和左侧,直到左侧大于右侧。
                left++;
            }
            swap(array, left, right);
        }
        return right; // return left / right 都一样，两者相等
    }

    public static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    public static int[] sort(int[] array, int left, int right) {
        if (left < right) {  // 递归出口
            int index = partition(array, left, right);   // 寻找中间点,分成2段
            sort(array, left, index - 1);    // 左侧
            sort(array, index + 1, right);   // 右侧
        }
        return array;
    }

    public static int[] sort(int[] numbers) {
        int low = 0;
        int high = numbers.length - 1;
        sort(numbers, low, high);
        return numbers;
    }

    public static void main(String[] args) {
        int[] numbers = BetaUtil.mockIntArraySrc();
        BetaUtil.printArray(sort(numbers));
    }
}
