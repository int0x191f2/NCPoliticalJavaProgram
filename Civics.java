import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
public class Civics{
   public static void main(String[] args){
      try{
      FileReader repsReader = new FileReader(new File("repList.txt"));
      BufferedReader repsBufferedReader = new BufferedReader(repsReader);
      FileReader countyReader = new FileReader(new File("countyList.csv"));
      BufferedReader countyBufferedReader = new BufferedReader(countyReader);
      String a;
      while((a=repsBufferedReader.readLine())!=null){
         System.out.println(a);
      }
      while((a=countyBufferedReader.readLine())!=null){
         System.out.println(a);
      }
            }catch(Exception e){
         System.out.println(e);
      }
   }
}
