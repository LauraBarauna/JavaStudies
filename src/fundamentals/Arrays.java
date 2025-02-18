package fundamentals;

public class Arrays {
    public static void main(String[] args) {

        // array = used to store multiple values in a single variable

        String[] cars = {"Camaro", "BMW", "Audi", "Volkswagen", "Honda"};

        String[] names = new String[3];
        names[0] = "Maria";
        names[1] = "John";
        names[2] = "Mike";

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }


    }
}
