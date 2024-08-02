import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] names = {"h", "f", "z", "u"};
        String aux;

        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < (names.length-1); j++) {
                if (names[j].compareTo(names[j+1]) > 0) {
                    aux = names[j];
                    names[j] = names[j+1];
                    names[j+1] = aux;
                }
            }
            System.out.println(names[i]);
        }

    }

    static void addName (List<String> names, String name) {
        name = name.trim();
        if(!names.contains(name)) names.add(name);
    }

    public static Scanner scanner (String message){
        System.out.println(message);
        return new Scanner(System.in);
    }
}
//usar o compareTo para fazer bubbler sort com string