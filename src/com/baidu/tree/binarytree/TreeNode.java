package com.baidu.tree.binarytree;

/**
 * Created by Administrator on 2017/8/8.
 */
public class TreeNode<T extends Comparable>{
    T data;
    TreeNode<T> leftNode;
    TreeNode<T> rightNode;

    public TreeNode(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public TreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(TreeNode<T> leftNode) {
        this.leftNode = leftNode;
    }

    public TreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }

}
