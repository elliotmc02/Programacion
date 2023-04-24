/*
En el rango de numeros entre 1 y 100

Si el numero es multiplo de 3 - muestras fizz
Si el numero es multiplo de 5 - muestras buzz
Si es multiplo de 3 y 5 muestras FIZZ BUZZ
Si no cumple los anteriores, muestra el numero

Si es multiplo de 10, muestra numero y salta de linea

Se muestran en horizontal todo
*/


public class EjercicioFIZZ {

    public static void main(String[] args) {
        
        int i;
        
        for (i = 1; i <= 100; i++) {
            
            if (i % 10 == 0) {
                System.out.println(i);
            }
            
            else if ((i % 5 == 0) && (i % 3 == 0)) {
                System.out.print("FIZZ BUZZ! ");
            }
            
            else if (i % 3 == 0) {
                System.out.print("FIZZ! ");
            }
            
            else if (i % 5 == 0) {
                System.out.print("BUZZ! ");
            }
            
            else {
                System.out.print(i + " ");
            }
        }
    }
}
