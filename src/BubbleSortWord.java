public class BubbleSortWord {
    public static void main(String[] args) {

        String[] names = {"d", "c", "b", "a"};
        String aux;
        System.out.println("Letras fora da ordem: \n"+names[0]+
                " "+names[1]+" "+names[2]+" "+names[3]);
        for (int i = 0; i < names.length; i++) {

            for (int j = 0; j < (names.length-1); j++) {
                if (names[j].compareTo(names[j+1]) > 0) {
                    aux = names[j];
                    names[j] = names[j+1];
                    names[j+1] = aux;
                }
            }
        }

        System.out.println("\nLetras na ordem certa:");
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i]+" ");
        }
    }
}
//usar o compareTo para fazer bubbler sort com string