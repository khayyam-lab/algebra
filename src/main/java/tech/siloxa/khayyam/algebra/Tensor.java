package tech.siloxa.khayyam.algebra;

import java.util.List;

public class Tensor<T extends Number> {

    private final List<Matrix<T>> tensor;

    public Tensor(List<Matrix<T>> tensor) {
        this.tensor = tensor;
    }

    public static <T extends Number> Tensor<T> of(List<Matrix<T>> tensor) {
        return new Tensor<T>(tensor);
    }

    public List<Matrix<T>> value() {
        return tensor;
    }
}
