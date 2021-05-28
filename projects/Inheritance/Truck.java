public class Truck extends Vehicle{
  private double gasMileage;
  private String model;
  private int fuelTankCapacity;
  public Truck(){
    setCapacity(5);
    setNumberOfDoors(4);
    setGasMileage(15.5);
    setModel("Tacoma");
  }
  public void setModel(String newValue){
    model = newValue;
  }
  public String getModel(){
    return model;
  }
  public void setFuelTankCapacity(int ftValue){
    fuelTankCapacity = ftValue;
  }
  public int getFuelTankCapacity(){
    return fuelTankCapacity;
  }
  public double getGasMileage(){
    return gasMileage;
  }
  public void setGasMileage(double gmValue){
    gasMileage = gmValue;
  }
  public String getDescription(){
    return "A "+ model + " truck with gas mileage " + gasMileage + " and a fuel tank capacity of " + fuelTankCapacity;
  }
}
