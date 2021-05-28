public class Motorcycle extends Vehicle{
  private int fuelTankCapacity;
  private String color;
  private double gasMileage;
  public Motorcycle(){
    setCapacity(1);
    setNumberOfDoors(0);
    setGasMileage(80);
    setFuelTankCapacity(3);
  }
  public void setColor(String mColor){
    color = mColor;
  }
  public String getColor(){
    return color;
  }
  public void setFuelTankCapacity(int ftmValue){
    fuelTankCapacity = ftmValue;
  }
  public int getFuelTankCapacity(){
    return fuelTankCapacity;
  }
  public double getGasMileage(){
    return gasMileage;
  }
  public void setGasMileage(double mgmValue){
    gasMileage = mgmValue;
  }
  public String getDescription(){
    return "A "+ color + " motorcycle with gas mileage " + gasMileage + " and a fuel tank capacity of " + fuelTankCapacity;
  }
}
