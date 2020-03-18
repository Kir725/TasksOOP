package com.kolmikra.tasksOOP.algebra;

import java.util.Objects;

public class MyComplex {
    private double real = 0.0;
    private double imag = 0.0;

    public MyComplex() {
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        return imag >= 0 ? "(" + real + "+" + imag + "i)" : "(" + real + imag + "i)";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyComplex myComplex = (MyComplex) o;
        return Double.compare(myComplex.real, real) == 0 &&
                Double.compare(myComplex.imag, imag) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(real, imag);
    }

    public boolean isReal() {
        return real != 0.0;
    }

    public boolean isImaginary() {
        return imag != 0.0;
    }

    public boolean equals(double real, double imag) {
        return this.real == real && this.imag == imag;
    }

    public boolean equals(MyComplex complex) {
        return equals(complex.real, complex.imag);
    }

    public double magnitude() {
        return Math.sqrt(Math.pow(real, 2) + Math.pow(imag, 2));
    }

    public double argument() {
        return Math.atan(imag / real);
    }

    public MyComplex add(MyComplex right) {
        this.real += right.real;
        this.imag += right.imag;
        return this;
    }

    public MyComplex addNew(MyComplex right) {
        return new MyComplex(this.real + right.real, this.imag + right.imag);
    }

    public MyComplex subtract(MyComplex right) {
        this.real = this.real + right.real * -1;
        this.imag = this.imag + right.imag * -1;
        return this;
    }

    public MyComplex subtractNew(MyComplex right) {
        return new MyComplex(this.real + right.real * -1, this.imag + right.imag * -1);
    }

    public MyComplex multiply(MyComplex right) {
        double realTemp = this.real * right.real - this.imag * right.imag;
        this.imag = this.real * right.imag + this.imag * right.real;
        this.real = realTemp;
        return this;
    }

    public MyComplex divide(MyComplex right) {
        double realTemp = (this.real * right.real + this.imag * right.imag) / (Math.pow(right.real, 2) + Math.pow(right.imag, 2));
        this.imag = (right.real * this.imag - right.imag * this.real) / (Math.pow(right.real, 2) + Math.pow(right.imag, 2));
        this.real = realTemp;
        return this;
    }


    public MyComplex conjugate() {
        return new MyComplex(this.real, this.imag * -1);
    }
}
