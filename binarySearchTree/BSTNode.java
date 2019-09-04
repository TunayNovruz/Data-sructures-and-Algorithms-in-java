package binarySearchTree;

class BSTNode <T extends Integer> {
    T data;
    BSTNode <T> right;
    BSTNode <T> left;

    BSTNode(T value){
        data = value;
    }
}