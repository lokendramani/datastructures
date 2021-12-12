package mani.samples.arrays;

public class MinMaxPair {
    public MinMaxPair() {

    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    int min;
    int max;

    MinMaxPair(int m, int n){
        min = m;
        max= n;
    }
}
