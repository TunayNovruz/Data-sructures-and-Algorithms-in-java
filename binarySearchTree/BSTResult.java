package binarySearchTree;
import binarySearchTree.BinarySearchTree;

class BSTResult {
    public static void main(String args[]){
        BinarySearchTree <Integer> myTree = new BinarySearchTree<Integer>();
        
        myTree.insert(5);
        myTree.insert(6);
        myTree.insert(4);
        myTree.insert(8);
        
        System.err.println(myTree.root.data);
        System.err.println(myTree.root.left.data);
        System.err.println(myTree.root.right.right.data);
    }
}