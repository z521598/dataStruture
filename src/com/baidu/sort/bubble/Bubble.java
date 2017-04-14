package com.baidu.sort.bubble;

import com.baidu.sort.common.BetaUtil;
import com.baidu.sort.common.StabBetaObject;

/**
 * Created by langshiquan on 17/4/14.
 */
public class Bubble {
    public static int[] sort(int[] src) {
        // src.length - 1
        for (int i = 0; i < src.length - 1; i++) {
            // j >= 0
            for (int j = i; j >= 0; j--) {
                if (src[j] > src[j + 1]) {
                    int temp = src[j];
                    src[j] = src[j + 1];
                    src[j + 1] = temp;
                }
            }
        }
        return src;
    }

    public static StabBetaObject[] sort(StabBetaObject[] stabBetaObjects) {
        for (int i = 0; i < stabBetaObjects.length - 1; i++) {
            for (int j = i; j >= 0; j--) {
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
        int[] ints = BetaUtil.mockIntegerSrc();
        BetaUtil.printArray(sort(ints));

        StabBetaObject[] stabBetaObjects = BetaUtil.mockStabSrc();
        BetaUtil.printArray(sort(stabBetaObjects));
    }
}
