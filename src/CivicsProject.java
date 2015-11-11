import util.FileScanner;
public class CivicsProject{
    public static void main(String [] args){
        System.out.println(new FileScanner("countyList.csv").readFile());
    }
}
