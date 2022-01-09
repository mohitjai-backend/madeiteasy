package main.java.tree;

import java.util.HashMap;
import java.util.Map;

public class ConstructBinaryTreeFromPreorderAndInorder {

    Map<Integer, Integer> inorderIndexMap;
    int                   preorderIndex;

    public static void main(String[] args) {
        int preorder[] = { 3, 9, 1, 2, 20, 15, 7 };
        int inorder[] = { 1, 9, 2, 3, 15, 20, 7 };

        ConstructBinaryTreeFromPreorderAndInorder obj = new ConstructBinaryTreeFromPreorderAndInorder();
        TNode root = obj.constructTree(inorder, preorder);
        obj.printInorderTree(root);
    }

    TNode constructTree(int inorder[], int preorder[]) {
        inorderIndexMap = new HashMap<>();
        preorderIndex = 0;
        for (int i = 0; i < inorder.length; i++) {
            inorderIndexMap.put(inorder[i], i);
        }

        return constructTreeUtil(preorder, 0, preorder.length - 1);
    }

    TNode constructTreeUtil(int preorder[], int left, int right) {
        if (left > right)
            return null;

        int rootValue = preorder[preorderIndex++];

        TNode root = new TNode(rootValue);

        root.left = constructTreeUtil(preorder, left, inorderIndexMap.get(rootValue) - 1);
        root.right = constructTreeUtil(preorder, inorderIndexMap.get(rootValue) + 1, right);
        return root;
    }

    void printInorderTree(TNode root) {
        if (root == null)
            return;
        printInorderTree(root.left);
        System.out.print(root.data + " ");
        printInorderTree(root.right);
    }
}

// https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/solution/
