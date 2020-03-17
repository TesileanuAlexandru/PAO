package pachet1;

import java.util.Arrays;

public class Ex5 {
    public static void main(String[] args){
        int[] ints = {2, 5, 555, 7 ,0, 22, 55, -234, 77};
        System.out.println(Arrays.binarySearch(ints, 555)); //If not found returns insertion point
        Arrays.sort(ints);
        System.out.println(Arrays.toString(ints));
        System.out.println(Arrays.binarySearch(ints, 555));
    }
}
