import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;

public class BabyNames
{
   public static void main(String[] args) throws FileNotFoundException
   {
     File babyinput = new File("babynames.txt");
     File boynames = new File("boynames.txt");
     File girlnames = new File("girlnames.txt");
     String[] boysnames = new String[200];
     String[] boyinfo = new String[200];
     String[] girlsnames = new String[200];
     String[] girlinfo = new String[200];
     PrintWriter boyNames = new PrintWriter(boynames);
     PrintWriter girlNames = new PrintWriter(girlnames);
     Scanner in = new Scanner(babyinput);
     int i = 0;
     while(in.hasNextLine()){
       String string = in.nextLine();
       String[] strings = string.split(" ");
       boysnames[i] = strings[0];
       girlsnames[i++] = strings[0];
     }
     for(i=0; i < 100; i++){
       boyNames.write(boysnames[i]);
       boyNames.println();
       girlNames.write(girlsnames[i]);
       girlNames.println();
     }
     in.close();
     boyNames.close();
     girlNames.close();
   }
}
