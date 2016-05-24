package com.company;

public class Sorter {

    private int []myArray;

    public Sorter(int []myArray) {
        this.myArray = myArray;
    }
    private  void swap (int []myArray, int index){
        int temp = myArray [index-1];
        myArray[index-1] = myArray[index];
        myArray[index] = temp;
    }
    //bubbleSort
    public int []bubbleSort(){
        int []resmyArray = myArray;

        for(int i = 1; i < resmyArray.length; i++) {
            for(int j = resmyArray.length-1; j>=i; j--) {
                if(resmyArray [j-1] > resmyArray[j])swap(resmyArray, j);
            }
        }

        return  resmyArray;
    }
    public int []selectSort(){
        int []resmyArray = myArray;
        int index = 0, min = 0;
        for (int i = 0; i < resmyArray.length; i++) {
            min =resmyArray[i];
            index = i;
            for (int j = i+1; j < resmyArray.length; j++){
                if(resmyArray[j] < min){
                    index = j;
                    min =resmyArray [j];
                }
            }
            if(resmyArray[i] != resmyArray[index]){
                resmyArray[index] = resmyArray[i];
                resmyArray[i] = min;
            }
        }
        return resmyArray;
    }
    /*public int []vstavkaSort(){
        int j, temp;
        for (int i = 0; i < myArray.length; i++){
            temp = myArray[i];
            for(j = i-1; j >= 0 && myArray[j] > temp; j--){
                myArray[j+1] = myArray[j];
            }
            myArray[j+1] = temp;
        }
    }*/

}
