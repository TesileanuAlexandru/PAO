package pachet1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args){

        byte[] bytes;
        bytes = new byte[5];
        bytes[0] = -128;
        bytes[4] = 127;
        for (byte i = 0; i < bytes.length; ++i){
            System.out.println(bytes[i]);
        }

        short[] shortArr;
        boolean [] boolArray = new boolean[4];

        int[] ints = new int []{12,55, 11, 22};
        /* <=>
        int[] ints = new int[4];
        ints[0] = 12;
        ints[1] = 55;
        ints[2] = 11;
        ints[3] = 22;
        <=> */
        int[] anotherIntArray = {12, 55, 11, 22};
        System.out.println(anotherIntArray);
        System.out.println(Arrays.toString(anotherIntArray)); // ctr+clic -> documentatie

        int[][] intMatrix = new int[3][3];
        intMatrix[0][0] = 0;
        intMatrix[2][2] = 23;
        for (int i[] : intMatrix){
            for(int j :i){
                System.out.print(j + " ");
            }
            System.out.println();
        }

        char [][] multidmCharArray = {{'c','p',}, {'a'}, {'j', 'a', 'v', 'a'}};
        System.out.println(multidmCharArray);

        int[][] ints1= new int[3][];
        ints1[0] = new int[2];
        ints1[0][0] = 1;
        ints1[0][1] = 2;
        ints1[1] = new int[]{3,4, 404};
        ints1[2] = new int[]{33, 44};

        displayArrayValues(ints1);

    }

    private static void displayArrayValues(int[][] input){
        for (int i[] : input){
            for( int j : i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
