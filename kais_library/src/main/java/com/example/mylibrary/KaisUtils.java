package com.example.mylibrary;

public class KaisUtils {
    public static int plus(int a, int b) {
        return a + b;
    }

    public static double max(double[] vals) {
        return vals[argmax(vals)];
    }

    public static int argmax(double[] vals) {
        if (vals == null || vals.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        int argmax = 0;
        for (int i = 1; i < vals.length; i++) {
            if (vals[i]>vals[argmax]) {
                argmax = i;
            }
        }
        return argmax;
    }

    public static double min(double[] vals) {
        return vals[argmin(vals)];
    }

    public static int argmin(double[] vals) {
        if (vals == null || vals.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        int argmax = 0;
        for (int i = 1; i < vals.length; i++) {
            if (vals[i] < vals[argmax]) {
                argmax = i;
            }
        }
        return argmax;
    }

    public static double amplitudeToDB (double val) {
        if (val == 0) throw new IllegalArgumentException("Argument should not be zero");
        return 20*Math.log10(val);
    }


}
