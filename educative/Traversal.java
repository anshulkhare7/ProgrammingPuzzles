package educative;

class Traversal{

    static void forwardTraversal(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ "");
        }
    }

    static void backwardTraversal(int[] arr){
        for(int i = arr.length-1; i >= 0; i--){
            System.out.print(arr[i]+ "");
        }
    }
}