public class BubbleSortWord {
    public static void main(String[] args) {

        String[] listNames = {"k", "c", "a", "d", "b"};
        String aux;
        int control = 0;

        System.out.println("Letras fora da ordem: \n"+listNames[0]+
                " "+listNames[1]+" "+listNames[2]+" "+listNames[3]);
        for (int i = 0; i < listNames.length; i++) {
            for (int count = 0; count < (listNames.length-1); count++) {

                if (listNames[count].compareTo(listNames[count+1]) < 0) {
                    aux = listNames[count];
                    listNames[count] = listNames[count+1];
                    listNames[count+1] = aux;
                }
            }
        }

        System.out.println("\nLetras na ordem certa:");
        while ( control < listNames.length) {
            System.out.print(listNames[control]+" ");
            control++;
        }
    }
}
//usar o compareTo para fazer bubble sort com string