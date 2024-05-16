public class Car {

    private String model;
    private String color;
    private int enginePower;
    private boolean isAutomatic;

    public Car() {
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public boolean isAutomatic() {
        return isAutomatic;
    }

    public void setAutomatic(boolean automatic) {  // Changed method name for clarity
        isAutomatic = automatic;
    }

    @Override
    public String toString() {
        return "Car Details"
                + "\n----------"
                + "\nModel: " + getModel()
                + "\nColor: " + getColor()
                + "\nEngine Power: " + getEnginePower() + " HP"
                + "\nAutomatic Transmission: " + isAutomatic();
    }

    public static class CarBuilder {

        private Car car;

        public CarBuilder() {
            this.car = new Car();
        }

        public CarBuilder model(String model) {
            car.setModel(model);
            return this;
        }

        public CarBuilder color(String color) {
            car.setColor(color);
            return this;
        }

        public CarBuilder enginePower(int enginePower) {
            car.setEnginePower(enginePower);
            return this;
        }

        public CarBuilder automatic(boolean automatic) {
            car.setAutomatic(automatic);
            return this;
        }

        public Car Builder() {
            return car;
        }
    }
}
