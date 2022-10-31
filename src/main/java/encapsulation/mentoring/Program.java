package encapsulation.mentoring;

public class Program {
    // OOP - object-oriented programming
    // Encapsulation


    int number; // field, variable, data, state of the program
    String name;
    double size;

    public void increaseNumber() { // method, function, behaviour of the program
        number = number*2;
    }


    public static void main(String[] args) {
        Program object = new Program();

        object.number = 12;
        System.out.println(object.number); // 12

        object.increaseNumber();
        System.out.println(object.number); // 24


        object.name = "Sasha";
        object.size = 12.4;

        System.out.println(object.name);
        System.out.println(object.size);


    }

    /*

        Class {

            1) fields
            2) methods

        }

        // class members

        General meaning:

        field = data
        methods = function
        class = unit
     */
}


