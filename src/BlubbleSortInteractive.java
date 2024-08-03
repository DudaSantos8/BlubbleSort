import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BlubbleSortInteractive {
    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();
        creatingList(lista);

        organizerNames(lista);
        System.out.println("Names in alphabetical order: "+lista);
    }

    static void creatingList(List<String> lista) {
        boolean control = true;
        while(control) {
            int option = scanner("Type:\n 1 to add a new name \n 2 to stop").nextInt();
            System.out.println("----------------------------");
            if (option == 1) {
                addName(lista, scanner("Write a name:").nextLine());
            } else {
                control = false;
            }
        }
    }

    static void addName (List<String> lista, String name){
        name = name.trim();
        if(!lista.contains(name)) lista.add(name);
    }

    static void organizerNames (List<String> lista) {
        for (int i = 0; i < lista.size(); i++) {
            for (int count = 0; count < (lista.size()-1); count++) {
                if (lista.get(count).compareTo(lista.get(count +1)) > 0) {
                    String l1 = lista.get(count);
                    String l2 = lista.get(count +1);
                    lista.set(count,l2);
                    lista.set(count +1,l1);
                }
            }
        }
    }

    public static Scanner scanner (String message){
        System.out.println(message);
        return new Scanner(System.in);
    }
}
