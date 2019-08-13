package mani.samples.sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int intArray[]= new int[]{22,15,-15,-22,55,35,7};

        int unSortedArrayIndex = intArray.length - 1;
        for (int i = unSortedArrayIndex; i > 0 ; i--) {
            for (int j = 0; j < i ; j++) {
                if(intArray[j] > intArray[j+1]){
                    swap(intArray,j, j+1);
                }
            }

        }

       for (int i=0;i < intArray.length;i++){
           System.out.println(intArray[i]);
       }
    }

    static void swap(int arr[],int i,int j){
        if(arr[i] == arr[j])
            return;
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j] = temp;
     }
}
