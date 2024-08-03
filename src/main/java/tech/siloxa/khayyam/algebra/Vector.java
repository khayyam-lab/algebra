package tech.siloxa.khayyam.algebra;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Vector {

    private final List<Scalar> vector;
    private final Integer n;

    public Vector(Number ... scalars) {
        this(Arrays.stream(scalars).map(Scalar::new).collect(Collectors.toList()));
    }

    public Vector(List<Scalar> scalars) {
        this.vector = scalars;
        this.n = scalars.size();
    }

    public static Vector of(List<Scalar> scalars) {
        return new Vector(scalars);
    }

    public static Vector of(Number ... scalars) {
        return new Vector(scalars);
    }

    public List<Scalar> value() {
        return vector;
    }

    public Integer n() {
        return n;
    }

    public Scalar get(int n) {
        return vector.get(n);
    }

    @Override
    public String toString() {
        return "[" + vector.stream().map(Scalar::toString).collect(Collectors.joining(", ")) + "]";
    }

    public void print() {
        System.out.println(this);
    }
}
