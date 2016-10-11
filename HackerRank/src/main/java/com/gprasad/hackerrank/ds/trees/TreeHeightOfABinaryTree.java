/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gprasad.hackerrank.ds.trees;

/**
 *
 * @author gq6pras
 */
public class TreeHeightOfABinaryTree {

    public static void main(String[] args) {

    }

    private static int height(Node root) {
        int leftHeight = 0;
        int rightHeight = 0;
        if (root != null) {
            leftHeight +=height(root.left);
            rightHeight+=height(root.right);
        }
        return leftHeight>rightHeight ? leftHeight:rightHeight;
    }
}
