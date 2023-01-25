import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileWriter;

public class Database {

    public Database(String fileName , int dataSize){

    }// database constructor

    public static void appendRecord(String data){

    }// append record

    public static String getRecord(int position){
        String data = " ";

        try (

            FileReader fr = new FileReader("Document");
            FileWriter fw = new FileWriter("Document");
            BufferedReader br = new BufferedReader(fr);
            BufferedWriter bw = new BufferedWriter(fw);

        ){
            




            }catch(IOException e){
            e.printStackTrace();
        }// exception handler

        return data;
    }// get record

    public static int findRecord(String data){
        int position = -1;

        return position;
    }// find record

    public static int getRecordCount(){
        int numData = -1;

        return numData;
    }// get record count

}// class database