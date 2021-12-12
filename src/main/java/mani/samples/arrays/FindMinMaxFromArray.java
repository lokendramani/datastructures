package mani.samples.arrays;

public class FindMinMaxFromArray {
    int []arr;

    FindMinMaxFromArray(int []arr){
        this.arr = arr;
    }

    MinMaxPair findMinMaxFromArrayLinearWay(){
        int min;
        int max;
        if(arr.length == 1 )
        {
            min = arr[0];
            max = arr[0];
            return new MinMaxPair(min,max);
        }

        if (arr[0] > arr[1]){
            min = arr[1];
            max = arr[0];
        }else{
            min = arr[0];
            max = arr[1];
        }

        for (int i = 2; i < arr.length; i++) {
            if(min > arr[i]){
                min = arr[i];
            }
            if(max < arr[i]){
                max = arr[i];
            }
        }

        return  new MinMaxPair(min,max);

    }

    MinMaxPair getMinMaxRecursiveWay(int left,int right){
        MinMaxPair minMaxPair = new MinMaxPair();
        if(left == right){
            minMaxPair.setMax(left);
            minMaxPair.setMin(left);
            return  minMaxPair;
        }
        if(right - left == 1){
            if( arr[left] > arr[right]){
                minMaxPair.setMin(arr[right]);
                minMaxPair.setMax(arr[left]);
            }else{
                minMaxPair.setMin(arr[left]);
                minMaxPair.setMax(arr[right]);
            }
            return minMaxPair;
        }
        MinMaxPair minMaxPairLeft = getMinMaxRecursiveWay(left, (left+right)/2);
        MinMaxPair minMaxPairRight = getMinMaxRecursiveWay(((left+right)/2)+1, right);
        if(minMaxPairLeft.getMin() < minMaxPairRight.getMin()){
            minMaxPair.setMin(minMaxPairLeft.getMin());
        }else{
            minMaxPair.setMin(minMaxPairRight.getMin());
        }

        if(minMaxPairLeft.getMax() < minMaxPairRight.getMax()){
            minMaxPair.setMax(minMaxPairRight.getMax());
        }else{
            minMaxPair.setMax(minMaxPairLeft.getMax());
        }

        return minMaxPair;


    }

    void printArray(){
        for (int i : arr) {
            System.out.print(i + ", ");
        }

    }

    public static void main(String[] args) {
        int []array= {21,32,11,2,13,1,8};
        FindMinMaxFromArray rv=new FindMinMaxFromArray(array);
        rv.printArray();
        MinMaxPair minMaxPair = rv.findMinMaxFromArrayLinearWay();
        System.out.println("Minimum & Maximum Value from array:"+minMaxPair.getMin() + ", "+ minMaxPair.getMax());
        minMaxPair = rv.getMinMaxRecursiveWay(0,6);
        System.out.println("Minimum & Maximum Value from array:"+minMaxPair.getMin() + ", "+ minMaxPair.getMax());
    }

}
