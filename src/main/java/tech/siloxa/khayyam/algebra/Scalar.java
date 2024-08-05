package tech.siloxa.khayyam.algebra;

import java.math.BigDecimal;
import java.util.Objects;

public class Scalar {

    private final BigDecimal scalar;

    public Scalar(Number scalar) {
        if(scalar instanceof BigDecimal bigDecimalScalar) {
            this.scalar = bigDecimalScalar;
        } else {
            this.scalar = new BigDecimal(scalar.toString());
        }
    }

    public static Scalar of(Number scalar) {
        return new Scalar(scalar);
    }

    public BigDecimal getScalar() {
        return scalar;
    }

    public Double value() {
        return scalar.doubleValue();
    }

    public boolean equals(Number value) {
        return Objects.equals(scalar.doubleValue(), Double.valueOf(value.toString()));
    }

    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return scalar.toString();
    }
}
