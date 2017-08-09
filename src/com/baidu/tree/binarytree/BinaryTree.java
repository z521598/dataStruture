package com.baidu.tree.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Administrator on 2017/8/10.
 */
//        Binary Sort Tree，又称二叉查找树（Binary Search Tree），亦称二叉搜索树。
//        若左子树不空，则左子树上所有结点的值均小于或等于它的根结点的值；
//        若右子树不空，则右子树上所有结点的值均大于或等于它的根结点的值；
//        左、右子树也分别为二叉排序树；
//        没有键值相等的节点（no duplicate nodes）。
public class BinaryTree<T extends Comparable> {
    TreeNode root;//树根

    public void insert(T data) {
        TreeNode<T> node = new TreeNode<>(data);
        //根节点
        if (root == null) {
            root = node;
        } else {
            // 存储当前节点
            TreeNode current = root;
            // 存储父节点
            TreeNode parent;
            // 寻找插入位置
            while (true) {
                parent = current;
                // 如果 新节点 < 当前节点
                if (node.getData().compareTo(current.getData()) < 0) {
                    current = current.getLeftNode();
                    if (current == null) {
                        parent.setLeftNode(node);
                        // 插入完成之后，跳出循环
                        return;
                    }
                } else {
                    current = current.getRightNode();
                    if (current == null) {
                        parent.setRightNode(node);
                        return;
                    }
                }

            }
        }

    }

    public void displayTree() {
       inOrder(root,6);
    }

    public void find() {
    }

    public void delete() {
    }

    private void inOrder(TreeNode localRoot,int i) {
        if (localRoot != null) {
            i--;
            localRoot.display();
            inOrder(localRoot.getRightNode(),i);//调用自身来遍历右子树
            System.out.println();
        }
    }
    private void preOrder(TreeNode localRoot,int i) {
        if (localRoot != null) {
            localRoot.display();
            preOrder(localRoot.getLeftNode(),i);//调用自身来遍历左子树
            preOrder(localRoot.getRightNode(),i);//调用自身来遍历右子树
            System.out.println();
            i--;
        }
    }

    // FIXME
    private  ArrayList printFromTopToBottom(TreeNode root) {
        ArrayList res = new  ArrayList();
        Queue<TreeNode> node =  new LinkedList<>();
        if(root == null){
            return res;
        }
        res.add(root.getData());
        node.add(root);
        while(node.size()!=0){
            root = node.poll();
            if(root.getLeftNode()!=null){
                res.add(root.getLeftNode().getData());
                node.add(root.getLeftNode());
            }
            if(root.getRightNode()!=null){
                res.add(root.getRightNode().getData());
                node.add(root.getRightNode());
            }
        }
        return res;
    }



}
