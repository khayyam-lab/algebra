package tech.siloxa.khayyam.algebra;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Matrix<T> {

    private final List<Vector<T>> matrix;
    private final Integer m;
    private final Integer n;

    @SafeVarargs
    public Matrix(Vector<T> ... vectors) {
        this(Arrays.stream(vectors).collect(Collectors.toList()));
    }

    public Matrix(List<Vector<T>> matrix) {
        this.matrix = matrix;
        this.m = matrix.size();
        this.n = matrix.get(0).n();
    }

    public static <T> Matrix<T> of(Vector<T> ... vectors) {
        return new Matrix<T>(vectors);
    }

    public static <T> Matrix<T> of(List<Vector<T>> matrix) {
        return new Matrix<T>(matrix);
    }

    public static <T> Matrix<T> identity(int n) {
        return null;
    }

    public List<Vector<T>> value() {
        return matrix;
    }

    public Integer m() {
        return m;
    }

    public Integer n() {
        return n;
    }

    @Override
    public String toString() {
        return "Matrix " + m + "*" + n + " [\n"
                + matrix.stream().map(Vector::toString).collect(Collectors.joining("\n")) +
                "]";
    }

    public void print() {
        System.out.println(this);
    }
}
