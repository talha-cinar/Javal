public class Car {
    public enum FuelType
    {
        GASOLINE("Gasoline",30.0),
        DIESEL("Diesel", 40.0);

    }
    private String plate;
    private String owner;
    private FuelType fuelType;

    public Car(String plate, String owner, FuelType fuelType, double fuel) {
        this.plate = plate;
        this.owner = owner;
        this.fuelType = fuelType;
    }

    public String getPlate()
    {
        return plate;
    }

    public void setPlate(String plate)
    {
        this.plate = plate;
    }

    public void introduceSelf() {
        System.out.println("Plate: " + plate);
        System.out.println("Owner: " + owner);
    }

    public double calculateFuelCost(double liter) {
        return liter * fuelType.getPricePerLiter();
    }
}
