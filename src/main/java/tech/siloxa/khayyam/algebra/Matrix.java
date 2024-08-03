package tech.siloxa.khayyam.algebra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Matrix {

    private final List<Vector> matrix;
    private final Integer m;
    private final Integer n;

    public Matrix(Vector ... vectors) {
        this(Arrays.stream(vectors).collect(Collectors.toList()));
    }

    public Matrix(List<Vector> matrix) {
        this.matrix = matrix;
        this.m = matrix.size();
        this.n = matrix.get(0).n();
    }

    public static Matrix of(Vector ... vectors) {
        return new Matrix(vectors);
    }

    public static Matrix of(List<Vector> matrix) {
        return new Matrix(matrix);
    }

    public static Matrix identity(int n) {
        final List<Vector> vectors = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            final List<Scalar> row = new ArrayList<>();
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

    public List<Vector> value() {
        return matrix;
    }

    public Integer m() {
        return m;
    }

    public Integer n() {
        return n;
    }

    public Scalar get(int n, int m) {
        return matrix.get(n).get(m);
    }

    public boolean isIdentity() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j && get(i, j).equals(1)) {
                    return false;
                } else if(i != j && get(i, j).equals(0)) {
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
