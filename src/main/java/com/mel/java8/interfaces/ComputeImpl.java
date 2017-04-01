package com.mel.java8.interfaces;

public class ComputeImpl  implements Compute {

    @Override
    public double compute(double length, double width) {
        return area(length,width);
    }
}
