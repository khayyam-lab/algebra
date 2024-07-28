package tech.siloxa.khayyam.algebra;

import java.util.List;

public class Tensor<T> {

    private final List<Matrix<T>> tensor;

    public Tensor(List<Matrix<T>> tensor) {
        this.tensor = tensor;
    }

    public static <T> Tensor<T> of(List<Matrix<T>> tensor) {
        return new Tensor<T>(tensor);
    }

    public List<Matrix<T>> value() {
        return tensor;
    }
}
