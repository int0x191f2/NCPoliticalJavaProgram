package util;
import java.util.ArrayList;
public class Sorter{
    String filename;
    FileScanner fileScanner;
    public Sorter(String filename){
        this.filename=filename;
        fileScanner=new FileScanner(filename);
    }
    /**
     * searches file for a searchterm in a given column then returns
     * an arraylist of a specified column from the same row
     * @param column the column to search in
     * @param searchTerm the term to search for in column
     * @param returnColumn the column to return results from
     */
    public ArrayList<String> search(int column, String searchTerm, int returnColumn){
        fileScanner=new FileScanner(filename);
        ArrayList<String[]> tmpList=fileScanner.readFileToArray();
        ArrayList<String> returnList=new ArrayList<String>();
        for(int i=0;i<tmpList.size()-1;i++){
            if(tmpList.get(i)[column].equals(searchTerm)){
                returnList.add(tmpList.get(i)[returnColumn]);
            }
        }
        return returnList;
    }
}
