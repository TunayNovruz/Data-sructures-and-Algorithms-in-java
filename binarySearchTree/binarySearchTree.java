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

    // rekursiv üsul tam deyil,gələcəkdə birdə baxacam
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

    BSTNode<T> findByValue(T value){    
        return findFromNode(root,value);
    }

    BSTNode<T> findFromNode(BSTNode<T> node , T value){

        BSTNode<T> result = new BSTNode<T>(null);
        if(node != null){
            if(node.data == value){
                result = node;
            }
            else if(node.data <= value && node.left != null){
                result = findFromNode(node.left,value);
            }
            else if(node.right != null){
                result =  findFromNode(node.right, value);
            }
        }
        return result;
       
    }

    void deleteByValue(T value){
       root =  deleteFromNode(root,value);
    }

    BSTNode<T> deleteFromNode(BSTNode<T>node,T value){
        //əgər node nulldursa deməli treedə bu qiymət yoxdu
        if(node == null){
            return root;
        }

        if( value < node.data){
            node.left = deleteFromNode(node.left,value);
        }else if(value > node.data){
            node.right = deleteFromNode(node.right, value);
        }else{
            //demeli sileceyimiz nodu tapdiq
            
            //eger hec bir childi yoxdursa
            if(node.right == null && node.left == null){
                node = null;
            }
            //eger iki childi varsa 
            else if(node.right != null && node.left != null){
                //indi bu nodu evezleyeceyimiz sagdaki en kicik nodu tapaq
                T minimum =  findMinimum(node.right);
                node.data = minimum;
                //artiq datamizi sildik amma minimumdan iki eded var demeli onu silmek lazimdi
                deleteFromNode(node.right,minimum);
            }
            //herhansi bir node nulldursa
            else {
                if(node.right == null){
                    node = node.left;
                }else{
                    node = node.right;
                }
            }        
        }
        return node;
    }

    T findMinimum(BSTNode <T> node){
        T min = node.data;
        BSTNode <T>  temp = node;
        while(temp.left != null){
            min = temp.left.data;
            temp = temp.left;            
        }

        return min;
    }

    void display(){
        displayFromNode(root);
    }
    void displayFromNode(BSTNode<T> node){
        if(node == null){
            return;
        }
        System.out.print("-"+node.data);
        displayFromNode(node.left);    
        displayFromNode(node.right);
    }
}