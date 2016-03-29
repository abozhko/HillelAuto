package HomeWork.Files;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.*;
//import java.nio.file.Files;

/**
 * Created by Papko on 28.03.2016.
 */
public class Actions implements Items {

    public void fillFile(String fileName) {
        try {
            File file = new File(PATH+TEST_FILE_NAME1);
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



    @Test
    public void beforeClass(){
        fillFile("TestTEXT");
    }


}
