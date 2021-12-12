package mani.samples.arrays;

public class ReverseArray {
    int []arr;

    public ReverseArray(int []arr){
        this.arr = arr;
    }

    void reverse(){
        int start = 0;
        int end = arr.length - 1;
        while(start < end ){
            swapPos(start, end);
            start++;
            end--;

        }
    }

    void reverseRecursively(int start, int end){
        if (start > end ){
            return ;

        }
        swapPos(start, end);
        start++;
        end--;
        reverseRecursively(start, end);
    }

    void printArray(){
        for (int i : arr) {
            System.out.println(i);
        }

    }

    private void swapPos(int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

    }

    public static void main(String[] args) {
        int []array= {1,2,3,4,5};
        ReverseArray rv=new ReverseArray(array);
        rv.reverse();
        rv.printArray();
        rv.reverseRecursively(0,4);
        rv.printArray();
    }

}
