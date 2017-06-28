package main.java.calculator.model.value;

public class DoubleValue implements Value{

    private Double value;

    public DoubleValue(Double value) {
        this.value = value;
    }

    public DoubleValue(String value) {
        this.value = Double.parseDouble(value);
    }

    @Override
    public String toString() {
        String result = Double.toString(value);
        if (value % 1 == 0) {
            return Integer.toString(value.intValue());
        }
        return result;
    }

    @Override
    public Value add(Value value) {
        Double result = this.value + Double.parseDouble(value.toString());

        return new DoubleValue(Double.toString(result));
    }

    @Override
    public Value multiply(Value value) {
        Double result = this.value * Double.parseDouble(value.toString());

        return new DoubleValue(Double.toString(result));
    }

    @Override
    public Value substract(Value value) {
        Double result = this.value - Double.parseDouble(value.toString());

        return new DoubleValue(Double.toString(result));
    }

    @Override
    public Value divide(Value value) {
        Double result = this.value / Double.parseDouble(value.toString());

        return new DoubleValue(Double.toString(result));
    }

    @Override
    public Value percentage(Value value) {
        Double result = this.value / 100 * Double.parseDouble(value.toString());

        return new DoubleValue(Double.toString(result));
    }

    @Override
    public Value root(Value value) {
        Double result = Math.pow(this.value, 1.0 / Double.parseDouble(value.toString()));

        return new DoubleValue(Double.toString(result));
    }

    @Override
    public Value power(Value value) {
        Double result = Math.pow(this.value, Double.parseDouble(value.toString()));

        return new DoubleValue(Double.toString(result));
    }

}
