public class CarData {
    private int yearOfManufacture;
    private String carModel;
    private String priceCar;
    private String carColor;

    public CarData(int yearOfManufacture, String carModel, String priceCar, String carColor) {
        this.yearOfManufacture = yearOfManufacture;
        this.carModel = carModel;
        this.priceCar = priceCar;
        this.carColor = carColor;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getPriceCar() {
        return priceCar;
    }

    public void setPriceCar(String priceCar) {
        this.priceCar = priceCar;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    @Override
    public String toString() {
        return "CarData " +
                "yearOfManufacture: " + yearOfManufacture +
                ", carModel: " + carModel  +
                ", priceCar: " + priceCar +
                ", carColor: " + carColor+"\n";
    }
}
