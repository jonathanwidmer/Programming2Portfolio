import java.util.*;

public class VehicleDemo{
  //car
  public static void print(Car c){
    System.out.println(c.getDescription());
    System.out.println("Capacity: " + c.getCapacity());
  }
  //truck
  public static void print(Truck t){
    System.out.println(t.getDescription());
    System.out.println("Capacity: " + t.getCapacity());
  }
  //train
  public static void print(Train tr){
    System.out.println(tr.getDescription());
    System.out.println("Capacity: " + tr.getCapacity());
  }
  //boat
  public static void print(Boat b){
    System.out.println(b.getDescription());
    System.out.println("Capacity: " + b.getCapacity());
  }
  //airplane
  public static void print(Airplane a){
    System.out.println(a.getDescription());
    System.out.println("Capacity: " + a.getCapacity());
  }
  //motorcycle
  public static void print(Motorcycle m){
    System.out.println(m.getDescription());
    System.out.println("Capacity: " + m.getCapacity());
  }
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    //car
    Car myCar = new Car();
    System.out.println("Set your car's color: ");
    String userColor = in.nextLine();
    myCar.setColor(userColor);
    print(myCar);

    //truck
    Truck myTruck = new Truck();
    System.out.println("Set your truck's fuel tank capacity: ");
    int userFuelTankCapacity = in.nextInt();
    myTruck.setFuelTankCapacity(userFuelTankCapacity);
    print(myTruck);

    //train
    Train myTrain = new Train();
    System.out.println("Set how many cable cars your train has: ");
    int userNumberOfCableCars = in.nextInt();
    myTrain.setNumberOfCableCars(userNumberOfCableCars);
    print(myTrain);

    //boat
    Boat myBoat = new Boat();
    System.out.println("Set the length of your boat: ");
    int userLength = in.nextInt();
    myBoat.setLength(userLength);
    print(myBoat);

    //airplane
    Airplane myAirplane = new Airplane();
    System.out.println("Set the company the airplane is owned by: ");
    String userCompany = in.nextLine();
    myAirplane.setCompanyOwnedBy(userCompany);
    print(myAirplane);

    //Motorcycle
    Motorcycle myMotorcycle = new Motorcycle();
    System.out.println("Set the color of your motorcycle: ");
    String userMColor = in.nextLine();
    myMotorcycle.setColor(userMColor);
    print(myMotorcycle);
  }
}
