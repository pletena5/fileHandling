import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Database {
    public static String fileName;
    public static Integer dataSize;



    public Database(String fileName , int dataSize){
        this.dataSize = dataSize;
        this.fileName = fileName;
    }// database constructor




    public static void appendRecord(String data){
        FileHandling fh = new FileHandling();
        fh.FileWriteLine(fileName , data , true);
    }// append record





    public static String getRecord(int position){
        String data = " ";
        FileHandling fh = new FileHandling();
        ArrayList<String> totalData = new ArrayList<>();

        totalData = fh.lineReturn(fileName);
        data = totalData.get(position);

        return data;
    }// get record




    public static boolean findRecord(String data){
        boolean found = false;
        ArrayList<String> allData = new ArrayList<>();

        FileHandling fh = new FileHandling();
        allData = fh.lineReturn(fileName);

        for (int i = 0 ; i < allData.size() ; i++){
            if (data.equals(allData.get(i))){
                found = true;
            }// if statement
        }// for loop

        return found;
    }// find record





    public static int getRecordCount(){
        ArrayList<String> allData = new ArrayList<>();

        FileHandling fh = new FileHandling();
        allData = fh.lineReturn(fileName);

        return allData.size();
    }// get record count



}// class database