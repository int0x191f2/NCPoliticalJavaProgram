package util;
import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
public class FileScanner{
    BufferedReader bufferedReader;
    /**
     * Constructor for the FileScanner
     * @param path the path to the file to be scanned
     */
    public FileScanner(String path){
        try{
            FileReader fileReader=new FileReader(new File(path));
            bufferedReader=new BufferedReader(fileReader);
        }catch(Exception e){
            System.out.println(e);
        }
    }
    /**
    * Gets the contents of the file
    * @return contents of the file
    */
    public String readFile(){
        String a="";
        String tmp="";
        try{
            while((a=bufferedReader.readLine())!=null){
                tmp=tmp+a;
            }
            return tmp;
        }catch(Exception e){
            System.out.println(e);
            return "";
        }
    }
    /**
     * Reads a csv file to an array
     * @return array with contents of csv
     */
    public String[] readFileToArray(){

    }
}
