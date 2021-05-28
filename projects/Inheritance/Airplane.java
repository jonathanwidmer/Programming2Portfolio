public class Airplane extends Vehicle{
  private int wingspan;
  private int numberOfEngines;
  private String companyOwnedBy;
  public Airplane(){
    setCapacity(300);
    setNumberOfDoors(4);
    setNumberOfEngines(4);
    setWingspan(200);
  }
  public void setNumberOfEngines(int eValue){
    numberOfEngines = eValue;
  }
  public int getNumberOfEngines(){
    return numberOfEngines;
  }
  public void setWingspan(int wsValue){
    wingspan = wsValue;
  }
  public int getWingspan(){
    return wingspan;
  }
  public String getCompanyOwnedBy(){
    return companyOwnedBy;
  }
  public void setCompanyOwnedBy(String owner){
    companyOwnedBy = owner;
  }
  public String getDescription(){
    return "A plane with " + numberOfEngines + " engines, wingspan of " + wingspan + " and owned by " + companyOwnedBy;
  }
}
