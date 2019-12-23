public class ByteShortInt {
    public static void main(String[] args) {

        // int has a width of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int myTotal = (myMinValue/2);
        System.out.println("myTotal = " + myTotal);

        // byte has a width of 8
        byte byteMaxValue = 127;
        byte byteMinValue = -128;
        byte myNewByteValue = (byte) (myMinValue/2);
        System.out.println("myNewByteValue = " + myNewByteValue);

        // short has a width of 16
        short shortMaxValue = 32767;
        short shortMinValue = -32768;
        short myNewShortValue = (short) (shortMaxValue / 2);

        // long has a width of 64
        long longMaxValue = 9_223_372_036_854_775_807L;
        long longMinValue = -9_223_372_036_854_775_808L;
        long myLongValue = 50_000L;

        System.out.println(myLongValue + (byteMaxValue * 10) + (myMinValue + shortMinValue));



    }
}
