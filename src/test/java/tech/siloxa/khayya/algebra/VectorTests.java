package tech.siloxa.khayya.algebra;

import org.junit.jupiter.api.Test;
import tech.siloxa.khayyam.algebra.Scalar;
import tech.siloxa.khayyam.algebra.Vector;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VectorTests {

    private final static Integer integer = 0;

    @Test
    void instantiateVector() {
        final Vector<Integer> vector = new Vector<>(integer);
    }

    @Test
    void instantiateStaticVector() {
        final Vector<Integer> vector = Vector.of(integer);
    }

    @Test
    void instantiateSingleVector() {
        final Vector<Integer> vector = Vector.of(integer);

        assertEquals(vector.n(), 1);
    }

    @Test
    void getValueOfVector() {
        final Vector<Integer> vector = Vector.of(integer);

        assertEquals(vector.value().get(0).value(), integer);
    }

    @Test
    void print() {
        final Vector<Integer> vector = Vector.of(integer);

        vector.print();
    }
}
