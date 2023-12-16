package mani.samples.arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int []arr = new int[n];
        int incrementSeries=0;
        int decrementSeries = 0;
        for(int i =0;i<n; i++){
            arr[i] = s.nextInt();
        }
        boolean increment = false;
        boolean decrement = false;
        if (n == 1) {
            System.out.println(true);
        }

        for(int i =0;i<n-1; i++){
            if(arr[i] < arr[i+1]){
                if(increment == false){
                 incrementSeries++;
                 increment = true;
                }
            }else if(arr[i] > arr[i+1]){
                if(decrement == false){
                    decrementSeries++;
                    decrement = true;
                }
            }else{
                System.out.println(false);
                return;
            }

        }
        if(incrementSeries == decrementSeries && incrementSeries > 1){
            System.out.println(false);
        }else if (incrementSeries == decrementSeries && incrementSeries == 1){
            System.out.println(true);
        }else if((incrementSeries == 1 && decrementSeries == 0) || decrementSeries == 1 && incrementSeries == 0 ){
            System.out.println(true);
        }

    }

}

