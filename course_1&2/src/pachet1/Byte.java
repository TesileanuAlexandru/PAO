package pachet1;

public class Byte {
    static byte defaultValue;
    public static void main(String[] args){
        // byte --> 8-bit integer value
        byte b1 = -128; // Local variables must be initialized
        System.out.println(b1);

        byte b2 = 127;
        System.out.println(b2);
        b2++;

        System.out.println(b2);

        byte b3 = (byte)12345;
        System.out.println(b3);

        System.out.println(defaultValue);

        // short --> 16-bit integer value

        short s = 12_234;
    }
}