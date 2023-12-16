package mani.samples.patterns;
/*
given pattern
*****
*****
*****
*****
*****
*****

 */
public class First {
    public static void main(String[] args) {
        printStar();
        print90DegreeTriangle();
        print90DegreeTriangleWithNumbers();
        print90DegreeTriangleWithSameNumbers();
        print90DegreeReverseTriangle();
        print90DegreeReverseTriangleWithNumber();
        printIsoscelesTriangle();
        System.out.println("Reverse");
        printReverseIsoscelesTriangle();
        printBinaryTriangle();
    }

    private static void printBinaryTriangle() {
        for (int i = 1; i <= 5; i++) {
            if(i % 2 == 0){
                for (int j = 0; j < i; j++) {
                    System.out.print(j%2);
                }
            }else{
                for (int j = 1; j <= i; j++) {
                    System.out.print(j%2);
                }
            }

            System.out.println();
        }
    }

    private static void printReverseIsoscelesTriangle() {
        int numStar = 9;
        for (int i = 0; i < 5; i++) {

            for(int j = 0;j<i;j++){
                System.out.print(" ");
            }
            for(int k = 0;k< numStar;k++){
                System.out.print("*");
            }
            System.out.println();
            numStar -= 2;
        }
    }
    private static void printIsoscelesTriangle() {
        int numStar = 1;
        for (int i = 4; i >=0; i--) {

            for(int j = 0;j<i;j++){
                System.out.print(" ");
            }
            for(int k = 0;k< numStar;k++){
                System.out.print("*");
            }
            System.out.println();
            numStar +=2;
        }
    }

    private static void print90DegreeTriangleWithSameNumbers() {
        for (int i = 1; i < 6; i++) {
            for(int j=1; j<= i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    private static void print90DegreeTriangleWithNumbers() {
        for (int i = 1; i <= 6; i++) {
            for(int j=1; j< i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    private static void print90DegreeReverseTriangleWithNumber() {
        for (int i = 5; i >= 0; i--) {
            for(int j=1; j<= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    private static void print90DegreeTriangle() {
        for (int i = 0; i < 6; i++) {
            for(int j=0; j< i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    private static void print90DegreeReverseTriangle() {
        for (int i = 5; i >= 0; i--) {
            for(int j=0; j< i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void printStar() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
