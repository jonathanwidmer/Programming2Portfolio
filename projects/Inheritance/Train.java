public class Train extends Vehicle{
  private int numberOfCableCars;
  private String engineType;
  private String trainType;
  public Train(){
    setCapacity(1000);
    setNumberOfDoors(400);
    setBrand("Amtrak");
    setEngineType("Steam Engine");
    setTrainType("passenger train");
  }
  public void setEngineType(String eType){
    engineType = eType;
  }
  public String getEngineType(){
    return engineType;
  }
  public void setTrainType(String tType){
    trainType = tType;
  }
  public String getTrainType(){
    return trainType;
  }
  public int getNumberOfCableCars(){
    return numberOfCableCars;
  }
  public void setNumberOfCableCars(int ccValue){
    numberOfCableCars = ccValue;
  }
  public String getDescription(){
    return "A "+ engineType + " " + trainType + " with " + numberOfCableCars + " cable cars";
  }
}
