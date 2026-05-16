package com.junit5.src;

public class Demo {

    public int computeSquare(int num){
        return num*num;
    }

    public int[] doubles(int[] array){
        for(int i=0; i<array.length; i++){
            array[i] *= 2;
        }
        return array;
    }

}
