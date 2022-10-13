package singleton_pattern;

public class CheckDB {
    public static void main(String[] args) {
//        DataBase obj = new DataBase();

        DataBase obj = DataBase.getInstance();
        obj.getConnection();


        DataBase obj2 = DataBase.getInstance();
        obj2.getConnection();


        System.out.println(obj.hashCode());
        System.out.println(obj2.hashCode());

        System.out.println(obj == obj2);


        obj.name = "joh";
        System.out.println(obj.name);
        System.out.println(obj2.name);

        obj2.setName("Anna");
        System.out.println(obj2.name);
        System.out.println(obj.name);


    }
}
