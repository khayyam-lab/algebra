package tech.siloxa.khayyam.algebra;

import java.util.Objects;

public class Scalar {

    private final Double scalar;

    public Scalar(Number scalar) {
        this.scalar = Double.valueOf(scalar.toString());
    }

    public static Scalar of(Number scalar) {
        return new Scalar(scalar);
    }

    public Double value() {
        return scalar;
    }

    public boolean equals(Number value) {
        return Objects.equals(scalar, Double.valueOf(value.toString()));
    }

    @Override
    public String toString() {
        return String.valueOf(scalar);
    }

    public void print() {
        System.out.println(this);
    }
}
