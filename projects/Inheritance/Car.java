public class Car extends Vehicle{
  private int numberOfTires;
  private String model;
  private String color;
  public Car(){
    setCapacity(5);
    setNumberOfDoors(4);
    setNumberOfTires(4);
  }
  public void setModel(String newValue){
    model = newValue;
  }
  public String getModel(){
    return model;
  }
  public void setColor(String carColor){
    color = carColor;
  }
  public String getColor(){
    return color;
  }
  public int getNumberOfTires(){
    return numberOfTires;
  }
  public void setNumberOfTires(int tValue){
    numberOfTires = tValue;
  }
  public String getDescription(){
    return "A car with " + numberOfTires + " tires and a color of " + color;
  }
}
