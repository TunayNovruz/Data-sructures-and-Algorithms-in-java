package stack ;

class StackNode<T> {
    T data;
    StackNode <T> next;
    StackNode(T value){
        data = value;
    }
}