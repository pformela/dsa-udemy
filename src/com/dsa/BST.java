package com.dsa;

public class BST {

    public static class Node {
        Node left;
        Node right;
        int value;

        Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public static class BinarySearchTree {
        Node root;

        public BinarySearchTree() {
            this.root = null;
        }

        public void insert(int value) {

            Node newNode = new Node(value);
            Node currNode = this.root;

            if(this.root == null) {
                this.root = newNode;
                return;
            }

            while (true) {
                if(newNode.value >= currNode.value)
                    if(currNode.right != null) {
                        currNode = currNode.right;
                    } else {
                        currNode.right = newNode;
                        break;
                    }
                else {
                    if(currNode.left != null) {
                        currNode = currNode.left;
                    } else {
                        currNode.left = newNode;
                        break;
                    }
                }
            }

        }


        public int lookup(int value) {

            Node currNode = this.root;

            while (currNode != null) {
                if(currNode.value == value)
                    return value;
                else if(value > currNode.value)
                    currNode = currNode.right;
                else
                    currNode = currNode.left;
            }

            return -1;
        }

    }

    public static void main(String[] args) {
        BinarySearchTree myBst = new BinarySearchTree();

        myBst.insert(9);
        myBst.insert(4);
        myBst.insert(6);
        myBst.insert(20);
        myBst.insert(170);
        myBst.insert(15);
        myBst.insert(1);

        System.out.println(myBst.root);

        System.out.println(myBst.lookup(20));
        System.out.println(myBst.lookup(21));
        System.out.println(myBst.lookup(1));

    }

}
