package Array;


public class ETemperaturas {

    public static void main(String[] args) {

        int lista[] = new int[7];

        for (int i = 0; i < lista.length; i++) {
            lista[i] = (int) ((Math.random() * (15)) + 13);
        }
        for (int i = 0; i < lista.length; i++) {
            for (int k = 0; k < lista[i]; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

