package tech.siloxa.khayya.algebra;

import org.junit.jupiter.api.Test;
import tech.siloxa.khayyam.algebra.Scalar;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScalarTests {

    private final static Integer integer = 0;

    @Test
    void instantiateScalar() {
        final Scalar scalar = new Scalar(integer);
    }

    @Test
    void instantiateStaticScalar() {
        final Scalar scalar = Scalar.of(integer);
    }

    @Test
    void getValueOfScalar() {
        final Scalar scalar = Scalar.of(integer);

        assertEquals(scalar.value(), Double.valueOf(integer));
    }

    @Test
    void print() {
        final Scalar scalar = Scalar.of(integer);

        scalar.print();
    }
}
