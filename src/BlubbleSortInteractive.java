import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BlubbleSortInteractive {
    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();
        lista.add("");
        run(lista);
    }

    static void run (List<String> lista) {
        boolean control = true;
        while(control) {
            int option = scanner("Add 1 or stop 2").nextInt();
            if (option == 1) {
                addName(lista, scanner("Digite um nome:").nextLine());
            }else{
                control = false;
            }
        }
        organizerNames(lista);
        System.out.println(lista);
    }

    static void addName (List<String> lista, String name){
        if(!lista.contains(name)) lista.add(name);
    }

    static void organizerNames (List<String> lista) {
        for (int i = 0; i < lista.size(); i++) {
            addName(lista, scanner("Digite um nome:").nextLine());
            for (int j = 0; j < (lista.size()-1); j++) {
                if (lista.get(j).compareTo(lista.get(j+1)) > 0) {
                    String l1 = lista.get(j);
                    String l2 = lista.get(j+1);
                    lista.set(j,l2);
                    lista.set(j+1,l1);
                }
            }
        }
    }

    public static Scanner scanner (String message){
        System.out.println(message);
        return new Scanner(System.in);
    }
}
