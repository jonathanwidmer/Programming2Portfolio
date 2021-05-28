import java.util.*;

public class Resistor{
  public static void main(String[] args){
    Random rand = new Random();
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a nominal resistance: ");
    double nominalResistance = in.nextDouble();
    System.out.println("Enter a tolerance percent: ");
    double tolerance = in.nextDouble() * .01;
    double actualResistance1 = nominalResistance + (tolerance * nominalResistance);
    double actualResistance2 = nominalResistance - (tolerance * nominalResistance);
    System.out.println("Actual resistance range: " + actualResistance2 + ", " + actualResistance1);
    double possibleResistance = actualResistance2 + (actualResistance1 - actualResistance2) * rand.nextDouble();
    System.out.println("Possible resistance: " + possibleResistance);
    double actualResistance3 = 330 + (.1 * 330);
    double actualResistance4 = 330 - (.1 * 330);
    double actualResistance5 = actualResistance4 + (actualResistance3 - actualResistance4) * rand.nextDouble();
    double actualResistance6 = actualResistance4 + (actualResistance3 - actualResistance4) * rand.nextDouble();
    double actualResistance7 = actualResistance4 + (actualResistance3 - actualResistance4) * rand.nextDouble();
    double actualResistance8 = actualResistance4 + (actualResistance3 - actualResistance4) * rand.nextDouble();
    double actualResistance9 = actualResistance4 + (actualResistance3 - actualResistance4) * rand.nextDouble();
    double actualResistance10 = actualResistance4 + (actualResistance3 - actualResistance4) * rand.nextDouble();
    double actualResistance11= actualResistance4 + (actualResistance3 - actualResistance4) * rand.nextDouble();
    double actualResistance12 = actualResistance4 + (actualResistance3 - actualResistance4) * rand.nextDouble();
    double actualResistance13 = actualResistance4 + (actualResistance3 - actualResistance4) * rand.nextDouble();
    double actualResistance14 = actualResistance4 + (actualResistance3 - actualResistance4) * rand.nextDouble();
    System.out.println("");
    System.out.println("Ten possible resistances for a 330 ohm 10 percent resistor: ");
    System.out.println(actualResistance5);
    System.out.println(actualResistance6);
    System.out.println(actualResistance7);
    System.out.println(actualResistance8);
    System.out.println(actualResistance9);
    System.out.println(actualResistance10);
    System.out.println(actualResistance11);
    System.out.println(actualResistance12);
    System.out.println(actualResistance13);
    System.out.println(actualResistance14);
    }
  }
