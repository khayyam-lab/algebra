package tech.siloxa.khayya.algebra;

import org.junit.jupiter.api.Test;
import tech.siloxa.khayyam.algebra.Matrix;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MatrixTests {

    private final static Integer integer = 0;

    @Test
    void instantiateMatrix() {
        final Matrix<Integer> matrix = new Matrix<>(integer);
    }

    @Test
    void instantiateStaticMatrix() {
        final Matrix<Integer> matrix = Matrix.of(integer);
    }

    @Test
    void instantiateSingleMatrix() {
        final Matrix<Integer> matrix = Matrix.of(integer);

        assertEquals(matrix.n(), 1);
    }

    @Test
    void getValueOfMatrix() {
        final Matrix<Integer> matrix = Matrix.of(integer);

        assertEquals(matrix.value().get(0).value(), integer);
    }

    @Test
    void print() {
        final Matrix<Integer> matrix = Matrix.of(integer);

        matrix.print();
    }
}
