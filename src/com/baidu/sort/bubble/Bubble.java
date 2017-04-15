package com.baidu.sort.bubble;

import com.baidu.sort.common.BetaUtil;
import com.baidu.sort.common.StabBetaObject;

/**
 * Created by langshiquan on 17/4/14.
 */
public class Bubble {
    public static int[] sort(int[] src) {
        // src.length - 1
        for (int i = 0; i < src.length; i++) {
            for (int j = src.length - 1; j > i; j--) {
                if (src[j] > src[j - 1]) {
                    int temp = src[j];
                    src[j] = src[j - 1];
                    src[j - 1] = temp;
                }
                BetaUtil.printArray(src);
            }
            System.out.print("i=" + i + ":");
            BetaUtil.printArray(src);
        }
        return src;
    }

    // 第一次改进
    public static int[] sortV2(int[] src) {
        for (int i = 0; i < src.length; i++) {
            // 每次先重置为false
            boolean isSwaped = false;
            for (int j = src.length - 1; j > i; j--) {
                if (src[j] > src[j - 1]) {
                    int temp = src[j];
                    src[j] = src[j - 1];
                    src[j - 1] = temp;
                    isSwaped = true;
                }
                BetaUtil.printArray(src);
            }
            // 如果上一次扫描没有发生交换，则说明数组已经全部有序，退出循环
            if (!isSwaped) {
                break;
            }
            System.out.print("i=" + i + ": ");
            BetaUtil.printArray(src);
        }
        return src;
    }

    // 第二次改进，双向冒泡
    public static int[] sortV3(int[] src) {
        int temp;
        int low = 0;
        int high = src.length - 1;
        int counter = 0; // 测试计数器
        while (high > low) {
            System.out.println("high=" + high);
            for (int i = low; i < high; i++) {   //正向冒泡，确定最大值
                if (src[i] > src[i + 1]) {  //如果前一位大于后一位，交换位置
                    temp = src[i];
                    src[i] = src[i + 1];
                    src[i + 1] = temp;
                }
                BetaUtil.printArray(src);
            }
            high--;
            System.out.println("low=" + low);
            for (int j = high; j > low; j--) {   //反向冒泡，确定最小值
                if (src[j] < src[j - 1]) {  //如果前一位大于后一位，交换位置
                    temp = src[j];
                    src[j] = src[j - 1];
                    src[j - 1] = temp;
                }
                BetaUtil.printArray(src);
            }
            low++;

            System.out.print("counter= " + (counter++) + ": ");
            BetaUtil.printArray(src);
        }
        return src;
    }

    public static StabBetaObject[] sort(StabBetaObject[] stabBetaObjects) {
        for (int i = 0; i < stabBetaObjects.length; i++) {
            for (int j = stabBetaObjects.length - 1; j > i; j--) {
                // >= , > 影响稳定性
                // 当'>'，则稳定
                // 当'>='，则不稳定
                if (stabBetaObjects[j].compareTo(stabBetaObjects[j + 1]) >= 0) {
                    StabBetaObject temp = stabBetaObjects[j];
                    stabBetaObjects[j] = stabBetaObjects[j + 1];
                    stabBetaObjects[j + 1] = temp;
                }
            }
        }
        return stabBetaObjects;
    }

    public static void main(String[] args) {
        int[] numbers = BetaUtil.mockIntArraySrc();
        BetaUtil.printArray(sortV3(numbers));
    }
}
