package com.mel.java8.interfaceother;

import com.mel.java8.interfaces.Compute;

/**
 * Created by mpais on 1/4/17.
 */
public class ComputeUsage {

    private Compute compute;


    public double calculate(double a, double b) {
        return compute.area(a, b);

    }

    public double compute(double a, double b) {
        return compute.compute(a, b);
    }
}
