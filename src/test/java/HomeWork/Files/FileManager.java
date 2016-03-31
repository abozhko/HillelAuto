package HomeWork.Files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Papko on 28.03.2016.
 */
public class FileManager implements Items {
    String name;

    public FileManager(String fileName) {
        name = fileName;
    }

    public void create() {
        try {
            System.out.println("Creating the txt file...\n");
            File file = new File(PATH + name + ".txt");
            FileWriter fileWriter = new FileWriter(file);
            for(int i=0; i<=300; i++){
                fileWriter.write("\n" + name + i + " \r\n");

            }
            fileWriter.flush();
            fileWriter.close();
            System.out.println("\nThe file '" + name + ".txt' created.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void delete() {
        System.out.println("Deleting the last file...\n");
        File file = new File(PATH + name + ".txt");
        file.delete();
        System.out.println("\nThe file '" + name + ".txt' deleted.");
    }

    public void rename(String newName) {
        File file = new File(PATH + name + ".txt");
        file.renameTo(new File(PATH + newName + ".txt"));
        System.out.println("\nFile " + name + ".txt successfully renamed to " + newName + ".txt\n");
        name = newName;
    }

    public void copy() {
        System.out.println("Feature in progres...");
    }

}
