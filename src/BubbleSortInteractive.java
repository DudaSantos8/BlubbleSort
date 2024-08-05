import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BubbleSortInteractive {
    public static void main(String[] args) {

        List<String> listNames = new ArrayList<>();
        creatingList(listNames);

        organizerNames(listNames);
        System.out.println("Names in alphabetical order: "+ listNames);
    }

    static void creatingList(List<String> listNames) {
        boolean control = true;
        while(control) {
            int option = scanner("Type:\n 1 to add a new name \n 2 to stop").nextInt();
            System.out.println("----------------------------");
            if (option == 1) {
                addName(listNames, scanner("Write a name:").nextLine());
                System.out.println("----------------------------");
            } else {
                control = false;
            }
        }
    }

    static void addName (List<String> listNames, String name){
        name = name.trim();
        if(!listNames.contains(name)) listNames.add(name);
    }

    // bubbleSort
    static void organizerNames (List<String> listNames) {
        for (int i = 0; i < listNames.size(); i++) {
            for (int count = 0; count < (listNames.size()-1); count++) {
                if (listNames.get(count).compareTo(listNames.get(count +1)) > 0) {
                    String name1 = listNames.get(count);
                    String name2 = listNames.get(count +1);
                    listNames.set(count, name2);
                    listNames.set(count +1, name1);
                }
            }
        }
    }

    public static Scanner scanner (String message){
        System.out.println(message);
        return new Scanner(System.in);
    }
}
