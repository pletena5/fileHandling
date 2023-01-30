import java.io.*;

public class PersistentArrayList {

    public String fileName = "PersistentArrayList";
    File f = new File(fileName);


    public PersistentArrayList(){

        try{
            f.createNewFile();
        }catch (IOException e){
            e.printStackTrace();
        }// try /catch
    }// constructor


    public String get(int i){
            int ascii = 0;
            int num = 0;
            String names = "";

            try {
                FileReader eg = new FileReader(fileName);
                BufferedReader egg = new BufferedReader(eg);

                String line = egg.readLine();

                while (line != null) {
                    num = num + 1;
                    if (ascii != -1 || num == i) {
                        names = line;
                        break;
                    }// if statement
                }// while loop
            }// try
            catch (IOException e) {

                e.printStackTrace();
            }// catch
            System.out.println();

            return names;
    }// getter



    public void add(String data){
        try(
                FileWriter write = new FileWriter(fileName , true);
                PrintWriter writer= new PrintWriter(write);
        ){
            writer.println(data);
        }// try
        catch(IOException e){
            e.printStackTrace();
        }// exception

    }// add element

    public void clear(){
        f.delete();
    }// clear file


}// class persistent array list