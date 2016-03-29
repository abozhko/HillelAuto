package HomeWork.Files;

import java.io.*;

/**
 * Created by Papko on 28.03.2016.
 */
public class FileManager implements Items {

    public FileManager() {
    }

    public void create (String fileName){
        try {
            File file = new File(PATH+"Test2.txt");
            FileWriter fileWriter = new FileWriter(file);
            for(int i=0; i<=300; i++){
                fileWriter.write("\n"+fileName+i);

            }
            fileWriter.flush();
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void delete (String file){}
    public void rename (String file){}
    public void copy (String file){}

}
