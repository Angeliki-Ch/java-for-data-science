package com.forte.maths;

public class ComplexNumber {

    // These fields represent the real and imaginary parts of the complex number
    private double real;
    private double imaginary;

    //I generated this constructor to allow us to create a complex number by providing
    // both real and imaginary parts.

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber(double real) {
        this.real = real;
        this.imaginary = 0;
    }

    // These are the getters or accessor functions that retrieve individual components.
    // I also generated these.

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    // These are the setters or mutator functions that allow us to change individual
    // components. I also generated these.

    public void setReal(double real) {
        this.real = real;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    // These are custom methods I wrote for the behaviour of complex numbers

    public double magnitude()   {
        return Math.sqrt(real * real + imaginary * imaginary);
    }

    public double phase() {
        return Math.atan2(imaginary, real);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ComplexNumber that = (ComplexNumber) o;

        if (Double.compare(that.real, real) != 0) return false;
        return Double.compare(that.imaginary, imaginary) == 0;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(real);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(imaginary);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {

        String answer = "";
        if ((real == 0D) && (imaginary == 0D)) {
            answer = "0";
        }
        else if (imaginary == 0) {
            answer = String.valueOf(real);
        }
        else if (real == 0) {
            answer = String.valueOf(imaginary) + "i";
        }
        else {
            if (imaginary > 0) {
                answer = String.valueOf(real) + " + " + String.valueOf(imaginary) + "i";
            }
            else {
                answer = String.valueOf(real) + " - " + String.valueOf(Math.abs(imaginary)) + "i";
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        ComplexNumber complexNumber = new ComplexNumber(5.7, 9.2);
        ComplexNumber complexNumber2 = new ComplexNumber(5.7);
        System.out.println(complexNumber.magnitude());
        System.out.println(complexNumber2.magnitude());
    }

}
