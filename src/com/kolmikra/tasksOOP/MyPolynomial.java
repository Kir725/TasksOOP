package com.kolmikra.tasksOOP;

import java.util.Arrays;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double... coeffs) {
        this.coeffs = new double[coeffs.length];
        for (int i = 0; i < coeffs.length; i++) {
            this.coeffs[coeffs.length - i - 1] = coeffs[i];
        }

    }

    public int getDegree() {
        return coeffs.length - 1;
    }

    @Override
    public String toString() {
        StringBuilder polynomialString = new StringBuilder();
        for (int i = coeffs.length - 1; i > 0; i--) {
            polynomialString.append(coeffs[i])
                            .append("x^")
                            .append(i)
                            .append(" + ");
        }
        polynomialString.append(coeffs[0]);
        return polynomialString.toString();
    }

    public double getCoefficient(int power) {
        if (power > this.coeffs.length) {
            return 0;
        }
        return coeffs[power];
    }

    public double evaluate(double x) {
        int answer = 0;
        for (int i = coeffs.length - 1; i > 0; i--) {
            answer += coeffs[i] * Math.pow(x, i);
        }
        answer += coeffs[0];
        return answer;
    }

    public MyPolynomial add(MyPolynomial right) {
        int maxLengh = Math.max(this.coeffs.length, right.coeffs.length);
        double[] addResult = new double[maxLengh];
        for (int i = 0; i < maxLengh; i++) {
            addResult[maxLengh - i - 1] = this.getCoefficient(i) + right.getCoefficient(i);
        }
        return new MyPolynomial(addResult);
    }

    public MyPolynomial multiply(MyPolynomial right) {
        int multSize = (coeffs.length + right.coeffs.length) - 1;
        double[] multResult = new double[multSize];
        for (int i = 0; i < coeffs.length; i++) {
            for (int j = 0; j < right.coeffs.length; j++) {
                multResult[multSize - 1 - (i + j)] += this.getCoefficient(i) * right.getCoefficient(j);
            }
        }
        return new MyPolynomial(multResult);
    }

}
