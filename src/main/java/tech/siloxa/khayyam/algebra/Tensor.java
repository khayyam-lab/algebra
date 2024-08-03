package tech.siloxa.khayyam.algebra;

import java.util.List;

public class Tensor {

    private final List<Matrix> tensor;

    public Tensor(List<Matrix> tensor) {
        this.tensor = tensor;
    }

    public static Tensor of(List<Matrix> tensor) {
        return new Tensor(tensor);
    }

    public List<Matrix> value() {
        return tensor;
    }
}
