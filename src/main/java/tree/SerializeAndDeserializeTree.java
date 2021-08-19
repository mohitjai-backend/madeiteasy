package main.java.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SerializeAndDeserializeTree {
    public static void main(String[] args) {
        TNode root = new TNode(1);
        root.left = new TNode(2);
        root.right = new TNode(3);
        root.left.left = new TNode(4);
        root.left.right = new TNode(5);

        SerializeAndDeserializeTree obj = new SerializeAndDeserializeTree();
        String s = obj.serialize(root);
        System.out.println(s);

        TNode deserializedRoot = obj.deserialize(s);
        System.out.println("Inorder Traversal:-");
        obj.printInOrder(deserializedRoot);
        System.out.println();
        System.out.println("Preorder Traversal:-");
        obj.printPreOrder(deserializedRoot);

    }

    void printPreOrder(TNode root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        printPreOrder(root.left);
        printPreOrder(root.right);
    }

    void printInOrder(TNode root) {
        if (root == null)
            return;
        printInOrder(root.left);
        System.out.print(root.data + " ");
        printInOrder(root.right);
    }

    String serialize(TNode root) {
        return serializeUtil(root, "");
    }

    String serializeUtil(TNode root, String s) {
        if (root == null) {
            return s + "null,";
        }

        s = s + String.valueOf(root.data) + ",";
        s = serializeUtil(root.left, s);
        s = serializeUtil(root.right, s);

        return s;
    }

    TNode deserialize(String s) {
        String[] data = s.split(",");
        List<String> dataList = new ArrayList<>(Arrays.asList(data));
        return deseralizeUtil(dataList);
    }

    TNode deseralizeUtil(List<String> dataList) {
        if (dataList.get(0).equals("null")) {
            dataList.remove(0);
            return null;
        }

        TNode root = new TNode(Integer.parseInt(dataList.get(0)));
        dataList.remove(0);
        root.left = deseralizeUtil(dataList);
        root.right = deseralizeUtil(dataList);

        return root;
    }
}

// https://leetcode.com/problems/serialize-and-deserialize-binary-tree/solution/