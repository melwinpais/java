package com.mel.java8.interfaces;

public interface Compute {

    default double area(double length, double width) {
        return length * width;
    }

    double compute(double length, double width);

}
