package HomeWork.Files;

import java.util.Scanner;

/**
 * Created by Papko on 28.03.2016.
 */
public class Menu {
    public static void main(String[] args){
        /* //Example from lesson
        FileManager fileManager = new FileManager();
        fileManager.create("Test.txt");*/

        int choice;
        String fileName;

        System.out.println("Input filename: ");
        Scanner inputName = new Scanner(System.in);
        fileName = inputName.nextLine();
        FileManager fileManager = new FileManager(fileName);

        Scanner in = new Scanner(System.in);
        do {
            do {
                String menu = "\n Please, make our choice:"
                        + "\n(1) Create a txt file."
                        + "\n(2) Delete file."
                        + "\n(3) Rename file."
                        + "\n(4) Copy file."
                        + "\n(0) Exit Program";
                System.out.println(menu);
                choice = in.nextInt();
            }
            while (choice < 0 || choice > 4); // This will make the menu repeat if option is higher than 4 or lowen than 0.

            switch (choice) {
                case 1:
                    fileManager.create();
                    break;
                case 2:
                    fileManager.delete();
                    break;
                case 3:
                    System.out.println("Input new filename: ");
                    String newName;
                    Scanner inputNewName = new Scanner(System.in);
                    newName = inputNewName.nextLine();
                    fileManager.rename(newName);
                    break;
                case 4:
                    fileManager.copy();
                    break;
                default:
                    System.out.println("This is The End");
                    break;
            }
        } while (choice != 0);

        // Example from lesson
        /* SQLManager sqlManager = new SQLManager();
            sqlManager.executeSQL("Select * from ec_audit");*/
    }
}
