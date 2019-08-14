package mani.samples.sorting;

public class SelectionSort {

    public static void main(String[] args) {
        int intArray[]= new int[]{22,15,-15,-22,55,35,7};

        int unSortedArrayIndex = intArray.length - 1;
        int largeIndex=0;
        for (int i = unSortedArrayIndex; i > 0 ; i--) {
            largeIndex=0;
            //Select a position of bigger number from each pass.
            for (int j = 1; j < i ; j++) {
                if(intArray[largeIndex] < intArray[j]){
                    largeIndex = j;
                }
            }
            swap(intArray,largeIndex,i);

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
