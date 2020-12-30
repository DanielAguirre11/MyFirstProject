package com.qaagility.controller;

public class Counter {

    public int safeDivision(int dividento, int divisor) {
        if (divisor == 0) {
        	return Integer.MAX_VALUE;
        }
        else {
        	return dividento / divisor;
        }
    }

}
