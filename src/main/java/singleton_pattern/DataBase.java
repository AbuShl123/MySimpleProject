package singleton_pattern;

public class DataBase {

    private static DataBase single_instance; // null

    public String name;

    private DataBase() {
    }


    public static DataBase getInstance() {
        if (single_instance == null) {
            single_instance = new DataBase();
        }
        return single_instance;
    }


    public void getConnection() {
        System.out.println("Connection is set");
    }

    public void setName(String name) {
        this.name = name;
    }
}
