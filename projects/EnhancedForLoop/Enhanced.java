import java.util.Random;

public class Enhanced{
  public static void main(String []args){
    Random rand = new Random();
    int[] values = new int[100];
    for (int i = 0; i<values.length; i++){
      values[i] = rand.nextInt(100+99) - 99;
      System.out.print(values[i] + " ");
    }
    int max=0;
    for(int element : values){
      if(max<element){
        max = element;
        System.out.println(max);
      }
    }
    int count = 0;
    for(int element : values){
      if(element<0){
        count++;
        System.out.println(count);
      }
    }
  }
}
