package HomeWork.Files;

/**
 * Created by Papko on 28.03.2016.
 */
public class SQLManager {

    public SQLManager(String address) {
        connect();
        checkConnection(address);
    }

    public void connect(){
        System.out.println("Connecting to...");
    }

    public boolean checkConnection(String address){
        System.out.println("Connecting is:");
        return true;
    }

    public boolean executeSQL(String query){
        System.out.println("Executing sql:" + query);
        return true;
    }
}
