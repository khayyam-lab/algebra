package tech.siloxa.khayyam.algebra;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Vector<T extends Number> {

    private final List<Scalar<T>> vector;
    private final Integer n;

    @SafeVarargs
    public Vector(T ... scalars) {
        this(Arrays.stream(scalars).map(Scalar::new).collect(Collectors.toList()));
    }

    public Vector(List<Scalar<T>> scalars) {
        this.vector = scalars;
        this.n = scalars.size();
    }

    public static <T extends Number> Vector<T> of(List<Scalar<T>> scalars) {
        return new Vector<T>(scalars);
    }

    @SafeVarargs
    public static <T extends Number> Vector<T> of(T ... scalars) {
        return new Vector<T>(scalars);
    }

    public List<Scalar<T>> value() {
        return vector;
    }

    public Integer n() {
        return n;
    }

    @Override
    public String toString() {
        return "[" + vector.stream().map(Scalar::toString).collect(Collectors.joining(", ")) + "]";
    }

    public void print() {
        System.out.println(this);
    }
}
