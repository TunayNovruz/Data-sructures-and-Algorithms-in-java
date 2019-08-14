package mycollection;
public class myPrint{
    public static void print(int [] args){
        for(int i:args){
            System.out.println(i);
        }
    }

    public static void print(String [] args){
        for(String str:args){
            System.out.println(str);
        }
    }

    public static void print(Object [] args){
        for(Object arr:args){
            System.out.println(arr.toString());
        }
    }
}