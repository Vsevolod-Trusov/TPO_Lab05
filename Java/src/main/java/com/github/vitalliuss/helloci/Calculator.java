package com.github.vitalliuss.helloci;

public class Calculator {
    public int getAmount(int term, int anotherTerm) {
        return term + anotherTerm;
    }

    public int getDifference(int term, int anotherTerm) {
        return term - anotherTerm;
    }

    public int getProduct(int term, int anotherTerm) {
        return term * anotherTerm;
    }

    public double getQuotient(int term, int anotherTerm) {
       if(anotherTerm == 0) throw new IllegalArgumentException("The second term cannot be zero");
        return (double) term / (double) anotherTerm;
    }

    public int getRemainder(int term, int anotherTerm) {
        return term % anotherTerm;
    }

    public double getTan(double term) {
        return Math.tan(term);
    }

    public double getSin(double term) {
        return Math.sin(term);
    }
    public double getCos(double term) {
        return Math.cos(term);
    }
    public double getCtan(double term) {
        return (double)1/Math.tan(term);
    }

    public double getLog(double term) {
        return Math.log(term);
    }

    public double getLn(double term) {
        return Math.log10(term);
    }

    public double getArcsin(double term) {
        return Math.asin(term);
    }

    public double getArccos(double term) {
        return Math.acos(term);
    }

    public double getArctan(double term) {
        return Math.atan(term);
    }

    public double getArccotan(double term) {
        return (double)1/Math.atan(term);
    }
}
