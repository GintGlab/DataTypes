import java.util.Arrays;



public class Main {
    public static void main(String[] args) {
        byte minByte = -128;
        byte maxByte = 127;
        short minShort = -32768;
        short maxShort = 32767;
        int minint = -2147483648;
        int maxInt = 2147483647;
        long minLong = -9223372036854775808l;
        long maxLong = 9223372036854775807l;
        float minFloat = -3.4e38f;
        float maxFloat =  3.4e38f;
        double minDouble = -1.7e-308;
        double maxDouble = 1.7e308;
        char minChar = '\u0000';
        char maxChar = '\uffff';
        boolean isTrue = true;
        boolean isFalse = false;

        String str = "I love Java";

        int[] intArr = new int[] {1,2,3,4,5};
        String[] strings = new String[] {
                "banana",
                "orange",
                "potato"
        };


        System.out.println(
                "Primitives: "
                        + "\n\tmin byte: " + minByte + "\n\tmax byte: " + maxByte
                        + "\n\tmin short: " + minShort + "\n\tmax short: " + maxShort
                        + "\n\tmin int: " + minint + "\n\tmax int: " + maxInt
                        + "\n\tmin long: " + minLong + "\n\tmax long: " + maxLong
                        + "\n\tmin float: " + minFloat + "\n\tmax float: " + maxFloat
                        + "\n\tmin double: " + minDouble + "\n\tmax double: " + maxDouble
                        + "\n\tmin char: " + minChar + "\n\tmax char: " + maxChar
                        + "\n\ttrue boolean: " + isTrue + "\n\tfalse boolean: " + isFalse
                        + "\nNot Primitives: "
                        + "\n\tstring: " + str
                        + "\n\tint Array: " + Arrays.toString(intArr)
                        + "\n\tstring Array " + Arrays.deepToString(strings)
        );
    }
}