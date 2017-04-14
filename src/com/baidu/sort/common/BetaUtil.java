package com.baidu.sort.common;

/**
 * Created by langshiquan on 17/4/14.
 */
public class BetaSourceUtil {
    public static int[] mockIntegerSrc() {
        return new int[] {343, 654, 23, 9, 432, 456, 546, 123, 9876, 2, 5, 6, 343, 654};
    }

    public static StabBetaObject[] mockStabSrc() {
        StabBetaObject stab1 = new StabBetaObject(343, "1");
        StabBetaObject stab2 = new StabBetaObject(456, "1");
        StabBetaObject stab3 = new StabBetaObject(343, "2");
        StabBetaObject stab4 = new StabBetaObject(456, "2");
        StabBetaObject stab5 = new StabBetaObject(343, "3");
        StabBetaObject stab6 = new StabBetaObject(456, "3");
        StabBetaObject stab7 = new StabBetaObject(343, "4");
        StabBetaObject stab8 = new StabBetaObject(9876, "1");
        StabBetaObject stab9 = new StabBetaObject(654, "1");
        StabBetaObject stab10 = new StabBetaObject(9876, "2");
        StabBetaObject stab11 = new StabBetaObject(2, "1");
        StabBetaObject stab12 = new StabBetaObject(654, "2");
        StabBetaObject stab13 = new StabBetaObject(2, "2");

        return new StabBetaObject[] {stab1, stab2, stab3, stab4, stab5, stab6, stab7, stab8, stab9, stab10, stab11,
                stab12, stab13};
    }

    public static void printArray(StabBetaObject[] stabBetaObjects) {
        for (int i = 0; i < stabBetaObjects.length; i++) {
            StabBetaObject stabBetaObject = stabBetaObjects[i];
            System.out.println("i : " + stabBetaObject.getI() + " originOrder : " + stabBetaObject.getOrder());
        }
    }

    public static void printArray(int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }

    }
}
