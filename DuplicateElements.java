package jfk;

public class DuplicateElements {
    public static void main(String[] args){
        int[]arr=new int[] {2, 3, 5, 1, 2, 9, 7, 5, 1, 9};
        System.out.println("Duplicate Elements of the given array: ");
        for(int i =0;i <arr.length; i++) {
            for(int j = i+1; j<arr.length;j++){
                if(arr[i] == arr[j])
                System.out.println(arr[j]);
            }
        }
    }
}
