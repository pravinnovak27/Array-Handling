package jfk;

public class SmallestNum {
    public static void main(String args[]){
        int temp, size;
        int array[] = {2, 15, 36, 6, 79, -19};
        size = array.length;
  
        for(int i = 0; i<size; i++ ){
           for(int j = i+1; j<size; j++){
              if(array[i]>array[j]){
                 temp = array[i];
                 array[i] = array[j];
                 array[j] = temp;
              }
           }
        }
        System.out.println("Smallest element in array is: "+array[0]);
     }
}
