package tech.siloxa.khayya.algebra;

import org.junit.jupiter.api.Test;
import tech.siloxa.khayyam.algebra.Matrix;
import tech.siloxa.khayyam.algebra.Vector;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MatrixTests {

    private final static List<Vector<Integer>> vectors = List.of(
            Vector.of(1, 2, 3),
            Vector.of(4, 5, 6),
            Vector.of(7, 8, 9)
    );

    @Test
    void instantiateMatrix() {
        final Matrix<Integer> matrix = new Matrix<>(vectors);
    }

    @Test
    void instantiateStaticMatrix() {
        final Matrix<Integer> matrix = Matrix.of(vectors);
    }

    @Test
    void nAndMOfMatrix() {
        final Matrix<Integer> matrix = Matrix.of(vectors);

        assertEquals(matrix.n(), 3);
        assertEquals(matrix.m(), 3);
    }

    @Test
    void getValueOfMatrix() {
        final Matrix<Integer> matrix = Matrix.of(vectors);

        assertEquals(matrix.value(), vectors);
    }

    @Test
    void print() {
        final Matrix<Integer> matrix = Matrix.of(vectors);

        matrix.print();
    }

    @Test
    void printIdentity() {
        final Matrix<Integer> matrix = Matrix.identity(3);

        matrix.print();
    }
}
