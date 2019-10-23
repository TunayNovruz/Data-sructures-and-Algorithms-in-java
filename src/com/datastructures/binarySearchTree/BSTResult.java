package com.datastructures.binarySearchTree;
import com.datastructures.binarySearchTree.BinarySearchTree;

class BSTResult {
    public static void main(String args[]){
        BinarySearchTree <Integer> myTree = new BinarySearchTree<Integer>();
        
        myTree.insert(10);
        myTree.insert(8);        
        myTree.insert(7);
        myTree.insert(9);
        myTree.insert(6);
        myTree.insert(13);
        myTree.insert(11);
        myTree.insert(12);
        myTree.insert(14);

        //myTree.deleteByValue(14);
        
        System.err.println(myTree.root.right.data);

        BSTNode <Integer> found = myTree.findByValue(11);

        System.out.println("tapilan: "+found.data);

        myTree.display();

        
    }
}