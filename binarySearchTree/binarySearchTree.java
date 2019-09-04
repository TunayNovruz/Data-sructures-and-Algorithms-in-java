package binarySearchTree;
import binarySearchTree.BSTNode;

class BinarySearchTree <T extends Integer> {
    BSTNode  <T> root;
    int height;

    void insert (T value){
        BSTNode <T> newChild = new BSTNode<T>(value);
        
        if(root == null){
            root = newChild;
        }else{
            BSTNode <T> temp = root;
            while(temp != null){
                if(newChild.data <= temp.data){
                    if(temp.left == null){
                        temp.left = newChild;
                        return;
                    }
                    temp = temp.left;
                }else{
                    if(temp.right == null){
                        temp.right = newChild;
                        return;
                    }
                    temp = temp.right;
                }
            }
            temp = newChild;
            System.out.println(temp.data + "inserted");
        }

        
        //addChild(root,newChild);
    }
    void addChild(BSTNode<T>node, BSTNode<T>child){
        if(node == null){
            node = child;
        }else{
            if(child.data <= node.data){
                addChild(node.left,child);
            }else{
                addChild(node.right,child);
            }
        }
    }

}