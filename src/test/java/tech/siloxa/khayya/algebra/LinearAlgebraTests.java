package tech.siloxa.khayya.algebra;

import org.junit.jupiter.api.Test;
import tech.siloxa.khayyam.algebra.LinearAlgebra;
import tech.siloxa.khayyam.algebra.Scalar;
import tech.siloxa.khayyam.algebra.Vector;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LinearAlgebraTests {

    private final static LinearAlgebra linearAlgebra = new LinearAlgebra();
    private final static Scalar firstScalar = Scalar.of(8);
    private final static Scalar secondScalar = Scalar.of(2);
    private final static Vector firstVector = Vector.of(1, 2, 3);

    @Test
    void addTwoScalars() {
        final Scalar result = linearAlgebra.add(firstScalar, secondScalar);

        assertTrue(result.equals(10));
    }

    @Test
    void addScalarToVector() {
        final Vector result = linearAlgebra.add(firstScalar, firstVector);

        assertTrue(result.equals(10));
    }

    @Test
    void subtractTwoScalars() {
        final Scalar result = linearAlgebra.subtract(firstScalar, secondScalar);

        assertTrue(result.equals(6));
    }

    @Test
    void multiplyTwoScalars() {
        final Scalar result = linearAlgebra.multiply(firstScalar, secondScalar);

        assertTrue(result.equals(16));
    }

    @Test
    void divideTwoScalars() {
        final Scalar result = linearAlgebra.divide(firstScalar, secondScalar);

        assertTrue(result.equals(4));
    }
}
