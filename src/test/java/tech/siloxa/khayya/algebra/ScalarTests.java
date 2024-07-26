package tech.siloxa.khayya.algebra;

import org.junit.jupiter.api.Test;
import tech.siloxa.khayyam.algebra.Scalar;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScalarTests {

    private final static Integer integer = 0;

    @Test
    void instantiateScalar() {
        final Scalar<Integer> scalar = new Scalar<>(integer);
    }

    @Test
    void instantiateStaticScalar() {
        final Scalar<Integer> scalar = Scalar.of(integer);
    }

    @Test
    void getValueOfScalar() {
        final Scalar<Integer> scalar = Scalar.of(integer);

        assertEquals(scalar.value(), integer);
    }

    @Test
    void print() {
        final Scalar<Integer> scalar = Scalar.of(integer);

        scalar.print();
    }
}
