package tech.siloxa.khayyam.algebra;

public class Scalar<T> {

    private final T scalar;

    public Scalar(T scalar) {
        this.scalar = scalar;
    }

    public static <T> Scalar<T> of(T scalar) {
        return new Scalar<T>(scalar);
    }

    public T value() {
        return scalar;
    }

    @Override
    public String toString() {
        return "S(" + scalar + ')';
    }

    public void print() {
        System.out.println(this);
    }
}
