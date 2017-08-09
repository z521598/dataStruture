package com.baidu.tree.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Administrator on 2017/8/8.
 */
public class Main {

    public static void main(String[] args) {

        BinaryTree<String> binaryTree = new BinaryTree<>();
        //                123
        //         1             1234
        //            12               12345
        //                                 12345678
        binaryTree.insert("123");
        binaryTree.insert("1");
        binaryTree.insert("1234");
        binaryTree.insert("12345");
        binaryTree.insert("12");
        binaryTree.insert("12345678");
        binaryTree.displayTree();

    }
}
