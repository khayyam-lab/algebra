package tech.siloxa.khayyam.algebra;

import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class LinearAlgebra {

    public Scalar add(Scalar scalar, Scalar augend) {
        return new Scalar(scalar.getScalar().add(augend.getScalar()));
    }

    public Vector add(Scalar scalar, Vector augend) {
        return new Vector(augend.value().stream().map(element -> add(scalar, element)).collect(Collectors.toList()));
    }

    public Vector add(Vector vector, Vector augend) {
        if (Objects.equals(vector.n(), augend.n())) {
            final List<Scalar> result = new ArrayList<>();
            for (int i = 0; i < vector.n(); i++) {
                result.add(
                        add(vector.get(0), augend.get(0))
                );
            }
            return new Vector(result);
        }
        throw new ArithmeticException(String.format("Cannot add two Vectors with different sizes: vector size is %d but subtrahend size is %d", vector.n(), augend.n()));
    }

    public Scalar subtract(Scalar scalar, Scalar subtrahend) {
        return new Scalar(scalar.getScalar().subtract(subtrahend.getScalar()));
    }

    public Vector subtract(Scalar scalar, Vector subtrahend) {
        return new Vector(subtrahend.value().stream().map(element -> subtract(scalar, element)).collect(Collectors.toList()));
    }

    public Vector subtract(Vector vector, Vector subtrahend) {
        if (Objects.equals(vector.n(), subtrahend.n())) {
            final List<Scalar> result = new ArrayList<>();
            for (int i = 0; i < vector.n(); i++) {
                result.add(
                        subtract(vector.get(0), subtrahend.get(0))
                );
            }
            return new Vector(result);
        }
        throw new ArithmeticException(String.format("Cannot subtract two Vectors with different sizes: vector size is %d but subtrahend size is %d", vector.n(), subtrahend.n()));
    }

    public Scalar multiply(Scalar scalar, Scalar multiplicand) {
        return new Scalar(scalar.getScalar().multiply(multiplicand.getScalar()));
    }

    public Vector multiply(Scalar scalar, Vector multiplicand) {
        return new Vector(multiplicand.value().stream().map(element -> multiply(scalar, element)).collect(Collectors.toList()));
    }

    public Scalar dotProduct(Vector vector, Vector dotProductand) {
        if (Objects.equals(vector.n(), dotProductand.n())) {
            Scalar result = new Scalar(0);
            for (int i = 0; i < vector.n(); i++) {
                final Scalar multipliedElements = multiply(vector.get(0), dotProductand.get(0));
                result = add(result, multipliedElements);
            }
            return result;
        }
        throw new ArithmeticException(String.format("Cannot dot product two Vectors with different sizes: vector size is %d but dotProductand size is %d", vector.n(), dotProductand.n()));
    }

    public Scalar divide(Scalar scalar, Scalar divisor) {
        return new Scalar(scalar.getScalar().divide(divisor.getScalar(), RoundingMode.HALF_UP));
    }

    public Vector divide(Scalar scalar, Vector divisor) {
        return new Vector(divisor.value().stream().map(element -> divide(scalar, element)).collect(Collectors.toList()));
    }
}
