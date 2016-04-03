package com.forte.maths;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ComplexNumberTest {

    @Test
    public void shouldCorrectlyGetRealPart() {

        ComplexNumber cn1 = new ComplexNumber(6,-9);
        double expectedRealPart = 6.0;
        assertThat(cn1.getReal(), is(expectedRealPart));

    }

    @Test
    public void shouldCorrectlyGetImaginaryPart() {

        ComplexNumber cn1 = new ComplexNumber(6,-9);
        double expectedImaginaryPart = -9.0;
        assertThat(cn1.getImaginary(), is(expectedImaginaryPart));

    }

    @Test
    public void shouldCorrectlyPrintComplexNumbersWithBothParts() {

        ComplexNumber cn1 = new ComplexNumber(5,-9);
        String expectedString = "5.0 - 9.0i";
        assertThat(cn1.toString(), is(expectedString));

    }

    @Test
    public void shouldCorrectlyPrintComplexNumbersWithOnlyImaginaryPart() {

        ComplexNumber cn1 = new ComplexNumber(0,-9);
        String expectedString = "-9.0i";
        assertThat(cn1.toString(), is(expectedString));

    }

    @Test
    public void shouldCorrectlyPrintComplexNumbersWithOnlyRealPart() {

        ComplexNumber cn1 = new ComplexNumber(5,0);
        String expectedString = "5.0";
        assertThat(cn1.toString(), is(expectedString));

    }

    @Test
    public void shouldCorrectlyComputeMagnitude() {

        ComplexNumber cn1 = new ComplexNumber(3,4);
        double expectedMagnitude = 5.0;
        assertThat(cn1.magnitude(), is(expectedMagnitude));

    }

    @Test
    public void shouldCorrectlyComputePhase() {

        ComplexNumber cn1 = new ComplexNumber(4,4);
        double expectedPhase = Math.PI/4.0;
        assertThat(cn1.phase(), is(expectedPhase));

    }

}
