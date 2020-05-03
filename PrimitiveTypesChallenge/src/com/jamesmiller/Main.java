package com.jamesmiller;

public class Main {

    public static void main(String[] args) {
        byte aNewNewByteValue = 8;
        short aNewNewShortValue = 16;
        int aNewNewIntValue = 32;
        long aNewNewLongValue = 50000L + (10L * (aNewNewByteValue + aNewNewShortValue + aNewNewIntValue));
        System.out.println(aNewNewLongValue);
    }
}
