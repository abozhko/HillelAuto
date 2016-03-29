package HomeWork.Files;

/**
 * Created by Papko on 28.03.2016.
 */
public class Menu {
    public static void main(String[] args){
        System.out.println();
        System.out.println("1. Create file.");
        System.out.println("2. Delete file.");
        System.out.println("3. Rename file.");
        System.out.println("4. Copy file.");

        FileManager fileManager = new FileManager();
        fileManager.create("Test.txt");

        //SQLManager sqlManager = new SQLManager();
       // sqlManager.executeSQL("Select * from ec_audit");
    }
}
