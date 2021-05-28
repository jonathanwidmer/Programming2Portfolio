public class Vehicle{
  private String brand;
  private int capacity;
  private int numberOfDoors;
  public String getBrand(){
    return brand;
  }
  public void setBrand(String carBrand){
    brand = carBrand;
  }
  public int getCapacity(){
    return capacity;
  }
  public void setCapacity(int cValue){
    capacity = cValue;
  }
  public int getNumberOfDoors(){
    return numberOfDoors;
  }
  public void setNumberOfDoors(int dValue){
    numberOfDoors = dValue;
  }
  public String getDescription(){
    return "A vehicle with " + numberOfDoors + " doors, and a capacity of " + capacity;
  }
}
