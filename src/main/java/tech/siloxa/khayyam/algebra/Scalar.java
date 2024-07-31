package tech.siloxa.khayyam.algebra;

import java.util.Objects;

public class Scalar<T extends Number> {

    private final T scalar;

    public Scalar(T scalar) {
        this.scalar = scalar;
    }

    public static <T extends Number> Scalar<T> of(T scalar) {
        return new Scalar<T>(scalar);
    }

    public T value() {
        return scalar;
    }

    public boolean equals(T value) {
        return Objects.equals(scalar, value);
    }

    @Override
    public String toString() {
        return String.valueOf(scalar);
    }

    public void print() {
        System.out.println(this);
    }
}
