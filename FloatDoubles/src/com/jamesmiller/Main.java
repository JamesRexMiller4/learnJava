package com.jamesmiller;

public class Main {

    public static void main(String[] args) {
	    float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        int myIntValue = 4;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;

//        Pounds to Kilograms
        int myLovelyLumpsInPounds = 42;
        double myLovelyLumpsInKG = myLovelyLumpsInPounds * .45359237;

        System.out.println("My pounds = " + myLovelyLumpsInPounds);
        System.out.println("My kilograms = " + myLovelyLumpsInKG);
    }
}
