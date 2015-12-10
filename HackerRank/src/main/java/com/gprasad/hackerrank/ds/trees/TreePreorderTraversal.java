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
public class TreePreorderTraversal {

    public static void main(String[] args) {

    }

    private static void preorder(Node root) {
        if (root != null) {
            System.out.println(root.data);
            preorder(root.left);
            preorder(root.right);
        }
    }
}
