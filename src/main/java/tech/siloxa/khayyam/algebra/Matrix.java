package tech.siloxa.khayyam.algebra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Matrix<T extends Number> {

    private final List<Vector<T>> matrix;
    private final Integer m;
    private final Integer n;

    @SafeVarargs
    public Matrix(Vector<T>... vectors) {
        this(Arrays.stream(vectors).collect(Collectors.toList()));
    }

    public Matrix(List<Vector<T>> matrix) {
        this.matrix = matrix;
        this.m = matrix.size();
        this.n = matrix.get(0).n();
    }

    public static <T extends Number> Matrix<T> of(Vector<T>... vectors) {
        return new Matrix<T>(vectors);
    }

    public static <T extends Number> Matrix<T> of(List<Vector<T>> matrix) {
        return new Matrix<T>(matrix);
    }

    public static Matrix<Integer> identity(int n) {
        final List<Vector<Integer>> vectors = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            final List<Scalar<Integer>> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    row.add(Scalar.of(1));
                } else {
                    row.add(Scalar.of(0));
                }
            }
            vectors.add(Vector.of(row));
        }
        return Matrix.of(vectors);
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

    public Scalar<T> get(int n, int m) {
        return matrix.get(n).get(m);
    }

    public boolean isIdentity() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j && !get(i, j).value().equals(1)) {
                    return false;
                } else if(i != j && !get(i, j).value().equals(0)) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "Matrix " + m + "*" + n + " [\n"
                + matrix.stream().map(vector -> "\t" + vector.toString()).collect(Collectors.joining(",\n")) +
                "\n]";
    }

    public void print() {
        System.out.println(this);
    }
}
