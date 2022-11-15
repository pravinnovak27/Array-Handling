package jfk;

public class LargestNumber {
    public static void main(String[] args) {
        double[] numArray = { 30, 55, 66.5, 94.3, 70.2, 80 };
        double largest = numArray[0];

        for (double num: numArray) {
            if(largest < num)
                largest = num;
        }

        System.out.format("Largest element = %.2f", largest);
    }
}
