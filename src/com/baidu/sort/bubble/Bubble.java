package com.baidu.sort.bubble;

import com.baidu.sort.common.BetaSourceUtil;

/**
 * Created by langshiquan on 17/4/14.
 */
public class bubble {
    public static int[] sort(int[] src) {
        for (int i = 0; i < src.length - 1; i++) {
            for (int j = i; j > 0; j--) {
                if (src[i] > src[i + 1]) {
                    int temp = src[i];
                    src[i] = src[i + 1];
                    src[i + 1] = temp;
                }
            }
        }
        return src;
    }

    public static void main(String[] args) {
        BetaSourceUtil.printArray(sort(BetaSourceUtil.mockIntegerSrc()));
    }
}
