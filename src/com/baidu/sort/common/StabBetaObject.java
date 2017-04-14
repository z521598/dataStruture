package com.baidu.sort.common;

/**
 * Created by langshiquan on 17/4/14.
 */
public class StabBetaObject implements Comparable {
    private int i;

    private String order;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public StabBetaObject(int i, String order) {
        this.i = i;
        this.order = order;
    }

    @Override
    public int compareTo(Object o) {
        return this.getI() - ((StabBetaObject) o).getI();
    }
}
