package mani.samples.sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int intArray[]= new int[]{22,15,-15,-22,55,35,7};


        for (int i=1; i < intArray.length;  i++) {
            int key=intArray[i];
            int j=i-1;
            while(j>=0 && intArray[j] > key){
                intArray[j+1]= intArray[j];
                j--;
            }
            intArray[j+1]=key;
        }
        for (int i=0;i < intArray.length;i++){
            System.out.println(intArray[i]);
        }
    }


}
