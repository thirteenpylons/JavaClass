package com.company;

public class Main {

    public static void main(String[] args) {
        int myValue = 1000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Minimum Integer Value = " + myMinIntValue);
        System.out.println("Maximum Integer Value = " + myMaxIntValue);
        System.out.println("Max Int value overflow = " + (myMaxIntValue + 1));
        System.out.println("Min Int value underflow = " + (myMinIntValue - 1));

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println("Minimum Byte Value = " + myMinByteValue);
        System.out.println("Maximum Byte Value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        System.out.println("Minimum Short Value = " + myMinShortValue);
        System.out.println("Maximum Short Value = " + myMaxShortValue);

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;

        System.out.println("Minimum Float Value = " + myMinFloatValue);
        System.out.println("Maximum Float Value = " + myMaxFloatValue);

        long myLongValue = 100l;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;

        System.out.println(myLongValue);
        System.out.println("Minimum Long Value = " + myMinLongValue);
        System.out.println("Maximum Long Value = " + myMaxLongValue);

        int myTotal = (myMinIntValue / 2);

        byte myNewByteValue = (byte) (myMinByteValue / 2);

        short myNewShortValue = (short) (myMinShortValue / 2);

        byte challengeByte = 125;

        short challengeShort = 3267;

        int challengeInt = 7483647;

        long challengeLong = 50000 + 10*(challengeByte + challengeShort + challengeInt);

        System.out.println("5000 + the byte + the short + the int = " + challengeLong);

        double myDoubleMinValue = Double.MIN_VALUE;
        double myDoubleMaxValue = Double.MAX_VALUE;

        System.out.println("Double Minimum Value = " + myDoubleMinValue);
        System.out.println("Double Maximum Value = " + myDoubleMaxValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        double toKilo = 0.45359237d;
        double lbs = 200d;
        double convertLbs = lbs * toKilo;
        System.out.println(convertLbs);

    }
}
