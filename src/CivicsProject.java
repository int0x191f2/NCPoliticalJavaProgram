import util.FileScanner;
import util.Sorter;
import java.util.ArrayList;
import java.util.Collections;
public class CivicsProject{
    public static void main(String [] args){
        Sorter repSorter=new Sorter("repList.txt");
        Sorter countySorter=new Sorter("countyList.csv");

        //Part 1
        System.out.println("Democrat Count: "+repSorter.search(1,"Democrat",0).size());
        System.out.println("Republican Count: "+repSorter.search(1,"Republican",0).size());
        System.out.println("");

        //Part 2
        System.out.println("Democrat list in order:");
        ArrayList<String> demoListSorted=repSorter.search(1,"Democrat",0);
        Collections.sort(demoListSorted);
        for(String rep : demoListSorted){
            System.out.println(rep);
        }
        System.out.println("");

        System.out.println("Republican list in order:");
        ArrayList<String> repubListSorted=repSorter.search(1,"Republican",0);
        Collections.sort(repubListSorted);
        for(String rep : repubListSorted){
            System.out.println(rep);
        }
        System.out.println("");
    }
}
