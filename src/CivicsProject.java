import util.FileScanner;
import util.Sorter;
import java.util.ArrayList;
public class CivicsProject{
    public static void main(String [] args){
        Sorter repSorter=new Sorter("repList.txt");
        System.out.println("Democrat Count: "+repSorter.search(1,"Democrat",0).size());
        System.out.println("Republican Count: "+repSorter.search(1,"Republican",0).size());
    }
}
