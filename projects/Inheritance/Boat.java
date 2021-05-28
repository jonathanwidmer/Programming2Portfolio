public class Boat extends Vehicle{
  private int length;
  private String bColor;
  private int propellerSize;
  public Boat(){
    setCapacity(12);
    setNumberOfDoors(0);
    setPropellerSize(15);
    setBrand("Titanic");
    setBoatColor("white");
  }
  public void setLength(int bLength){
    length = bLength;
  }
  public int getLength(){
    return length;
  }
  public void setPropellerSize(int pSize){
    propellerSize = pSize;
  }
  public int getPropellerSize(){
    return propellerSize;
  }
  public String getBoatColor(){
    return bColor;
  }
  public void setBoatColor(String boatColor){
    bColor = boatColor;
  }
  public String getDescription(){
    return "A " + bColor + " boat with a propeller size of " + propellerSize +" and a length of "+ length;
  }
}
